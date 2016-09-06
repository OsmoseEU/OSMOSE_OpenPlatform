package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.utils.DataConstant.DataParamConstant;

public abstract class AbstractDaoService {
	
	/** log */
	protected static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PiDaoService.class);
	
	/** PiConnection */
	private PiConnection connection;

	/* ******************************
	 * C O N S T R U C T E U R
	 * *****************************/
	/**
	 * Default constructor
	 */
	public AbstractDaoService() {
		this.connection = new PiConnection();
		this.connection.connect();
		
		// test to init data base
		String version = getVersion();
		// init base
		if (null == version) {
			if (!isTableExists(DataParamConstant.TABLE_PARAM)) {
				//create data base
				executeFile("sql/create_table.sql");
				//create data
	//			executeFile("sql/insert_data.sql");
			}
		}
		this.connection.close();
	}

	/* ******************************
	 * M E T H O D E S
	 * *****************************/
	/**
	 * Execute SQL file 
	 * @param filePath	file path
	 */
	private void executeFile(String filePath) {
		// FIXME for testing
		System.out.println((new File(".")).getAbsolutePath());
		try{
			InputStream inputStream = new FileInputStream(filePath); 
			InputStreamReader isReader = new InputStreamReader(inputStream);
			BufferedReader bufferReader = new BufferedReader(isReader);

			StringBuffer ligne = new StringBuffer();
			String ligneTemp;
			while ((ligneTemp=bufferReader.readLine())!=null){
				ligne.append(ligneTemp);
				if (isEndInstruction(ligne.toString())) {
					this.connection.insert(ligne.toString());
					ligne = new StringBuffer();
				}
			}
			bufferReader.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}
	
	/**
	 * Test if line have a character for end Instruction
	 * @param line SQL line
	 * @return no if not found
	 */
	private boolean isEndInstruction(String line) {
		int indexEnd = line.lastIndexOf(";");
		if (indexEnd != -1) {
			String temp = line.substring(indexEnd);
			temp = temp.replaceAll(" ", "");
			return ";".equals(temp);
		} else {
			return false;
		}
	}

	/**
	 * @return version number
	 */
	private String getVersion() {
		String version = null;
		// create query
		String query = "SELECT * FROM " + DataParamConstant.TABLE_PARAM 
				+ " WHERE " + DataParamConstant.FIELD_ID + " = 'VERSION'";
		// execute query
		ResultSet result = this.connection.query(query);
		// reade result
		try {
			if (null != result && result.next()) {
				version = result.getString(DataParamConstant.FIELD_VALUE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la requet : " + query);
		}
		
		return version;
	}

	/**
	 * Test table
	 */
	protected boolean isTableExists(String table) {
		String query = "SELECT * FROM " + table;
		ResultSet result = this.connection.query(query);
		return null != result;
	}


	/**
	 * Test data
	 * @param table		target
	 * @param feild		to find
	 * @param value		data value
	 * @return if find
	 */
	protected boolean isDataExists(String table, String feild, String value) {
		String query = "SELECT * FROM " + table + " WHERE " + feild + "='" + value + "'";
		ResultSet result = this.connection.query(query);
		try {
			return null != result
					&& result.next();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la requet : " + query);
			return false;
		}
	}

	/**
	 * Create a SQL query for select all elements in a table
	 * @param table			for query
	 * @param fieldOrder	field for order
	 * @return query
	 */
	protected String createQuerySelectAll(String table, String fieldOrder) {
		return createQuerySelectAll(table, fieldOrder, null, null);
	}
	
	/**
	 * Create a SQL query for select all elements in a table with a field filter
	 * @param table			for query
	 * @param fieldOrder	field for order
	 * @param fieldFilter	field filter
	 * @param valueFilter	value filter
	 * @return query
	 */
	protected String createQuerySelectAll(String table, String fieldOrder,
			String fieldFilter, String valueFilter) {

		StringBuffer bufferQuery = new StringBuffer();
		bufferQuery.append("Select * FROM ");
		bufferQuery.append(table);
		if (null != fieldFilter) {
			bufferQuery.append(" WHERE ");
			bufferQuery.append(fieldFilter);
			bufferQuery.append(" = '");
			bufferQuery.append(valueFilter);
			bufferQuery.append("'");
		}
		if (null != fieldOrder) {
			bufferQuery.append(" order by ");
			bufferQuery.append(fieldOrder);
		}
		return bufferQuery.toString();
	}

	
	/* ******************************
	 * G E T T E R S / S E T T E R S
	 * *****************************/
	/**
	 * @return the connection
	 */
	public PiConnection getConnection() {
		return connection;
	}
}

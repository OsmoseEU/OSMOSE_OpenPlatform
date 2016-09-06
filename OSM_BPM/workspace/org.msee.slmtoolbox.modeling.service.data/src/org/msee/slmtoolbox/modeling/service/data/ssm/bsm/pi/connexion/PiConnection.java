package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Connection class
 * @author fto
 *
 */
public class PiConnection {
	
	/** log */
	protected static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PiDaoService.class);
	
	/** Default db path */
	private String DBPath = "msee_pi_reference_list.db";
	
	/** Connection to db */
	private Connection connection = null;
	
	/** Statement */
	private Statement statement = null;
	
	/**
	 * Default constructor
	 */
	public PiConnection() {
	}

	/**
	 * Constructor with param
	 * @param dBPath	path for db
	 */
	public PiConnection(String dBPath) {
		this.DBPath = dBPath;
	}

	/**
	 * Connect to db
	 */
	public void connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBPath);
			this.statement = connection.createStatement();
			System.out.println("Login in " + DBPath + " success");
		} catch (ClassNotFoundException notFoundException) {
			log.error("Connection Error : " + notFoundException.getMessage() );
		} catch (SQLException sqlException) {
			log.error("Connection Error : " + sqlException.getMessage() );
		}
	}

	/**
	 * Close connection
	 */
	public void close() {
		try {
			connection.close();
			statement.close();
			statement = null;
		} catch (SQLException sqlException) {
			log.error("Connection Error : " + sqlException.getMessage() );
		}
	}

	/**
	 * Execute query
	 * @param requet	to be execute
	 * @return	
	 */
	public ResultSet query(String requet) {
		if (null == statement) {
			connect();
		}
		ResultSet resultat = null;
		if (null != statement) {
			try {
				resultat = statement.executeQuery(requet);
			} catch (SQLException sqlException) {
				log.error("Request error : " + requet +" - " + sqlException.getMessage());
			}
		}
		return resultat;
	}

	/**
	 * Execute query
	 * @param requet	to be execute
	 * @return	
	 */
	public int update(String requet) {
		if (null == statement) {
			connect();
		}
		int resultat = 0;
		if (null != statement) {
			try {
				resultat =statement.executeUpdate(requet);
			} catch (SQLException sqlException) {
				log.error("Request error : " + requet +" - " + sqlException.getMessage());
			}
		}
		return resultat;
	}

	/**
	 * Execute query for insert data
	 * @param request	to be execute
	 * @return 
	 */
	public int insert(String request) {
		if (null == statement) {
			connect();
		}
		int resultat = 0;
		if (null != statement) {
			try {
				resultat = statement.executeUpdate(request);
			} catch (SQLException sqlException) {
				log.error("Request error : " + request +" - " + sqlException.getMessage());
			}
		}
		return resultat;
	}
}

package org.msee.slmtoolbox.modeling.service.app.ssm.bsm;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory1;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory2;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;
import org.msee.slmtoolbox.modeling.service.app.utils.ConstantsCsvPi;
import org.msee.slmtoolbox.modeling.service.app.utils.CsvReaderSlmToolbox;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion.IPiDaoService;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion.PiDaoService;

import com.csvreader.CsvReader.CatastrophicException;
import com.csvreader.CsvReader.FinalizedException;
import com.csvreader.CsvWriter;

/**
 * Service for Bsm Pi
 * @author fto
 *
 */
public class BsmPiService {
	
	/**
	 * Dao Pi service
	 */
	private IPiDaoService serviceDao;
	
	/** log */
	@SuppressWarnings("unused")
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(BsmAppService.class);
	
	/**
	 * Default Constructor
	 */
	public BsmPiService() {
		this.serviceDao = new PiDaoService();
	}
	
	/**
	 * Get all piCcategory1
	 * @return not null
	 */
	public List<PiCategory1> getListCategory1() {
		return this.serviceDao.getListCategory1();
	}

	/**
	 * Get all piCcategory2 for piCategory1
	 * @param piCategory1 
	 * @return not null
	 */
	public List<PiCategory2> getListCategory2(PiCategory1 piCategory1) {
		return this.serviceDao.getListCategory2(piCategory1);
	}

	/**
	 * Get all piCcategory3 for piCategory2
	 * @param piCategory2
	 * @return not null
	 */
	public List<PiCategory3> getListCategory3(PiCategory2 piCategory2) {
		return this.serviceDao.getListCategory3(piCategory2);
	}

	/**
	 * Get all Metrics filter with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @param dimension		can be null
	 * @param field			can be null
	 * @param name			can be null
	 * @return all Metrics filer with param
	 */
	public List<PiMetric> getListMetrics(PiCategory1 category1, PiCategory2 category2,
			PiCategory3 category3, PiDimension dimension, PiField field, String name) {
		return this.serviceDao.getListMetrics(category1, category2, category3, dimension, field, name);
	}

	/**
	 * Get all field filter with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @return all field filer with param
	 */
	public List<PiField> getListField(PiCategory1 category1,
			PiCategory2 category2, PiCategory3 category3) {
		return this.serviceDao.getListField(category1, category2, category3);
	}

	/**
	 * Get all dimension filer with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @return all dimension filer with param
	 */
	public List<PiDimension> getListDimension(PiCategory1 category1,
			PiCategory2 category2, PiCategory3 category3) {
		return this.serviceDao.getListDimension(category1, category2, category3);
	}

	/**
	 * Get all dimension
	 * @return all dimension
	 */
	public List<PiDimension> getListDimension() {
		return this.serviceDao.getListDimension();
	}

	/**
	 * Conversion PiMetric to BsmPerformanceIndicator
	 * @param metricSelected
	 * @return a BsmPerformanceIndicator
	 */
	public BsmPerformanceIndicator piMetricToBsmPi(PiMetric metricSelected) {
		BsmPerformanceIndicator bsmPi = BsmFactory.eINSTANCE.createBsmPerformanceIndicator();
		bsmPi.setName(metricSelected.getName());
		bsmPi.setDescription(metricSelected.getDescription());
		//set categories (1,2, and 3)
		if (null != metricSelected.getCategory3()) {
			PiCategory3 cat3 = metricSelected.getCategory3();
			if (null != cat3.getCategory2()) {
				PiCategory2 cat2 = cat3.getCategory2();
				if (null != cat2.getCategory1()) {
					PiCategory1 cat1 = cat2.getCategory1();
					bsmPi.setCategory1(cat1.getName());
				}
				bsmPi.setCategory2(cat2.getName());
			}
			bsmPi.setCategory3(cat3.getName());
		}
		//set unit
		bsmPi.setUnit(metricSelected.getUnit());
		bsmPi.setDimension(metricSelected.getDimension().getName());
		//set PiFields
		List<PiField> piFields = metricSelected.getFieldsList();
		for(PiField piField: piFields){
			BsmPiField bsmPiField = BsmFactory.eINSTANCE.createBsmPiField();
			bsmPiField.setName(piField.getName());
			bsmPi.getFields().add(bsmPiField);
		}
		return bsmPi;
	}
	
	/**
	 * Save Metric
	 * @param metric	to save
	 */
	public void saveMetric(PiMetric metric) {
		this.serviceDao.addOrUpdateMetric(metric);
	}
	
	/**
	 * Delete Metric
	 * @param metric	to delte
	 */
	public void deleteMetric(PiMetric metric) {
		this.serviceDao.deleteMetric(metric);
	}
	
	/**
	 * @param bufferFields	fields' list in string
	 * @return fields' list in DB
	 */
	public List<PiField> getListField(String bufferFields) {
		List<PiField> listFields = new ArrayList<PiField>();
		// split buffer
		String[] tableFields = bufferFields.split(",");
		// for all buffer's element
		for (int i = 0 ; i < tableFields.length ; i++) {
			// clear space in element
			String fieldName = tableFields[i].trim();
			if (!"".equals(fieldName)) {
				// find element
				PiField piField = this.serviceDao.getField(fieldName);
				// create if not exist 
				if (null == piField) {
					piField = new PiField(null, fieldName);
					this.serviceDao.add(piField);
				}
				// add to list
				listFields.add(piField);
			}
		}
		return listFields;
	}
	
	/**
	 * Import PI
	 * @param inputStream	of csv file
	 */
	public Object[] importPi(InputStream inputStream) {

		InputStreamReader inR = new InputStreamReader(inputStream);
		CsvReaderSlmToolbox csvReader = new CsvReaderSlmToolbox(inputStream, ConstantsCsvPi.CSV_SEPARATOR,
				Charset.forName(inR.getEncoding()));
		csvReader.setTextQualifier('"');
		csvReader.setUseTextQualifier(true);

		// read csv
		List<Object> messages = new ArrayList<Object>();
		try {
			csvReader.readRecord(); //fist line is header
			while (csvReader.readRecord()) {
				// add test line valid
				Object[] messagesError = isLineValid(csvReader);
				if (null != messagesError && 0 == messagesError.length) {
					// find PiCategory1
					PiCategory1 category1 = this.serviceDao.findCategory1(
							csvReader.get(ConstantsCsvPi.COLUMN_CAT_1_CODE));
					// add PiCategory1 if not exist in data
					if (null == category1) {
						category1 = new PiCategory1(
								csvReader.get(ConstantsCsvPi.COLUMN_CAT_1_CODE), 
								csvReader.get(ConstantsCsvPi.COLUMN_CAT_1_NAME));
						this.serviceDao.add(category1);
					}
					// find PiCategory2
					PiCategory2 category2 = this.serviceDao.findCategory2(
							csvReader.get(ConstantsCsvPi.COLUMN_CAT_2_CODE),
							csvReader.get(ConstantsCsvPi.COLUMN_CAT_1_CODE));
					// add PiCategory2 if not exist in data
					if (null == category2) {
						category2 = new PiCategory2(
								csvReader.get(ConstantsCsvPi.COLUMN_CAT_2_CODE), 
								csvReader.get(ConstantsCsvPi.COLUMN_CAT_2_NAME));
						category2.setCategory1(category1);
						this.serviceDao.add(category2);
					}
					// find PiCategory3
					PiCategory3 category3 = this.serviceDao.findCategory3(
							csvReader.get(ConstantsCsvPi.COLUMN_CAT_3_CODE),
							csvReader.get(ConstantsCsvPi.COLUMN_CAT_2_CODE));
					// add PiCategory3 if not exist in data
					if (null == category3) {
						category3 = new PiCategory3(
								csvReader.get(ConstantsCsvPi.COLUMN_CAT_3_CODE), 
								csvReader.get(ConstantsCsvPi.COLUMN_CAT_3_NAME));
						category3.setCategory2(category2);
						this.serviceDao.add(category3);
					}
					// find PiDimension
					String dimensionName = csvReader.get(ConstantsCsvPi.COLUMN_DIMENSION);
					PiDimension dimension = this.serviceDao.findDimension(dimensionName);
					// if PiMetric have PiDimension add if not exist in data
					if (null != dimensionName && dimensionName.length() > 0 && null == dimension) {
						dimension =  new PiDimension(null,dimensionName);
						this.serviceDao.add(dimension);
					}
					// for all PiField
					List<PiField> listFields = new ArrayList<PiField>();
					String fields = csvReader.get(ConstantsCsvPi.COLUMN_FIELDS);
					if (null != fields && fields.length() > 0) {
						String[] tableField = fields.split(",");
						for (int i=0; i<tableField.length; i++) {
							// add PiField if not exist in data
							PiField piField = this.serviceDao.findField(tableField[i].trim());
							if (null == piField) {
								piField =  new PiField(null,tableField[i].trim());
								this.serviceDao.add(piField);
							}
							listFields.add(piField);
						}
					}
					// create PI
					PiMetric metric = new PiMetric(
							null,
							csvReader.get(ConstantsCsvPi.COLUMN_PI_NAME));
					metric.setUnit(csvReader.get(ConstantsCsvPi.COLUMN_UNIT));
					metric.setCategory3(category3);
					metric.setDimension(dimension);
					metric.setFieldsList(listFields);
					// add PiField
					this.serviceDao.add(metric);
				} else {
					// if not valid return message error
				}
				
				for (int i=0; i < messagesError.length; i++) {
					messages.add(messagesError[i]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinalizedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CatastrophicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return messages.toArray();
	}
	
	/**
	 * Valid line
	 * @param csvReader
	 * @return
	 */
	private Object[] isLineValid(CsvReaderSlmToolbox csvReader) {
		List<String> messages = new ArrayList<String>();
		// test column
		if (csvReader.getColumnCount() != 11) {
			messages.add("Error line " + csvReader.getPosition() + " not have good number column");
		} else {
			int column = 0;
			// test all code
			try {
				column = ConstantsCsvPi.COLUMN_CAT_1_CODE; // category 1 code Column
				String codeCat1 = csvReader.get(column);
				if (null == codeCat1 || "".equals(codeCat1)) {
					messages.add("Not found category 1 code for line " + csvReader.getPosition());
				}
				column = ConstantsCsvPi.COLUMN_CAT_2_CODE; // category 2 code Column
				String codeCat2 = csvReader.get(column);
				if (null == codeCat2 || "".equals(codeCat2)) {
					messages.add("Not found category 2 code for line " + csvReader.getPosition());
				}
				column = ConstantsCsvPi.COLUMN_CAT_3_CODE; // category 3 code Column
				String codeCat3 = csvReader.get(column);
				if (null == codeCat3 || "".equals(codeCat3)) {
					messages.add("Not found category 3 code for line " + csvReader.getPosition());
				}
				
			} catch (FinalizedException e) {
				messages.add("Error for reade data line " + csvReader.getPosition() + " column " + column); //FIXME message
			}
			
		}
		return messages.toArray();
	}

	/**
	 * Export PI
	 * @param outputFile file export uri
	 * @return error messages
	 */
	public Object[] exportPi(String outputFile) {
		List<Object> messages = new ArrayList<Object>();
			
		try {
			// use FileWriter constructor that specifies open for appending
			FileWriter temp = new FileWriter(outputFile, true);
			CsvWriter csvOutput = new CsvWriter(temp, ConstantsCsvPi.CSV_SEPARATOR);
			
			// header
			csvOutput.write("mdsea_level");
			csvOutput.write("code_category_1");
			csvOutput.write("name_category_1");
			csvOutput.write("code_category_2");
			csvOutput.write("name_category_2");
			csvOutput.write("code_category_3");
			csvOutput.write("name_category_3");
			csvOutput.write("fields");
			csvOutput.write("dimension");
			csvOutput.write("pi_name");
			csvOutput.write("unit");
			csvOutput.endRecord();
			
			// write out a few records
			List<PiMetric> listMetric = getListMetrics(null, null, null, null, null, null);
			for (PiMetric metric : listMetric) {
				PiCategory3 category3 = metric.getCategory3();
				PiCategory2 category2 = category3.getCategory2();
				PiCategory1 category1 = category2.getCategory1();
				PiDimension dimention = metric.getDimension();
				String fields = metric.getFields();
				
				csvOutput.write(" ");
				csvOutput.write(category1.getId());
				csvOutput.write(category1.getName());
				csvOutput.write(category2.getId());
				csvOutput.write(category2.getName());
				csvOutput.write(category3.getId());
				csvOutput.write(category3.getName());
				csvOutput.write(fields);// field
				if (null != dimention) {
					csvOutput.write(dimention.getName());
				} else {
					csvOutput.write("");
				}
				csvOutput.write(metric.getName());
				csvOutput.write(metric.getUnit());
				csvOutput.endRecord();
			}
			csvOutput.close();
			temp.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (com.csvreader.CsvWriter.FinalizedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return messages.toArray();
	}

}

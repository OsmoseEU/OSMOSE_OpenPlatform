package org.msee.slmtoolbox.modeling.service.app.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import com.csvreader.CsvReader;

/**
 * Csv reader  class for slmtoolbox
 * @author fto
 *
 */
public class CsvReaderSlmToolbox extends CsvReader {

	/**
	 * Line position
	 */
	private int position;

	/**
	 * Default constructor
	 * @param inputStream
	 * @param charSeparator
	 * @param charset
	 */
	public CsvReaderSlmToolbox(InputStream inputStream, char charSeparator, Charset charset) {
		super(inputStream, charSeparator, charset);
		this.position = 1;
	}
	
	/**
	 * Read Record
	 * @return if can read
	 */
	public boolean readRecord() throws IOException, FinalizedException, CatastrophicException{
		boolean readRecord = super.readRecord();
		if (readRecord) {
			this.position ++;
		}
		return readRecord;
	}
	
	/**
	 * Get current line position
	 */
    public int getPosition(){
    	return this.position;
    }
    
    

}

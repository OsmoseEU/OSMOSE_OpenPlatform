package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pimport;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;

/**
 * Model du tableau de la liste des générations de PDF
 * @author fto
 *
 */
public class MetricModel extends AbstractTableModel {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** Data */
    private List<PiMetric> data;
    
	/** Title data */
    private String[] title;
 
    /**
     * Default constructor
     * @param data
     * @param title
     */
	public MetricModel() {

		this.data = new ArrayList<PiMetric>();
		String temp[] = {"Category 1", "Category 2", "Category 3", "Dimension", "Name"};
		this.title = temp;
	}
	
	/**
	 * Retourne le titre de la colonne à l'indice spécifié
	 */
	public String getColumnName(int col) {
		return this.title[col];
	}
	
	public Class<?> getColumnClass(int col){
		return String.class;
	}
	
	public boolean isCellEditable(int row, int col){
	  return false; 
	}
	

    /**
     * Retourne le nombre de colonnes
     */
	@Override
	public int getColumnCount() {
		return this.title.length;
	}

	/**
	 * Retourne le nombre de lignes
	 */
	@Override
	public int getRowCount() {
		return this.data.size();
	}

	/**
	 * Retourne la valeur à l'emplacement spécifié
	 */
	@Override
	public Object getValueAt(int row, int col) {
		if (row >= 0) {
			PiMetric metric = this.data.get(row);
	    	switch (col) {
	    	// "Category 1"
			case 0:
				if(null != metric.getCategory3()
						&& null != metric.getCategory3().getCategory2()
						&&  null != metric.getCategory3().getCategory2().getCategory1()) {
					return metric.getCategory3().getCategory2().getCategory1().getName();
				} else {
					return "";
				}
			// "Category 2"
			case 1:
				if(null != metric.getCategory3()
				&& null != metric.getCategory3().getCategory2()) {
						return metric.getCategory3().getCategory2().getName();
				} else {
					return "";
				}
			// "Category 3"
			case 2:
				if(null != metric.getCategory3()) {
					return metric.getCategory3().getName();
				} else {
					return "";
				}
			// "Dimension"
			case 3:
				if (null != metric.getDimension()) {
					return metric.getDimension().getName();
				} else {
					return "";
				}
			// "Name"
			case 4:
				return metric.getName();
			default:
				return null;
			}
		} else {
			return null;
		}
	}
	
	/**
	 * @param row		row index
	 * @return get data in a row
	 */
	public PiMetric getData(int row) {
		if (row >= 0) {
			return this.data.get(row);
		} else {
			return null;
		}
	}
	
	/**
	 * Clear data
	 */
	public void clear(){
		this.data.clear();
		this.fireTableDataChanged();
	}
	
	/**
	 * Add data list
	 * @param newData	data list
	 */
	public void addAll(List<PiMetric> newData) {
		this.data.addAll(newData);
		this.fireTableDataChanged();
	}
}

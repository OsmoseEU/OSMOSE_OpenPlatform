package org.msee.slmtoolbox.modeling.editor.graphiti.style;

/**
 * Bean defin color for paint graphic element
 * @author fto
 *
 */
public class MseeStylePaintColor {

	/** id */
	private String id;
	
	/** name */
	private String name;
	
	/** first color */
	private int[] colorFirst;

	/** Second color */
	private int[] colorSecond;  
	
	/** Third color*/
	private int[] colorThrid;    
	
	/** Fourth color*/
	private int[] colorFourth;  
	
	/**
	 * Constructor with param
	 * @param id			id style
	 * @param name			name style
	 * @param colorFirst	first color for style, int table with 3 data [red,green,blue]  light color
	 * @param colorSecond	Second color for style, int table with 3 data [red,green,blue] standard color
	 * @param colorThrid	Third color for style, int table with 3 data [red,green,blue]  dark color
	 * @param colorFourth	Third color for style, int table with 3 data [red,green,blue]  bottom color	
	 */
	public MseeStylePaintColor(String id, String name,int[] colorFirst,int[] colorSecond,int[] colorThrid,int[] colorFourth) {
		this.id = id;
		this.name = name;
		this.colorFirst = addColor(colorFirst);
		this.colorSecond = addColor(colorSecond);
		this.colorThrid = addColor(colorThrid);
		this.colorFourth = addColor(colorFourth);
	}

	/**
	 * Valide and add color
	 * @param color
	 * @return
	 */
	private int[] addColor(int[] color) {
		if (color.length < 3) {
			return new int[]{255,255,255};
		} else if (color.length > 3) {
			return new int[]{color[0], color[1], color[2]};
		} else {
			return color;
		}
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the colorFirst
	 */
	public int[] getColorFirst() {
		return colorFirst;
	}

	/**
	 * @param colorFirst the colorFirst to set
	 */
	public void setColorFirst(int[] colorFirst) {
		this.colorFirst = colorFirst;
	}

	/**
	 * @return the colorSecond
	 */
	public int[] getColorSecond() {
		return colorSecond;
	}

	/**
	 * @param colorSecond the colorSecond to set
	 */
	public void setColorSecond(int[] colorSecond) {
		this.colorSecond = colorSecond;
	}

	/**
	 * @return the colorThrid
	 */
	public int[] getColorThrid() {
		return colorThrid;
	}

	/**
	 * @param colorThrid the colorThrid to set
	 */
	public void setColorThrid(int[] colorThrid) {
		this.colorThrid = colorThrid;
	}

	/**
	 * @return the colorFourth
	 */
	public int[] getColorFourth() {
		return colorFourth;
	}

	/**
	 * @param colorFourth the colorFourth to set
	 */
	public void setColorFourth(int[] colorFourth) {
		this.colorFourth = colorFourth;
	}
	
	
}

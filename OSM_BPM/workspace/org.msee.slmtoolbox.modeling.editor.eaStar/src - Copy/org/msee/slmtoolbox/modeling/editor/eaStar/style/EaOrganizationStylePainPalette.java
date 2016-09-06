package org.msee.slmtoolbox.modeling.editor.eaStar.style;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePaintColor;

public class EaOrganizationStylePainPalette extends MseeStylePainPalette {
	
	/** ID for style RED */
	public static final String ID_STYLE_RED = "STYLE_RED";
	/** ID for style BLUE */
	public static final String ID_STYLE_BLUE = "STYLE_BLUE";
	/** ID for style GREEN */
	public static final String ID_STYLE_GREEN = "STYLE_GREEN";
	/** ID for style YELLOW */
	public static final String ID_STYLE_YELLOW = "STYLE_YELLOW";
	/** ID for style CYAN */
	public static final String ID_STYLE_CYAN = "STYLE_CYAN";
	/** ID for style PURPLE */
	public static final String ID_STYLE_PURPLE = "STYLE_PURPLE";
	/** ID for style WITH */
	public static final String ID_STYLE_WITH = "STYLE_WITH";
	/** ID for style GRAY */
	public static final String ID_STYLE_GRAY = "STYLE_GRAY";

	/**
	 * Default list of style
	 */
	@SuppressWarnings("serial")
	public static final List<MseeStylePaintColor> DEFAULT_LIST = new ArrayList<MseeStylePaintColor>(){{
		add(new MseeStylePaintColor(ID_STYLE_RED,"Red",
				new int[]{255,250,250},
				new int[]{255,240,240},
				new int[]{255,240,240},
				new int[]{250,230,230}));
		add(new MseeStylePaintColor(ID_STYLE_BLUE,"Blue",
				new int[]{250,250,255},
				new int[]{240,245,255},
				new int[]{240,245,255},
				new int[]{230,230,250}));
		add(new MseeStylePaintColor(ID_STYLE_GREEN,"Green",
				new int[]{250,255,250},
				new int[]{240,255,240},
				new int[]{230,255,230},
				new int[]{230,250,230}));
		add(new MseeStylePaintColor(ID_STYLE_YELLOW,"Yellow",
				new int[]{255,255,250},
				new int[]{255,250,240},
				new int[]{255,250,230},
				new int[]{250,250,230}));
		add(new MseeStylePaintColor(ID_STYLE_CYAN,"Cyan",
				new int[]{250,255,255},
				new int[]{240,250,255},
				new int[]{230,245,255},
				new int[]{230,245,250}));
		add(new MseeStylePaintColor(ID_STYLE_PURPLE,"Purple",
				new int[]{255,250,255},
				new int[]{250,240,255},
				new int[]{245,230,255},
				new int[]{245,230,250}));
		add(new MseeStylePaintColor(ID_STYLE_WITH,"White",
				new int[]{255,255,255},
				new int[]{255,255,255},
				new int[]{250,250,250},
				new int[]{240,240,240}));
		add(new MseeStylePaintColor(ID_STYLE_GRAY,"Gray",
				new int[]{250,250,250},
				new int[]{240,240,240},
				new int[]{230,230,230},
				new int[]{230,230,230}));
		}};
	
	/**
	 * Gest a list of name style 
	 * @return
	 */
	public String[] getListNameStyle() {
		String[] listNameStyle = new String [DEFAULT_LIST.size() + 1];
		
		int i = 0;
		for (MseeStylePaintColor style : DEFAULT_LIST) {
			listNameStyle[i]= style.getName();
			i++;
		}
		listNameStyle[i] = "Default";
		return listNameStyle;
	}

	/**
	 * Get style paint
	 * @param index	of getListNameStyle()
	 * @return null if not found style
	 */
	public MseeStylePaintColor getStylePaint(int index) {
		if (null != DEFAULT_LIST && DEFAULT_LIST.size() > index && -1 != index) {
			return DEFAULT_LIST.get(index);
		} else {
			return null;
		}
	}
	/**
	 * Get style paint
	 * @param id of MseeStylePaintColor in DEFAULT_LIST
	 * @return null if not found style
	 */
	public static MseeStylePaintColor getStylePaint(String id) {
		if (null != id) {
			for (MseeStylePaintColor stylePaint : DEFAULT_LIST) {
				if (id.equals(stylePaint.getId())) {
					return stylePaint;
				}
			}
		}
		return null;
	}
}
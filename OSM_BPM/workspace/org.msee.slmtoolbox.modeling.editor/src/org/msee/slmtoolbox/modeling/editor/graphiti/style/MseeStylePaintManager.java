package org.msee.slmtoolbox.modeling.editor.graphiti.style;

import java.awt.Color;
import java.util.Collection;

import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class MseeStylePaintManager {
	
	//private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(MseeStylePaintManager.class);
	
	private static final int COLOR_OMBRE = 5;


	/** Style for a InformationSource element 
	 * @param diagram
	 * @param stylePaint
	 * @param templateColored
	 */
	public static Style getStyle(Diagram diagram, MseeStylePaintColor stylePaint, AbstractMsseTemplateColoredAreas templateColored) {
		Style style = findStyle(diagram, templateColored.getPrefixId() + stylePaint.getId());

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(diagram, stylePaint.getId());
			
			gaService.setRenderingStyle(style,
					templateColored.getAreas(stylePaint.getId(),
							stylePaint.getColorFirst(),
							stylePaint.getColorSecond(),
							stylePaint.getColorThrid(),
							stylePaint.getColorFourth()));
			style.setForeground(gaService.manageColor(diagram,
					getColorForeground(stylePaint.getColorSecond())));
			style.setLineStyle(LineStyle.SOLID);
			style.setLineWidth(1);
		}
		return style;
	}
	
	/**
	 * Get color for foreground
	 * @param color	[red,green,blue]
	 */
	private static IColorConstant getColorForeground(int[] color) {
		return new ColorConstant(color[0]-125,color[1]-125,color[2]-125);
	}


	// find the style with a given id in the style-container, can return null
	private static Style findStyle(StyleContainer styleContainer, String id) {
		// find and return style
		Collection<Style> styles = styleContainer.getStyles();
		if (styles != null) {
			for (Style style : styles) {
				if (id.equals(style.getId())) {
					return style;
				}
			}
		}
		return null;
	}

	public static String color(int[] color, boolean selected) {
		Color colorTemp = new Color(250,250,250);
		if (color.length > 2) {
			colorTemp= new Color(color[0],color[1],color[2]);
		}
		
		if (!selected) {
			colorTemp= new Color(colorTemp.getRed() - COLOR_OMBRE,colorTemp.getGreen() - COLOR_OMBRE,colorTemp.getBlue() - COLOR_OMBRE);
		}
		
		String colorHexa = String.valueOf(Integer.toHexString(colorTemp.getRGB()));
		if (colorHexa.length() > 6 ) {
			return colorHexa.substring(colorHexa.length()-6);
		} else {
			return colorHexa;
		}
	}
}

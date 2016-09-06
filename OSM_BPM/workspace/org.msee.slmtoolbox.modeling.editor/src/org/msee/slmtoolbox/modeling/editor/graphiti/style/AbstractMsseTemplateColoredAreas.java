package org.msee.slmtoolbox.modeling.editor.graphiti.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

/**
 * Abstract class for define style color area
 * @author fto
 */
public abstract class AbstractMsseTemplateColoredAreas extends PredefinedColoredAreas {

	/**
	 * The color-areas for elements InformationSource
	 * @param colorDown 
	 * @param color 
	 * @param colorUp 
	 * @param styleId 
	 */
	public AdaptedGradientColoredAreas getAreas(String styleId, int[] colorLight, int[] color, int[] colorDark, int[] colorBottom) {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(styleId+"Gradient");
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getDefaultAreas(colorLight,color,colorDark,colorBottom));
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getSelectedAreas(colorLight,color,colorDark,colorBottom));
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getSelectedAreas(colorLight,color,colorDark,colorBottom));
		
		return agca;
	}

	/**
	 * The color-areas for primary default elements InformationSource
	 * @param colorDark 
	 * @param color 
	 * @param colorLight 
	 */
	private GradientColoredAreas getDefaultAreas(int[] colorLight, int[] color, int[] colorDark, int[] colorBottom) {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addColorToGradientArea(gcas,colorLight,color,colorDark, colorBottom,false);
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
		return gradientColoredAreas;
	}

	/**
	 * The color-areas for primary selected elements InformationSource
	 * @param colorDown 
	 * @param color 
	 * @param colorUp 
	 */
	private GradientColoredAreas getSelectedAreas(int[] colorLight, int[] color, int[] colorDark, int[] colorBottom) {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addColorToGradientArea(gcas,colorLight,color,colorDark,colorBottom,true);

		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);

		return gradientColoredAreas;
	}
	
	/**
	 * add a color in the area
	 * @param gcas			gradient colored area
	 * @param colorLight	color light
	 * @param color			color standar
	 * @param colorDark		color dark
	 * @param colorBottom	color bottom
	 * @param selected		flag for a element area selected or no
	 */
	protected abstract void addColorToGradientArea(EList<GradientColoredArea> gcas,
			int[] colorLight, int[] color, int[] colorDark, int[] colorBottom, boolean selected);
	
	/**
	 * Get a prefix for id style
	 * @return
	 */
	public abstract String getPrefixId();
	
}

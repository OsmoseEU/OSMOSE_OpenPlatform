package org.msee.slmtoolbox.modeling.editor.eaStar.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

public class EaColoredAreas extends PredefinedColoredAreas {

	/** The ID for a function gradient. */
	public static final String WHITE_ID = "whiteIdGradient";
	/** The ID for a function gradient. */
	public static final String INVISIBLE_ID = "invisibleIdGradient";

	/**
	 * The color-areas for elements function
	 */
	public static AdaptedGradientColoredAreas getWhiteAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(WHITE_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getWhiteGradientColoredAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getWhiteGradientColoredAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getWhiteGradientColoredAreas());
		return agca;
	}

	public static AdaptedGradientColoredAreas getInvisibleAreas() {
		final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE
				.createAdaptedGradientColoredAreas();
		agca.setDefinedStyleId(INVISIBLE_ID);
		agca.setGradientType(IGradientType.VERTICAL);
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
				getInvisibleGradientColoredAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
				getInvisibleGradientColoredAreas());
		agca.getAdaptedGradientColoredAreas().add(
				IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
				getInvisibleGradientColoredAreas());
		return agca;
	}

	/**
	 * The color-areas for primary selected elements function
	 */
	private static GradientColoredAreas getWhiteGradientColoredAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		final EList<GradientColoredArea> gcas = gradientColoredAreas
				.getGradientColor();

		addGradientColoredArea(
				gcas,
				"FFFFFF", 0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 0, //$NON-NLS-1$ //$NON-NLS-2$
				LocationType.LOCATION_TYPE_ABSOLUTE_END);
		
		gradientColoredAreas
				.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);

		return gradientColoredAreas;
	}
	/**
	 * The color-areas for primary selected elements function
	 */
	private static GradientColoredAreas getInvisibleGradientColoredAreas() {
		final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE
				.createGradientColoredAreas();
		return gradientColoredAreas;
	}
	      
	
	/**
	 * 
	 * OSMIOTIC GRAPHITTI COLORS
	 * GRAY = UNDEFINED (Min=#A9ABAD Max=#8F95AA)
	 * RED = VIRTUAL (Min=#E37367 Max=#D23E3E)
	 * GREEN = DIGITAL (Min=#A0BD6B Max=#85BB43)
	 * BLUE = REAL (Min=#81D7FA Max=#0F65AE)
	 */
	 
	 // VIRTUAL = RED
	 

        private static GradientColoredAreas getRedWhiteDefaultAreas() {
            final GradientColoredAreas gradientColoredAreas =
                  StylesFactory.eINSTANCE.createGradientColoredAreas();
            final EList<GradientColoredArea> gcas =
                  gradientColoredAreas.getGradientColor();
     
            addGradientColoredArea(gcas, "E37367", 0, 
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "E37367", 1,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START);
            addGradientColoredArea(gcas, "E37367", 1,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "E37367", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START);
            addGradientColoredArea(gcas, "E37367", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "E37367", 3,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START);
            addGradientColoredArea(gcas, "E37367", 3,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "E37367", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_END);
            addGradientColoredArea(gcas, "E37367", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_END, "E37367", 0,
                  LocationType.LOCATION_TYPE_ABSOLUTE_END);
            gradientColoredAreas.setStyleAdaption
                  (IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
            return gradientColoredAreas;
        }
     
        private static GradientColoredAreas getRedWhitePrimarySelectedAreas() {
            final GradientColoredAreas gradientColoredAreas =
                  StylesFactory.eINSTANCE.createGradientColoredAreas();
            gradientColoredAreas.setStyleAdaption
                  (IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
            final EList<GradientColoredArea> gcas =
                  gradientColoredAreas.getGradientColor();
     
            addGradientColoredArea(gcas, "D23E3E", 0,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "D23E3E", 1,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START);
            addGradientColoredArea(gcas, "D23E3E", 1,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "D23E3E", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START);
            addGradientColoredArea(gcas, "D23E3E", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "D23E3E", 3,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START);
            addGradientColoredArea(gcas, "D23E3E", 3,
                  LocationType.LOCATION_TYPE_ABSOLUTE_START, "D23E3E", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_END);
            addGradientColoredArea(gcas, "D23E3E", 2,
                  LocationType.LOCATION_TYPE_ABSOLUTE_END, "D23E3E", 0,
                  LocationType.LOCATION_TYPE_ABSOLUTE_END);
            return gradientColoredAreas;
          }
     
          private static GradientColoredAreas getRedWhiteSecondarySelectedAreas() {
              final GradientColoredAreas gradientColoredAreas =
                    StylesFactory.eINSTANCE.createGradientColoredAreas();
              gradientColoredAreas.setStyleAdaption
                    (IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
              final EList<GradientColoredArea> gcas =
                    gradientColoredAreas.getGradientColor();
     
              addGradientColoredArea(gcas, "FF5C70", 0,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "FF5C70", 1,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "FF5C70", 1,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "FF5C70", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "33FF5C70CC66", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "FF5C70", 3,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "FF5C70", 3,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "FF5C70", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END);
              addGradientColoredArea(gcas, "FF5C70", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END, "FF5C70", 0,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END);
              return gradientColoredAreas;
          }
     
          public static AdaptedGradientColoredAreas getRedWhiteAdaptions() {
              final AdaptedGradientColoredAreas agca =
                    StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
              agca.setDefinedStyleId("Red-white");
              agca.setGradientType(IGradientType.VERTICAL);
              agca.getAdaptedGradientColoredAreas()
                   .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                		   getRedWhiteDefaultAreas());
              agca.getAdaptedGradientColoredAreas()
                   .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                    getRedWhitePrimarySelectedAreas());
              agca.getAdaptedGradientColoredAreas()
                  .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                		  getRedWhiteSecondarySelectedAreas());
              return agca;
          }

          //DIGITAL = GREEN

          private static GradientColoredAreas getGreenWhiteDefaultAreas() {
              final GradientColoredAreas gradientColoredAreas =
                    StylesFactory.eINSTANCE.createGradientColoredAreas();
              final EList<GradientColoredArea> gcas =
                    gradientColoredAreas.getGradientColor();
       
              addGradientColoredArea(gcas, "A0BD6B", 0, 
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 1,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "A0BD6B", 1,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "A0BD6B", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 3,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "A0BD6B", 3,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END);
              addGradientColoredArea(gcas, "A0BD6B", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END, "A0BD6B", 0,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END);
              gradientColoredAreas.setStyleAdaption
                    (IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
              return gradientColoredAreas;
          }
       
          private static GradientColoredAreas getGreenWhitePrimarySelectedAreas() {
              final GradientColoredAreas gradientColoredAreas =
                    StylesFactory.eINSTANCE.createGradientColoredAreas();
              gradientColoredAreas.setStyleAdaption
                    (IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
              final EList<GradientColoredArea> gcas =
                    gradientColoredAreas.getGradientColor();
       
              addGradientColoredArea(gcas, "85BB43", 0,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "85BB43", 1,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "85BB43", 1,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "85BB43", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "85BB43", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "85BB43", 3,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START);
              addGradientColoredArea(gcas, "85BB43", 3,
                    LocationType.LOCATION_TYPE_ABSOLUTE_START, "85BB43", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END);
              addGradientColoredArea(gcas, "85BB43", 2,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END, "85BB43", 0,
                    LocationType.LOCATION_TYPE_ABSOLUTE_END);
              return gradientColoredAreas;
            }
       
            private static GradientColoredAreas getGreenWhiteSecondarySelectedAreas() {
                final GradientColoredAreas gradientColoredAreas =
                      StylesFactory.eINSTANCE.createGradientColoredAreas();
                gradientColoredAreas.setStyleAdaption
                      (IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
                final EList<GradientColoredArea> gcas =
                      gradientColoredAreas.getGradientColor();
       
                addGradientColoredArea(gcas, "A0BD6B", 0,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 1,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "A0BD6B", 1,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "A0BD6B", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 3,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "A0BD6B", 3,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "A0BD6B", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END);
                addGradientColoredArea(gcas, "A0BD6B", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END, "A0BD6B", 0,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END);
                return gradientColoredAreas;
            }
       
            public static AdaptedGradientColoredAreas getGreenWhiteAdaptions() {
                final AdaptedGradientColoredAreas agca =
                      StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
                agca.setDefinedStyleId("Green-white");
                agca.setGradientType(IGradientType.VERTICAL);
                agca.getAdaptedGradientColoredAreas()
                     .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                     getGreenWhiteDefaultAreas());
                agca.getAdaptedGradientColoredAreas()
                     .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                      getGreenWhitePrimarySelectedAreas());
                agca.getAdaptedGradientColoredAreas()
                    .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                     getGreenWhiteSecondarySelectedAreas());
                return agca;
            }
            
            //REAL = BLUE

            private static GradientColoredAreas getBlueWhiteDefaultAreas() {
                final GradientColoredAreas gradientColoredAreas =
                      StylesFactory.eINSTANCE.createGradientColoredAreas();
                final EList<GradientColoredArea> gcas =
                      gradientColoredAreas.getGradientColor();
         
                addGradientColoredArea(gcas, "3399FF", 0, 
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "3399FF", 1,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "3399FF", 1,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "3399FF", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "3399FF", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "3399FF", 3,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "3399FF", 3,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "3399FF", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END);
                addGradientColoredArea(gcas, "3399FF", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END, "3399FF", 0,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END);
                gradientColoredAreas.setStyleAdaption
                      (IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
                return gradientColoredAreas;
            }
         
            private static GradientColoredAreas getBlueWhitePrimarySelectedAreas() {
                final GradientColoredAreas gradientColoredAreas =
                      StylesFactory.eINSTANCE.createGradientColoredAreas();
                gradientColoredAreas.setStyleAdaption
                      (IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
                final EList<GradientColoredArea> gcas =
                      gradientColoredAreas.getGradientColor();
         
                addGradientColoredArea(gcas, "0F65AE", 0,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "0F65AE", 1,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "0F65AE", 1,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "0F65AE", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "0F65AE", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "0F65AE", 3,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START);
                addGradientColoredArea(gcas, "0F65AE", 3,
                      LocationType.LOCATION_TYPE_ABSOLUTE_START, "0F65AE", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END);
                addGradientColoredArea(gcas, "0F65AE", 2,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END, "0F65AE", 0,
                      LocationType.LOCATION_TYPE_ABSOLUTE_END);
                return gradientColoredAreas;
              }
         
              private static GradientColoredAreas getBlueWhiteSecondarySelectedAreas() {
                  final GradientColoredAreas gradientColoredAreas =
                        StylesFactory.eINSTANCE.createGradientColoredAreas();
                  gradientColoredAreas.setStyleAdaption
                        (IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
                  final EList<GradientColoredArea> gcas =
                        gradientColoredAreas.getGradientColor();
         
                  addGradientColoredArea(gcas, "81D7FA", 0,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "81D7FA", 1,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "81D7FA", 1,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "81D7FA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "81D7FA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "81D7FA", 3,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "81D7FA", 3,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "81D7FA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END);
                  addGradientColoredArea(gcas, "81D7FA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END, "81D7FA", 0,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END);
                  return gradientColoredAreas;
              }
         
              public static AdaptedGradientColoredAreas getBlueWhiteAdaptions() {
                  final AdaptedGradientColoredAreas agca =
                        StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
                  agca.setDefinedStyleId("Blue-white");
                  agca.setGradientType(IGradientType.VERTICAL);
                  agca.getAdaptedGradientColoredAreas()
                       .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                       getBlueWhiteDefaultAreas());
                  agca.getAdaptedGradientColoredAreas()
                       .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                        getBlueWhitePrimarySelectedAreas());
                  agca.getAdaptedGradientColoredAreas()
                      .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                       getBlueWhiteSecondarySelectedAreas());
                  return agca;
              }
              //UNDEFINED = GRAY

              private static GradientColoredAreas getGrayWhiteDefaultAreas() {
                  final GradientColoredAreas gradientColoredAreas =
                        StylesFactory.eINSTANCE.createGradientColoredAreas();
                  final EList<GradientColoredArea> gcas =
                        gradientColoredAreas.getGradientColor();
           
                  addGradientColoredArea(gcas, "FFFFFF", 0, 
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 1,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "FFFFFF", 1,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "FFFFFF", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 3,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "FFFFFF", 3,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "FFFFFF", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END);
                  addGradientColoredArea(gcas, "FFFFFF", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END, "FFFFFF", 0,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END);
                  gradientColoredAreas.setStyleAdaption
                        (IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
                  return gradientColoredAreas;
              }
           
              private static GradientColoredAreas getGrayWhitePrimarySelectedAreas() {
                  final GradientColoredAreas gradientColoredAreas =
                        StylesFactory.eINSTANCE.createGradientColoredAreas();
                  gradientColoredAreas.setStyleAdaption
                        (IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
                  final EList<GradientColoredArea> gcas =
                        gradientColoredAreas.getGradientColor();
           
                  addGradientColoredArea(gcas, "8F95AA", 0,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "8F95AA", 1,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "8F95AA", 1,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "8F95AA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "8F95AA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "8F95AA", 3,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START);
                  addGradientColoredArea(gcas, "8F95AA", 3,
                        LocationType.LOCATION_TYPE_ABSOLUTE_START, "8F95AA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END);
                  addGradientColoredArea(gcas, "8F95AA", 2,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END, "8F95AA", 0,
                        LocationType.LOCATION_TYPE_ABSOLUTE_END);
                  return gradientColoredAreas;
                }
           
                private static GradientColoredAreas getGrayWhiteSecondarySelectedAreas() {
                    final GradientColoredAreas gradientColoredAreas =
                          StylesFactory.eINSTANCE.createGradientColoredAreas();
                    gradientColoredAreas.setStyleAdaption
                          (IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
                    final EList<GradientColoredArea> gcas =
                          gradientColoredAreas.getGradientColor();
           
                    addGradientColoredArea(gcas, "A9ABAD", 0,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START, "A9ABAD", 1,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START);
                    addGradientColoredArea(gcas, "A9ABAD", 1,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START, "A9ABAD", 2,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START);
                    addGradientColoredArea(gcas, "A9ABAD", 2,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START, "A9ABAD", 3,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START);
                    addGradientColoredArea(gcas, "A9ABAD", 3,
                          LocationType.LOCATION_TYPE_ABSOLUTE_START, "A9ABAD", 2,
                          LocationType.LOCATION_TYPE_ABSOLUTE_END);
                    addGradientColoredArea(gcas, "A9ABAD", 2,
                          LocationType.LOCATION_TYPE_ABSOLUTE_END, "A9ABAD", 0,
                          LocationType.LOCATION_TYPE_ABSOLUTE_END);
                    return gradientColoredAreas;
                }
           
                public static AdaptedGradientColoredAreas getGrayWhiteAdaptions() {
                    final AdaptedGradientColoredAreas agca =
                          StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
                    agca.setDefinedStyleId("Gray-white");
                    agca.setGradientType(IGradientType.VERTICAL);
                    agca.getAdaptedGradientColoredAreas()
                         .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                         getGrayWhiteDefaultAreas());
                    agca.getAdaptedGradientColoredAreas()
                         .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                          getGrayWhitePrimarySelectedAreas());
                    agca.getAdaptedGradientColoredAreas()
                        .add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                         getGrayWhiteSecondarySelectedAreas());
                    return agca;
                }
                
}

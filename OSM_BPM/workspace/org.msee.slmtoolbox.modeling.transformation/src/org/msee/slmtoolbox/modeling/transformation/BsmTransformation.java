package org.msee.slmtoolbox.modeling.transformation;


/**
 * Service class for transformation BSM file
 * @author fto
 *
 */
public class BsmTransformation {
	
	/**
	 * Service for transforation BSM to TIM
	 * @param inputFile
	 * @param outputFile
	 */
	public static void toTim(String inputFile, String outputFile) {
		// create an atl transformation object
		ATLTransformation atlTransformation = new ATLTransformation();
		// init the atl transformation object
		atlTransformation.setSourceMetaModePath(ATLTransformation.META_MODEL_BSM_PATH);
		atlTransformation.setSourceModelReferenceName("BSM");
		atlTransformation.setTargetMetaModePath(ATLTransformation.META_MODEL_TIM_PATH);
		atlTransformation.setTargetModelReferenceName("TIM");
		atlTransformation.setAtlPath(ATLTransformation.ATL_BSM_TIM_PATH);
		
		// execute transformation
		atlTransformation.transform(inputFile, outputFile);
	}
}
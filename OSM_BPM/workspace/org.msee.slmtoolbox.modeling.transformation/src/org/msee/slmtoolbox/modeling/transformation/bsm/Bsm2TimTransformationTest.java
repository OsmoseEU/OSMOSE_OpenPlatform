package org.msee.slmtoolbox.modeling.transformation.bsm;
import static org.junit.Assert.assertTrue;

import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;



public class Bsm2TimTransformationTest {

	public EaModel bsmModelToTransform;
	public EaModel bsmModel;

	// specify the paths of input and output files
	private String inputFilePath;
	private String outputFilePath;


	public Bsm2TimTransformationTest() {

		// define the pathes to inputFile.xmi and outputFile.xmi
		inputFilePath = "source files/bsm test.xmi";
		outputFilePath = "source files/outputFile.tim";

	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		// apply atl transformation
		Bsm2TimTransformation.transform(inputFilePath, outputFilePath);

		assertTrue(((EMFModel) Bsm2TimTransformation.getBsmModel())
				.getResource().getContents().size() == 1);
		assertTrue(((EMFModel) Bsm2TimTransformation.getTimModel())
				.getResource().getContents().size() > 0);
	}

}

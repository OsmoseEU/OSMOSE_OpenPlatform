package org.msee.slmtoolbox.modeling.transformation.eastar;
import static org.junit.Assert.assertTrue;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

//import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
//import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
//import org.eclipse.emf.cdo.net4j.CDOSession;
//import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
//import org.eclipse.emf.cdo.transaction.CDOTransaction;
//import org.eclipse.net4j.Net4jUtil;
//import org.eclipse.net4j.connector.IConnector;
//import org.eclipse.net4j.tcp.TCPUtil;
//import org.eclipse.net4j.util.container.IPluginContainer;
//import org.eclipse.net4j.util.lifecycle.ILifecycle;
//import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
//import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

//@SuppressWarnings("deprecation")
public class EAStar2BPMNTransformationTest {

	/**
	 * Cdo transaction for data service and find resource
	 */
//	private CDOTransaction transaction;
//	/**
//	 * 
//	 */
//	private BsmAppService bsmAppService;
	/**
	 * Data model resource
	 */
//	private Resource resource;
	public EaModel extendedActigramModelToTransform;
	public EaModel extendedActigramModel;

	// specify the paths of input and output files
	private String inputFilePath;
	private String outputFilePath;
	private String xsltFilePath;
	private String bpmnFilePath;
//	ID of the Extended Actigram Model stored in data base
//	private String EAStarModelId = "ExtendedActigramModelImpl_3475ab8b-5f74-4640-b834-949b7f9509d0";
//	private String EAStarModelId = "ExtendedActigramModelImpl_2d6cbb9f-7cc4-4a52-8028-bd0e6f63ff43";
	
//	private String EAStarModelId = "ExtendedActigramModelImpl_52a10643-ce72-4ec5-9cad-6c05a9f0f5fb";
	
//	Design Phase of products and services
//	private String EAStarModelId = "ExtendedActigramModelImpl_2dd1d959-a02b-4286-bf10-9ffb1d27fc88";
	
	// Design of the product service to be
//	private String EAStarModelId = "ExtendedActigramModelImpl_abace4a6-7903-4b0f-894e-baae4ef3a3cb";
	// order from producer
//	private String EAStarModelId = "ExtendedActigramModelImpl_822ef9d3-ca86-499c-be58-d314935b64fd";
	
	// Fullfill demande
//	private String EAStarModelId = "ExtendedActigramModelImpl_4399fe72-98c5-495a-8f5c-fdfa69337c7d";
	

	public EAStar2BPMNTransformationTest() {
		// prepare connection to cdo server
//		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
//		TCPUtil.prepareContainer(IPluginContainer.INSTANCE);
//		CDOSession session = openSession("repo1");
//		session.getPackageRegistry().putEPackage(BsmPackage.eINSTANCE);
//		// open transaction
//		transaction = session.openTransaction();
//		// get the cdo resource
//		resource = transaction.getOrCreateResource("/testing2");

//		bsmAppService = new BsmAppService(transaction, resource);
		// define the pathes to inputFile.xmi and outputFile.xmi
		inputFilePath = "source files/inputFile.xmi";
		outputFilePath = "source files/outputFile.xmi";
		// defoine the paths to xslt file and the new BPMN file
		xsltFilePath = "xslt/Transformation V2.xslt";
		bpmnFilePath = "source files/outputBPMNFile.bpmn";

//		// create an xmi (inputFile.xmi) resource containing an
//		// ExtendedActigramModel
//		extendedActigramModelToTransform = (ExtendedActigramModel) bsmAppService
//				.getEAStarProcess(EAStarModelId);
//		if (null != extendedActigramModelToTransform) {
//			extendedActigramModel = EcoreUtil
//					.copy(extendedActigramModelToTransform);
//		}
//		// create a new ResourceSet
//		ResourceSet resourceSet = new ResourceSetImpl();
//		// create an input eaStar xmi file
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put("xmi", new XMIResourceFactoryImpl());
//		Resource resource = resourceSet.createResource(URI
//				.createFileURI(inputFilePath));
//		// add the ExtendedActigramModel to the new created xmi file
//		// (inputFile.xmi)
//		resource.getContents().add(extendedActigramModel);
//		try {
//			Map<Object, Object> options = new HashMap<Object, Object>();
//			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
//			resource.save(options);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
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
		EAStarToBPMNTransformation.transformToCollaboration(inputFilePath, outputFilePath, "");
		// prepare the xml input file
		Source xmlInput = new StreamSource(new File(outputFilePath));
		// prepare the xsl file
		Source xsl = new StreamSource(new File(xsltFilePath));
		// prepare the xslt transformation's result file
		Result xmlOutput = new StreamResult(new File(bpmnFilePath));

		// apply xslt transformation
		try {
		    Transformer transformer = TransformerFactory.newInstance().newTransformer(xsl);
		    transformer.transform(xmlInput, xmlOutput);
		} catch (TransformerException e) {
		    // Handle.
		}
		assertTrue(((EMFModel) EAStarToBPMNTransformation.getEaStarModel())
				.getResource().getContents().size() == 1);
		assertTrue(((EMFModel) EAStarToBPMNTransformation.getBpmnModel())
				.getResource().getContents().size() > 0);

	}

	/**
	 * openSession
	 * 
	 * @param repoName
	 * @return CDOSession
	 */
//	public static CDOSession openSession(String repoName) {
//		final IConnector connector = (IConnector) IPluginContainer.INSTANCE
//				.getElement( //
//						"org.eclipse.net4j.connectors", // Product group
//						"tcp", // Type
//						"localhost"); // Description
//
//		CDOSessionConfiguration config = CDONet4jUtil
//				.createSessionConfiguration();
//		config.setConnector(connector);
//		config.setRepositoryName(repoName);
//
//		CDOSession session = config.openSession();
//
//		session.addListener(new LifecycleEventAdapter() {
//			@Override
//			protected void onDeactivated(ILifecycle lifecycle) {
//				connector.close();
//			}
//		});
//
//		return session;
//	}

}

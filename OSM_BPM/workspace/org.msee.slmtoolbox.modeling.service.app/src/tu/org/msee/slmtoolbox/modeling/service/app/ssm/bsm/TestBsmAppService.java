package tu.org.msee.slmtoolbox.modeling.service.app.ssm.bsm;

import java.io.IOException;
import java.util.Collections;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.service.app.exception.ServiceAppException;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

import tu.org.msee.slmtoolbox.modeling.service.app.AbstractTestAppService;

public class TestBsmAppService extends AbstractTestAppService<BsmAppService> {

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TestBsmAppService.class);
	
	/**
	 * Constructor for CopyOperationTest.
	 * @param arg
	 */
	public TestBsmAppService(String arg) {
		super(arg);
		setAppServiceClass(BsmAppService.class);
	}
	
	/**
	 * Test createBsmModel(...)
	 */
	public void testCreateBsmModel() {
		BsmModel bsm = getAppService().createBsmModel("bsmProjectName", "organizationName", "serviceName");
		try {
			if (null != getResource()) {
				getResource().save(Collections.EMPTY_MAP);
			}
		} catch (IOException e) {
			log.error(e.getMessage());
			throw new ServiceAppException(e);
		}
		assertTrue(getResource().getContents().contains(bsm));
		
	}

}

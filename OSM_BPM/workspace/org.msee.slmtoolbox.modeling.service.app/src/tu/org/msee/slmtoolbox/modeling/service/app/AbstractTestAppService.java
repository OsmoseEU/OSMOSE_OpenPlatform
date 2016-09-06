package tu.org.msee.slmtoolbox.modeling.service.app;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.service.app.exception.ServiceAppConfigurationException;
import org.msee.slmtoolbox.modeling.service.app.exception.ServiceAppException;

public abstract class AbstractTestAppService<S> extends TestCase {

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AbstractTestAppService.class);
	
	/**
	 * Data model resource
	 */
	private Resource resource; 
	
	/** 
	 * Service App 
	 */
	private S appService;
	
	/**
	 * Service app class
	 */
	private Class<S> appServiceClass;
	
	/**
	 * Constructor for CopyOperationTest.
	 * @param arg
	 */
	public AbstractTestAppService(String arg) {
		super(arg);
		// initialize the data access
		List<EPackage> ePackageInstances = new ArrayList<EPackage>();
		ePackageInstances.add(BsmPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);
		/* Following the change management repository : the data service is without CDO
		CDOSessionFactory.getInstance().configureSession(
				"repo1",
				"localhost",
				ePackageInstances);
		*/
	}
	
	/*
	 * @see TestCase#setUp()
	 * Note use a data service
	 */
	protected void setUp() throws Exception {
		/* Following the change management repository : the data service is without CDO
		this.transaction = CDOSessionFactory.getInstance().getCurrentSession().openTransaction();
		this.resource = this.transaction.getOrCreateResource("/testingJunit");
		*/
		try {
			// def constructor arguments
            /*Class<?>[] ctorArgs = new Class<?>[2];
            ctorArgs[0] = CDOTransaction.class;
            ctorArgs[1] = Resource.class;
            // find constructor
			Constructor<S> cr = appServiceClass.getConstructor(ctorArgs);
			// create a new instance
			//this.setAppService(cr.newInstance(this.transaction, this.resource));*/
			Constructor<S> cr = appServiceClass.getConstructor();
			this.setAppService(cr.newInstance());
			this.setAppService(cr.newInstance());
		} catch (NoSuchMethodException e) { //ReflectiveOperationException
			log.error(e.getMessage());
			throw new ServiceAppConfigurationException(e);
		} catch (SecurityException e) { // RuntimeException
			log.error(e.getMessage());
			throw new ServiceAppConfigurationException(e);
		} catch (InstantiationException e) { // ReflectiveOperationException
			log.error(e.getMessage());
			throw new ServiceAppConfigurationException(e);
		} catch (IllegalAccessException e) { // ReflectiveOperationException
			log.error(e.getMessage());
			throw new ServiceAppConfigurationException(e);
		} catch (IllegalArgumentException e) { // RuntimeException
			log.error(e.getMessage());
			throw new ServiceAppConfigurationException(e);
		} catch (InvocationTargetException e) { // ReflectiveOperationException
			log.error(e.getMessage());
			throw new ServiceAppConfigurationException(e);
		}
	}
	
	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		// FIXME Can't clear the database with JUnit
		//this.resource.delete(Collections.EMPTY_MAP);
		//saveResource();
	}
	
	/**
	 * Save resource
	 */
	protected void saveResource() {
		try {
			if (null != getResource()) {
				getResource().save(Collections.EMPTY_MAP);
			}
		} catch (IOException e) {
			log.error(e.getMessage());
			throw new ServiceAppException(e);
		}
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * @return the appService
	 */
	public S getAppService() {
		return appService;
	}

	/**
	 * @param appService the appService to set
	 */
	public void setAppService(S appService) {
		this.appService = appService;
	}

	/**
	 * @return the appServiceClass
	 */
	public Class<S> getAppServiceClass() {
		return appServiceClass;
	}

	/**
	 * @param appServiceClass the appServiceClass to set
	 */
	public void setAppServiceClass(Class<S> appServiceClass) {
		this.appServiceClass = appServiceClass;
	}

}

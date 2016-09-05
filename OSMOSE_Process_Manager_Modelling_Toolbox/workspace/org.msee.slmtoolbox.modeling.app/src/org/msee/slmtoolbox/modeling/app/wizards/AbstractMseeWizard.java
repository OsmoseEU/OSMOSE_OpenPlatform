package org.msee.slmtoolbox.modeling.app.wizards;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.msee.slmtoolbox.modeling.app.exception.MseeConfigurationException;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

public abstract class AbstractMseeWizard <S extends AbstractAppService> extends Wizard implements INewWizard {

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AbstractMseeWizard.class);
	
	/** 
	 * Service App for the graphiti editor
	 */
	private S appService;
	
	/**
	 * Service class
	 */
	protected Class<S> appServiceClass;
	
	/**
	 * Constructor for ServiceSystemModelingWizard.
	 */
	public AbstractMseeWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	


	/**
	 * Init the service app for the graphiti editor
	 */
	protected void initAppService() {
		try {
			// def constructor arguments
			/* Following the change management repository : the data service is without CDO
            Class<?>[] ctorArgs = new Class<?>[2];
            ctorArgs[0] = CDOTransaction.class;
            ctorArgs[1] = Resource.class;
			// find constructor
			Constructor<S> cr = this.appServiceClass.getConstructor(ctorArgs);
			// create a new instance
			this.setAppService(cr.newInstance(this.transaction, this.resource));*/
			Constructor<S> cr = this.appServiceClass.getConstructor();
			this.setAppService(cr.newInstance());
		} catch (NoSuchMethodException e) { //ReflectiveOperationException
			log.error(e.getMessage());
			throw new MseeConfigurationException(e);
		} catch (SecurityException e) { // RuntimeException
			log.error(e.getMessage());
			throw new MseeConfigurationException(e);
		} catch (InstantiationException e) { // ReflectiveOperationException
			log.error(e.getMessage());
			throw new MseeConfigurationException(e);
		} catch (IllegalAccessException e) { // ReflectiveOperationException
			log.error(e.getMessage());
			throw new MseeConfigurationException(e);
		} catch (IllegalArgumentException e) { // RuntimeException
			log.error(e.getMessage());
			throw new MseeConfigurationException(e);
		} catch (InvocationTargetException e) { // ReflectiveOperationException
			log.error(e.getMessage());
			throw new MseeConfigurationException(e);
		}
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
	private void setAppService(S appService) {
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

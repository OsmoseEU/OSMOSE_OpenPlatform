package org.msee.slmtoolbox.modeling.service.app.exception;

/**
 * This class represents an exception in the Editor configuration which cannot be resolved at runtime,
 * such as a missing resource in the classpath, a missing property in the properties file, etcetera.
 *
 * @author BalusC
 * @link http://balusc.blogspot.com/2008/07/dao-tutorial-data-layer.html
 */
public class ServiceAppConfigurationException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a ServiceAppConfigurationException with the given detail message.
     * @param message The detail message of the ServiceAppConfigurationException.
     */
    public ServiceAppConfigurationException(String message) {
        super(message);
    }

    /**
     * Constructs a ServiceAppConfigurationException with the given root cause.
     * @param cause The root cause of the ServiceAppConfigurationException.
     */
    public ServiceAppConfigurationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a ServiceAppConfigurationException with the given detail message and root cause.
     * @param message The detail message of the ServiceAppConfigurationException.
     * @param cause The root cause of the ServiceAppConfigurationException.
     */
    public ServiceAppConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
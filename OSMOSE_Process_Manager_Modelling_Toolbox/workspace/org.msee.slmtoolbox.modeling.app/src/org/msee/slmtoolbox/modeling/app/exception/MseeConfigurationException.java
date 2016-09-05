package org.msee.slmtoolbox.modeling.app.exception;

/**
 * This class represents an exception in the Editor configuration which cannot be resolved at runtime,
 * such as a missing resource in the classpath, a missing property in the properties file, etcetera.
 *
 * @author BalusC
 * @link http://balusc.blogspot.com/2008/07/dao-tutorial-data-layer.html
 */
public class MseeConfigurationException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a MseeConfigurationException with the given detail message.
     * @param message The detail message of the MseeConfigurationException.
     */
    public MseeConfigurationException(String message) {
        super(message);
    }

    /**
     * Constructs a MseeConfigurationException with the given root cause.
     * @param cause The root cause of the MseeConfigurationException.
     */
    public MseeConfigurationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a MseeConfigurationException with the given detail message and root cause.
     * @param message The detail message of the MseeConfigurationException.
     * @param cause The root cause of the MseeConfigurationException.
     */
    public MseeConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
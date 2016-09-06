package org.msee.slmtoolbox.modeling.service.app.exception;

public class ServiceAppException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a ServiceAppException with the given detail message.
     * @param message The detail message of the ServiceAppException.
     */
    public ServiceAppException(String message) {
        super(message);
    }

    /**
     * Constructs a ServiceAppException with the given root cause.
     * @param cause The root cause of the ServiceAppExceptions.
     */
    public ServiceAppException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a ServiceAppException with the given detail message and root cause.
     * @param message The detail message of the ServiceAppExceptions.
     * @param cause The root cause of the ServiceAppExceptions.
     */
    public ServiceAppException(String message, Throwable cause) {
        super(message, cause);
    }

}

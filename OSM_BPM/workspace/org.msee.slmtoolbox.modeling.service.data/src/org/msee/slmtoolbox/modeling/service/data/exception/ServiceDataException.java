package org.msee.slmtoolbox.modeling.service.data.exception;

public class ServiceDataException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a DAOException with the given detail message.
     * @param message The detail message of the DAOException.
     */
    public ServiceDataException(String message) {
        super(message);
    }

    /**
     * Constructs a DAOException with the given root cause.
     * @param cause The root cause of the DAOException.
     */
    public ServiceDataException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a DAOException with the given detail message and root cause.
     * @param message The detail message of the DAOException.
     * @param cause The root cause of the DAOException.
     */
    public ServiceDataException(String message, Throwable cause) {
        super(message, cause);
    }

}

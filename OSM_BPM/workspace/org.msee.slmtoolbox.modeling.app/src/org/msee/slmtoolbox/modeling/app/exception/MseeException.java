package org.msee.slmtoolbox.modeling.app.exception;

public class MseeException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a MseeException with the given detail message.
     * @param message The detail message of the MseeException.
     */
    public MseeException(String message) {
        super(message);
    }

    /**
     * Constructs a MseeException with the given root cause.
     * @param cause The root cause of the MseeException.
     */
    public MseeException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a MseeException with the given detail message and root cause.
     * @param message The detail message of the MseeException.
     * @param cause The root cause of the MseeException.
     */
    public MseeException(String message, Throwable cause) {
        super(message, cause);
    }

}

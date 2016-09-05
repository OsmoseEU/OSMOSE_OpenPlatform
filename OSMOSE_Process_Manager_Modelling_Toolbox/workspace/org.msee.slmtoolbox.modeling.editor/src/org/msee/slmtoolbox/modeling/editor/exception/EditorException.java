package org.msee.slmtoolbox.modeling.editor.exception;

public class EditorException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a EditorException with the given detail message.
     * @param message The detail message of the EditorException.
     */
    public EditorException(String message) {
        super(message);
    }

    /**
     * Constructs a EditorException with the given root cause.
     * @param cause The root cause of the EditorException.
     */
    public EditorException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a EditorException with the given detail message and root cause.
     * @param message The detail message of the EditorException.
     * @param cause The root cause of the EditorException.
     */
    public EditorException(String message, Throwable cause) {
        super(message, cause);
    }

}

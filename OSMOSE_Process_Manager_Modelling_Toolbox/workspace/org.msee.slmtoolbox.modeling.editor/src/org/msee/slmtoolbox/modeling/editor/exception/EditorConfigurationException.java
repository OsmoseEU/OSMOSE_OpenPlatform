package org.msee.slmtoolbox.modeling.editor.exception;

/**
 * This class represents an exception in the Editor configuration which cannot be resolved at runtime,
 * such as a missing resource in the classpath, a missing property in the properties file, etcetera.
 *
 * @author BalusC
 * @link http://balusc.blogspot.com/2008/07/dao-tutorial-data-layer.html
 */
public class EditorConfigurationException extends RuntimeException {

    // Constants ----------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    // Constructors -------------------------------------------------------------------------------

    /**
     * Constructs a EditorConfigurationException with the given detail message.
     * @param message The detail message of the EditorConfigurationException.
     */
    public EditorConfigurationException(String message) {
        super(message);
    }

    /**
     * Constructs a EditorConfigurationException with the given root cause.
     * @param cause The root cause of the EditorConfigurationException.
     */
    public EditorConfigurationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a EditorConfigurationException with the given detail message and root cause.
     * @param message The detail message of the EditorConfigurationException.
     * @param cause The root cause of the EditorConfigurationException.
     */
    public EditorConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
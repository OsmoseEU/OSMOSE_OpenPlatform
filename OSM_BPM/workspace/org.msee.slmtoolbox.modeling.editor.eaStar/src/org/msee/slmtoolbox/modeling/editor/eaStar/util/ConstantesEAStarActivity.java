package org.msee.slmtoolbox.modeling.editor.eaStar.util;

/**
 * Constante class for Activity 
 * @author fto
 *
 */
public class ConstantesEAStarActivity {

    // the additional size of the invisible rectangle at the right border
    // (this also equals the half width of the anchor to paint there)
    public static final int EXTERN_ANCHOR_SIZE = 3;
    
    /** WIDTH of graphic element */
    public static final int GRAPHIC_WIDTH = 100;
    /** HEIGHT of graphic element */
    public static final int GRAPHIC_HEIGHT = 70;
    /** WITH of text element */
    public static final int TEXT_WITH = 80;
    /** HEIGHT of text element */
    public static final int TEXT_HEIGHT = 40;
    /** HEIGHT of graphic element code */
    public static final int TEXT_CODE_SIZE = 20;
    /** HEIGHT of graphic element */
    public static final int TEXT_MARGE = 5;
    /** SIZE ICON (WIDTH and HEIGHT) */
    public static final int ICON_SIZE = 16;
    /** Start icon id in children shape */
	public static final int START_ICON_ID = 0;
    /** End icon id in children shape */
	public static final int END_ICON_ID = 1;
	/** Decomposition Code id in children shape */
	public static final int DECOMPOSITION_CODE_ID = 2;
	/** Code id in children shape */
	public static final int CODE_ID = 3;
	
	/** coordinate x for start icon */
	public static final int START_ICON_X = EXTERN_ANCHOR_SIZE + TEXT_MARGE;
	/** coordinate x for end icon */
	public static final int END_ICON_X = START_ICON_X + ICON_SIZE + 1;
	
    /** SIZE ICON (WIDTH and HEIGHT) */
    public static final int STRUCUTRAL_ICON_SIZE = 24;
    /** Structural icon id in children shape */
	public static final int STRUCUTRAL_ICON_ID = 4;

	/** Default constructor */
	private ConstantesEAStarActivity() {
		
	}
}

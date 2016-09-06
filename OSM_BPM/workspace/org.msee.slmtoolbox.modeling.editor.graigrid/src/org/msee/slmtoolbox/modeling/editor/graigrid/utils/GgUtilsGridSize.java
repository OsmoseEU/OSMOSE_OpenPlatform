package org.msee.slmtoolbox.modeling.editor.graigrid.utils;

public class GgUtilsGridSize {
	private static final int MARGIN_LEFT = 0;
	private static final int MARGIN_TOP = 0;
	private static final int SIZE_COLUMN = 150;
	private static final int SIZE_LINE = 75;
	private static final int SIZE_HEAD_ORGANIZATION = 25;
	private static final int SIZE_HEAD_FUNCTION = 75;
	private static final int SIZE_FOOTER_FUNCTION = 25;
	private static final int SIZE_HEAD_LEVEL = 150;
	
	/** Y coordinate of basis Organization elements' */
	public static final int COORDINATED_BASE_ORGANIZATION_Y = MARGIN_TOP;
	/** X coordinate of basis Organization elements' */
	public static final int COORDINATED_BASE_ORGANIZATION_X = MARGIN_LEFT + SIZE_HEAD_LEVEL + 1;
	/** Size head of Organization elements */
	public static final int SIZE_ORGANIZATION_HEIGHT_HEAD = SIZE_HEAD_ORGANIZATION;

	/** Y coordinate of basis Function elements' */
	public static final int COORDINATED_BASE_FUNCTION_Y = 0;
	/** X coordinate of basis Function elements' */
	public static final int COORDINATED_BASE_FUNCTION_X = 0;
	/** Size head of Function elements */
	public static final int SIZE_FUNCTION_HEIGHT_HEAD = SIZE_HEAD_FUNCTION;
	/** Size footer of Function elements */
	public static final int SIZE_FUNCTION_HEIGHT_FOOTER = SIZE_FOOTER_FUNCTION;
	/** Size body and head of Function elements */
	public static final int SIZE_FUNCTION_WIDTH_BASE = SIZE_COLUMN;
	
	public static final int SIZE_FUNCTION_NAME_HEIGHT = SIZE_HEAD_FUNCTION *2 /3;
	public static final int SIZE_FUNCTION_CODE_HEIGHT = SIZE_HEAD_FUNCTION - SIZE_FUNCTION_NAME_HEIGHT;

	/** Y coordinate of basis LevelDecision elements */
	public static final int COORDINATED_BASE_LEVELDECISION_Y = MARGIN_TOP + SIZE_HEAD_ORGANIZATION + SIZE_HEAD_FUNCTION + 1;
	/** X coordinate of basis LevelDecision elements */
	public static final int COORDINATED_BASE_LEVELDECISION_X = MARGIN_LEFT;
	/** Size head of LevelDecision elements */
	public static final int SIZE_LEVEL_HEAD_WIDTH = SIZE_HEAD_LEVEL;
	/** Size body and head of LevelDecision elements */
	public static final int SIZE_LEVEL_BASE_HEIGHT = SIZE_LINE;
	
	/** Size body of LevelDecision and Function elements */
	public static final int SIZE_BASE_LEVELDECISION_WIDTH = SIZE_FUNCTION_WIDTH_BASE * 3;
	public static final int SIZE_BASE_FUNCTION_HEIGHT = SIZE_LEVEL_BASE_HEIGHT * 3;
	public static final int SIZE_CENTER_MARGIN = 5;

	public static final int NB_MIN_ORGANIZATION = 1;
	public static final int NB_MIN_FUNCTION = 1;
	public static final int NB_MIN_LEVEL = 3;

}

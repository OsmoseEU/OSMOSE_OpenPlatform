package org.msee.slmtoolbox.modeling.editor.eaStar.util;

/**
 * Constant for anchor index in extended activity
 * 
 * @author fto
 * 
 */
public enum EaActivityAnchors {
	Input(1), Output(0), Control(3), Support(2);

	/** index of anchor */
	private final int index;

	/**
	 * Constructor
	 * 
	 * @param index
	 */
	EaActivityAnchors(int index) {
		this.index = index;
	}

	/** get index in extended activity */
	public int getIndex() {
		return this.index;
	}
}

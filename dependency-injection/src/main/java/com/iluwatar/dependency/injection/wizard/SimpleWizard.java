package com.iluwatar.dependency.injection.wizard;

import com.iluwatar.dependency.injection.bacco.OldTobyTobacco;

/**
 * 
 * Naive Wizard implementation violating the inversion of control principle.
 * It should depend on abstraction instead.
 *
 */
public class SimpleWizard implements IWizard {
	
	private OldTobyTobacco tobacco = new OldTobyTobacco();
	
	public void smoke() {
		tobacco.smoke(this);
	}
}

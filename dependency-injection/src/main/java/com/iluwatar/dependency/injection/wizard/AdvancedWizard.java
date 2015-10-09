package com.iluwatar.dependency.injection.wizard;

import com.iluwatar.dependency.injection.bacco.AbsTobacco;

/**
 * 
 * AdvancedWizard implements inversion of control.
 * It depends on abstraction that can be injected through
 * its constructor.
 *
 */
public class AdvancedWizard implements IWizard {
	
	private AbsTobacco tobacco;

	public AdvancedWizard(AbsTobacco tobacco) {
		this.tobacco = tobacco;
	}

	@Override
	public void smoke() {
		tobacco.smoke(this);
	}
}

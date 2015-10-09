package com.iluwatar.dependency.injection.wizard;

import javax.inject.Inject;

import com.iluwatar.dependency.injection.bacco.AbsTobacco;

/**
 * 
 * GuiceWizard implements inversion of control.
 * Its dependencies are injected through its constructor
 * by Guice framework.
 *
 */
public class GuiceWizard implements IWizard {
	
	private AbsTobacco tobacco;
	
	@Inject
	public GuiceWizard(AbsTobacco tobacco) {
		this.tobacco = tobacco;
	}

	@Override
	public void smoke() {
		tobacco.smoke(this);
	}
}

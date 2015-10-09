package com.iluwatar.dependency.injection.bacco;

import com.iluwatar.dependency.injection.wizard.IWizard;

/**
 * 
 * Tobacco abstraction
 *
 */
public abstract class AbsTobacco {
	
	public void smoke(IWizard wizard) {
		System.out.println(String.format("%s smoking %s", wizard.getClass().getSimpleName(), this.getClass().getSimpleName()));
	}
}

package com.iluwatar.dependency.injection.guice;

import com.google.inject.AbstractModule;
import com.iluwatar.dependency.injection.bacco.AbsTobacco;
import com.iluwatar.dependency.injection.bacco.RivendellTobacco;

/**
 * 
 * Guice module for binding certain concrete Tobacco implementation.
 *
 */
public class TobaccoModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(AbsTobacco.class).to(RivendellTobacco.class);
	}
}

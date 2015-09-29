package com.iluwatar.business.delegate.service;

import com.iluwatar.business.delegate.itfc.IBusinessService;

/**
 * 
 * Service EJB implementation
 *
 */
public class EjbService implements IBusinessService {

	@Override
	public void doProcessing() {
		System.out.println("EjbService is now processing");
	}
}

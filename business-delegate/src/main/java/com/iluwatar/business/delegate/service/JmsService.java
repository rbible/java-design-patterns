package com.iluwatar.business.delegate.service;

import com.iluwatar.business.delegate.itfc.IBusinessService;

/**
 * 
 * Service JMS implementation
 *
 */
public class JmsService implements IBusinessService {

	@Override
	public void doProcessing() {
		System.out.println("JmsService is now processing");
	}
}

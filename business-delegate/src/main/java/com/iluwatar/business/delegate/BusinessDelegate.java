package com.iluwatar.business.delegate;

import com.iluwatar.business.delegate.itfc.IBusinessService;

/**
 * 
 * BusinessDelegate separates presentation and business tiers
 *
 */
public class BusinessDelegate {

    private BusinessLookup lookupService = new BusinessLookup();
    private IBusinessService businessService;
    private EServiceType serviceType;

    public void setServiceType(EServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}

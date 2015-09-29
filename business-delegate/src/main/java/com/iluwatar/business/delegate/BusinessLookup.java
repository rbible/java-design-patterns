package com.iluwatar.business.delegate;

import com.iluwatar.business.delegate.itfc.IBusinessService;
import com.iluwatar.business.delegate.service.EjbService;
import com.iluwatar.business.delegate.service.JmsService;

/**
 * 
 * Class for performing service lookups
 *
 */
public class BusinessLookup {

    public IBusinessService getBusinessService(EServiceType serviceType) {
        if (serviceType.equals(EServiceType.EJB)) {
            return new EjbService();
        } else {
            return new JmsService();
        }
    }
}

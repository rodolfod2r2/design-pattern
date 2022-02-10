package org.framework.rodolfo.freire.git.design.pattern.business.delegate.business;

import org.framework.rodolfo.freire.git.design.pattern.business.delegate.service.BusinessService;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.util.EnumFactory;

public class BusinessDelegate {

    public void doTransaction(EnumFactory serviceType) {
        BusinessService businessService = BusinessLookUp.getBusinessService(serviceType);
        businessService.transactionProcess();
    }

}

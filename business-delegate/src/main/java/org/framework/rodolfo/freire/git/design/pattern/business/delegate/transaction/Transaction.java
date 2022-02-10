package org.framework.rodolfo.freire.git.design.pattern.business.delegate.transaction;

import org.framework.rodolfo.freire.git.design.pattern.business.delegate.business.BusinessDelegate;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.util.EnumFactory;

public class Transaction {

    private final BusinessDelegate businessService;

    public Transaction(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTransaction(EnumFactory enumFactory) {
        businessService.doTransaction(enumFactory);
    }
}

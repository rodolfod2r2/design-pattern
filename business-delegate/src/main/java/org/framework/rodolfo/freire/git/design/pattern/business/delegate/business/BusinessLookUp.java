package org.framework.rodolfo.freire.git.design.pattern.business.delegate.business;

import org.framework.rodolfo.freire.git.design.pattern.business.delegate.service.BankService;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.service.BusinessService;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.service.CreditService;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.service.DebitService;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.util.EnumFactory;

public class BusinessLookUp {

    public static BusinessService getBusinessService(EnumFactory choice) {
        return switch (choice) {
            case CREDIT -> new CreditService();
            case DEBIT -> new DebitService();
            case BANK -> new BankService();
        };
    }

}

package org.framework.rodolfo.freire.git.design.pattern.business.delegate;

import org.framework.rodolfo.freire.git.design.pattern.business.delegate.business.BusinessDelegate;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.transaction.Transaction;
import org.framework.rodolfo.freire.git.design.pattern.business.delegate.util.EnumFactory;

public class BusinessDelegateDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        Transaction transaction = new Transaction(businessDelegate);

        transaction.doTransaction(EnumFactory.CREDIT);

        transaction.doTransaction(EnumFactory.DEBIT);

        transaction.doTransaction(EnumFactory.BANK);

    }
}
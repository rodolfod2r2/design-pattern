package org.framework.rodolfo.freire.git.design.pattern.business.delegate.service;

public class DebitService implements BusinessService {

    @Override
    public void transactionProcess() {
        System.out.println("Transaction Processing task by invoking Debit Service");
    }

}
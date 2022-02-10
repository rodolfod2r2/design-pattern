package org.framework.rodolfo.freire.git.design.pattern.business.delegate.service;

public class BankService implements BusinessService {

    @Override
    public void transactionProcess() {
        System.out.println("Transaction Processing task by invoking Bank Service");
    }

}
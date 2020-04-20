 
package com.mycompany.jerseytutorial.models;

import java.math.BigDecimal;
import java.util.List;


/**
 *
 * @author katke
 */
public class SavingsAccount {

    private Long id;
    private int accountNumber;
    private double accountBalance;
     
    private List<SavingsTransaction> savingsTransaction;
    
public SavingsAccount(){
    
}
    public SavingsAccount(Long id, int accountNumber, double accountBalance, List<SavingsTransaction> savingsTransaction) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.savingsTransaction = savingsTransaction;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<SavingsTransaction> getSavingsTransaction() {
        return savingsTransaction;
    }

    public void setSavingsTransaction(List<SavingsTransaction> savingsTransaction) {
        this.savingsTransaction = savingsTransaction;
    }

    public void save(SavingsAccount savingsAccount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<SavingsTransaction> getSavingsTransactionList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SavingsAccount findByAccountNumber(int accountNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

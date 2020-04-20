
package com.mycompany.jerseytutorial.models;
//import java.math.BigDecimal;
import java.util.List;



public class PrimaryAccount {


    
    private Long id;
    private int accountNumber;
    private double accountBalance;
    
    private List <PrimaryTransaction> primaryTransactionList;
    //primary transaction is a sub resource of Primary Account.
//Why does this not have a constructor?
public PrimaryAccount(){
    
}

public PrimaryAccount(Long id, int accountNumber, double accountBalance, List<PrimaryTransaction> primaryTransactionList) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.primaryTransactionList = primaryTransactionList;
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

    public List<PrimaryTransaction> getPrimaryTransactionList() {
        return primaryTransactionList;
    }

    public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
        this.primaryTransactionList = primaryTransactionList;
    }

    public void save(PrimaryAccount primaryAccount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PrimaryAccount findByAccountNumber(int accountNumber) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

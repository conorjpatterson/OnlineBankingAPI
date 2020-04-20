
package com.mycompany.jerseytutorial.models;
import java.math.BigDecimal;
import  java.util.Date;
/**
 *
 * @author katke
 */
public class SavingsTransaction {
    
    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private double availableBalance;
    
    private SavingsAccount savingsAccount;
    
   
    public SavingsTransaction(){
      
    }

    public SavingsTransaction(Long id, String description, String type, String status, double amount, double availableBalance, SavingsAccount savingsAccount) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.savingsAccount = savingsAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public void save(SavingsTransaction savingsTransaction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

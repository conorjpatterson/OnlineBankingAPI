
package com.mycompany.jerseytutorial.models;
 import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author katke
 */
public class PrimaryTransaction {
    
    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private double availableBalance;
    private PrimaryAccount primaryAccount;
    
    public PrimaryTransaction(){
    
  }

    public PrimaryTransaction(Long id, /*Date date,*/ String description, String type, String status, double amount, double availableBalance, PrimaryAccount primaryAccount) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.primaryAccount = primaryAccount;
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

    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public void save(PrimaryTransaction primaryTransaction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

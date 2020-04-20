
package com.mycompany.jerseytutorial.services;


import com.mycompany.jerseytutorial.models.PrimaryAccount;
import com.mycompany.jerseytutorial.models.SavingsAccount;
import java.security.Principal;

/**
 *
 * @author katke
 */
      
 public interface AccountService {
     
PrimaryAccount createPrimaryAccount();
SavingsAccount createSavingsAccount();
void deposit(String accountType, double amount, Principal principal);
void withdraw(String accountType, double amount, Principal principal);
    
    
}


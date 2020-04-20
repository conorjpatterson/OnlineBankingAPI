
package com.mycompany.jerseytutorial.services;


import com.mycompany.jerseytutorial.models.PrimaryAccount;
import com.mycompany.jerseytutorial.models.PrimaryTransaction;
import com.mycompany.jerseytutorial.models.Recipient;
import com.mycompany.jerseytutorial.models.SavingsAccount;
import com.mycompany.jerseytutorial.models.SavingsTransaction;
import java.security.Principal;
import java.util.List;
/**
 *
 * @author katke
 */

public interface TransactionService {
	List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
    
    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);
    
    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
    
    List<Recipient> findRecipientList(Principal principal);

    Recipient saveRecipient(Recipient recipient);

    Recipient findRecipientByName(String recipientName);

    void deleteRecipientByName(String recipientName);
    
    void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);
}


    
    
    


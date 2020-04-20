/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.databases;

import com.mycompany.jerseytutorial.models.PrimaryAccount;
import com.mycompany.jerseytutorial.models.PrimaryTransaction;
import com.mycompany.jerseytutorial.models.Recipient;
import com.mycompany.jerseytutorial.models.SavingsAccount;
import com.mycompany.jerseytutorial.models.SavingsTransaction;
import com.mycompany.jerseytutorial.models.User;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Fintan
 */
//Manuel's template below to be edited.
public class Database {

    public static boolean isInit() {
        return init;
    }
      public static List<User> userDB = new ArrayList<>();
      public static List <SavingsTransaction> savingsTransactionDB = new ArrayList<>();
      public static List <SavingsAccount> savingsAccountDB = new ArrayList<>();
      public static List <Recipient> recipientDB = new ArrayList<>();
      public static List <PrimaryTransaction> primaryTransactionDB = new ArrayList<>();
      public static List <PrimaryAccount> primaryAccountDB = new ArrayList<>();

    public static boolean init = true;
     
    // Lets create a constructor for the class
    public Database () {
      if (init) {
          
        // Lets create some comments

        //message//1/author/james
        // Lets add those comments to each of the messages. //incompatible types List<savings Account>  cannot be conected to savings account
        // Keep in mind ALL messages will contain same list of seeded comments!!!
        //Start of PrimaryAccount DB
        PrimaryAccount primAcc1 = new  PrimaryAccount (1L, 123, 123.123, primaryTransactionDB);
        primaryAccountDB.add(primAcc1);
        //End of Primary Account DB
        //Start of Primary Transaction DB
        PrimaryTransaction primTrans1 = new PrimaryTransaction(1L, "good","good", "good",2000.20, 20060.50, primAcc1);
        primaryTransactionDB.add(primTrans1);
        //End of Primary Transaction DB


        //Start of Savings Account DB
        SavingsAccount acc1 = new SavingsAccount (1L,21212, 200.50,savingsTransactionDB);
        savingsAccountDB.add(acc1);
        //End of SavingsAccount DB
        //Savings Transactio DB
        SavingsTransaction strn1 = new SavingsTransaction (1L,"Withdraw","good","all good",1000.50,2000.50, acc1);
        savingsTransactionDB.add(strn1);
        //End of Savings Transaction DB
        //User Database data
       User u1 = new User(1L,"User_1", "UnbreakablePassword1","Brian","O'Brien","o'brien@outlook.ie","09571324");
       
          userDB.add(u1);
          //End of User DB data
                  //Start of Recipients DB 
        Recipient recip1 = new Recipient (1L,"Brian","brien@outlook.ie", "089232345", "11111", "description all good!.", u1 );
        recipientDB.add(recip1);
        //End of Recipients DB
     
        
        init = false;
     }
    }
    
   public static List<User> getUserDB() {
        return userDB;
    }

    public static List<SavingsTransaction> getSavingsTransactionDB() {
        return savingsTransactionDB;
    }

    public static List<SavingsAccount> getSavingsAccountDB() {
        return savingsAccountDB;
    }

    public static List<Recipient> getRecipientDB() {
        return recipientDB;
    }

    public static List<PrimaryTransaction> getPrimaryTransactionDB() {
        return primaryTransactionDB;
    }

    public static List<PrimaryAccount> getPrimaryAccountDB() {
        return primaryAccountDB;
    }

    /*public static List<Comment> getCommentsDB() {
        return commentDB;
    }*/
}

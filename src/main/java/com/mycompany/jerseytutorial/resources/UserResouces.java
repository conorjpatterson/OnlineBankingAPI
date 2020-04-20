package com.mycompany.jerseytutorial.resources;


import com.mycompany.jerseytutorial.models.PrimaryTransaction;
import com.mycompany.jerseytutorial.models.SavingsTransaction;
import com.mycompany.jerseytutorial.models.User;
import com.mycompany.jerseytutorial.services.TransactionService;
import com.mycompany.jerseytutorial.services.UserService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/*
*com.mycompany.jerseytutorial.databases
 *
 * @author katke
 */
@Path("/user") 
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class  UserResouces{
    
  UserService UserService= new UserService();
  TransactionService transactionService = new TransactionService();
   
        
   @GET
   @Path("/user/all")
    public List<User> userList() {
        return userService.findUserList();
    }
   
   
   @GET
   @Path ("user/primary/transaction")
    public List<PrimaryTransaction> getPrimaryTransactionList(@PathParam("username") String username) {
        return transactionService.findPrimaryTransactionList(username);
}
    
    @GET
    @Path("/user/savings/transaction")
    public List<SavingsTransaction> getSavingsTransactionList(@PathParam("username") String username) {
        return transactionService.findSavingsTransactionList(username);
    }
    
    @GET
    @Path("/user/{username}/enable")
    public void enableUser(@PathParam("username") String username) {
        userService.enableUser(username);
    }

    @GET
    @Path("/user/{username}/disable")
    public void diableUser(@PathParam("username") String username) {
        userService.disableUser(username);
    }
     
}   
 

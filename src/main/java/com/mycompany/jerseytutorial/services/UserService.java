
package com.mycompany.jerseytutorial.services;

//import UserFront.Security.UserRole;

//import UserFront.User;
import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.User;
import com.sun.xml.internal.ws.wsdl.writer.document.Message;
import java.util.ArrayList;
import java.util.List;


public class UserService {
	/*User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);
    
    void save (User user);
    
    User createUser(User user, Set<UserRole> userRoles);
    
    User saveUser (User user); 
    
    List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);*/
    
//Manuel's template
          /*
    Database d = new Database();
    private List<User> list = d.getUsersDB();
    
    public List<Message> getAllMessages() {
        return list;
    }
    
    public List<Message> getSearchMessages(String message, String author) {
        List<Message> matcheslist = new ArrayList<>();
        
        for (Message q: getAllMessages()) {
            if ((message == null || q.getMessage().equals(message)) 
                   && (author == null || q.getAuthor().equals(author))) {
               matcheslist.add(q);
            }
        }
        return matcheslist;
    }
        
    public Message getMessage(long id) {
        int i = Math.toIntExact(id);
        return list.get( i - 1 );
    }
    
    public Message createMessage(Message m) {
	m.setId(list.size() + 1);
	list.add(m);
	System.out.println("201 - resource created with path: /messages/" + String.valueOf(m.getId()));
	return m;
    }
    
    
}
 

}*/
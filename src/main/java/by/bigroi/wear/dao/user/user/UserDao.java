package by.bigroi.wear.dao.user.user;

import by.bigroi.wear.model.user.User;
import by.bigroi.wear.model.user.UserRole;

public interface UserDao {

    public void saveUser(User user);
    public User findByUserEmail(String email);
    
    public UserRole getRoleById(int id);
}

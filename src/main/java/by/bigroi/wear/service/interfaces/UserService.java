package by.bigroi.wear.service.interfaces;

import by.bigroi.wear.model.user.User;

import java.util.List;

public interface UserService {

        public String addUser(User user);
        public boolean isUserRegistered(User user);
        public String deleteUser(User user);
       /* public List getAllUsers();
        public User updateUser(User user);*/
}

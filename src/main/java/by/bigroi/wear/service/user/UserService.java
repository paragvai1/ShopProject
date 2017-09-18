package by.bigroi.wear.service.user;

import by.bigroi.wear.model.user.User;

public interface UserService {

        public String addUser(User user);
        public User findByUserEmail(String email);
}

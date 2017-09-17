package by.bigroi.wear.service.user;

import by.bigroi.wear.dao.user.UserDao;
import by.bigroi.wear.model.user.User;
import by.bigroi.wear.model.user.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    public String addUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<UserRole> roles = new HashSet<>();
        roles.add(userDao.getRoleById(2));  // id = 1 ADMIN  /  id = 2 CUSTOMER
        user.setRoles(roles);
        userDao.saveUser(user);
        return "User saved to database";
    }

    @Override
    public User findByUserEmail(String email) {
        return userDao.findByUserEmail(email);
    }
}

package by.bigroi.wear.service.impl;

import by.bigroi.wear.dao.intefaces.DAOInterface;
import by.bigroi.wear.model.user.User;
import by.bigroi.wear.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private DAOInterface dao;

    @Override
    @Transactional
    public String addUser(User user) {
        try {
            dao.getEntity(user.getEmail());
            return "User is already in database";
        } catch (NoResultException e) {
            dao.addEntity(user);
            return "User saved to database";
        }
    }

    @Override
    @Transactional
    public boolean isUserRegistered(User user) {
        try {
            User u = (User) dao.getEntity(user.getEmail());
            if(user.getPassword().equals(u.getPassword())){
                return true;
            } else {
                return false;
            }
        } catch (NoResultException e){
            return false;
        }
    }

    @Override
    @Transactional
    public String deleteUser(User user) {
        try {
            dao.getEntity(user.getEmail());
            dao.deleteEntity(user);
            return "User is already in database";
        } catch (NoResultException e) {
            dao.addEntity(user);
            return "User not found";
        }

    }
/*
    @Override
    @Transactional
    public List getAllUsers() {
        return dao.getAll(User.class);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        return (User)dao.updateEntity(user);
    }
*/
}

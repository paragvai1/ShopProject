package by.bigroi.wear.dao.user;

import by.bigroi.wear.model.user.User;
import by.bigroi.wear.model.user.UserRole;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @Transactional
    public User findByUserEmail(String email) {
        Query query = sessionFactory.getCurrentSession().createQuery("from User where email =:paramEmail");
        query.setParameter("paramEmail", email);
        return (User) query.getSingleResult();
    }

    @Override
    @Transactional
    public UserRole getRoleById(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from UserRole where id =:paramId");
        query.setParameter("paramId", id);
        return (UserRole) query.getSingleResult();
    }
}

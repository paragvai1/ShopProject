package by.bigroi.wear.dao.impl;

import by.bigroi.wear.dao.intefaces.DAOInterface;
import by.bigroi.wear.model.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;

@Repository
public class UserDAOImpl implements DAOInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addEntity(Object obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }

    @Override
    public User getEntity(Object param) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User where email =:paramMail");
        query.setParameter("paramMail", param);
        return (User) query.getSingleResult();
    }

    @Override
    public void deleteEntity(Object obj) { this.sessionFactory.getCurrentSession().delete(obj); }
/*
    @Override
    public List getAll() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    @Override
    public Object updateEntity(Object obj) {
        sessionFactory.getCurrentSession().update(obj);
        return obj;
    }*/
}

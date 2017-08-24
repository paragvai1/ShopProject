package by.bigroi.wear.dao.intefaces;

import java.util.List;

public interface DAOInterface <T>{

    public void addEntity(T obj);
   /* public List getAll();
    public Object updateEntity(T obj);*/
    public Object getEntity(T param);
    public void deleteEntity(T obj);
}

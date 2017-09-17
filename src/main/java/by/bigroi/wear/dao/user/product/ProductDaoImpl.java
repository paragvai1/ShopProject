package by.bigroi.wear.dao.user.product;

import by.bigroi.wear.model.catalog.Catalog;
import by.bigroi.wear.model.product.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Set<Catalog> allCatalogs(String collection) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Catalog where collection =:paramCollection");
        query.setParameter("paramCollection", collection);
        return (Set<Catalog>) query.getResultList();
    }

    @Override
    @Transactional
    public Catalog getCatalogByCollectionAndName(String collection, String catalogName) {
        Query query = sessionFactory.getCurrentSession()
                .createQuery("from Catalog where collection =:paramCollection, name =:paramName");
        query.setParameter("paramCollection", collection);
        query.setParameter("paramName", catalogName);
        return (Catalog) query.getSingleResult();
    }

    @Override
    @Transactional
    public List<Product> allProducts(Catalog catalog) {
        Query query = sessionFactory.getCurrentSession()
        .createQuery("from Product where catalog.collection =:paramCollection, catalog.id =:paramCatalog");
        query.setParameter("paramCollection", catalog.getCollection());
        query.setParameter("paramCatalog", catalog.getId());
        return query.getResultList();
    }
}

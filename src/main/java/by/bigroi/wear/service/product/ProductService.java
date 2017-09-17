package by.bigroi.wear.service.product;

import by.bigroi.wear.model.catalog.Catalog;
import by.bigroi.wear.model.product.Product;

import java.util.List;
import java.util.Set;

public interface ProductService {

    public Set<Catalog> getCatalogs(String collection);
    public List<Product> getProductsFromCatalogAndCollection(String collection, String catalogName);
}

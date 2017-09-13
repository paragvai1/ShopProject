package by.bigroi.wear.model.catalog;

import by.bigroi.wear.model.product.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "COLLECTION")

public class WearCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COLLECTION")
    private long id;

    @Column (name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "COLLECTION", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

package by.bigroi.wear.model.product;

import by.bigroi.wear.model.catalog.WearCollection;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Product")
    private long id;

    @Column (name = "NAME", nullable = false)
    private String name;

    @Column (name = "DESCRIPTION", nullable = false)
    private String description;

    @Column (name = "PICTURE", nullable = false)
    private Object picture;

    @Column (name = "PRICE", nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "ID_COLLECTION")
    private WearCollection wearCollection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public WearCollection getWearCollection() {
        return wearCollection;
    }

    public void setWearCollection(WearCollection wearCollection) {
        this.wearCollection = wearCollection;
    }
}

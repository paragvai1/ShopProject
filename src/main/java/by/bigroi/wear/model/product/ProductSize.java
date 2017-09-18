package by.bigroi.wear.model.product;

import javax.persistence.*;

@Entity
@Table(name = "SIZE")
public class ProductSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SIZE")
    private long id;

    @Column(name = "SIZE", nullable = false)
    private int size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCT")
    private Product product;

    //////////////// GETTERS + SETTERS ///////////////////////////


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

package com.kudinov.restorator.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @Column(name = "price", nullable = false)
    private Float price;

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "admin_id")
    private Admin creator;

    @ManyToOne
    @JoinColumn(name = "maker_id", referencedColumnName = "department_id")
    private Department maker;


    public Product() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Admin getCreator() {
        return creator;
    }
    public void setCreator(Admin creator) {
        this.creator = creator;
    }
    public Department getDepartment() {
        return maker;
    }
    public void setDepartment(Department department) {
        this.maker = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (!title.equals(product.title)) return false;
        if (!price.equals(product.price)) return false;
        if (!creator.equals(product.creator)) return false;
        return maker.equals(product.maker);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + creator.hashCode();
        result = 31 * result + maker.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", creator=" + creator +
                ", maker=" + maker +
                '}';
    }
}

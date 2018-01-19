package com.kudinov.restorator.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "requests")
public class Request implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "request_id")
    private Long id;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "traider_id",referencedColumnName = "waiter_id")
    private Waiter traider;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "product_id"),
    inverseJoinColumns = @JoinColumn(name = "request_id"))
    private List<Product> productList;


    public Request() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Waiter getTraider() {
        return traider;
    }
    public void setTraider(Waiter traider) {
        this.traider = traider;
    }
    public List<Product> getProductList() {
        return productList;
    }
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (!id.equals(request.id)) return false;
        if (!date.equals(request.date)) return false;
        if (!traider.equals(request.traider)) return false;
        return productList.equals(request.productList);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + traider.hashCode();
        result = 31 * result + productList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", date=" + date +
                ", traider=" + traider +
                ", productList=" + productList +
                '}';
    }

}

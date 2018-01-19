package com.kudinov.restorator.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "department_makers")
public class DepartmentMaker implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "maker_id")
    private int id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin creator;


    public DepartmentMaker() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Admin getCreator() {
        return creator;
    }
    public void setCreator(Admin creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentMaker maker = (DepartmentMaker) o;

        if (id != maker.id) return false;
        if (!title.equals(maker.title)) return false;
        return creator.equals(maker.creator);
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + title.hashCode();
        result = 31 * result + creator.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "Maker{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", creator=" + creator +
                '}';
    }
}

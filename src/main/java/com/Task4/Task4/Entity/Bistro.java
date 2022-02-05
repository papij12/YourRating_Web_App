package com.Task4.Task4.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Bistro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "B_id")
    private int bId;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Rating")
    private int rating;
    @Basic
    @Column(name = "User_id")
    private int userId;

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bistro bistro = (Bistro) o;
        return bId == bistro.bId && rating == bistro.rating && userId == bistro.userId && Objects.equals(name, bistro.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bId, name, rating, userId);
    }
}

package com.Task4.Task4.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Restaurants {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "R_id")
    private int rId;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Rating")
    private int rating;
    @Basic
    @Column(name = "User_id")
    private int userId;

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
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
        Restaurants that = (Restaurants) o;
        return rId == that.rId && rating == that.rating && userId == that.userId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rId, name, rating, userId);
    }
}

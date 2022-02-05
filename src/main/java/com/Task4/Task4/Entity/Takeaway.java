package com.Task4.Task4.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Takeaway {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "T_id")
    private int tId;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Rating")
    private int rating;
    @Basic
    @Column(name = "User_id")
    private int userId;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
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
        Takeaway takeaway = (Takeaway) o;
        return tId == takeaway.tId && rating == takeaway.rating && userId == takeaway.userId && Objects.equals(name, takeaway.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tId, name, rating, userId);
    }
}

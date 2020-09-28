package com.creditscore.creditScore.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Long id;

    @NotNull
    @Size(min = 11, max = 11)
    public  String ssn;

    @NotNull
    @Size(min = 2)
    public String name;

    @NotNull
    @Size(min = 2)
    public String surname;

    @NotNull
    public int budget;

    @NotNull
    public String phone;

    @NotNull
    public Long score;

    @NotNull
    public String result;

    public int limit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(ssn, user.ssn) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(budget, user.budget) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(score, user.score) &&
                Objects.equals(result, user.result) &&
                Objects.equals(limit, user.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ssn, name, surname, budget, phone, score, result, limit);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ssn=" + ssn +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", budget=" + budget +
                ", phone=" + phone +
                ", score=" + score +
                ", result=" + result +
                ", limit=" + limit +
                '}';
    }
}

package com.littlesekii.crudier.model.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@SuppressWarnings("unused")
@Entity(name = "t_user")
@Table(name = "t_user")
public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -182287912886940970L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String name;
    private Integer age;
    private String favoriteThing;
    private Boolean isDeveloper;

    public UserEntity() {}
    public UserEntity(UUID id, String username, String name, Integer age, String favoriteThing, Boolean isDeveloper) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.age = age;
        this.favoriteThing = favoriteThing;
        this.isDeveloper = isDeveloper;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavoriteThing() {
        return favoriteThing;
    }

    public void setFavoriteThing(String favoriteThing) {
        this.favoriteThing = favoriteThing;
    }

    public Boolean getIsDeveloper() {
        return isDeveloper;
    }

    public void setIsDeveloper(Boolean isDeveloper) {
        this.isDeveloper = isDeveloper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

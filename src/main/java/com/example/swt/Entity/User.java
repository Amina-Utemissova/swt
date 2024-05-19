package com.example.swt.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @Column(nullable = false, unique = true, length = 50) //email is unique and cannot be null
    private String email;

    @Column(nullable = false, length = 50)
    private String name;


    @Column(nullable = false, length = 64)
    private String passwordHash;

    @Column(nullable = false)
    private int role;

    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Long id, String email, String name, String passwordHash, int role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

}

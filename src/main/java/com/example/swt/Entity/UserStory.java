package com.example.swt.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="user_story")
public class UserStory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 120)
    private String description;

    @Column(nullable = false)
    private Long createdBy;

    @Column(nullable = false)
    private int priority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public UserStory() {
    }

    public UserStory(Long id, String title, String description, Long createdBy, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.priority = priority;
    }
}

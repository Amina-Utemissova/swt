package com.example.swt.Dto;

import jakarta.persistence.Column;

public class UserStoryDTO {

    private Long id;

    private String title;

    private String description;

    private Long createdBy;

    private int priority;

    public UserStoryDTO(Long id, String title, String description, Long createdBy, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.priority = priority;
    }

    public UserStoryDTO() {
    }

    @Override
    public String toString() {
        return "UserStoryDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdBy=" + createdBy +
                ", priority=" + priority +
                '}';
    }

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
}

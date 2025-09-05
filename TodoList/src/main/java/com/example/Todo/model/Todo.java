package com.example.Todo.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "todos")
@Data
public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(length = 1000)
    private String description;
    
    @Enumerated(EnumType.STRING)
    private Priority priority = Priority.MEDIUM;
    
    private boolean completed = false;
    
    // Enum for Priority
    public enum Priority {
        LOW, MEDIUM, HIGH
    }
}

package com.example.Todo.repository;

import com.example.Todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
    List<Todo> findByCompleted(boolean completed);
    
    List<Todo> findByOrderByIdDesc();
    
    List<Todo> findByCompletedOrderByIdDesc(boolean completed);
    
    long countByCompleted(boolean completed);
}

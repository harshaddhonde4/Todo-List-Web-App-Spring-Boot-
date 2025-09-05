package com.example.Todo.controller;

import com.example.Todo.model.Todo;
import com.example.Todo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
public class TodoController {
    
    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public ModelAndView redirecttoTodos()
    {
        ModelAndView modelAndView = new ModelAndView("redirect:/todos");
        return  modelAndView;
    }
    
    @GetMapping("/todos")
    public String getAllTodos(@RequestParam(value = "filter", defaultValue = "all") String filter, Model model) {
        List<Todo> todos;
        switch (filter) {
            case "pending":
                todos = todoService.getTodosByStatus(false);
                break;
            case "completed":
                todos = todoService.getTodosByStatus(true);
                break;
            default:
                todos = todoService.getAllTodos();
                break;
        }
        
        model.addAttribute("todos", todos);
        model.addAttribute("newTodo", new Todo());
        model.addAttribute("filter", filter);
        model.addAttribute("totalTodos", todoService.getTotalTodos());
        model.addAttribute("pendingTodos", todoService.getPendingTodos());
        model.addAttribute("completedTodos", todoService.getCompletedTodos());
        
        return "index";
    }
    
    @PostMapping("/todos")
    public String createTodo(@ModelAttribute Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/todos";
    }
    
    @GetMapping("/todos/{id}/edit")
    public String editTodo(@PathVariable Long id, Model model) {
        Optional<Todo> todoOptional = todoService.getTodoById(id);
        if (todoOptional.isPresent()) {
            model.addAttribute("todo", todoOptional.get());
            return "edit";
        }
        return "redirect:/todos";
    }
    
    @PostMapping("/todos/{id}")
    public String updateTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
        todo.setId(id);
        todoService.updateTodo(todo);
        return "redirect:/todos";
    }
    
    @PostMapping("/todos/{id}/toggle")
    public String toggleTodoStatus(@PathVariable Long id) {
        todoService.toggleTodoStatus(id);
        return "redirect:/todos";
    }
    
    @PostMapping("/todos/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todos";
    }
}

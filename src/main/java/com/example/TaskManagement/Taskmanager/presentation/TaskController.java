package com.example.TaskManagement.Taskmanager.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

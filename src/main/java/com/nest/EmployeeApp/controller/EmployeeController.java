package com.nest.EmployeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Employee App";
    }

    @GetMapping("/add")
    public String AddEmployee(){
        return "Welcome to Employee Add Page";
    }

    @GetMapping("/search")
    public String SearchEmployee(){
        return "Welcome to Employee Search Page";
    }

    @GetMapping("/delete")
    public String DeleteEmployee(){
        return "Welcome to Employee Delete Page";
    }

    @GetMapping("/viewall")
    public String ViewAllEmployee(){
        return "Welcome to View All Employee Page";
    }
}

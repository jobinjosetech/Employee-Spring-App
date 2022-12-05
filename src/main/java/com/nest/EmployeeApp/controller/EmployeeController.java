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
    public String AddPage(){
        return "Welcome to Employee Add Page";
    }

    @GetMapping("/search")
    public String SearchPage(){
        return "Welcome to Employee Search Page";
    }
}

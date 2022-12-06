package com.nest.EmployeeApp.controller;

import com.nest.EmployeeApp.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Employee App";
    }

    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname());
        System.out.println(e.getMobile());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        return "Welcome to Employee Add Page";
    }

    @PostMapping("/search")
    public String SearchEmployee(){
        return "Welcome to Employee Search Page";
    }

    @PostMapping("/delete")
    public String DeleteEmployee(){
        return "Welcome to Employee Delete Page";
    }

    @PostMapping("/edit")
    public String EditEmployee(){
        return "Welcome to Employee Edit Page";
    }

    @GetMapping("/viewall")
    public String ViewAllEmployee(){
        return "Welcome to View All Employee Page";
    }
}

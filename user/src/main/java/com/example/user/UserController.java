package com.example.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
public class UserController 
{
     
    @GetMapping(path="", produces = "application/json")
    public String getUser() 
    {
        return "I am the user";
    }

}

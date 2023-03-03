package com.example.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/book")
public class BookController 
{
     
    @GetMapping(path="", produces = "application/json")
    public String getUser() 
    {
        return "I am the book";
    }

}

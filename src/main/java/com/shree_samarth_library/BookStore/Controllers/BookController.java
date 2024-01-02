package com.shree_samarth_library.BookStore.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping({"/api/v1/book"})
public class BookController {

    @GetMapping("/hello")
    public String greetMember(){
        return "Hello Member ";
    }

}

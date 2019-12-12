package com.authserver.sample.controller;

import com.authserver.sample.model.Apple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApplesController {

    @GetMapping("/apples")
    public List<Apple> getAllApples(){
        List<Apple> appleList = Arrays.asList(
                new Apple(1L,"blue",35),
                new Apple(2L,"green",55),
                new Apple(3L,"Red",77)
        );

        return appleList;
    }
}

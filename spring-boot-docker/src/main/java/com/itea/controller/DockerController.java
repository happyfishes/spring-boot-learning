package com.itea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DockerController
 * @Describe
 * @create 2019-03-21 16:01
 * @Version 1.0
 **/
@RestController
public class DockerController {

    @RequestMapping("/")
    public String index() {
        return "Hello Docker !";
    }
}

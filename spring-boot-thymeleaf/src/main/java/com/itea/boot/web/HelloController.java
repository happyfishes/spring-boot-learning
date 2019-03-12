package com.itea.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Describe
 * @create 2019-03-12 12:33
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.ityouknow.com");
        return "hello";
    }


}

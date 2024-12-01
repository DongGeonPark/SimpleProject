package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/common/board/{boardType}/main.do")
    public String test(@PathVariable String boardType) {
        return boardType;
    }
}

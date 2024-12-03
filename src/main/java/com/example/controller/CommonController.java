package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.BoardService;
import com.example.service.MenuService;

@Controller
public class CommonController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private MenuService menuService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    @RequestMapping("/common/{menuTitle}/main.do")
    public ModelAndView test(@PathVariable String menuTitle) {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/test-db-connection")
    public String testDbConnection() {
        boolean isConnected = boardService.testConnection();
        System.out.println("isConnected: " + isConnected);
        return "index";
    }

    @RequestMapping("/common/remove/cache.do")
    public String removeCache() {
        menuService.refreshCache();
        boardService.refreshCache();
        return "redirect:/";
    }
}

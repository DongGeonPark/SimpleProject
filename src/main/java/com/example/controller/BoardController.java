package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.BoardService;
import com.example.vo.BoardVO;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/board/{boardType}/main.do")
    public ModelAndView test(@PathVariable String boardType) {
        ModelAndView mv = new ModelAndView();
        List<BoardVO> boardList = boardService.getBoardList();
        mv.addObject("boardList", boardList);
        return mv;
    }

}

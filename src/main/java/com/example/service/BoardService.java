package com.example.service;

import java.util.List;

import com.example.vo.BoardVO;

public interface BoardService {

    public boolean testConnection();

    public List<BoardVO> getBoardList();

    public void refreshCache();
} 
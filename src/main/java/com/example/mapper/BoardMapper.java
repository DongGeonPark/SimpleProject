package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vo.BoardVO;

@Mapper
public interface BoardMapper {
    
    //@Select("SELECT 1")
    int testQuery();
    
    // XML에 정의된 쿼리를 사용하는 경우
    int testXmlQuery();

    // 게시판 목록 조회
    List<BoardVO> getBoardList();
} 
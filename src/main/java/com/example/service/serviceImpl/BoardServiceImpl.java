package com.example.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.example.mapper.BoardMapper;
import com.example.service.BoardService;
import com.example.vo.BoardVO;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public boolean testConnection() {
        try {
            int result = boardMapper.testXmlQuery();
            return result == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @Cacheable(value = "boardCache", key = "'boardList'")
    public List<BoardVO> getBoardList() {
        System.out.println("캐시에서 데이터를 찾지 못해 DB에서 조회합니다.");

        return boardMapper.getBoardList();
    }

    @CacheEvict(value = "boardCache", allEntries = true)
    public void refreshCache() {
        // 캐시를 수동으로 갱신해야 할 때 호출
    }
} 
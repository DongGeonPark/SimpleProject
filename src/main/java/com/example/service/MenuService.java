package com.example.service;

import java.util.List;
import com.example.vo.MenuVO;

public interface MenuService {
    // 메뉴 목록 조회
    List<MenuVO> getMenuList();
    // 캐시 갱신
    void refreshCache();
}
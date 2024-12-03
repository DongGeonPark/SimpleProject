package com.example.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.mapper.MenuMapper;
import com.example.service.MenuService;
import com.example.vo.MenuVO;

@Service
public class MenuServiceImpl implements MenuService {
    
    @Autowired
    private MenuMapper menuMapper;
    
    @Override
    @Cacheable(value = "menuCache", key = "'menuList'")
    public List<MenuVO> getMenuList() {
        return menuMapper.getMenuList();
    }
    
    @CacheEvict(value = "menuCache", allEntries = true)
    public void refreshCache() {
        // 캐시를 수동으로 갱신해야 할 때 호출
    }
}
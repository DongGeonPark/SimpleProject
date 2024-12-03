package com.example.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.vo.MenuVO;

@Mapper
public interface MenuMapper {
    List<MenuVO> getMenuList();
}
package com.example.interceptor;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.example.service.MenuService;
import com.example.vo.MenuVO;

public class MenuInterceptor implements HandlerInterceptor {
    
    @Autowired
    private MenuService menuService;
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, 
                         Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null && !isResourceRequest(request)) {
            List<MenuVO> menuList = menuService.getMenuList();
            modelAndView.addObject("menuList", menuList);
        }
    }

    private boolean isResourceRequest(HttpServletRequest request) {
        String uri = request.getRequestURI();
        return uri.startsWith("/resources/") || uri.endsWith(".css") || uri.endsWith(".js") 
               || uri.endsWith(".jpg") || uri.endsWith(".png");
    }
}
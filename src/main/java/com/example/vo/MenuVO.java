package com.example.vo;

public class MenuVO {
    private int menuSeq;
    private String menuTitle;
    private String menuUrl;
    
    public int getMenuSeq() {
        return menuSeq;
    }
    
    public void setMenuSeq(int menuSeq) {
        this.menuSeq = menuSeq;
    }
    
    public String getMenuTitle() {
        return menuTitle;
    }
    
    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
}
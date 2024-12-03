<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="board-list">
    <h2>게시판 목록</h2>
    <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${boardList}" var="board">
                <tr>
                    <td>${board.boardSeq}</td>
                    <td>${board.boardTitle}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div> 
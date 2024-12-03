<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="sidebar">
    <ul>
        <c:forEach items="${boardList}" var="board">
            <li><a href="#">${board.boardTitle}</a></li>
        </c:forEach>
    </ul>
</div>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="header">
    <div class="logo">
        <a href="/"><img src="${pageContext.request.contextPath}/resources/images/logo.png" alt="Logo"></a>
    </div>
    <div class="nav">
        <ul>
            <c:forEach items="${menuList}" var="menu">
                <li><a href="${menu.menuUrl}">${menu.menuTitle}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>

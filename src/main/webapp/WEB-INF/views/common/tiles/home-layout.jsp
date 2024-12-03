<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css">
</head>
<body>
    <header class="header">
        <tiles:insertAttribute name="header"/>
    </header>
    
    <main class="main-content-full">
        <tiles:insertAttribute name="body"/>
    </main>
    
    <footer class="footer">
        <tiles:insertAttribute name="footer"/>
    </footer>
</body>
</html> 
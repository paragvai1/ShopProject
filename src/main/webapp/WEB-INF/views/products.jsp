<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>PRODUCTS</title>
</head>
<body>
PRODUCTS LIST
<c:forEach var="product" items="${productsList}">
    <tr>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>${product.pictureLink}</td>
    </tr>
    <tr>
        <td>${product.price}</td>
    </tr>
</c:forEach>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>ENTER_FORM</title>
    <style type="text/css">
        .error {
            color: red;
        }
    </style>

</head>
<body> Customer enter from
<form:form action="checkUser" method="post" modelAttribute="user">
    <table>
        <tr>
            <th>Email</th>
            <td>
                <form:input path="email" />
                <form:errors path="email" cssClass="error" />
            </td>
        </tr>
        <tr>
            <th>Password</th>
            <td>
                <form:input path="password" />
                <form:errors path="password" cssClass="error" />
            </td>
        </tr>
        <td><button type="submit">Check</button></td>
        </tr>
    </table>
</form:form>
<button><a href="regForm">REGISTRATION</a></button>
<h1>${message}</h1>
</body>
</html>

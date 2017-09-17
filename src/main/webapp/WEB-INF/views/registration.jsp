<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>REGISTRATION_FORM</title>
    <style type="text/css">
        .error {color: red;}
    </style>
</head>
<body> Customer registration from
<spring:form action="saveUser" method="get" modelAttribute="user">
    <table>
        <tr>
            <th>Surname</th>
            <td>
                <spring:input path="surname" type="text" required="true" placeholder="Your surname" />
                <spring:errors path="surname" cssClass="error" />
            </td>
        </tr>
        <tr>
            <th>Name</th>
            <td>
                <spring:input path="name" type="text" required="true" placeholder="Your name" />
                <spring:errors path="name" cssClass="error" />
            </td>
        </tr>
        <tr>
            <th>Email</th>
            <td>
                <spring:input path="email" type="email" required="true" placeholder="bigroiWear.2017@gmail.com" />
                <spring:errors path="email" cssClass="error" />
            </td>
        </tr>
        <tr>
            <th>Password</th>
            <td>
                <spring:input path="password" type="password" required="true" placeholder="123AsKKl5"/>
                <spring:errors path="password" cssClass="error" />
            </td>
        </tr>
        <tr>
            <th>Phone</th>
            <td>
                <spring:input path="phone" type="tel" required="true" placeholder="+375(xx) xxx xx xx"/>
                <spring:errors path="phone" cssClass="error" />
            </td>
        </tr>
        <td><button type="submit">Save</button></td>
        </tr>
    </table>
</spring:form>
<button><a href="login">ENTER</a></button><br>
<h1 color="red">${message}</h1>
</body>
</html>

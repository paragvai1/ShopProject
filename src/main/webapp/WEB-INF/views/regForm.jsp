<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>REGISTRATION_FORM</title>

    <style type="text/css">
        .error {
            color: red;
        }
    </style>

</head>
<body> Customer registration from
    <form:form action="saveUser" method="post" modelAttribute="user">
        <table>
            <tr>
                <th>Surname</th>
                <td>
                    <form:input path="surname" />
                    <form:errors path="surname" cssClass="error" />
                </td>
            </tr>
            <tr>
                <th>Name</th>
                <td>
                    <form:input path="name" />
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
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
            <tr>
                <th>Phone</th>
                <td>
                    <form:input path="phone" />
                    <form:errors path="phone" cssClass="error" />
                </td>
            </tr>
                <td><button type="submit">Save</button></td>
            </tr>
        </table>
    </form:form>
<button><a href="enterForm">ENTER</a></button>
<h1>${message}</h1>
</body>
</html>
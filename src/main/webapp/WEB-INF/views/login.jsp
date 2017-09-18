<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>LOGIN_FORM</title>
</head>
<body>
<form action="/j_spring_security_check" method="POST">
    <table>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="j_username" /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="j_password" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="LOGIN"/></td>
        </tr>
    </table>
</form>
<h3 color="red">
    <span>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
</h3>
</body>
</html>

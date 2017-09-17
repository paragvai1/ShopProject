<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>AUTHORIZED_USER_PAGE</title>
</head>
<body>
<sec:authentication property="name" /><br>
<sec:authentication property="authorities"/><br>
<h1>${message}</h1><br>
<h3><a href="logout">Logout</a></h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error{
color:red;
font-family:serif;
font-style:italic;
}
</style>
</head>
<body>
<form:form action="addaccount" method="post" modelAttribute="account">
<form:hidden path="id"/>

Enter accountNo:<form:input path="accountNo"/><form:errors path="accountNo" class="error"/><br/>
Enter balance:<form:input path="balance"/><form:errors path="balance" class="error"/><br/>
Enter customer:<form:input path="customer"/><form:errors path="customer" class="error"/><br/>
Enter blocked:<form:input path="blocked"/><form:errors path="blocked" class="error"/><br/>


<input type="submit"/>
</form:form>
</body>
</html>
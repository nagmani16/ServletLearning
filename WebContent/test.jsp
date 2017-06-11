<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="JavaClass.JavaClassExample,java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file= "/helloWorld.jsp" %> <br>
<%! 



public boolean checkNumber(int a, int b){
 if (a>b) {
 return true;
} else {
	return false;
}
 
}
 %>

The current Time is: <%= new Date() %>
<%
	boolean k = checkNumber(4,5);
	
%>

  

 <h3>is number 4 is greater than 5 :  <%=k %>  </h3> <br>

  sum for 4 and 5 is : <%= JavaClassExample.getSum(4, 5) %> <br>

  

</body>
</html>
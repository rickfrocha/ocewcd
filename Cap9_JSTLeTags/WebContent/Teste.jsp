<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	
	   <%
	     // java.lang.String xml = "<script> function show(){ alert('ola!!'); }  show(); </script>";
	   //   pageContext.setAttribute("show", xml, PageContext.PAGE_SCOPE);
	      pageContext.setAttribute("none", "", PageContext.REQUEST_SCOPE);
	   
	    %>
         	    
	    <c:out value="${show}" escapeXml="false"/>
	    ${requestScope.none gt -1}
	    
	</body>
   
</html>
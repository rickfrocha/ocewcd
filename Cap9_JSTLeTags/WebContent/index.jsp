<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="myTags" prefix="my" %>
<fmt:setBundle basename="resources.application" /> 

<html>
<head>
  <title><fmt:message key="welcome.title"/></title>
</head>
<body bgcolor="white">

<h3><fmt:message key="welcome.heading"/></h3>
<p><fmt:message key="welcome.message"/></p>
<my:myCustomTag usuario="${param.usuario}"/>

</body>
</html>
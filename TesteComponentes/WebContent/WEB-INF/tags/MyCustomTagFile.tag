
<%@ tag body-content="scriptless" dynamic-attributes="false"  %>
<%@ attribute name="usuario" fragment="false" required="true" rtexprvalue="true" %>

<!-- CHAMANDO TAG FILE -->
<b> Hello: ${usuario} </b> <jsp:doBody/>
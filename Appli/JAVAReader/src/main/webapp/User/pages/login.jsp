<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<center>
<h1>Bienvenue dans JAVAReader !</h1>
 
<s:form action="accueilAction.action">
	<s:textfield name="username" label="Username"/>
	<s:password name="password" label="Password"/>
	<s:submit label="se connecter"/>
</s:form>
<s:form action="loginAction.action">
    <s:submit label="s'inscrire"/>
</s:form>

</center>
</body>
</html>
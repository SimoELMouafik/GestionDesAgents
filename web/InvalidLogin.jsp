<%-- 
    Document   : InvalidLogin
    Created on : 19 juil. 2016, 11:30:50
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8" />
   <link rel="stylesheet"  href="CSS/InvalidLogin.css" />
   <title>Banque populaire</title>
   
</head>
<body>
   <form action="login.jsp" method="get">
	<img src="IMAGES/log in.png" /><br />
        <div id="dsl">Désolé !!</div>
        <div id="msg">Nom D'utilisateur ou Mot de passe non Valide .</div> 
	<input  id="envoi" type="submit" name="login" value="Réessayer"  />
        <div id="copy">&COPY;Banque Populaire</div>
   </form>

</body>
</html>


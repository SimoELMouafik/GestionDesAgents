<%-- 
    Document   : login
    Created on : 18 juil. 2016, 10:08:16
    Author     : user
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8" />
   <link rel="stylesheet"  href="CSS/login.css" />
   <title>Banque populaire</title>
</head>
<body>
   <form action="logServ" method="post">
	<img src="IMAGES/log in.png" /><br />
	<pre>     Matricule    </pre>
	<input class="boutton"  type="text" name="matric" /><br />
	<pre>   Mot de passe   </pre>      
	<input class="boutton"  type="password" name="pass" /><br />
	<input  id="envoi" type="submit" name="login" value="Envoyer" />
        <div>&COPY;Banque Populaire</div>
   </form>

</body>
</html>

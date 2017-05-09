<%-- 
    Document   : UserLogged
    Created on : 19 juil. 2016, 11:38:56
    Author     : user
--%>

<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="WebClasses.Agent"
         import="WebClasses.AffichageDAO"
   %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8" />
   <link rel="stylesheet"  href="CSS/Mdp.css" />
   <title>Banque populaire</title>
</head>
<body>
    <%Agent emp=(Agent)session.getAttribute("employe2");%>
   <form action="EnvoiPassServ" method="post">
	<img id="rien" src="IMAGES/log in.png" alt=""/><br />
	<pre>Matricule *                  </pre>
	<input class="boutton"  type="text" name="matric" /><br />
	<pre>Nom                          </pre>      
	<input class="boutton"  type="text" name="nom" /><br />
	<pre>Prénom                       </pre>      
	<input class="boutton"  type="text" name="prenom" /><br />
        <input  id="envoi" type="submit" name="login" value="Envoyer Le Mot De Passe" />
        <div id="copy">&COPY;Banque Populaire</div>
   </form>
         <img id="userPic" src="IMAGES/log in.png" alt=""/>
         <div id="user"><span class="span2"><%="Matricule:  "%></span><%=emp.getUsername()%><br />
          <span class="span2"><%="Rôle:  "%></span><%=emp.getAcces()%></div>
</body>
</html>

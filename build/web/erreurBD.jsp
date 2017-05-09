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
   <link rel="stylesheet"  href="CSS/ErreurBD.css" />
   <title>Banque populaire</title>
   
   

</head>         
<body> 
   <div id="corps">
   <%Agent emp=(Agent)session.getAttribute("employe");%>
   <center><form  action="RetourServ" method="post">     
        <img src="IMAGES/rechEmp.png" alt=""/><br />
        <span class="msg" id="texte1">Agent Inexistant Dans La Base De Donnée !!</span><br />
        <span class="msg" id="texte2">( Matricule Invalide )</span><br /> 
        <input  id="dcnx" class="boutton" type="submit" name="dconx" value="Retour Au Menu" />
    </form>
   </center> 
     <div id="user"><span class="span2"><%="  Matricule:  "%></span><%=emp.getUsername()%><br /><span class="span2"><%="  Rôle:  "%></span><%=emp.getAcces()%></div>
     <img id="userPic" src="IMAGES/log in.png" alt=""/>
     <div id="copy">&COPY;Banque Populaire</div> 
    
</body>
</html>

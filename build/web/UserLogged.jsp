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
   <link rel="stylesheet"  href="CSS/UserLogged.css" />
   <title>Banque populaire</title>
   
   <script>            
   var rl=<%=session.getAttribute("employe")%>; 
    var r2=rl;
   </script>      
   <script>
      
        function verrouiller(ro)
       {
        if(ro===1)
           { document.getElementById("ajout").disabled = true;   
             document.getElementById("supp").disabled = true;
             document.getElementById("ajout").style.opacity = 0.3;   
             document.getElementById("supp").style.opacity= 0.3;
            }
         else if(ro===2) 
           { /*document.getElementById("ajout").disabled = true; */  
             document.getElementById("supp").disabled = true;
             /*document.getElementById("modif").disabled = true;*/
            /*document.getElementById("ajout").style.opacity = 0.3;*/   
             document.getElementById("supp").style.opacity= 0.3;
             /*document.getElementById("modif").style.opacity= 0.3;*/
     
        } }
</script>

</head>         
<body onload="verrouiller(r2)"> 
   <div id="corps">
   <%Agent emp=(Agent)session.getAttribute("employe2");%>
   <form name="ch" action="chercher.jsp" method="post">     
        <input  id="cherch" class="boutton" type="submit" name="supp" value="Chercher Agent" />   
   </form> 
   <form name="aj" action="BprServA" method="post">     
       <input id="ajout" class="boutton" type="submit" name="ajout" value="Ajouter Agent" /><br />
   </form>
   <form name="mo" action="BprServ" method="post">         
       <input id="modif" class="boutton"  type="submit" name="login" value="Modifier les Données" />
   </form>  
   <form name="mdp" action="mdp.jsp" method="post">     
        <input  id="recup" class="boutton" type="submit" name="mdp" value="Envoyer Mot De Passe" />   
   </form> 
   <form name="su" action="supprimer.jsp" method="post">     
        <input id="supp" class="boutton" type="submit" name="supp" value="Supprimer Agent" /><br />
    </form>
    <form  action="DecoServ" method="post">     
        <input  id="dcnx" class="boutton" type="submit" name="dconx" value="Se Déconnecter" />
    </form>
    
     
     <div id="user"><span><%="  Matricule:  "%></span><%=emp.getUsername()%><br /><span><%="  Rôle:  "%></span><%=emp.getAcces()%></div>
     <img id="userPic" src="IMAGES/log in.png" alt=""/>
     <div id="copy">&COPY;Banque Populaire</div> 
    
</body>
</html>

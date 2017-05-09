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
   <link rel="stylesheet"  href="CSS/Afficher.css" />
   <title>Banque populaire</title>
</head>
<body>
    
   <form id="formul" name="fo" action="RetourServ" method="post">
	<%Agent emp=(Agent)session.getAttribute("employe");%>
       <img id="rien" src="IMAGES/log in.png" /><br />    
            <div id="grp1" >
        <pre>Matricule                    </pre>
        <input class="boutton"  type="text" name="matric" value='<%=emp.getMatricule()%>' readonly /> <br />
	<pre>Nom                          </pre>      
       <input class="boutton"  type="text" name="nom" readonly value="<%=emp.getNom()%>" /><br />
       <pre>Prénom                       </pre>      
	<input class="boutton"  type="text" name="prenom" readonly value="<%=emp.getPrenom()%>"/><br />
        <pre>Rôle                         </pre>      
	<input class="boutton"  type="text" name="role" readonly value="<%=emp.getRole()%>"/><br />
        <pre>Mot De Passe                 </pre>      
        <input class="boutton"  type="password" name="mdp" readonly value="<%=emp.getPassword()%>"/><br />
       <pre>Banque Populaire régionale   </pre>      
	<input class="boutton"  type="text" name="bpr" readonly value="<%=emp.getBpr()%>"/><br />
    </div>
    <div id="grp2">
        <pre>Succursal actuelle           </pre>      
	<input class="boutton"  type="text" name="succ" readonly value="<%=emp.getSuccursal()%>"/><br />
        <pre>Agence actuelle              </pre>      
	<input class="boutton"  type="text" name="agence" readonly value="<%=emp.getAgence()%>"/><br />
        <pre>Fonction actuelle            </pre>      
	<input class="boutton"  type="text" name="fct" readonly value="<%=emp.getFonction()%>"/><br />
        <pre>Email                        </pre>      
	<input class="boutton"  type="text" name="ema" readonly value="<%=emp.getEmail()%>"/><br />
        <pre>Version                      </pre>      
	<input class="boutton"  type="text" name="vers" readonly value="<%=emp.getVersion()%>"/><br />
        <pre>Actif                        </pre>
        <input class="boutton"  type="text" name="actif" readonly value="<%if(emp.getActif()) out.println("Oui"); else out.println("Non");%>" /><br />
    </div>    
        <input  id="rmenu" class="envoi" type="submit" name="rmenu" value="Retour Au Menu" />
    </form> 
    
     
    
        <img id="userPic" src="IMAGES/log in.png" alt=""/>
         <div id="user"><span class="span2"><%="Matricule:  "%></span><%=emp.getUsername()%><br /><span class="span2"><%="Rôle:  "%></span><%=emp.getAcces()%></div>
         <div id="copy">&COPY;Banque Populaire</div>
   

</body>
</html>

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
   <link rel="stylesheet"  href="CSS/Modifier.css" />
   <title>Banque populaire</title>
</head>
<body>
    <%Agent emp=(Agent)session.getAttribute("employe");%>
    <form action="BprServR" method="post">
	<img id="rien" src="IMAGES/log in.png" alt="" /><br />
	<pre>             Matricule *                  </pre>
	<input class="boutton"  type="text" name="matric" value="<%=emp.getMatricule()%>" readonly />
	 <input  id="afficher" type="submit" name="login" value="Retour" />
        <pre>Nom                          </pre>      
	<input class="boutton"  type="text" name="nom" value="<%=emp.getNom()%>" readonly/><br />
	<pre>Prénom                       </pre>      
	<input class="boutton"  type="text" name="prenom" value="<%=emp.getPrenom()%>" readonly /><br />
        <pre>Banque Populaire régionale * </pre>      
	<input class="boutton"  name="bpr" value="<%=emp.getBpr()%>" readonly >
        <!--<option value="1">FES-TAZA</option>
        <option value="2">CENTRE SUD</option>
        <option value="3">CASABLANCA</option>
        <option value="4">EL JADIDA-SAFI</option>
        <option value="5">LAAYOUNE</option>
        <option value="6">MARRAKECH-BENI MELLAL</option>
        <option value="7">MEKNES</option>
        <option value="8">NADOR-EL HOCEIMA</option>
        <option value="9">RABAT-KENITRA</option>
        <option value="10">OUJDA</option>
        <option value="11">TANGER-TETOUAN</option>
        </select>--><br />
        <pre>Succursal actuelle *         </pre>      
	<input class="boutton"  type="text" name="succ" value="<%=emp.getSuccursal()%>" readonly /><br />
        <pre>Agence actuelle *            </pre>      
	<input class="boutton"  type="text" name="agence" value="<%=emp.getAgence()%>" readonly/><br />
        <pre>Fonction actuelle *          </pre>      
	<input class="boutton"  name="fct" value="<%=emp.getFonction()%>" readonly >
       <!-- <option>Audit</option>
        <option>Ressources humaines</option>
        <option>Maintenance</option>
        <option>Comerciale</option>
        <option>Informatique</option>
        </select>--><br />
        <input  id="envoi" type="submit" name="login" value="Valider les Modifications" disabled
                style="opacity:0.5;"/>
        <div id="copy">&COPY;Banque Populaire</div>
   </form>
    <img id="userPic" src="IMAGES/log in.png" alt=""/>
    <div id="user"><span class="span2"><%="Matricule:  "%></span><%=emp.getUsername()%><br /><span class="span2"><%="Rôle:  "%></span><%=emp.getAcces()%></div>
          
</body>
</html>

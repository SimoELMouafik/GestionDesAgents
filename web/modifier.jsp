<%-- 
    Document   : UserLogged
    Created on : 19 juil. 2016, 11:38:56
    Author     : user
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="WebClasses.liste"%>
<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="WebClasses.Agent"
         import="WebClasses.AffichageDAO"
         import="WebClasses.listerDAO"


   %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8" />
   <link rel="stylesheet"  href="CSS/Modifier.css" />
   <title>Banque populaire</title>         
   <%List listB=(List)session.getAttribute("listB"); %>
   <%List listS=(List)session.getAttribute("listS"); %>
   <%List listA=(List)session.getAttribute("listA"); %>
   <%List listF=(List)session.getAttribute("listF"); %>
  

</head>
<body>
    <%Agent emp=(Agent)session.getAttribute("employe2");%>
    <form name="form" id="form" action="ModServ" method="post">
        <img id="rien" src="IMAGES/log in.png" alt="" /><br />
	<pre>             Matricule *                  </pre>
	<input class="boutton"  type="text" name="matric" value="" />
	 <input  id="afficher" type="submit" name="login" value="Check" />
        <pre>Nom                          </pre>      
	<input class="boutton"  type="text" name="nom" /><br />
	<pre>Prénom                       </pre>      
	<input class="boutton"  type="text" name="prenom" /><br />
        
        <pre>Banque Populaire régionale * </pre>      
	<SELECT class="boutton"  name="bpr" style="height:34px; width:215px;">
        <OPTION value="Initiale">Banque régionnale</Option>
         <c:forEach items="${listB}" var="cont">
                    <option value=${cont.getCode()}>${cont.getLibelle()}</option>
                </c:forEach>
        </SELECT><br />
      
        <pre>Succursal actuelle *         </pre>      
	<SELECT class="boutton"  name="succ" style="height:34px; width:215px;">
        <OPTION value="Initiale">Succursal</Option>
         <c:forEach items="${listS}" var="cont">
                    <option value=${cont.getCode()}>${cont.getLibelle()}</option>
                </c:forEach>
        </SELECT><br />
        
        <pre>Agence actuelle *            </pre>      
	<SELECT class="boutton"  name="agence" style="height:34px; width:215px;">
        <OPTION value="Initiale">Agence</Option>
         <c:forEach items="${listA}" var="cont">
                    <option value=${cont.getCode()}>${cont.getLibelle()}</option>
                </c:forEach>
        </SELECT><br />
        
        <pre>Fonction actuelle *          </pre>      
	<SELECT class="boutton"  name="fct" style="height:34px; width:215px;">
        <OPTION value="Initiale">Fonction</Option>
         <c:forEach items="${listF}" var="cont">
                    <option>${cont.getLibelle()}</option>
                </c:forEach>
        </SELECT><br />
        <input  id="envoi" type="submit" name="login" value="Valider les Modifications" />
        <div id="copy">&COPY;Banque Populaire</div>
   </form>
    <img id="userPic" src="IMAGES/log in.png" alt=""/>
    <div id="user"><span class="span2"><%="Matricule:  "%></span><%=emp.getUsername()%><br /><span class="span2"><%="Rôle:  "%></span><%=emp.getAcces()%></div>
</body>          

</html>

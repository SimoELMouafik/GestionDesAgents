<%-- 
    Document   : UserLogged
    Created on : 19 juil. 2016, 11:38:56
    Author     : user
--%>

<%@page import="java.util.List"%>
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
   <link rel="stylesheet"  href="CSS/Ajouter.css" />
   <title>Banque populaire</title>
    <title>Banque populaire</title>
   <%List listB=(List)session.getAttribute("listB"); %>
   <%List listS=(List)session.getAttribute("listS"); %>
   <%List listA=(List)session.getAttribute("listA"); %>
   <%List listF=(List)session.getAttribute("listF"); %>
   
</head>
<body>
   <%Agent emp=(Agent)session.getAttribute("employe2");%>
    <form action="AjoutServ" method="post">
    <img id="rien" src="IMAGES/log in.png" alt=""/><br />
    <div id="grp1">
        <pre>Matricule                    </pre>
	<input class="boutton"  type="text" name="matric" /><br />
	<pre>Nom                          </pre>      
	<input class="boutton"  type="text" name="nom" /><br />
        <pre>Prénom                       </pre>      
	<input class="boutton"  type="text" name="prenom" /><br />
        <pre>Rôle                         </pre>      
	<select class="boutton"  name="role" style="height:34px; width:213px;">
        <option value="ADM">Administration</option>
        <option>Maintenance</option>
        <option>Consultation</option>  
       </select><br />
        <pre>Mot De Passe                 </pre>      
        <input class="boutton"  type="password" name="mdp" /><br />
            <pre>Banque Populaire régionale * </pre>      
	<SELECT class="boutton"  name="bpr" style="height:34px; width:215px;">
        <OPTION value="Initiale">Banque régionnale</Option>
         <c:forEach items="${listB}" var="cont">
                    <option value=${cont.getCode()}>${cont.getLibelle()}</option>
                </c:forEach>
        </SELECT><br />
    </div>
    <div id="grp2">
        
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
        <pre>Email                        </pre>      
	<input class="boutton"  type="text" name="ema" /><br />
        <pre>Version                      </pre>      
	<input class="boutton"  type="text" name="vers" /><br />
        <pre>Actif                        </pre>
        <input class="radio"  type="radio" name="actif" value="oui"/><pre> Oui     </pre>
        <input class="radio"  type="radio" name="actif" value="non"/><pre> Non     </pre><br />
   </div>    
        <input  id="envoi" type="submit" name="login" value="Ajouter l'Agent" />
        <div id="copy">&COPY;Banque Populaire</div>
   </form>
     <img id="userPic" src="IMAGES/log in.png" alt=""/>
      <div id="user"><span class="span2"><%="Matricule:  "%></span><%=emp.getUsername()%><br /><span class="span2"><%="Rôle:  "%></span><%=emp.getAcces()%></div>
</body>
</html>

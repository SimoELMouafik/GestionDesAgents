<%-- 
    Document   : test
    Created on : 30 juil. 2016, 00:18:07
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE>Tout JavaScript.com - Info Bulle DHTML</TITLE>
<SCRIPT LANGUAGE="JavaScript">
//D'autres scripts sur http://www.toutjavascript.com
//Si vous utilisez ce script, merci de m'avertir ! < <voir adresse mail sur site> >
function Ajouter(form) {
var o=new Option(form.libelle.value,form.valeur.value);
form.liste.options[form.liste.options.length]=o;
}
function Inserer(form) {
var o=new Option(form.libelle.value,form.valeur.value);
if(form.liste.options.selectedIndex>=0) {
form.liste.options.length++;
for (var i=form.liste.options.length-1;i>form.liste.options.selectedIndex;i--) {
var p=new Option(form.liste.options[i-1].text,form.liste.options[i-1].value);
form.liste.options[i]=p;
}
form.liste.options[form.liste.options.selectedIndex]=o;
} else {
alert("Insertion impossible. Sélectionnez une ligne");
}
}
function Supprimer(list) {
if (list.options.selectedIndex>=0) {
list.options[list.options.selectedIndex]=null;
} else {
alert("Suppression impossible : aucune ligne sélectionnée");
}
}
function SupprimerTout(list) {
list.options.length=0;
}
</SCRIPT>
</HEAD>
<BODY bgcolor="#FFFFFF">
    <FONT FACE="Arial" SIZE='-1' COLOR="#000099" ></FONT>
<BIG><B>Ajouter, insérer et supprimer une ligne dans une liste</B></BIG>
<BR>
Ce script est tiré de la page de conseil "Trucs et Astuces de formulaire" sur <B><A href="http://www.toutjavascript.com" target="_blank">Tout JavaScript.com</A></B><BR>
<form name="formulaire">
Ce script permet d'ajouter dynamiquement des éléments dans une liste, sans rechargement de la page (nécessite des versions 4 et + de Netscape ou Internet Explorer).<BR>
Entrez le libellé et la valeur dans les champs ci-dessous, cliquez sur Ajouter ou Insérer.<BR>
Libellé : <INPUT type="text" name="libelle" size=15 value="texte">
- Valeur : <INPUT type="text" name="valeur" size=15 value="texte">
<INPUT type="button" Value="Ajouter" onClick="Ajouter(this.form)">
<INPUT type="button" Value="Insérer" onClick="Inserer(this.form)">
<BR><BR>
Sélectionnez une ligne de la liste pour voir le détail
<SELECT  name="liste" size=3 onChange="alert('Libellé : '+this.options[this.selectedIndex].text+'\nValeur : '+this.options[this.selectedIndex].value)">
<OPTION value="Initiale">Ligne initiale</OPTION>
</SELECT><BR><BR>
<INPUT type="button" value="Supprimer la sélection" onClick="Supprimer(this.form.liste)">
<INPUT type="button" value="Supprimer tout" onClick="SupprimerTout(this.form.liste)">
<BR><BR>
Le bouton Ajouter ajoute à la fin de la liste la ligne.<BR>
Le bouton Insérer insère la nouvelle ligne avant la ligne sélectionnée.<BR>
Le bouton Supprimer la sélection supprime la ligne sélectionnée dans la liste.<BR>
Le bouton Supprimer tout supprime toutes les lignes.<BR>
</FORM>
<BR>
</BODY></HTML>
<!-- Script développé par Olivier Hondermarck <voir adresse mail sur site> -->
<!-- D'autres scripts et des conseils sur http://www.toutjavascript.com -->


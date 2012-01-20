<%-- 
    Document   : jeu
    Created on : 20 janv. 2012, 08:25:52
    Author     : dubreil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puissance 4</title>
    </head>
    <body>
        <h1>Joueur : <%= request.getParameter("name") %></h1>
        <%
            for (int i=0;i<7;i++)
                out.println("<a href='Jeu?colonne=" + i + "'><img src='images/fleche.PNG' style='border: none;'/></a>");
            out.println("<br/>");
            for (int i=0;i<6;i++){
                for (int j=0;j<7;j++)
                    out.println("<img src='images/empty.png' style='position: relative;'/>" );
                out.println("<br/>");
            }
        %>
        </br>
        <a href="index.jsp">Arr&ecirc;ter</a>
    </body>
</html>

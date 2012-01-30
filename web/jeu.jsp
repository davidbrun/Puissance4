<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="gameBean" scope="session" class="fr.uha.ensisa.brundubreil.servlet.GameBean" />
<!DOCTYPE html>
<html>
    <style type="text/css">
        table {
            border-collapse: collapse;
        }
        th, td {
            padding: 0px;
        }
        td img {
            padding: 0px;
            margin: 0px;
            display: block;
        }
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puissance 4</title>
    </head>
    <body>
        <h1><center>Puissance 4</center></h1>
        <h4>Joueur : <%= gameBean.getPlayer() %></h4>
        <%
            
            out.println("<table><tr>");
            for (int i=0;i<7;i++)
                out.println("<td><a href='Game?column=" + i + "'><img src='images/fleche.PNG' style='border: none;'/></a></td>");
            out.println("</tr>");
            for (int i=0;i<6;i++) {
                out.println("<tr>");
                for (int j=0;j<7;j++)
                    out.println("<td><img src='images/" + gameBean.getImage(i, j) + "' style='position: relative;display:block;padding:0px:margin:0px;'/></td>" );
            
                out.println("</tr>");
            }
            
            out.println("</table>");
        %>
        </br>
        <a href="index.jsp">Arr&ecirc;ter</a>
    </body>
</html>

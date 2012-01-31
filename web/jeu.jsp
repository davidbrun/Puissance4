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
        </br>
        <h3>Joueur : <%= gameBean.getPlayerName() %></h3>
        </br>
        <% out.print(gameBean.getGridHTML()); %>
        </br></br></br>
        <a href="index.jsp"><% out.print((gameBean.gameIsEnded() ? "Recommencer" : "Arr&ecirc;ter")); %></a>
    </body>
</html>
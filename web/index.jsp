<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="gameBean" scope="session" class="fr.uha.ensisa.brundubreil.servlet.GameBean" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puissance 4</title>
    </head>
    <body>
        <h1><center>Puissance 4</center></h1>
        </br></br>
        <form action="Index" method="POST">
            Nom du joueur :
            <input type="text" name="name" value="<%= gameBean.getPlayerName() %>" /></br></br>
            Qui commence la partie : 
            <select name="begin">
                <option value="1"<%= (gameBean.isHumanPlayerBegin() ? "SELECTED" : "") %>>Moi</option>
                <option value="0"<%= (gameBean.isHumanPlayerBegin() ? "" : "SELECTED") %>>Ordinateur</option>
            </select></br></br></br>
            <INPUT type="submit" value="Valider">
        </form>
    </body>
</html>
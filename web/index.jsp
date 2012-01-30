<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="gameBean" scope="session" class="fr.uha.ensisa.brundubreil.servlet.GameBean" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puissance 4</title>
    </head>
    <body>
        <h1>Puissance 4</h1>
        <form action="Index" method="POST">
            Nom : <input type="text" name="name" value="<%= gameBean.getPlayerName() %>" /></br></br>
            Qui commence la partie : 
            <select name="begin">
                <option value="player">Moi</option>
                <option value="computer">Ordinateur</option>
            </select></br></br>
            <INPUT type="submit" value="Valider">
        </form>
    </body>
</html>
<%-- 
    Document   : index
    Created on : 20 janv. 2012, 08:19:42
    Author     : dubreil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Puissance 4</h1>
        <form action="Validation" method="POST">
            Nom : <input type="text" name="name"/></br></br>
            Qui commence la partie : 
            <select name="begin">
                <option value="me">Moi       </option>
                <option value="computer">Ordinateur</option>
            </select></br></br>
            <INPUT type="submit" value="Valider">
        </form>
    </body>
</html>
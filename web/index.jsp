<%-- 
    Document   : index
    Created on : 13/10/2019, 14:44:34
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Implementação BigM</h1>
        <div id="principal">
            <form action="RestricoesController" method="post">
                <label for="txtQtdVar">
                    Insira aqui a quantidade de váriaveis que o problema tem:
                </label>    
                <input type="text" col="3" id="txtQtdVar" name="txtQtdVar"/>
                <br>
                <label for="txtQtdRes">
                    Insira aqui a quantidade de restrições que o problema tem:
                </label>
                <input type="text" id="txtQtdRes" col="3" name="txtQtdRes"/>
                <br>
                <input type="submit" value="Próximo"/>
            </form>
        </div>
    </body>
</html>

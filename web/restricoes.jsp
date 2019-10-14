<%-- 
    Document   : restricoes
    Created on : 13/10/2019, 15:14:29
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <form action="CalcularController" method="post">
            <input type="hidden" col="3" value="${qtdVar}" id="txtQtdVar" name="txtQtdVar" placeholder="none"/>
            <input type="hidden" col="3" value="${qtdRes}" id="txtQtdRes" name="txtQtdRes" placeholder="none"/>
            <label>Qual o objetivo da função:</label>
            <select id="objetivo" name="txtObjetivo">
                <option value="maximar">Maximar</option>
                <option value="minimizar">Minimizar</option>
            </select>
            <br> 
            <label>Função:            </label>
             <c:forEach items="${variaveis}" var="variavel">
            
                <input type="text" name="txtObjetivoX${variavel}" />
                <label for="txtObjetivoX${variavel}">X${variavel}+</label>
                </c:forEach>
                <br>
            <label>Restricoes:</label>
            <br>
            <c:forEach items="${restricoes}" var="restricao">
                <label for="${restricao}"> Restricao ${restricao}: </label>
                <c:forEach items="${variaveis}" var="variavel">
                
                <input type="text" name="txtX${variavel}r${restricao}" />
                <label for="txtX${variavel}r${restricao}">X${variavel}+</label>
                </c:forEach>
                <select id="igualdade${restricao}" name="txtIgualdadeRes${restricao}">
                    <option value="<=" > <= </option> 
                    <option value=">=" > >= </option> 
                    <option value="=" > = </option> 
                </select>
                <input type="text" name="txtResultadoRes${restricao}" id="resultadoRes${restricao}"/>
                <br>
            </c:forEach>
                <br>
            <input type="submit" value="Calcular"/>
            
        </form>
        </div>
    </body>
</html>

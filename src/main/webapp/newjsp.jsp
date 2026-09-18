<%-- 
    Document   : newjsp
    Created on : 18 de set. de 2026, 09:06:18
    Author     : ALUNOS 2
--%>

<!-- Página de aprendizado da sintaxe de JSP -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%! static String imprimeDia(String mes, int dia){
                return "Hoje é dia " + dia + " de "+ mes;
            };
        %>
        <% for (int i=1; i<=10;i++){out.println(imprimeDia("setembro",i)+"</br>"); } %>
    </body>
</html>
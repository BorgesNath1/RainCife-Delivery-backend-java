<%-- 
    Document   : Entregadores
    Created on : 24 de set. de 2026, 10:30:39
    Author     : ALUNOS 2
--%>

<%@page import="br.edu.ifpe.recife.raincifedelivery.model.entities.Entregador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Página dos Entregadores</h1>
        <%
            List<Entregador> entregadores = (List<Entregador>)session.getAttribute("entregadores");
            %>
            
            <button class="btn btn-success" data-bs-toogle="modal" data-bs-modal="">Cadastrar novo</button>
                    <table class="table">   
                <tr>
                    <th>
                        Nome
                    </th>
                    <th>
                        e-mail
                    </th>
                    <th>
                        telefone
                    </th>
                    <th>ações</th>
                </tr>
                <% 
                    for (Entregador e: entregadores){
                                    
                    %>
                    
                    <tr>
                        <td><%= e.getNome() %></td>
                        <td><%= e.getEmail() %></td>
                        <td><%= e.getTelefone() %></td>
                        <td>
                            <a class="btn btn-info" href="Entregadores?email=<%= e.getEmail()%>&?operacao=editar">editar</a>
                        </td>
                    </tr>
                    <% } %>
            </table>
    </body>
</html>

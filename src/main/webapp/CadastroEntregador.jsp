<%-- 
    Document   : CadastroEntregador
    Created on : 24 de set. de 2026, 09:52:46
    Author     : ALUNOS 2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${(sessionScope["entregador"] ne null)?'Atualizar':'Cadastrar'} novo entregador</h1>
        
        <%
          String mensagem = (String)session.getAttribute("msg");
          
          if (mensagem!= null){
              %>
              <h4><%=mensagem %></h4>
              <%
                  session.removeAttribute("msg");
          }
            %>
        
        <form method="post" action="Entregadores" ></br>
            nome:<input type="text" name="nome" value="${(sessionScope.entregador ne null)?sessionScop.entregador.name:''}"/></br> 
            email:<input type="text" name="email" value="${(sessionScope.entregador ne null)?sessionScop.entregador.email:''}" ${(sessionScope.entregador ne null)?'readOnly="True"':''}/></br>
            telefone:<input type="text" name="telefone" value="${(sessionScope.entregador ne null)?sessionScop.entregador.telefone:''}"/></br>
            senha:<input type="password" name="senha"/></br>
            confirma:<input type="password" name="confirma"/></br>
            <button>Cadastrar</button>
        </form>
    </body>
</html>

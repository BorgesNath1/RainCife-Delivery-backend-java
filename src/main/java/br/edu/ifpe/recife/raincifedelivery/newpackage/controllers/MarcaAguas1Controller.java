/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.newpackage.controllers;

import br.edu.ifpe.recife.raincifedelivery.model.entities.MarcaAgua;
import br.edu.ifpe.recife.raincifedelivery.model.repositories.MarcaAguaRepositorio;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author ALUNOS 2
 */
@WebServlet(name = "MarcaAguas1Controller", urlPatterns = {"/MarcaAguas"})
public class MarcaAguas1Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarcaAguas1Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Marcas de Água Cadastradas</h1>");
            out.println("<table border='1'/>");
            out.println("<tr><th>Nome</th><th>Fonte</th><th>Preço</th></tr>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String op = request.getParameter("operacao");
        
        if(op != null && op.equals("detalhar")){
            
            String id = request.getParameter("id");
            
            MarcaAgua agua = MarcaAguaRepositorio.read(id);
            
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarcaAguas1Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Marcas de Água Cadastradas</h1>");
            out.println("<a href='MarcaAguas'> Ver Marcas </a></br>");
            out.println("Nome:"+agua.getNome()+"</br>");
            out.println("Fonte:"+agua.getFonteOrigem()+"</br>");
            out.println("Preço:"+agua.getPrecoOriginal()+"</br>");
            out.println("Descrição:"+agua.getDescricao()+"</br>");
            out.println("</body>");
            out.println("</html>");
        
            }
            return;
        }
        
        if(op != null && op.equals("alterar")){
            
            String id1 = request.getParameter("id");
            
            MarcaAgua agua1 = MarcaAguaRepositorio.read(id1);
            
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarcaAguas1Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Editar Marca D'água</h1>");          
            out.println("<form action='MarcaAguas' method='post'>");
            out.println("Nome:<input type='text' readonly='true' name='nome' value='"+agua1.getNome()+"'/>");
            out.println("Fonte de Origem: <input type='text' name='fonte' value='"+agua1.getFonteOrigem()+"'/>");
            out.println("Preço: <input type='text' name='preço' value'"+agua1.getPrecoOriginal()+"'/>");
            out.println("Descrição: <textarea name='description' value'"+agua1.getDescricao()+"'></textarea>");
            out.println("<button type='submit'> Editar </button>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");        
            }
            return;
        
            
        }
        
        List<MarcaAgua> aguas = MarcaAguaRepositorio.readAll();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarcaAguas1Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Marcas de Água Cadastradas</h1>");
            out.println("<table border='1'/>");
            out.println("<tr><th>Nome</th><th>Fonte</th><th>Preço</th><th>ações</th></tr>");
            
            for(MarcaAgua agua2: aguas){
                out.println("<tr>");
                out.println("<td>"+agua2.getNome()+"</td>");
                out.println("<td>"+agua2.getFonteOrigem()+"</td>");
                out.println("<td>"+agua2.getPrecoOriginal()+"</td>");
                out.println("<td><a href='MarcaAguas?operacao=detalhar&id="+agua2.getNome()+"'>detalhes</a>"
                        + "<a href='MarcaAguas?operacao=alterar&id="+agua2.getNome()+"'> alterar </a>"
                                + "<a href=''>placeholder</a></td>");
                
                out.println("</tr>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String fonte = request.getParameter("fonte");
        Double preço = Double.parseDouble(request.getParameter("preço"));
        String Descrição = request.getParameter("description");
        
        MarcaAgua mAgua = new MarcaAgua();
        
        mAgua.setNome(nome);
        mAgua.setFonteOrigem(fonte);
        mAgua.setPrecoOriginal(preço);
        mAgua.setDescricao(Descrição);
        
        MarcaAguaRepositorio.update(mAgua);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarcaAguaController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Produto editado com Sucesso</h1></br>");
            out.println("<a href='cadastroMarcaAgua.html'> Voltar </a></br>");
            out.println("<a href='MarcaAguas'> Ver marcas cadastradas </a></br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

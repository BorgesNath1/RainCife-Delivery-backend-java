/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.newpackage.controllers;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Entregador;
import br.edu.ifpe.recife.raincifedelivery.model.repositories.EntregadorRepositorio;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author ALUNOS 2
 */
@WebServlet(name = "EntregadorController", urlPatterns = {"/Entregadores"})
public class EntregadorController extends HttpServlet {

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
            out.println("<title>Servlet EntregadorController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EntregadorController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String op = request.getParameter("operacao");
        
        List<Entregador> entregadores = EntregadorRepositorio.readAll();
        
        request.getSession().setAttribute("entregadores", entregadores);
        
        if(op!=null && op.equals("editar")){
            String email = request.getParameter("email");
            Entregador e = EntregadorRepositorio.read(email);
            
            request.getSession().setAttribute("entregador", e);
            
            response.sendRedirect("Entregadores.jsp");
            
            return;
        }
        
        request.getSession().setAttribute("entregadores", entregadores);
        
        response.sendRedirect("Entregadores.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String senha = request.getParameter("senha");
        String confirma = request.getParameter("confirma");
        
        if (!confirma.equals(senha)){
            HttpSession session = request.getSession();
            
            session.setAttribute("msg", "As senhas não coincidem");
            response.sendRedirect("Entregadores");
            
            return;
        }
        
        Entregador e = new Entregador();
        e.setNome(nome);
        e.setEmail(email);
        e.setTelefone(telefone);
        e.setSenha(senha);
        
        String op = request.getParameter("operacao");
        
        if (op!=null && op.equals("editar")){
            EntregadorRepositorio.update(e);
            request.getSession().setAttribute("msg", "Entregador editado com sucesso");
            response.sendRedirect("Entregadores");
        } else{
        
            EntregadorRepositorio.create(e);
        
            request.getSession().setAttribute("msg", "Entregador cadastrado com sucesso!");
            
        }
        
        response.sendRedirect("Entregadores");
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

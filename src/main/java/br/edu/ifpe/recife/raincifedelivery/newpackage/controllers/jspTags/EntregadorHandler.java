/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.newpackage.controllers.jspTags;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Entregador;
import br.edu.ifpe.recife.raincifedelivery.model.repositories.EntregadorRepositorio;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ALUNOS 2
 */
public class EntregadorHandler extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); 
        
        List<Entregador> entregadores = (List<Entregador>) EntregadorRepositorio.readAll();
        
        getJspContext().setAttribute("Entregadores", entregadores,);
    }
    
}

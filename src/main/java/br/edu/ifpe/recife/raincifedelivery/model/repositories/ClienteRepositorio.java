/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class ClienteRepositorio {
    private static List<Cliente> clientes;
    
    static{
        clientes = new ArrayList<>();
    }
    
    public void create (Cliente comprador){
        clientes.add(comprador);
    }
    
    public void update (Cliente comprador){
        for (Cliente cada : clientes){
            if (comprador.getEmail().equals(cada.getEmail())){
                cada.setNome(comprador.getNome());
                cada.setEndereco(comprador.getEndereco());
                cada.setSenha(comprador.getSenha());
                cada.setTelefone(comprador.getTelefone());
            }
        }
    }

    public Cliente read (String email){
        for (Cliente cada : clientes){
            if (cada.getEmail().equals(email)){
                return cada.selfReplicate();
            }
        }
        return null;
    }
            
    public void delete (Cliente comprador){
        clientes.remove(comprador);
    }
    
}

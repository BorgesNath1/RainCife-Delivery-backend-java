/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Entregador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class EntregadorRepositorio {
    private static List<Entregador> entregadores;
    
    static{
        entregadores = new ArrayList<>();
    }
    
    public static void create (Entregador deliverer){
        entregadores.add(deliverer);    
    }
    
    public static void update (Entregador deliverer){
        for (Entregador cara : entregadores){
            if (cara.getEmail().equals(deliverer.getEmail())){
                cara.setNome(deliverer.getNome());
                cara.setSenha(deliverer.getSenha());
                cara.setTelefone(deliverer.getTelefone());
            }
        }
    }
    
    public static Entregador read (String email){
        for (Entregador cara : entregadores) {
            if (cara.getEmail().equals(email)){
                return cara.selfReplicate();
            }
        }
        return null;
    }
    
    public static void delete (Entregador deliverer){
        entregadores.remove(deliverer);
    }
    
    public static List<Entregador> readAll(){
        return entregadores;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Entrega;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class EntregaRepository {
    private static List<Entrega> entregas;
    
    static {
        entregas = new ArrayList<>();
    }
    
    public static void create (Entrega e){
        entregas.add(e);
    }
    
    public static void update (Entrega e){
        for (Entrega e1 : entregas){
            if (e1.getId() == e.getId()){
                e1.setDataHora(e.getDataHora());
                e1.setObservacao(e.getObservacao());
                e1.setStatus(e.getStatus());
                
                e1.setLoja(e.getLoja());
                e1.setCliente(e.getCliente());
                e1.setEntregador(e.getEntregador());
                e1.setItemEntrega(e.getItemEntrega());
            }
        }
    }
    
    public static Entrega read (int ident){
        for (Entrega e1 : entregas){
            if (e1.getId() == ident){
                return e1.selfReplicate();
            }
        }
        return null;
    }
    
    public static void delete (Entrega e){
        entregas.remove(e);
    }
}

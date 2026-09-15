/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.ItemEntrega;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class ItemEntregaRepositorio {
    private static List<ItemEntrega> itens;
    
    static {
        itens = new ArrayList<>();
    }
    
    public static void create (ItemEntrega item){
        itens.add(item);
    }
    
    public static void update (ItemEntrega item){
        for (ItemEntrega este : itens){
            if (item.getId()== este.getId()){
                este.setAgua(item.getAgua());
                este.setPrecoVenda(item.getPrecoVenda());
                este.setQuantidade(item.getQuantidade());
            }
        }
    }
    
    public static ItemEntrega read (int ident){
        for (ItemEntrega este : itens){
            if (este.getId() == ident){
                return este.selfReplicate();
            }
        }
        return null;
    }
    
    public static void delete (ItemEntrega item){
        itens.remove(item);
    }
}

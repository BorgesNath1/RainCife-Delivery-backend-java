/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Entregador;
import br.edu.ifpe.recife.raincifedelivery.model.entities.Loja;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNOS 2
 */
public class LojaRepositorio {
    private static List<Loja> lojas;
    
    static {
        lojas = new ArrayList<>();
    }
    
    public static void create(Loja store){
        lojas.add(store);
    }
    
    public static void update(Loja store){
        for (Loja pdv : lojas) {
            if (pdv.getCnpj().equals(store.getCnpj())){
                pdv.setDescricao(store.getDescricao());
                pdv.setEmail(store.getEmail());
                pdv.setNome(store.getNome());
                pdv.setTelefone(store.getTelefone());
                pdv.setSenha(store.getSenha());
            }
        }
    }
    
    public static Loja read (String cnpj){
        for (Loja pdv : lojas){
            if(pdv.getCnpj().equals(cnpj)){
                return pdv.selfReplicate();
            }
        }
        return null;
    }
    
    public static void delete (Loja store){
        lojas.remove(store);
    }
    
    public static List<Loja> readAll(){
        return lojas;
    }
}

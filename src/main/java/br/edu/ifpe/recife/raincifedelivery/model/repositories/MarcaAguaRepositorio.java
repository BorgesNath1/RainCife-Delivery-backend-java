/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.MarcaAgua;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNOS 2
 */
public class MarcaAguaRepositorio {
    private static List<MarcaAgua> aguas;
    
    static {
            aguas = new ArrayList<>();
    };

    public static void create(MarcaAgua agua){
        aguas.add(agua);
    }
    
    public static void update(MarcaAgua agua){
        for(MarcaAgua a: aguas){
            if(a.getNome().equals(agua.getNome())){
                a.setFonteOrigem(agua.getFonteOrigem());
                a.setDescricao(agua.getFonteOrigem());
            }
        }
    }
    
    public static MarcaAgua  read(String nome) {
        for (MarcaAgua a: aguas){
            if(a.getNome().equals(nome)){
                return a.selfReplicate();
            }
        }
        return null;
    }
    
    public static void delete (MarcaAgua agua){
        aguas.remove(agua);
    }
    
    public static List<MarcaAgua> readAll(){
        return aguas;
    }
}

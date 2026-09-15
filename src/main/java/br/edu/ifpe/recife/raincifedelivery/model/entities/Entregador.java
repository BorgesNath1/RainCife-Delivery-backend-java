/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.entities;

/**
 *
 * @author ALUNOS 2
 */
public class Entregador {
    private String email;
    private String nome;
    private String telefone;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Entregador selfReplicate() {
        Entregador replica = new Entregador();
        
        replica.setEmail(this.getEmail());
        replica.setNome(this.getNome());
        replica.setSenha(this.getSenha());
        replica.setTelefone(this.getTelefone());
        
        return replica;
    }
    
    
}

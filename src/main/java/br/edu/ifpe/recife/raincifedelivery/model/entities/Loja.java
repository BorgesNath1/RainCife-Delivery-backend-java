/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.entities;

import java.util.List;

/**
 *
 * @author ALUNOS 2
 */
public class Loja {
    
    private String cnpj;
    private String email;
    private String nome;
    private String telefone;
    private String endereço;
    private String senha;
    private String descricao;
    
    private List<Entregador> entregadores;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List getEntregadores() {
        return entregadores;
    }

    public void setEntregadores(List entregadores) {
        this.entregadores = entregadores;
    }
    
    public Loja selfReplicate(){
        Loja replica = new Loja();
        replica.setNome(this.getNome());
        replica.setDescricao(this.getDescricao());
        replica.setEmail(this.getEmail());
        replica.setEndereço(this.getEndereço());
        replica.setCnpj(this.getCnpj());
        replica.setTelefone(this.getTelefone());
        replica.setSenha(this.getSenha());
        replica.setEntregadores(this.getEntregadores());
        
        return replica;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.entities;

/**
 *
 * @author ALUNOS 2
 */
public class MarcaAgua {
    private String nome;
    private String fonteOrigem;
    private double precoOriginal;
    private String descricao;

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFonteOrigem() {
        return fonteOrigem;
    }

    public void setFonteOrigem(String fonteOrigem) {
        this.fonteOrigem = fonteOrigem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}

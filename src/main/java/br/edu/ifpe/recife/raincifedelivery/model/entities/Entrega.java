/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.entities;

import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author ALUNOS 2
 */
public class Entrega {
    private int id;
    private long dataHora;
    private String observacao;
    private String status;
    
    private Loja loja;
    private Cliente cliente;
    private Entregador entregador;
    private List<ItemEntrega> aguas;
    
    private Entrega(){
        this.dataHora = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDataHora() {
        return dataHora;
    }

    public void setDataHora(long dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public List<ItemEntrega> getItemEntrega() {
        return aguas;
    }

    public void setItemEntrega(List<ItemEntrega> itemEntrega) {
        this.aguas = itemEntrega;
    }
    
    public String getData(){
        return new SimpleDateFormat("dd/mm/yyyy").format(new Date(this.dataHora));
    }
    
    public double getValorTotal(){
        double valor = 0;
        for (ItemEntrega item : this.aguas){
            valor += item.getPrecoVenda();
        }
        return valor;
    }
    
}

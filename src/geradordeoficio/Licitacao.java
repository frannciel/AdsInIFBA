/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeoficio;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cliente
 */
public class Licitacao {
    
    private int numero;
    private int ano;
    private int processo;
    private List<Item> itens;
    private int modalidade;
    private String situacao;// inserir get e set e colocar no construtor

    public Licitacao() {
    }

    public Licitacao(int numero, int ano, int processo, int modalidade) {
        this.numero = numero;
        this.ano = ano;
        this.processo = processo;
        this.modalidade = modalidade;
    }

    public Licitacao(int numero, int ano, int processo, ArrayList<Item> itens, int modalidade) {
        this.numero = numero;
        this.ano = ano;
        this.processo = processo;
        this.itens = itens;
        this.modalidade = modalidade;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item objeto){
        this.itens.add(objeto);
    }
    
    public Item getItem(int numero){
        return this.itens.get(numero);
    }
    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getProcesso() {
        return processo;
    }

    public void setProcesso(int processo) {
        this.processo = processo;
    }

    @Override
    public String toString() {
        return modalidade+ " " +numero+ "/" + ano + ", processo=" + processo + "\n" + itens;
    }

  
    
}

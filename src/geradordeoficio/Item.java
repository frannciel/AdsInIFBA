/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeoficio;

/**
 *
 * @author Anderson Franciel 
 * 
 */
public class Item {
    private int numero;
    private String descricao;
    private String detalhada;
    private String unidade;
    private int quantidade;
    private double valor;
    private String situacao;
    
    public Item() {
    }
    
    public Item(int numero, String descricao, String detalhada, String unidade, 
            int quantidade, double valor, String situacao) {
        this.numero = numero;
        this.descricao = descricao;
        this.detalhada = detalhada;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.valor = valor;
        this.situacao = situacao;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDetalhada() {
        return detalhada;
    }

    public void setDetalhada(String detalhada) {
        this.detalhada = detalhada;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item:" + numero + ", descricao=" + descricao + ", unidade=" + unidade + ", quantidade=" + quantidade + ", valor=" + valor + ", situacao=" + situacao + "\n";
    }
    
    
}

package Entidades;

public class Carro {
	
	private double valor;
	private String nome;
	private int anoFabric;
	private String fabric;
	private String cor;
	private String chassi;
	private int qdtEstoque;
	private int id_carro;
        private int porta;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_carro() {
		return id_carro;
	}
	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
	}
	public int getAnoFabric() {
		return anoFabric;
	}
	public void setAnoFabric(int anoFabric) {
		this.anoFabric = anoFabric;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getQdtEstoque() {
		return qdtEstoque;
	}
	public void setQdtEstoque(int qdtEstoque) {
		this.qdtEstoque = qdtEstoque;
	}
	

}

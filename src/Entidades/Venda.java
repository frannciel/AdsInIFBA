package Entidades;

public class Venda {
	
	private double valorTotal;
	private String dataVend;
	private String forrmPaga;
	private boolean situacao;// indica se a compra foi paga ou ainda aguarda pagamento
	private int numeroVenda;
	private double comissao;
	private int id_cliente;
	private int id_vendedor;
	
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDataVend() {
		return dataVend;
	}
	public void setDataVend(String dataVend) {
		this.dataVend = dataVend;
	}
	public String getForrmPaga() {
		return forrmPaga;
	}
	public void setForrmPaga(String forrmPaga) {
		this.forrmPaga = forrmPaga;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

}

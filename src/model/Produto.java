package model;

public class Produto {
	private int idFornecedor;
	private String nome;
	private TipoProduto tipo;
	
	public Produto(int idFornecedor, String nome, TipoProduto tipo) {
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.tipo = tipo;
	}
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Produto [idFornecedor=" + idFornecedor + ", nome=" + nome + ", tipo=" + tipo + "]";
	}
	
	
}

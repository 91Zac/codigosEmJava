package Entidades;

public class ProdutoVenda {
	private String  nome;
	private String medida;
	private double valorUnitario;
	private int estoque;
	private int codigo;
	private int qtde;
	public ProdutoVenda(String nome, String medida,int qtde, double valorUnitario) {
		super();
		this.nome = nome;
		this.medida = medida;
		this.qtde = qtde;
		this.valorUnitario = valorUnitario;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
}
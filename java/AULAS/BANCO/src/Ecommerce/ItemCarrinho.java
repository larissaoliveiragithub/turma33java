package Ecommerce;

public class ItemCarrinho {
	//Atributos
	private Produto produto;
	private int quantidade;
	
	//Construtores
	public ItemCarrinho(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public ItemCarrinho(int quantidade){
		super();
		this.quantidade = quantidade;
	}
	
	//Getters and Setters
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
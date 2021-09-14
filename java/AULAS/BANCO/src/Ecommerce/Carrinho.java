package Ecommerce;


import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	static ERP util = new ERP();
	//Lista de Items no carrinho
	private List<ItemCarrinho> itens;
	private Produto produto;
	//Atributos
	private double valorCompra;
	private int total;
	private String modoPagamento;
	
	//Formatação
	static String formatter = "%-4s %-40s %-8s %-4s";
	
	//Metodos
	public Carrinho(){
		this.itens = new ArrayList<ItemCarrinho>();
	}
	
	//Sobrecarga dos métodos add item
	public void addItem(Produto produto, int quantidade) {
		ItemCarrinho item = new ItemCarrinho(produto, quantidade);
		itens.add(item);
	}
	
	public void addItem(int quantidade) {
		ItemCarrinho item = new ItemCarrinho(quantidade);
		itens.add(item);

	}
	
	
	//Método que lista os produtos
	public void listaProdutos(){
		System.out.println("\nProdutos no carrinho: \n");
		System.out.format(formatter, "ID", "NOME", "PRECO", "QUANTIDADE");
		System.out.println();
	
		for (ItemCarrinho item : this.itens) {
			this.mostraItem(item);
			
		}
	}
	
	public void nota( int quantidade, String id){
   
		System.out.println("\n\n\n");
		System.out.println("\n\t\t==== NOTA FISCAL DO CONSUMIDOR ====\n");
		System.out.format(formatter, "ID", "NOME", "PRECO", "QUANTIDADE");
		System.out.println();
		
		for (ItemCarrinho item : this.itens) {
			this.mostraItem(item);
			
		
		}
		
	}
	
	//Método que mostra items adicionado
	private void mostraItem(ItemCarrinho item) {
		Produto produto = item.getProduto();
		String id = produto.getId();
		String nome = produto.getNome();
		double preco = produto.getPreco();
		String quantidade = String.valueOf(item.getQuantidade());
		
		System.out.format(formatter, id, nome, preco, quantidade);
		System.out.println();
	}
	
	//Getters 
	public List<ItemCarrinho> getItens() {
		return itens;
	}
	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getModoPagamento() {
		return modoPagamento;
	}
	public void setModoPagamento(String modoPagamento) {
		this.modoPagamento = modoPagamento;
	} 
	
	

}
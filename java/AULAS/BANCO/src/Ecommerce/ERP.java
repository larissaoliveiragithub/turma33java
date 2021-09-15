package Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ERP {
	private Produto produto;
	private List<Produto> produtosDisponiveis;
	private Carrinho carrinho;
	private int op = 0;
	private List<ItemCarrinho> itens;
	static String formatter = "%-4s %-40s %-8s %-4s";
	private String emitirNota;
	// Forma de pagamento
	static double valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0;
	static int formaPagamento;
	
	
	public ERP() {
		this.produtosDisponiveis = new ArrayList<Produto>();
		this.carrinho = new Carrinho();

		Produto TenisNike = new Produto("G2-1", "Tênis Nike", 200, 10);
		Produto TenisAdidas = new Produto("G2-2", "Tênis Adidas", 150, 10);
		Produto TenisPuma = new Produto("G2-3", "Tênis Puma", 100, 10);
		Produto CamisaNike = new Produto("G2-4", "Camisa Nike", 50, 10);
		Produto CamisaLacoste = new Produto("G2-5", "Camisa Lacoste", 500, 10);
		Produto CamisaSupreme = new Produto("G2-6", "Camisa Supreme", 1000, 10);
		Produto MeiaNike = new Produto("G2-7", "Meia Nike", 30, 10);
		Produto MeiaAdidas = new Produto("G2-8", "Meia Adidas", 25, 10);
		Produto BolaFutebol = new Produto("G2-9", "Bola Futebol", 40, 10);
		Produto BlusaMoletonNike = new Produto("G2-10", "Blusa Moleton Nike", 120, 10);
		
		
		
		this.produtosDisponiveis.add(TenisNike);
		this.produtosDisponiveis.add(TenisAdidas);
		this.produtosDisponiveis.add(TenisPuma);
		this.produtosDisponiveis.add(CamisaNike);
		this.produtosDisponiveis.add(CamisaLacoste);
		this.produtosDisponiveis.add(CamisaSupreme);
		this.produtosDisponiveis.add(MeiaNike);
		this.produtosDisponiveis.add(MeiaAdidas);
		this.produtosDisponiveis.add(BolaFutebol);
		this.produtosDisponiveis.add(BlusaMoletonNike);
	}
	
	
	//Método lista produtos disponiveis.
	public List<Produto> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}
	
	//Método forma de pagamento
	
	public void formaPagamento(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a forma de pagamento: ");
		System.out.println("1 Débito ");
		System.out.println("2 Crédito ");
		System.out.println("3 2x parcelado ");
		
		//REFATORADO!
		//TROCAR PRODUTO POR ITEM CARRINHO
		op = sc.nextInt();
		for(ItemCarrinho items : this.carrinho.getItens()){
			
			if (op == 1) {
				
				//Aproveitando do carrinho!
				valorTotal = items.getProduto().getPreco() * items.getQuantidade();
				valorNota = valorTotal * (10.00 / 100.00);
				valorTotal = valorTotal - valorNota;
				System.out.printf("O valor total da nota é de: R$%.2f%s",valorTotal,"\n");
				System.out.printf("Desconto no valor de: R$%.2f%s",valorNota,"\n\n");
			

			} else if (op == 2) {
				
				valorTotal = items.getProduto().getPreco()  * items.getQuantidade();
				valorNota = valorTotal * (10.00 / 100.00);
				valorNota = valorTotal * (9.00 / 100.00);
				valorTotal = valorTotal + valorNota;
				System.out.printf("O valor total da nota é de: R$%.2f%s",valorTotal,"\n");
				System.out.printf("Acréscimo no valor de: R$%.2f%s",valorNota,"\n\n");
			} else if (op == 3) {
				
				valorTotal = items.getProduto().getPreco()  * items.getQuantidade();
				valorNota = valorTotal * (15.00 / 100.00);
				valorNota = valorTotal * (9.00 / 100.00);
				valorTotal = valorTotal + valorNota;
				System.out.println(valorTotal);
				System.out.println(valorNota);
				System.out.printf("O valor total da nota é de: R$%.2f%s",valorTotal,"\n");
				System.out.printf("Acréscimo no valor de: R$%.2f%s",valorNota,"\n\n");
				valorParcela = valorTotal / 2;
				System.out.println(valorParcela);
			} else {
				System.out.println("Forma inválida!");
			}
		}
		
		
	}

	/*
	 * 		while(quantidade >10){
			addProductCarrinho(id, quantidade);
			
		}
	 */
	
	
	//Reaproveitando 
	//Método buscar produto pelo id e adiciona quantidade
	public void addProductCarrinho(Produto product, int quantidade){

		ItemCarrinho produtoCarrinho = findProductCarrinhoById(product.getId());
		
		if(produtoCarrinho == null){
			
			this.carrinho.addItem(product, quantidade);	
			
		}else {
			//Vai acrescentar a quantidade no mesmo item
			produtoCarrinho.setQuantidade(produtoCarrinho.getQuantidade()+quantidade);
		}

		product.tirarEstoque(quantidade);
	}
	
	//Método totalizador
	public void totalizador(String id, int quantidade){
		Produto product = this.findProductById(id);
			
			System.out.printf("Sub-total: R$%s",product.getPreco()*quantidade," \n");	
	}
	
	//Método buscar produto pelo id
	public Produto findProductById(String id) {
		for (Produto product : this.getProdutosDisponiveis()) {
			
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}
	
	//Método buscar produto pelo id
	public ItemCarrinho findProductCarrinhoById(String id) {
		for (ItemCarrinho items : this.carrinho.getItens()) {
			
			if (items.getProduto().getId().equalsIgnoreCase(id)) {
				return items;
			}
		}
		return null;
	}
	
	//Método exibe produtos disponíveis
	public void exibeProdutosDisponiveis() {
		System.out.println("=== Produtos Disponíveis ===");
		Util.mostraProdutos(this.produtosDisponiveis);
	}
	//Método exibe produtos no carrinho
	public void exibeProdutosCarrinho() {
		this.carrinho.listaProdutos();
	}
	
	//Método exibe produtos no carrinho
	public void emitirNota(){
		carrinho.nota();
	}
	
	//Método exibe preview produto escolhido
	public Produto previewProduto(String id) {
		Produto produto = this.findProductById(id);
		Util.mostraUmProduto(produto);
		
		return produto;
	}

}
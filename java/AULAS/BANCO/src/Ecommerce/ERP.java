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

	// Método lista produtos disponiveis.
	public List<Produto> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}

	// Método forma de pagamento

	public void formaPagamento(Produto produto, int quantidade, String id) {
		Produto produto1 = this.findProductById(id);
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione a forma de pagamento: ");
		System.out.println("1 Débito ");
		System.out.println("2 Crédito ");
		System.out.println("3 3x parcelado ");

		op = sc.nextInt();

		if (op == 1) {
			System.out.println("Débito!");
			valorTotal = produto1.getPreco() * quantidade;
			valorNota = valorTotal * (10.00 / 100.00);
			valorTotal = valorTotal - valorNota;
			System.out.println(valorTotal);
			System.out.println(valorNota);

		} else if (op == 2) {
			System.out.println("Crédito!");
			valorTotal = produto1.getPreco() * quantidade;
			valorNota = valorTotal * (10.00 / 100.00);
			valorNota = valorTotal * (9.00 / 100.00);
			valorTotal = valorTotal + valorNota;
			System.out.println(valorTotal);
			System.out.println(valorNota);
		} else if (op == 3) {
			System.out.println("Parcelado em 3x!");
			valorTotal = produto1.getPreco() * quantidade;
			valorNota = valorTotal * (15.00 / 100.00);
			valorNota = valorTotal * (9.00 / 100.00);
			valorTotal = valorTotal + valorNota;
			System.out.println(valorTotal);
			System.out.println(valorNota);
			valorParcela = valorTotal / 2;
			System.out.println(valorParcela);
		} else {
			System.out.println("Forma inválida!");
		}
		
	}

	private void mostraItem(ItemCarrinho item) {
		Produto produto = item.getProduto();
		String id = produto.getId();
		String nome = produto.getNome();
		double preco = produto.getPreco();
		String quantidade = String.valueOf(item.getQuantidade());

		System.out.format(formatter, id, nome, preco, quantidade);
		System.out.println();
	}

	// Método buscar produto pelo id e adiciona quantidade
	public void addProductCarrinho(String id, int quantidade) {
		Produto product = this.findProductById(id);
		if (quantidade < 10) {
			this.carrinho.addItem(product, quantidade);
		} else {
			System.out.println("Quantidade indisponivel!");
		}
	}

	// Método totalizador
	public void totalizador(String id, int quantidade) {
		Produto product = this.findProductById(id);
		this.carrinho.addItem(product, quantidade);
		System.out.printf("Sub-total: R$%s", product.getPreco() * quantidade, " \n");
	}

	// Método buscar produto pelo id
	private Produto findProductById(String id) {
		for (Produto product : this.getProdutosDisponiveis()) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}

	// Método exibe produtos disponíveis
	public void exibeProdutosDisponiveis() {
		System.out.println("=== Produtos Disponíveis ===");
		Util.mostraProdutos(this.produtosDisponiveis);
	}

	// Método exibe produtos no carrinho
	public void exibeProdutosCarrinho() {
		this.carrinho.listaProdutos();
	}

	// Método exibe produtos no carrinho
	public void emitirNota() {
		carrinho.nota(op, null);
	}

	// Método exibe preview produto escolhido
	public void previewProduto(String id) {
		Produto produto = this.findProductById(id);
		Util.mostraUmProduto(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
package Ecommerce;
	import java.util.List;

	public class Util {
		static String formatter = "%-4s %-20s %-10s %-10s";
		
		static public void mostraProdutos(List<Produto> produtos) {
			System.out.format(formatter, "ID", "NOME", "PRECO", "Qnt");
			System.out.println("\n");
			for (Produto produto : produtos) {
				mostraUmProduto(produto);
				System.out.println("\n");
			}
		}
		
		static public void mostraUmProduto(Produto produto) {
			String id = produto.getId();
			String nome = produto.getNome();
			double preco = produto.getPreco();
			int estoque = produto.getEstoque();
			System.out.format(formatter, id, nome, preco, estoque);
		}
	}



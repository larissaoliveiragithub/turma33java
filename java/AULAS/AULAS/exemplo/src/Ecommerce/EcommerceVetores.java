package Ecommerce;

import java.util.Scanner;

public class EcommerceVetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// variaveis
		char desejaAdicionar = 'x', s = 's', n = 'n';
		char valor;
		double total = 0.0, totalFinal = 0.0;
		char desejaComprar = 'x', desejaComprar2 = 'x', continuarCompra = 'x';
		double valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0;
		int formaPagamento;
		int fim = 1;
		String codigoEscolhido = " ";

		// vetores
		String nomeProduto[] = { "Tênis Nike", "Tênis Adidas", "Tênis Puma", "Camisa Nike", "Camisa Lacoste",
				"Camisa Supreme", "Meia Nike", "Meia Adidas", "Bola de futebol", "Blusa moleton Nike" };
		String codigoProduto[] = { "G2-1", "G2-2", "G2-3", "G2-4", "G2-5", "G2-6", "G2-7", "G2-8", "G2-9", "G2-10" };
		int qtaAdicionadoCarrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int valorProduto[] = { 200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 };
		String carrinho[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
		int estoqueProduto[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println("COD\t  Produto \t Valor  Qnt\n");
		for (int y = 0; y < 10; y++) {
			if (desejaComprar == 's' || desejaComprar == 'S')
				;
			{

				for (y = 0; y < 10; y++)
					System.out.println(codigoProduto[y] + "\t" + nomeProduto[y] + "\t" + "R$ " + valorProduto[y] + "\t"
							+ estoqueProduto[y] + "\n");
				System.out.println("\nExemplo: G2-1 - Tênis Nike \n");
				System.out.println("SELECIONE O CODIGO DO PRODUTO: ");
			}

		}

		codigoEscolhido = leia.next();

		for (int x = 0; x < 10; ++x) {
			if (codigoEscolhido == codigoProduto[x]) {
				System.out.println("COD " + codigoProduto[x] + "\t" + "PRODUTO: " + nomeProduto[x] + "VALOR R$"
						+ valorProduto[x] + "\t" + "ESTOQUE:" + estoqueProduto[x] + "\n");
				System.out.println("\n");
				System.out.println("ESCOLHA A QUANTIDADE : ");
				qtaAdicionadoCarrinho[x] = leia.nextInt();

				if (qtaAdicionadoCarrinho[x] <= estoqueProduto[x] && carrinho[x] == " "
						&& qtaAdicionadoCarrinho[x] > 0) {

				}
			}
		}

	}

}

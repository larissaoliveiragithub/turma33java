/**
 * @author Paulo, Matehus, Beatriz, Fernando, Larissa e Leonardo. 
 * ECOMMERCE - DEV SHOES
 
 * GENERATION 2021
 */

package ecommerce;
//############## IMPORTS ###################

import java.util.Scanner;

public class Application {
	//############## SCANNER ###################
	static Scanner mySc = new Scanner(System.in);
	
	
	static char desejaAdicionar = 'x', s = 's', n = 'n';
	//############## VARIÁVEIS ###################
		static char valor;
		static double total = 0.0, totalFinal = 0.0;
		static String desejaComprar = "";
		static char desejaComprar2 = 'x', continuarCompra = 'x';// opcaoPgto= 'x'
		static double valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0;
		static int formaPagamento;
		static int fim = 1;
		static String codigoEscolhido = "";

	//############## VETORES ###################
	static String nomeProduto[] = { 
			"Tênis Nike          ", 
			"Tênis Adidas        ", 
			"Tênis Puma          ",
			"Camisa Nike         ", 
			"Camisa Lacoste      ", 
			"Camisa Supreme      ", 
			"Meia Nike           ",
			"Meia Adidas         ", 
			"Bola de futebol     ", 
			"Blusa moleton Nike  " };

	static String codigoProduto[] = { "G2-1", "G2-2", "G2-3", "G2-4", "G2-5", "G2-6", "G2-7", "G2-8", "G2-9", "G2-10" };
	static int qtaAdicionadoCarrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static int valorProduto[] = { 200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 };
	static String carrinho[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
	static int estoqueProduto[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	
	
	//############## FUNÇÃO - main ###################
	public static void main(String[] args) {
		// Aprentação
		getApresentacao();
		executarOperacao();
	}

	//############## FUNÇÃO - finalizarCompra ###################

	public static void finalizarCompra(int x) {
		double valorTotal = 0, valorNota = 0.0, valorParcela, valorCompra = 0.0, valorPagamento = 0.00;
		int formaPagamento;
		String fim ="";
		String emitirNota = "";
		System.out.print("||||||||||||||||| Selecione forma de pagamento |||||||||||||||||||||\n");

		System.out.println("\n1 - DÉBITO \n2 - CRÉDITO \n3 - PARCELADO (2X)");
		System.out.print("\nPagamento: ");
		
		formaPagamento = mySc.nextInt();

		if(formaPagamento == 1){
			valorCompra = total * (10.00 / 100.00);
			valorTotal = total - valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
			System.out.println(" (Desconto de 10%)");

		}else if (formaPagamento == 2) {
			valorCompra = total * (10.00 / 100.00);
			valorTotal = total + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
			System.out.println(" Acréscimo de 10%");

		}else if (formaPagamento == 3) {
			valorCompra = total * (15.00 / 100.00);
			valorTotal = total + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.println("\n\n");
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
	
			valorParcela = valorTotal / 2;
			System.out.print("\nA conta totalizou 2 parcelas de: R$ " + valorParcela);
		}
		
		System.out.printf("\nO imposto é de R$%.2f: ", valorNota);
		System.out.println("\n\n");
		System.out.printf("E o valor da nota é de R$%.2f %s", valorTotal+valorNota,"com 9% de imposto");
		System.out.println("\n\n");
		System.out.print("Deseja imitir nota? S/N \n");
		
		emitirNota = mySc.next();

		if ("s".equalsIgnoreCase(emitirNota)) {
			
			System.out.println("\n\n\n\n\n\n");
			System.out.print("\t\t\t\t#DevShoes - CodStyle é vida!\n\n");
			System.out.print("||||||||||||||||||||| NOTA FISCAL |||||||||||||||||||||||||\n\n");

			System.out.printf("Valor impostos R$%.2f ", valorNota);
			System.out.println("\n--------------------------------------------------------");
			System.out.printf("Valor total da nota é de R$%.2f ", valorTotal+valorNota);
			System.out.println("\n--------------------------------------------------------");
			System.out.println("\nObrigado.. Volte sempre!");
			System.out.println("\n\n");
			System.out.print("\n\n (S) SAIR DO PROGRAMA AGORA OU (F) FAZER OUTRA COMPRA \n");
			fim = mySc.next();
			
			if("s".equalsIgnoreCase(fim)) {
				System.out.println("\n\n\n\n\n");
				estoqueProduto[x] = estoqueProduto[x] - qtaAdicionadoCarrinho[x];
				qtaAdicionadoCarrinho[x] = 0;
				getApresentacao();
				executarOperacao();
			}else if ("f".equalsIgnoreCase(fim)) {
				executarOperacao();
			}else{
				System.out.println(" Ops, voce digitou algo errado ");
				finalizarCompra(x);
			}
			//AQUI ACABA O IF DE DENTRO
		}else if ("n".equalsIgnoreCase(emitirNota)){
			System.out.println("Obrigade, volte sempre ");
			getApresentacao();
		}else{
			System.out.println(" Ops, voce digitou algo errado ");
			getApresentacao();	
		}
			//AQUI ACABA O IF DE FORA
	}// AQUI ACABA A FUNÇÃO FORMA DE PAGAMENTO!
	

//############## FUNÇÃO - executarOperação ###################
	public static void executarOperacao() {
		
		// FUNÇÃO listar produtos
		listarProdutos();
		
		//Variavel codigoEscolhido recebendo o método receberDados();
		codigoEscolhido = receberDados();
		
		//Variavel auxiliar para validar o código do produto
		boolean achouCodigoProduto = false;
		
		for (int x = 0; x < 10; x++) {

			if (codigoEscolhido.equals(codigoProduto[x])) {
				achouCodigoProduto = true;
				System.out.println("\n\n\n\n");
				System.out.print("||||||||||||||||||||||||| Produto Selecionado ||||||||||||||||||||||||||||\n");
				System.out.println("\n");
				System.out.println("COD " + codigoProduto[x] + "\t" + "PRODUTO: " + nomeProduto[x] + "VALOR R$"+ valorProduto[x] + "\t" + "ESTOQUE:" + estoqueProduto[x] + "\n");
				System.out.println("\n");
				
				System.out.print("ESCOLHA A QUANTIDADE : ");
				
				qtaAdicionadoCarrinho[x] = mySc.nextInt();

				if (qtaAdicionadoCarrinho[x] <= estoqueProduto[x] && qtaAdicionadoCarrinho[x] > 0) {

					System.out.println("\n\n\n\n");
					System.out.print("||||||||||||||||||||| Carrinho |||||||||||||||||||||||||\n");
					System.out.println("\n");
					System.out.print("COD       Produto           Valor      Quantidade\n");
					carrinho[x] = codigoProduto[x] + "\t" + nomeProduto[x] + "R$ " + valorProduto[x] + "\t   "+ qtaAdicionadoCarrinho[x];
					
					for (int c = 0; c < 10; c++) {
						if (carrinho[c] != " ") {
							System.out.println(carrinho[c]);
							total = valorProduto[x] * qtaAdicionadoCarrinho[x];
						}
					}
				} // SEGUNDO IF ACABA AQUI

				// SE FOR VERDADEIRO O IF JÁ ENTRA EXECUTANDO O MÉTODO executarOperacao();
				if (decisaoEntrada("Continuar comprando?")) {
					executarOperacao();
				} else {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
					finalizarCompra(x);
				}
			} // PRIMEIRO IF ACABA AQUI

		} // AQUI ACABA O FOR
		if (achouCodigoProduto == false) {
			System.out.println("Ops.. esse código não existe..");
			desejaContinuar();
		}
	}// A CLASSE OPERAÇÃO ACABA AQUI

	
	private static void executarOpercao(int x) {
	// TODO Auto-generated method stub
	
}

	//############## FUNÇÃO LISTAR PRODUTOS ###################
	public static void listarProdutos() {
		System.out.print("#DevShoes");
		System.out.print("#CodStyle é vida!\n\n");
		System.out.println("COD\t  Produto \t\t Valor  Qnt\n");
		for (int y = 0; y < 10; y++) {
				for (y = 0; y < 10; y++)
				System.out.println(codigoProduto[y] + "\t" + nomeProduto[y] + "\t" + "R$ " + valorProduto[y] + "\t"+ estoqueProduto[y]);
		}// Aqui acaba o for
		System.out.println("\n\n\n");
		System.out.println("Digite exemplo: G2-2");
		System.out.print("Selecione o código do produto: ");
	}
	
	//############## Criando uma função parar tratar excessão ###################
	public static void desejaContinuar() {
		System.out.println("\n\n");
		System.out.print("Se deseja tentar novamente digite S/N");
		String continuarComprando = mySc.next();
		
		//Método equalsIgnoreCase vai referenciar a variavel ignorando se é maiuscula ou minuscula
		if("s".equalsIgnoreCase(continuarComprando)) {
			executarOperacao();
		}else if("n".equalsIgnoreCase(continuarComprando)) {
			System.out.println("Até breve..");
		}else {
			desejaContinuar();
		}
	}
	
	//############## Sobrecarga da função receberDados ###################
	public static String receberDados(){
		mySc = new Scanner(System.in);
		return mySc.next().toUpperCase();
	}
	
	//############## Função VALIDAR ENTRADA ###################
	public static boolean decisaoEntrada(String mensagem){
		
		System.out.println("\n\n ");
		System.out.printf("\t\t\t      %s \n ",mensagem);
		System.out.printf("\t\t\t\t    S/N ");
		
		//Passando os dados para variável auxiliar desejaComprar
		desejaComprar = receberDados();
		
		//Validando a entrada de desejaComprar
		if("s".equalsIgnoreCase(desejaComprar)){
			return true;
			//Sendo verdadeiro o método executarOperação é chamado
		}else if("n".equalsIgnoreCase(desejaComprar)) {
			return false;
			//Sendo falso é impresso um até breve
		}else {
			System.out.println("Código inválido.. Digite S/N");
			return decisaoEntrada(mensagem);
		}
	}
	
	//############## FUNÇÃO - getApresentação ###################
	public static void getApresentacao() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle é vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		
		if(decisaoEntrada("Deseja comprar?")) {
			executarOperacao();
		}else {
			System.out.println("Até breve...");
		}
		
	}

}
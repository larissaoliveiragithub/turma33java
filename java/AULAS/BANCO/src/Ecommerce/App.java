package Ecommerce;

import java.util.Scanner;

public class App {

	static ERP util = new ERP();
	static ItemCarrinho items = new ItemCarrinho(0);
	static Scanner sc = new Scanner(System.in);

	static String op;

	public static void main(String[] args) {
		getApresentacao();
		erp();
	}
   
	// Forma de pagamento
	public static void formaPagamento() {
		System.out.println("Escolha forma de pagamento: ");

		
	}

	// Função apresentação
	public static void getApresentacao() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle é vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
	}

	// Função erp
	public static void erp() {
		System.out.print("\n\t\t    Deseja fazer uma compra? S/N_");
		String flag = sc.nextLine();
		System.out.println("\n\n\n\n\n");
		if (flag.toLowerCase().equals("n")) {
			System.out.println("Até breve!");
		}
		while (flag.toLowerCase().equals("s")) {

			if (flag.toLowerCase().equals("s")) {
				util.exibeProdutosDisponiveis();
				System.out.print("Digite o código do produto: ");
				String id = sc.nextLine();
				System.out.println("\n\n\n\n\n");

				util.previewProduto(id);
				System.out.print("\nDigite a quantidade necessária: ");
				int quantidade = Integer.parseInt(sc.nextLine());
				System.out.println("\n\n\n\n\n");

				util.addProductCarrinho(id, quantidade);
				util.exibeProdutosCarrinho();
				System.out.println("\n\n");
				util.totalizador(id, quantidade);
				System.out.println();
				System.out.println("\nDeseja continuar a compra? S/N");
				flag = sc.nextLine();

				if (flag.equalsIgnoreCase("n")) {
					System.out.println("Forma de pagamento");
					util.formaPagamento(null, quantidade, id);


					
					System.out.print("Deseja emitir sua Nota Fiscal? S/N");
					op = sc.next();

					if ("n".equalsIgnoreCase(op)) {
						System.out.println("\nDeseja fazer uma nova compra?");
					} else if ("s".equalsIgnoreCase(op)) {

					 util.emitirNota();
						System.out.println();

						util.totalizador(id, quantidade);
						System.out.println("\n\nDeseja fazer outra compra? S/N");
						op = sc.next();

						if ("s".equalsIgnoreCase(op)) {

							erp();
						} else {
							System.out.println("Até breve..");
						}

					} else {
						System.out.println("Digito inválido!");
					}
					
					
					
					
				}

			}
		}

	}

}

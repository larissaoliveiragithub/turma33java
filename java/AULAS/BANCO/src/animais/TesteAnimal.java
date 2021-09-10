package animais;

import java.util.Scanner;

public class TesteAnimal {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int som = 0;
		int bicho;
		Cachorro scooby = new Cachorro();
		Cavalo peDePano = new Cavalo();
		Preguica alvaro = new Preguica();


		scooby.setNome("Scooby");
		scooby.setIdade(2);
		peDePano.setNome("Pé de Pano");
		peDePano.setIdade(5);
		alvaro.setNome("Alvaro");
		alvaro.setIdade(3);


		System.out.println("Escolha um animal : ");
		System.out.println("1 - Cachorro");
		System.out.println("2 - Cavalo");
		System.out.println("3 - Preguiça");
		bicho = ler.nextInt();
		if(bicho == 1) {
			System.out.println("Cachorro, nome :" + scooby.getNome());
			System.out.println("A idade do cachorro é " + scooby.getIdade() + " Anos");
			System.out.println("Deseja ouvir o som do cachorro : 1- sim, 2 - não" );
			som = ler.nextInt();
			if(som == 1) {
				scooby.latido();
			}

		}else if (bicho == 2) {
			System.out.println("Cavalo, nome :" + peDePano.getNome());
			System.out.println("A idade do Cavalo é " + peDePano.getIdade() + " Anos");
			System.out.println("Deseja ouvir o som do cavalo : 1- sim, 2 - não" );
			som = ler.nextInt();
			if(som == 1) {
				peDePano.relinchar();
			}

		}else if (bicho == 3) {
			System.out.println("Preguiça, nome :" + alvaro.getNome());
			System.out.println("A idade da preguiça é " + alvaro.getIdade() + " Anos");
			System.out.println("Deseja ouvir o som da preguiça : 1- sim, 2 - não" );
			som = ler.nextInt();
			if(som == 1) {
				alvaro.somPreguica();
			}
		}else {
			System.out.println("Porfavor digite um numero valido !");

		}
		System.out.println("Fim do programa");
		ler.close();
	}

} 
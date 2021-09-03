package VetorJava;

import java.util.Scanner;

public class Exercicio4Vetor {

	//Crie um programa que receba valores do usuário para preencher uma matriz
	//3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
	//diagonal, ou seja, diagonal principal.
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int m1[][] = new int[3][3];
		int total = 0, diagonal = 0;

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.println("Digite o velor da matriz M1 na linha " + x + " e na coluna " + y + ":");
				m1[x][y] = leia.nextInt();
				total = total + m1[x][y];
				if (x == y) {
					diagonal = diagonal + m1[x][y];
				}
			}
			System.out.println("A soma total é: " + total);
			System.out.println("A soma da diagonal principal é de:  " + diagonal);

		}
		leia.close();

	}

}

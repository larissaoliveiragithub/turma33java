package VetorJava;

import java.util.Scanner;

public class Exercicio3Vetor {

	//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				System.out.println("Digite o valor da matriz N1 na linha " + x + " e na coluna " + y + ":");
				n1[x][y] = leia.nextInt();

			}
		}

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				System.out.println("Digite o valor da matriz N2 na linha " + x + " e na coluna" + y + ":");
				n2[x][y] = leia.nextInt();
			}
		}
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				m1[x][y] = n1[x][y] + n2[x][y];

			}
		}
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				if (n1[x][y] > n2[x][y]) {
					m2[x][y] = n1[x][y] - n2[x][y];
				} else {
					m2[x][y] = n2[x][y] - n1[x][y];

				}

			}
		}

		System.out.println("A matriz 1 é: ");
		for (int x = 0; x <m1.length; x++) {
			System.out.println("\n");
			for (int y = 0; y < m2.length; y++) {
				System.out.println(m1[x][y]+" ");
			}
		}
		System.out.println("A matriz 2 é: ");
		for (int x = 0; x < n1.length; x++) {
			System.out.println("\n");
			for (int y = 0; y < n2.length; y++) {
				System.out.println(m1[x][y]+" ");
				
			}

		}

	}
}

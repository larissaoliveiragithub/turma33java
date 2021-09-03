package VetorJava;

import java.util.Scanner;

public class Exercicio1Vetor {

	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
	//o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double pontos [] = new double[5];
		double maior=0.00;
		System.out.println("Verificando a maior nota-\n");
		for(int x=0; x<5; x++) {
		System.out.println("Escreva a pontuação da "+(x+1)+"° nota: "); 
		pontos[x] = leia.nextDouble();
		if(pontos[x]>maior) {
			maior=pontos[x];
		}
		}
		System.out.println("A maior nota é "+maior+" !!");
		
		
	}
}

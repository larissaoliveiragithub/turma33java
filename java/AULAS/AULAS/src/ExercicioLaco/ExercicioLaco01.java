package ExercicioLaco;

import java.util.Scanner;

public class ExercicioLaco01 {
	
//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int primeiro, segundo, terceiro;
		
		System.out.println("Digite o primeiro número: ");
		primeiro = leia.nextInt();
		
		System.out.println("Digite o segundo número");
		segundo = leia.nextInt();
		
		System.out.println("Digite o terceiro número");
		terceiro = leia.nextInt();
		
		if((primeiro > segundo) && (primeiro > terceiro)) {
			System.out.println("O maior valor é o Primeiro!");
			}
		else if((segundo > primeiro)&&(segundo > terceiro)) {
			System.out.println("O maior valor é o Segundo!");
		    }
		else if((terceiro > primeiro)&&(terceiro > segundo)) {
			System.out.println("O maior valor é o Terceiro!");
		    }
		
		
		
	}

}

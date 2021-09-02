package ListaExercicioLaco;

import java.util.Scanner;

public class Exercicio5Laco {

	//Crie um programa que leia um número do teclado até que encontre um
	//número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

    public static void main(String[] args) {
    	
    	Scanner leia = new Scanner(System.in);
    	
    	int numero, total=0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			total = total + numero;
		}
		while(numero != 0);
		System.out.println("Total: "+total);
    }
}
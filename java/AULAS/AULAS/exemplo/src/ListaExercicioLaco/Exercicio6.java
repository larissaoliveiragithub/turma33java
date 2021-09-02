package ListaExercicioLaco;

import java.util.Scanner;

public class Exercicio6 {

	//Escrever um programa que receba vários números inteiros no teclado. E no
	//final imprimir a média dos números múltiplos de 3. Para sair digitar
	//0(zero).(DO...WHILE)
	
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	
	double numero, total=0, media=0, contador=0;

	do {
		System.out.print("Digite um número: ");
		numero = leia.nextDouble();

		if(numero%3 == 0 && numero > 0) {
			total = total + numero;
			contador++;
			System.out.println("Esse é multiplo de 3!");
		}

	}
	while(numero != 0);
	media = total/(contador-1);
	System.out.printf("Media dos inteiros positivos multiplos de 3: %.2f",media);
	
	
	
	
	
}

}

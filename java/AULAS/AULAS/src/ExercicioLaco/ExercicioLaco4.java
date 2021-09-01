package ExercicioLaco;

import java.util.Scanner;

public class ExercicioLaco4 {
	
	//Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//ímpar exiba o número elevado ao quadrado.
	
	
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
       double numero, raizQuadrada, potencia;
	  
       
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		   raizQuadrada = Math.sqrt(numero*numero);
	       potencia = Math.pow(numero,2);
		
		if(numero<0) {
		 System.out.println("Número negativo!");	
		}
		else if(numero == 0) {
		 System.out.println("Número neutro!");	
		}
		else if((numero%2)==0) {
			System.out.println("Número é PAR! E sua raiz é:  " + raizQuadrada);
		}
		else if((numero%2)==1) {
			System.out.println("Número é ÍMPAR! E sua potência é:  " + potencia);
			}
		
		
		
		
		
		
		
		
	}

}

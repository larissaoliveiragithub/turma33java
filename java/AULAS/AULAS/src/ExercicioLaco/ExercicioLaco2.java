package ExercicioLaco;

import java.util.Scanner;

public class ExercicioLaco2 {

	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	
	public static void main (String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int primeiro, segundo, terceiro;
	
	
	System.out.println("Digite o primeiro número: ");
	primeiro = leia.nextInt();
	
	System.out.println("Digite o segundo número: ");
	segundo = leia.nextInt();
	
	System.out.println("Digite o terceiro número: ");
	terceiro = leia.nextInt();
	
	if((primeiro >= segundo) && (primeiro >= terceiro) && (segundo >= terceiro) ) {
		System.out.println("A ordem crescente é: " +primeiro+segundo+terceiro);
		}
	else if((primeiro >= segundo) && (primeiro >= terceiro) && (terceiro >= segundo) ) {
		System.out.println("A ordem crescente é: "+primeiro+" / " + terceiro+" / " + segundo);
		}
	else if((segundo >= primeiro) && (segundo >= terceiro) && (primeiro >= terceiro) ) {
		System.out.println("A ordem crescente é: "+segundo+" / " + primeiro+" / " + terceiro);
	    }
	else if((segundo >= primeiro) && (segundo >= terceiro) && (terceiro >= primeiro) ) {
		System.out.println("A ordem crescente é: "+segundo+" / " + terceiro+" / " + primeiro);
	    }
	else if((terceiro >= primeiro) && (terceiro >= segundo) && (primeiro >= segundo) ) {
		System.out.println("A ordem crescente é: "+terceiro+" / " + primeiro+" / " + segundo);
	    }
	else if((terceiro >= primeiro) && (terceiro >= segundo) && (segundo >= primeiro) ) {
		System.out.println("A ordem crescente é: "+terceiro+" / " + segundo+" / " + primeiro);
	    }
	 
	
	
	
	
	
	
	
	
	}
		
	
}

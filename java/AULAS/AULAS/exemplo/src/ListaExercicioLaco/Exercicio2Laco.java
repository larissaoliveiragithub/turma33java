package ListaExercicioLaco;

import java.util.Scanner;

public class Exercicio2Laco {

	
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

          public static void main(String[]args) {
        	
        	  Scanner leia = new Scanner(System.in);
        	  
  			int quantidadePares, quantidadeImpares, valor; 
  		
  			quantidadePares = 0;
  			quantidadeImpares = 0;
  			
  		
  			for (int n = 0; n < 10; n++)
  			{
  				System.out.print("Número " + (n + 1) + ": ");
  				valor = leia.nextInt();

  				
  					if ((valor % 2) == 0) {
  						quantidadePares+= 1;
  					}
  						else {
  						quantidadeImpares+= 1;
  				}
  					

  			}
  			
  			System.out.println("Quantidade de números pares: " + quantidadePares);
  			System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
  			
          }
  	
}
  
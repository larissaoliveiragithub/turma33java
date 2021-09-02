package exemplo;

import java.util.Scanner;

public class ExercicioEnquanto {


public static void main(String[] args) {
	
   Scanner leia = new Scanner(System.in);
   
  double somatoria=0.00, media, numero=0.00, total=0.00;
   
   while(numero >= 0) {
	   System.out.println("Digiteo um número a ser somado: ");
	   numero = leia.nextDouble();
	   System.out.println("Digiteo um número a ser somado: ");
	   numero = leia.nextDouble();
	   System.out.println("Digiteo um número a ser somado: ");
	   numero = leia.nextDouble();	  
	   somatoria = somatoria+numero;
	   total=total+1; 
	   media = somatoria/total;
	   
	   if(numero<0) {
		  System.out.println("Número inválido. Digite um número positivo!");   
	   }
        System.out.println("A somatória dos números é: "+somatoria);
	    System.out.println("A média dos valores é: "+media);
	    System.out.println("O total de números é: "+total);
   
	    
   }
   





 
	
	
  }


}

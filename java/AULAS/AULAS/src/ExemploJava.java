import java.util.Scanner;

public class ExemploJava {
	
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par, impar, numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero<0) {
		 System.out.println("Número negativo!");	
		}
		else if(numero == 0) {
		 System.out.println("Número neutro!");	
		}
		else if((numero%2)==0) {
			System.out.println(("Número é PAR!"));
		}
		else {
			System.out.println("Número é ÍMPAR!");
		}
	}
	

}

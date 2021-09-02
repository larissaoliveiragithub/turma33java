package ExercicioLaco;

import java.util.Scanner;

public class Exemplo {


public static void main (String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int n1, n2, n3;
	
	System.out.println("Digite o primeiro número: ");
	n1 = leia.nextInt();
	
	System.out.println("Digite o segundo número: ");
	n2 = leia.nextInt();
	
	System.out.println("Digite o terceiro número: ");
	n3 = leia.nextInt();
	
	if((n1 > n2) && (n1 > n3)) {
	    System.out.println("O número maior é o primeiro! ");
	}
	else if((n2 > n1) && (n2 > n3)) {
		System.out.println("O número maior é o segundo! ");
	}
	else if((n3 > n1) && (n3 > n2)) {
	System.out.println("O número maior é o terceiro! ");
	}
	
}

}

package exemplo;

import java.util.Scanner;

public class ExercicioFacaEnquanto {

public static void main(String[] args) {
	
	
	Scanner leia = new Scanner(System.in);
	
	int contador = 233;
	do {
		System.out.println(contador);
		
		if((contador >= 400) && (contador <= 500) ) {
	         contador = contador + 5;	
		}
	
	else {
		contador = contador + 3;
	}
	 
	}
		
	 while(contador < 456);
			
			
		}


}




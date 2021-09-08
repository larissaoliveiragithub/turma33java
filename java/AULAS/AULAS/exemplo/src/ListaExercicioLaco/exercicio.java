package ListaExercicioLaco;

import java.util.Scanner;

public class exercicio {

public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double altura, base, areaT;
	
	System.out.println("Digite o valor da base do triangulo retangulo em centímetros: ");
	base = leia.nextDouble();
	System.out.println("Digite o valor da altura do triangulo retangulo em centímetros: ");
	altura = leia.nextDouble();
	if(base <=0) {
		System.out.println("Impossível realizar esta operação, valor da base está incorreto!");
	}
	else if(altura <=0) {
	System.out.println("Impossível realizar esta operação, valor da altura está incorreto!");	
	}
	else {
		areaT = base*altura/2;
	
	System.out.println("O valor do cálculo é: "+areaT);
	}
	
	
	
	
	
}


}

import java.util.Scanner;

public class Exercicio3 {

	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	
	public static void main (String[] args) {
		
		 Scanner leia = new Scanner(System.in);
			
	        int horas, minutos, segundos, tempoSegundos;
	        
	        System.out.println("Informe o tempo em segundos: ");
	        tempoSegundos = leia.nextInt();
	        
	        horas = tempoSegundos/3600;
	        minutos = tempoSegundos %3600 /60;
	        segundos = tempoSegundos %3600 %60;
	        
	        
	        System.out.println("Horas:  "+horas);
	        System.out.println("Minutos: "+minutos);
	        System.out.println("Segundos: "+segundos);
		
		
		
	}
}

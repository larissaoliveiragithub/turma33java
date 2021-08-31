import java.util.Scanner;

public class Temperatura{

 public static void main (String[] args){
	
	 Scanner leia = new Scanner(System.in);
		double Celsius, Fahrenheit; 
        int nome;
		
        System.out.print("Digite seu nome: "); 
        nome = leia.nextInt();
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = leia.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print(nome+"A medida convertida é " + Fahrenheit + "ºF\n"); 
		
 
 
 
 
 }

}



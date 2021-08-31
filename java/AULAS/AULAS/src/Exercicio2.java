import java.util.Scanner;

public class Exercicio2 {

	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
   
	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	
        int anos, meses, dias, idadePessoaDias;
        
        System.out.println("Informe a idade em dias: ");
        idadePessoaDias = leia.nextInt();
        
        anos = idadePessoaDias/365;
        meses = idadePessoaDias %365 /30;
        dias = idadePessoaDias %365 %30;
        
        
        System.out.println("Anos:  "+anos);
        System.out.println("Meses: "+meses);
        System.out.println("Dias: "+dias);
        
        
        
        
        
        
        
        
        
        
        
    }
}

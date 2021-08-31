import java.util.Scanner;

public class Exercicio1 {

	
	
	public static void main (String[] args){
		
//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		
		int idadeAnos, idadeMeses, idadeDias, idadeTotalDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os Anos: "); 
		idadeAnos = leia.nextInt();
		
		System.out.println("Digite os Meses: ");
		idadeMeses = leia.nextInt();
		
		System.out.println("Digite os dias: ");
		idadeDias = leia.nextInt();
		
		idadeTotalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		 
		System.out.println("A idade expressa em dias é de :"+idadeTotalDias);
		
		


}
}

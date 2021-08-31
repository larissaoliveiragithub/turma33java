import java.util.Scanner;

public class Exercicio8 {

	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.


      public static void main (String[] args) {
    	  
    	  
       Scanner leia = new Scanner(System.in);
       
       double distribuidor, imposto, fabrica, consumidor;
       
       System.out.println("Digite o custo do veículo: ");
       fabrica = leia.nextDouble();
      
       distribuidor = fabrica + (fabrica * 28/100);
       imposto = fabrica + (fabrica * 45/100);
       consumidor = fabrica + distribuidor + imposto;
       
       System.out.println("O custo do consumidor será de: "+consumidor);
      
      
      
      
      
      
      
      
      
      
      }




}

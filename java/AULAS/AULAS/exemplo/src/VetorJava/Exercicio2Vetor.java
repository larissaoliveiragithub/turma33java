package VetorJava;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2Vetor {

	// Um dado é lançado 10 vezes e o valor correspondente é anotado.
	// Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	// A seguir determine e imprima a média aritmética dos lançamentos, contabilize
	// e apresente
	// também quantas foram as ocorrências da maior pontuação.

	public static void main(String[] args) {
//int numero = random. nextInt(100)
		Scanner leia = new Scanner(System.in);
		Random random = new Random();

		int lancamento[] = new int[10];
		int maior = 0, quantidade = 1, total = 0, media;
		System.out.println("Lançamento de dados-\n");
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite o " + x + "° valor do dado lançado: ");
			lancamento[x] = random.nextInt();
			lancamento[x] = leia.nextInt();
         while(lancamento[x]>6) {
        	 System.out.println("Digite um valor de 1 a 6: ");
        	 lancamento [x] = leia.nextInt();
         }
        	 total = total+lancamento[x];  
           if(lancamento[x]>maior) {
        	   maior = lancamento[x];
        	   quantidade=1;
           }
           else if(lancamento[x]==maior) {
        	   quantidade++;
           }
          
		}

		media = total/10;
		System.out.println("Os lançamentos foram:\n");
		for(int x=0; x<10; x++) {
			System.out.println("" +lancamento[x]+",");
		}
		
	    System.out.println("A média foi de: "+media);
	    System.out.println("O maior número lançado foi "+maior+" e ele foi lançado "+quantidade+" vezes!!");
	
	
	}
}

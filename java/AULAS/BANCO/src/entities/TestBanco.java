package entities;

import java.util.Scanner;

public class TestBanco {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double valor;
		String nome;
		int numero;


		System.out.println("digite o nome do cliente :");
		nome = leia.next();
		System.out.println("Digite o numero da conta :");
		numero = leia.nextInt();
		ContaEstudantil cne1 = new ContaEstudantil(numero,nome, 5000);


		//Conta ce1 = new Conta(numero,nome);

		//
		ContaPoupanca cp1 = new ContaPoupanca(5,"MARCOS",15);
		//ContaEspecial ce1 = new ContaEspecial(113,"MARIA", 5000);




		System.out.println("Cliente : "+cne1.getNomeCliente());
		System.out.println("Saldo atual : R$"+cne1.getSaldo());
		System.out.println("Digite o valor do CREDITO :");
		valor = leia.nextDouble();
		cne1.credito(valor);
		System.out.println("Saldo atual : R$"+cne1.getSaldo());
		System.out.println("Digite o valor do debito :");
		valor = leia.nextDouble();
		if (cne1.getSaldo()<valor) {
			double auxValor = valor - cne1.getSaldo();
			cne1.setLimiteEstudantil(auxValor);
			System.out.println("Limite atual :"+cne1.getLimiteEstudantil());
		}
		cne1.debito(valor);

		System.out.println("Saldo atual : R$"+cne1.getSaldo());
	}

}


package CADFUNC;

import java.util.Locale;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class CadFunc {

	public static void main(String[] args) {

		//Variaveis
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List <Funcionario> folha = new ArrayList<>();

		char tipo; //1- funcinario, 2-terceiro
		int qtde;
		System.out.println("CADASTRO E CALCULO DE SALÁRIO");
		System.out.println("Quantos funcionarios vamos cadastrar : ");
		qtde = leia.nextInt();
		for (int x=1; x<=qtde; x++) {
			System.out.println("Funcionario "+x);
			System.out.print("Digite \n1-Funcinario\n2-Terceiro :");
			tipo = leia.next().charAt(0);
			System.out.println("Digite a matricula :");
			String matricula = leia.next();
			leia.nextLine();
			System.out.println("Digite o nome :");
			String nome = leia.nextLine().toUpperCase();
			System.out.println("Digite as horas trabalhadas :");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora : R$ ");
			double valorHora = leia.nextDouble();

			if (tipo =='2') {
				System.out.println("Digita o valor do adicional : R$ ");
				double adicional = leia.nextDouble();
				folha.add(new Terceiro(matricula,horasTrabalhadas,valorHora,adicional));

			} else if (tipo =='1') {
				folha.add(new Funcionario(matricula,horasTrabalhadas,valorHora));

			}

		}
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionario item : folha) {
			System.out.println(item.toString()+",\nSalario= R$ "+item.salario());
		}




	}

}

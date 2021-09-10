package ExercicioLaco;

public class Carro {
	
		public boolean ligado=false;
		public String modelo;
		public int ano;
		public String cor;

		public void ligarCarro() {
			System.out.println("Ligando o carro...");
			ligado=true;
		}
		public void desligarCarro() {
			System.out.println("Desligando o carro...");
			ligado=false;
		}
		public void estadoCarro() {
			if(ligado) {
				System.out.println("O carro esta ligado");
			}
			else {
				System.out.println("O carro esta desligado");
			}
		}

}


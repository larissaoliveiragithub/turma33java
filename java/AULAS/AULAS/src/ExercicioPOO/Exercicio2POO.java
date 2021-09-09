package ExercicioPOO;

public class Exercicio2POO {
	public class Aviao {
		public String modelo;
		public boolean ligado = false;
		public double altitude = 0.0;

		public void ligarAviao() {
			System.out.println("O avião foi ligado!");
			ligado = true;
		}

		public void desligarAviao() {
			if (altitude ==0) {
			System.out.println("O avião foi desligado!");
			ligado = false;
			}
			else {
				System.out.println("O avião não foi desligado, ele ainda está no ar");
			}

		}

		public void subir(double x) {
			System.out.println("O avião subiu " + x + " metros");
			altitude = altitude + x;
		}

		public void descer(double x) {
			if ((altitude-x) >= 0) {
				System.out.println("O avião desceu " + x + " metros");
				altitude = altitude - x;
			}
			else {
				System.out.println("O avião não pode descer essa altura");
			}
		}

		public void estadoAviao() {
			if (ligado) {
				System.out.println("Situação: Ligado\nAltitude: "+ altitude +"m");
			} else {
				System.out.println("Situação: Desligado\nAltitude: "+ altitude +"m\"");
			}
		}

	}

}


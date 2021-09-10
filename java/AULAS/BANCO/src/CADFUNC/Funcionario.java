package CADFUNC;

public class Funcionario {

	private static final String Funcionario1 = null;
	private String nome;
	private String matricula;
	protected static int horasTrabalhadas;
	protected double valorHora;
	
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	

	public Funcionario(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}



	public void Funcionario1(String matricula2, int horasTrabalhadas2, double valorHora2) {
		// TODO Auto-generated constructor stub
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public static  int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public static int setHorasTrabalhadas(int horasTrabalhadas) {
		return Funcionario.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	

	public double salario() {

		return (this.horasTrabalhadas * this.valorHora);
	}
}




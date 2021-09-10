package entities;

public class ContaEspecial extends Conta {

	// Atributos
	private double limite;

	// Construtor
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	// Encapsulamento
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}


// metodos


public void usarLimite(double valor) {

	this.limite = this.limite - valor;
	super.credito(valor);

}

}

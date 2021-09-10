package animais;

public class Cachorro extends Animal {

	int correr = 0;

	public void latido() {
		System.out.println("Au Au AU !");
	}

	public void correr() {
		correr +=1;
	}
}
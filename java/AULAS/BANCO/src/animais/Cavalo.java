package animais;

public class Cavalo extends Animal {

	int correr = 0;

	public void relinchar() {
		System.out.println("iiirrrrí, rilinchin");
	}

	public void correr() {
		correr +=2;
	}
} 
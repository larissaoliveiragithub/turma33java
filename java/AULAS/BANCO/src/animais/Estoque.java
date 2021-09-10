package animais;

import java.util.ArrayList;

public class Estoque {
	public static void main(String[] args) {
		String estoque1 = "Torcidas";
		String estoque2 = "Cheetos";
		String estoque3 = "Fofura";
		String estoque4 = "Doritos";
		String estoque5 = "Rufles";

		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		estoque.add(estoque5);

		System.out.println(estoque);

		estoque.add(estoque5);
		System.out.println(estoque);

		estoque.remove(0);
		System.out.println(estoque);

		for(String s: estoque) {
			System.out.println("Salgadinhos disponiveis : " + s);
		}
	}
}
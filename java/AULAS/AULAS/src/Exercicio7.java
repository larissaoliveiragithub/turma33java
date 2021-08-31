import java.util.Scanner;

public class Exercicio7 {

 public static void main (String[] args) {
	 
	 Scanner leia = new Scanner(System.in);
	 
	 double a, b, c, d, e, f, x, y;
	 
	 
	 System.out.println("Digite o valor de A: ");
	 a = leia.nextDouble();
	 System.out.println("Digite o valor de B: ");
	 b = leia.nextDouble();
	 System.out.println("Digite o valor de C: ");
	 c = leia.nextDouble();
	 System.out.println("Digite o valor de D: ");
	 d = leia.nextDouble();
	 System.out.println("Digite o valor de E: ");
	 e = leia.nextDouble();
	 System.out.println("Digite o valor de F: ");
	 f = leia.nextDouble();
	 
	 x = ((c*e) - (b*f)) / ((a*e) - (b*d));
	 y = ((a*f) - (c*d) / (a*e) - (b*d));

	         c = ((a*x) + (b*y));
	         f = ((d*x) + (e*y));
	         
	         System.out.println("O valor de X é: " +String.format("%.2f", x));
	         System.out.println("O valor de Y é: "+String.format("%.2f", y));
	 
	 
	 
	 
	 
	 
	 
	 
 }



}

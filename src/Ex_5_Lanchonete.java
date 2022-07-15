import java.util.Locale;
import java.util.Scanner;

public class Ex_5_Lanchonete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o codigo do produto: ");
		
		int codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto: ");
	
		int quantidade = sc.nextInt();
		
		double total = 0;
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
	}

}

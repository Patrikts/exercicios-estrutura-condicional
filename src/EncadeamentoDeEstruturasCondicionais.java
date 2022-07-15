import java.util.Scanner;

public class EncadeamentoDeEstruturasCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		// if = se
		// else = senão
		// lembrando que o else não tem condição
		// a condição fica afrente do if "if () / se ()"

		if (hora <= 12) {
			System.out.println("Bom dia");
			
		// else if = senão se
			
		} else if (hora <= 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}
}

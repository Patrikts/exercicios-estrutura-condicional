import java.util.Scanner;

public class Ex_1_ONumeroENegativoOuPositivo {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		
		int numero;
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("O numero é positivo");
		} else if (numero < 0) {
			System.out.println("O numero é negativo");
		} else {
			System.out.println("O numero é 0");
		}
	}

}

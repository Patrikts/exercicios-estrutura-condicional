import java.util.Scanner;

public class Ex_1_ONumeroENegativoOuPositivo {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		
		int numero;
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("O numero � positivo");
		} else if (numero < 0) {
			System.out.println("O numero � negativo");
		} else {
			System.out.println("O numero � 0");
		}
	}

}

import java.util.Scanner;

public class Ex_2_ONumeroEParOuImpar {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");

		int numero;
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O numero � par");
		} else {
			System.out.println("O numero � impar");
		}
	}
}
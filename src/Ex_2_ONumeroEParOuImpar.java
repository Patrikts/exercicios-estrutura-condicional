import java.util.Scanner;

public class Ex_2_ONumeroEParOuImpar {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");

		int numero;
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}
	}
}
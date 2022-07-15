import java.util.Scanner;

public class Ex_3_SaoMultiplosOuNaoSaoMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.*/
		
		System.out.println("Digite o primeiro numero: ");
		
		int numero1;
		numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero: ");
		
		int numero2;
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}

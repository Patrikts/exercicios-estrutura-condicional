import java.util.Scanner;

public class Ex_4_CalculoDaDuracaoDoJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
		come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.*/

		System.out.println("OBS: Devem ser digitados valores de horas ou seja de 0 a 24");
		System.out.println("Digite a hora inicial do jogo: ");

		int horaInicial = sc.nextInt();

		System.out.println("Digite a hora final do jogo: ");

		int horaFinal = sc.nextInt();

		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O jogo durou: " + duracao + " hora(s)");

		sc.close();
	}

}

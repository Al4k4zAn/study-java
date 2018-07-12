package exerciciosEstruturaDeControles;

import java.util.Scanner;

public class CalcularNotaAluno {
	public static void main(String[] args) {
		double nota1 = 0;
		double nota2 = 0;
		double mediaFinal = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite as duas notas:\n");
		nota1 = scanner.nextDouble();
		nota2 = scanner.nextDouble();

		mediaFinal = (nota1 + nota2) / 2;

		if (mediaFinal >= 7) {
			System.out.printf("Aprovado - nota: %.2f", mediaFinal);
		} else if (mediaFinal < 7 && mediaFinal > 4) {
			System.out.printf("Recuperação - nota: %.2f", mediaFinal);
		} else {
			System.out.printf("Reprovado - nota: %.2f", mediaFinal);
		}

		scanner.close();
	}
}

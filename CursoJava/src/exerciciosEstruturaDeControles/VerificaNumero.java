package exerciciosEstruturaDeControles;

import java.util.Scanner;

public class VerificaNumero {
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner scanner = new Scanner(System.in);
		int numeroReceived = 0;
		int verifica = 0;

		numeroReceived = scanner.nextInt();
		System.out.printf("O numero recebido foi: %d\n", numeroReceived);

		if (numeroReceived >= 0 && numeroReceived <= 10) {
			verifica = numeroReceived % 2;
			System.out.println("Verificando numero...\n");
			if (verifica == 0) {
				System.out.printf("Você digitou um Número par: %d", numeroReceived);
			} else {
				System.out.printf("Você digitou um Número ímpar: %d", numeroReceived);
			}
		} else {
			System.out.println("Número inválido");
		}

		scanner.close();

	}
}

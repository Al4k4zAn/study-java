package exerciciosEstruturaDeControles;

import java.util.Scanner;

public class VerificaNumeroPrimo {
	public static void main(String[] args) {
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para saber se é primo: ");

		num = scanner.nextInt();
		// Regra de calculo do numero primo

		if (num == 0 || num == 1) {
			System.out.println("Não é numero primo!");
		} else if (num % 2 == 0) { // numeros pares
			System.out.println("Não é numero primo!");
		} else if (num == 2) {
			System.out.println("É número primo!");
		} else if (num % 2 == 1 || num % 3 == 1 || num % 5 == 1 || num % 7 == 1 || num % 11 == 1 || num % 13 == 1) {
			System.out.println("É número primo!");
		} else {
			System.out.println("número inválido");
		}
		scanner.close();
	}
}

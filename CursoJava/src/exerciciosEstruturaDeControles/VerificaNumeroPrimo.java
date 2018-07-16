package exerciciosEstruturaDeControles;

import java.util.Scanner;

public class VerificaNumeroPrimo {
	public static void main(String[] args) {
		int num = 0;
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para saber se é primo: ");

		num = scanner.nextInt();
		// Regra de calculo do numero primo

		if (num == 1 || num == 0) {
			System.out.println("Não é numero primo!");
		} else if (num == 2 || num == 3 || num == 5 || num == 7) { 
			System.out.println("É numero primo!");
			// Elimina todos os multiplos de 3, 5, 7, 11 e 13
		} else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0 || num % 13 == 0) {			
			System.out.println("Não é numero primo!");
		} else if (num % 2 == 1 || num % 3 == 1 || num % 5 == 1 || num % 7 == 1 || num % 11 == 1 || num % 13 == 1){
			System.out.println("É número primo");
		}else {
			System.out.println("Numero invalido");
		}
		scanner.close();
	}
}

package exerciciosEstruturaDeControles;

import java.util.Scanner;

public class VerificaNumeroPrimo {
	public static void main(String[] args) {
		int num = 0;
		int verify = 0;
		int verifyTwo = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber se é primo: ");
		
		num = scanner.nextInt();
		
		//  Regra de calculo do numero primo
		verify = num % 1;
		verifyTwo = num % num;
		
		
		if (verify == 0 && verifyTwo == 0) {
			System.out.printf("%d é um numero primo!", num);
		}else {
			System.out.printf("%d não é um número primo!" , num);
		}
		
		scanner.close();
	}
}

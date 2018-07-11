package exerciciosEstruturaDeControles;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		int anoAtual = 0;
		int verifica = 0;
		System.out.println("Digite o Ano atual para saber se é Bissexto: ");
		Scanner scanner = new Scanner(System.in);
		
		anoAtual = scanner.nextInt();
		
		verifica = anoAtual % 4;
		
		if (verifica == 0) {
			System.out.printf("O ano atual informado, %d, é bisssexto!", anoAtual);
		}else {
			System.out.printf("O ano atual informado, %d, não é bissexto!", anoAtual);
		}
		
		scanner.close();
	}
}

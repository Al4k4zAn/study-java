package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = false;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2; //XOR
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		
		// Operador unário intruso
		System.out.println("Fome = " + !comprouSorvete);
	}

}

package fundamentos;

public class ObjetosPrimitivosWrappers {
	public static void main(String[] args) {
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		System.out.println(bo.toString().length()); //A forma do objeto primitivo que traz o comportamento
		System.out.println("true".length()); //A forma mais basica
		
	}

}

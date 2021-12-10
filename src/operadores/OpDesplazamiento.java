package operadores;

public class OpDesplazamiento {
	public static void main( String [] args) {
		int a = 1;
		int b = 128;
		
		a = a<<4;
		b = b>>5;
		
		System.out.println("a vale: " + a);
		System.out.println("b vale: " + b);
	}
}

package operadores;

public class OpAritmeticos {

	public static void main( String [] args) {
		int valor1 =7;
		int valor2 = 20;
		
		int suma = valor1 + valor2;
		int resta = valor1 - valor2;
		int division = valor1 / valor2;
		int multiplicacion = valor1 * valor2;
		int resto = valor2 % valor1;
		
		System.out.println("La suma de valor 1 + valor 2 es:" + "...En este programa : " + suma);
		System.out.println("La resta del valor1 - el valor2 es: " + resta);
		System.out.println("La division del valor1 / el valor2 es: " + division);
		System.out.println("La multiplicacion del valor1 * el valor2 es: " + multiplicacion);
		System.out.println("La multiplicacion del valor1 % el valor2 es: " + resto);
	}
	
}

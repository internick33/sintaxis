package practicaU1;

public class Almacen {
	
	public static void main(String [] args) {
		
		String nombre = "Jose";
		String telefono = "55-89-96-65-23";
		String domicilio = "Zapata 22 NR";
		int cantidad = 15;
		double precioEscoba = 30;
		double total;
		
		if(cantidad>1 && cantidad<=10) {
			total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.10);
			System.out.println("Cliente: " + nombre + "\n Domicilio: " + domicilio + "\n telefono: " + telefono + "\n total a pagar: $" + total);
		} else if(cantidad>10 && cantidad<=20) {
			total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.20);
			System.out.println("Cliente: " + nombre + "\n Domicilio: " + domicilio + "\n telefono:" + telefono + "\n total a pagar: $" + total);
		} else if(cantidad>21 && cantidad<=30) {
			total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.30);
			System.out.println("Cliente: " + nombre + "\n Domicilio: " + domicilio + "\n telefono: " + telefono + "\n total a pagar: $" + total);
		}	
	}
}

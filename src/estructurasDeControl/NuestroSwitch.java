package estructurasDeControl;

public class NuestroSwitch {
	public static void main( String[] args) {
		
		int calificacion = 6;
		
		switch( calificacion ) {
		case 10:
			System.out.println("Felicidades sacaste 10");
			break;
		case 9:
			System.out.println("En hora buena sacaste 9");
			break;
		case 8:
			System.out.println("Un 8 muy poco");
			break;
		case 7:
			System.out.println("Echale mas ganas un 7 no sirve");
			break;
		default: 
			System.out.println("Reprobaste");
			break;
		}	
	}
}

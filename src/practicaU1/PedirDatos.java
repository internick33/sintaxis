package practicaU1;

import javax.swing.*;

public class PedirDatos {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
		String telefono = JOptionPane.showInputDialog(null, "Cual es tu telefono?");
		String direccion= JOptionPane.showInputDialog(null, "Cual es tu direccion?");
		JOptionPane.showMessageDialog(null, "Bienvenido: " + nombre + "\nTelefono:" + telefono + "\nDierccion:"+ direccion);
	}

}

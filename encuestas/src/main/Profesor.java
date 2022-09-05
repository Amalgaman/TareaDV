package main;

import javax.swing.JOptionPane;

public class Profesor {

	public static int calificarAlumno() {
		int nota;
		do {
		nota=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar calificacion del 1 al 10"));
		}while(nota<1 || nota>10);
		return nota;
		}
	}


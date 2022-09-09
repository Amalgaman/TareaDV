package ej2;

import javax.swing.JOptionPane;

public class Persona {

	private String nombre;
	private String dni;
	
	public Persona(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return  nombre+" (dni: "+dni+")";
	}
	public static boolean realizarLlamada(Persona persona1,Persona persona2,Motorola cel1,Iphone cel2) {
		if (cel1.isEncendido() && cel2.isEncendido()) {
			int minutos = (int)(Math.random()*20);
			JOptionPane.showMessageDialog(null, persona1.toString()+" y "+persona2.toString()+" realizaron una llamada que duro "+minutos+" minutos");
			cel1.consumirBateria(minutos);
			cel2.consumirBateria(minutos);
			return true;
		}
	    JOptionPane.showMessageDialog(null, "Alguno de los celulares esta apagado, no pudo realizarse la llamada");
	    return false;

	}
	
	
}

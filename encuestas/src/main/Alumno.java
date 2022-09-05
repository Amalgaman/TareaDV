package main;

import javax.swing.JOptionPane;

public class Alumno {

	private String nombre;
	private String apellido;
	private int encuestas;
	private int calificacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEncuestas() {
		return encuestas;
	}
	public void setEncuestas(int encuestas) {
		this.encuestas = encuestas;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.encuestas = 0;
		this.calificacion = 0;
	}
	@Override
	public String toString() {
		return "Alumno= " + nombre + " " + apellido + ", encuestas=" + encuestas + ", calificacion="
				+ calificacion;
	}
	public void añadirEncuesta() {
		int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar edad"));
		String genero=(String)(JOptionPane.showInputDialog(null, "Ingresar Genero"));
		String rol=(String)(JOptionPane.showInputDialog(null, "Ingresar rol que ejerce en la escuela"));
		
		
		boolean ejercicio;
		int op=JOptionPane.showConfirmDialog(null, "¿Realiza ejercicio regularmente?");
		if (op==0) {
			ejercicio=true;
		}else {
			ejercicio=false;
		}
		
		String alimentacion=(String)(JOptionPane.showInputDialog(null, "Ingresar alimento que consume regularmente"));
		
		Persona encuestado=new Persona(edad,genero,rol,ejercicio,alimentacion);
		
		this.encuestas++;
	}
	
	
}

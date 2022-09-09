package ej2;

import javax.swing.JOptionPane;

public abstract class Celular {
	
private int imai;
private boolean encendido;
private double bateria;


	
	public Celular(int imai) {
	super();
	this.imai = imai;
	this.encendido = true;
	this.bateria = 5;
}



	public int getImai() {
	return imai;
}



public void setImai(int imai) {
	this.imai = imai;
}



public boolean isEncendido() {
	return encendido;
}



public void setEncendido(boolean encendido) {
	this.encendido = encendido;
}



public double getBateria() {
	return bateria;
}



public void setBateria(double bateria) {
	this.bateria = bateria;
}



	public void consumirBateria(int minutos) {
		System.out.println("La llamada duro" + minutos);
		System.out.println("gasto x bateria");
	}
	
	public String comprobarBateria() {
		if(this.bateria <= 0) {
			this.encendido=false;
			return " se quedo sin bateria y se apago";
		}
		return " la bateria que queda es "+this.bateria;
	}
	public boolean cargarBateria() {
		this.bateria=5;
		this.encendido=true;
		JOptionPane.showMessageDialog(null,"El celular "+this.imai+" cargo exitosamente");
		return true;
	}
	
}

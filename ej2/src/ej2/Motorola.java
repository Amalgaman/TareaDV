package ej2;

import javax.swing.JOptionPane;

public class Motorola extends Celular{
	
	private String v_android;
	
	
	
	public Motorola(int imai,String v_android) {
		super(imai);
		this.v_android=v_android;
	}

	@Override 
	public void consumirBateria(int minutos) {
		
		double aux = this.getBateria() - minutos * 0.25;
		this.setBateria(aux);
		JOptionPane.showMessageDialog(null,"El Motorola gasto " + minutos * 0.25 +" puntos de bateria,"+this.comprobarBateria());	
	}

}

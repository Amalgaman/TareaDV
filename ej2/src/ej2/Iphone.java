package ej2;

import javax.swing.JOptionPane;

public class Iphone extends Celular{
	
	private String v_ios;
	
	
	
	public Iphone(int imai, String v_ios) {
		super(imai);
		this.v_ios=v_ios;
		
	}

	@Override 
	public void consumirBateria(int minutos) {
		
		double aux = this.getBateria() - minutos * 0.1;
		this.setBateria(aux);
		JOptionPane.showMessageDialog(null,"El Iphone gasto " + minutos * 0.25 +" puntos de bateria,"+this.comprobarBateria());
	}
}

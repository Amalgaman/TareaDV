package supermercado;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
	    String[] opciones= {"Mover Empleado","Mostrar Lista"};
		int op;
		
		Sector sector1= new Sector(1,"Cajas");
		Sector sector2= new Sector(2,"Entradas");
		Sector sector3= new Sector(3,"Gondolas");
		
		
	    
		op=JOptionPane.showOptionDialog(null, "Selecciona accion que desea realizar", "supermercado", 0, 0, null, opciones, opciones[0]);
		if (op==0) {
			
		}else {
			
		}
	}

}

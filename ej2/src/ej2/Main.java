package ej2;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		
		Persona persona1=new Persona("Juliana","123456789");
		Persona persona2=new Persona("Catalina","987654321");
		
		Motorola cel1=new Motorola(1,"g30");
		Iphone cel2 = new Iphone(2,"xs");
		
		menuPrincipal(persona1,persona2,cel1,cel2);
		
	}
public static void menuPrincipal(Persona persona1,Persona persona2,Motorola cel1,Iphone cel2) {
	String[] opciones= {"Realizar llamada","Comprobar baterias","Cargar celulares","Salir"};
	int op=JOptionPane.showOptionDialog(null, "Elija la opcion que quiere realizar:", "Llamadas", 0, 0, null, opciones, null);
	switch(op) {
	case 0:
		Persona.realizarLlamada(persona1, persona2, cel1, cel2);
		menuPrincipal(persona1,persona2,cel1,cel2);
		break;
	case 1:
		JOptionPane.showMessageDialog(null, "Celular de "+persona1.toString()+cel1.comprobarBateria()+" \nCelular de "+persona2.toString()+cel2.comprobarBateria());
		menuPrincipal(persona1,persona2,cel1,cel2);
		break;
	case 2:
		cel1.cargarBateria();
		cel2.cargarBateria();
		menuPrincipal(persona1,persona2,cel1,cel2);
		break;
	case 3:
		JOptionPane.showMessageDialog(null, "Programa finalizado");
		break;
	}
}
}

package ej1;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		
		menuEmpleado();	
		System.out.println("Programa finalizado");
	}

	public static void menuEmpleado() {
		String nombre=JOptionPane.showInputDialog("Ingrese nombre del empleado");
		
		String[] opciones1= {"Gerente","Cadete"};
		int puesto=JOptionPane.showOptionDialog(null, "Elija el puesto del empleado", "Empleados", 0, 0, null, opciones1, null);
		
		int ausentismo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de dias que falto"));
		
		String[] opciones2= {"Exelente","Bueno","Regular"};
		int rendimiento=JOptionPane.showOptionDialog(null, "¿Como es el desempeño del empleado?", "Empleados", 0, 0, null, opciones2, null);
		
		//Uso un switch y no un if por si quisiera agregar mas puestos
		switch (puesto) {
		case 0:
			Gerente gerente=new Gerente(nombre,ausentismo,rendimiento,01);
			gerente.calcularSueldo(ausentismo, rendimiento);
			JOptionPane.showMessageDialog(null, gerente.mostrarSueldo());
			break;
		case 1:
			Cadete cadete=new Cadete(nombre,ausentismo,rendimiento,01);
			cadete.calcularSueldo(ausentismo, rendimiento);
			JOptionPane.showMessageDialog(null, cadete.mostrarSueldo());
			break;
		}
		int op = JOptionPane.showConfirmDialog(null, "¿Seguir calculando sueldos?");
		if(op==0) {
			menuEmpleado();
		}
	}

}

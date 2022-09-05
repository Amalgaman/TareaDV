package main;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		int op;
		String[] opciones= {"Ingresar como alumno","ingresar como profesor"};
	
		
		Alumno alumno1=new Alumno("Jose","Lopez");
		Alumno alumno2=new Alumno("Matias","Sanchez");
		Alumno alumno3=new Alumno("Carmen","Avila");
		Alumno alumno4=new Alumno("Brian","Rodriguez");
		String[] alumnos= {alumno1.getNombre(),alumno2.getNombre(),alumno3.getNombre(),alumno4.getNombre(),};
		
		do {
			
			op=JOptionPane.showOptionDialog(null, "Encuesta sobre habitos saludables en el recreo. \n "+alumno1.toString()+"\n "+alumno2.toString()+"\n "+alumno3.toString()+"\n "+alumno4.toString(),"encuestas",0,0,null, opciones, null);
			if(op==0) {
				op=JOptionPane.showOptionDialog(null, "¿Quien realiza la encuenta?","encuestas",0,0,null, alumnos, null);
				switch (op){
				case 0:
					alumno1.añadirEncuesta();
					break;
				case 1:
					alumno2.añadirEncuesta();
					break;
				case 2:
					alumno3.añadirEncuesta();
					break;
				case 3:
					alumno4.añadirEncuesta();
					break;
				}
			}else {
				
				op=JOptionPane.showOptionDialog(null, "¿A quien quiere calificar?","encuestas",0,0,null, alumnos, null);
				switch (op){
				case 0:
					alumno1.setCalificacion(Profesor.calificarAlumno());
					break;
				case 1:
					alumno2.setCalificacion(Profesor.calificarAlumno());
					break;
				case 2:
					alumno3.setCalificacion(Profesor.calificarAlumno());
					break;
				case 3:
					alumno4.setCalificacion(Profesor.calificarAlumno());
					break;
			}
			}
			op=JOptionPane.showConfirmDialog(null, "¿Realizar otra accion?");
			
		}while(op==0);
		JOptionPane.showMessageDialog(null, "ejecucion finalizada");
	}

}

package supermercado;

public abstract class Empleado {

	public String nombre;
	public String apellido;
	public String dni;
	public boolean activo;
	
	public Empleado(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.activo = true;
	}
	

	public void sectpr(Sector sector) {
		
		if(sector.getId()==1) {
			
		}
	}
	
	
}

package ej1;

public class Gerente extends Empleado{

	private int id;

	public Gerente(String nombre, int ausentismo, int rendimiento,int id) {
		super(nombre, ausentismo, rendimiento);
		this.id=id;
		this.setSueldo(1500);
	}

	@Override
	public String toString() {
		return "Gerente [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}
	
	
}

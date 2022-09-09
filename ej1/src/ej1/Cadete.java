package ej1;

public class Cadete extends Empleado{

	private int id;

	

	public Cadete(String nombre, int ausentismo, int rendimiento,int id) {
		super(nombre, ausentismo, rendimiento);
		this.id=id;
		this.setSueldo(1000);
	}
	@Override
	public String toString() {
		return "Cadete [id=" + id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

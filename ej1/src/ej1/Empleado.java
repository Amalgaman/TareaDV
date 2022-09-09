package ej1;

public abstract class Empleado {

	private String nombre;
	private double sueldo;
	private int ausentismo;
	private int rendimiento;
	
	public Empleado(String nombre, int ausentismo, int rendimiento) {
		super();
		this.nombre = nombre;
		this.ausentismo = ausentismo;
		this.rendimiento = rendimiento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", ausentismo=" + ausentismo + ", rendimiento="
				+ rendimiento + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAusentismo() {
		return ausentismo;
	}

	public void setAusentismo(int ausentismo) {
		this.ausentismo = ausentismo;
	}

	public int getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}
	public boolean calcularSueldo(int ausentismo, int desempeño) {
		Presentismo bono1=new Presentismo(100,50);
		Desempeño bono2=new Desempeño(0.10,80);
		
		double bonos=bono1.calcularBono(ausentismo)+bono2.calcularBono(desempeño,this.getSueldo());
		this.setSueldo(this.getSueldo()+bonos);
		
		return true;
	}
	public String mostrarSueldo() {
		return "El sueldo total de "+this.getNombre()+" es: $"+this.getSueldo();
	}
	
}

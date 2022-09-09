package ej1;

public abstract class Bono {

	private double monto1;
	private double monto2;
	
	public double getMonto1() {
		return monto1;
	}
	public void setMonto1(double monto1) {
		this.monto1 = monto1;
	}
	public double getMonto2() {
		return monto2;
	}
	public void setMonto2(double monto2) {
		this.monto2 = monto2;
	}
	public Bono(double monto1, double monto2) {
		super();
		this.monto1 = monto1;
		this.monto2 = monto2;
	}
	@Override
	public String toString() {
		return "Bono [monto1=" + monto1 + ", monto2=" + monto2 + "]";
	}
	
	public double calcularBono(){
		return 0;
	}
	
	
}

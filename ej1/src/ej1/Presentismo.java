package ej1;

public class Presentismo extends Bono{

	public Presentismo(double monto1, double monto2) {
		super(monto1, monto2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Presentismo []";
	}

	public double calcularBono(int ausentismo){
		if(ausentismo==0) {
			return this.getMonto1();
		}
		if(ausentismo==1) {
			return this.getMonto2();
		}
		return 0;
	}
	

}

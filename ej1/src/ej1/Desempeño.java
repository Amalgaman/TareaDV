package ej1;

public class Desempe�o extends Bono{

	public Desempe�o(double monto1, double monto2) {
		super(monto1, monto2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Desempe�o []";
	}
	
	public double calcularBono(int desempe�o,double sueldo){
		if(desempe�o==0) {
			return sueldo*this.getMonto1();
		}
		if(desempe�o==1) {
			return this.getMonto2();
		}
		return 0;
	}

	
}

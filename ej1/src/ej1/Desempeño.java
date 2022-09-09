package ej1;

public class Desempeño extends Bono{

	public Desempeño(double monto1, double monto2) {
		super(monto1, monto2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Desempeño []";
	}
	
	public double calcularBono(int desempeño,double sueldo){
		if(desempeño==0) {
			return sueldo*this.getMonto1();
		}
		if(desempeño==1) {
			return this.getMonto2();
		}
		return 0;
	}

	
}

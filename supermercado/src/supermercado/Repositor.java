package supermercado;

public class Repositor extends Empleado{

	private final int id_puesto=3;
	
		public Repositor(String nombre, String apellido, String dni) {
			super(nombre, apellido, dni);
		}

		@Override
		public String toString() {
			return "Repositor [id_puesto=" + id_puesto + ", nombre=" + nombre + ", apellido=" + apellido + ", dni="
					+ dni + ", activo=" + activo + "]";
		}

		
	}


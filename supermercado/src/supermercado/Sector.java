package supermercado;

public abstract class Sector {

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sector(int id) {
		this.id=id;
	}
	
	
}

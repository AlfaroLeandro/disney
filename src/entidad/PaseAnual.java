package entidad;

public class PaseAnual {
	private int id;
	private int idClienteAsociado;
	
	public PaseAnual(int id, int idClienteAsociado) {
		super();
		this.id = id;
		this.idClienteAsociado = idClienteAsociado;
	}
	
	public int getId() {
		return id;
	}
	
	public int getIdClienteAsociado() {
		return idClienteAsociado;
	}
}

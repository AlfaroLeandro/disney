package entidad;

public class PrecioParque {
	private int idParque;
	private float precioDia;
	private float precioAnio;
	public PrecioParque(int idParque, float precioDia, float precioAnio) {
		super();
		this.idParque = idParque;
		this.precioDia = precioDia;
		this.precioAnio = precioAnio;
	}
	public int getIdParque() {
		return idParque;
	}
	public float getPrecioDia() {
		return precioDia;
	}
	public float getPrecioAnio() {
		return precioAnio;
	}

}

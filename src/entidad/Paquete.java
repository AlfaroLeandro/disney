package entidad;

public class Paquete {
	private int id;
	private int[] idParques;
	private int[] idProductos;
	private float precio;
	public Paquete(int id, int[] idParques, int[] idProductos, float precio) {
		super();
		this.id = id;
		this.idParques = idParques;
		this.idProductos = idProductos;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public int[] getIdParques() {
		return idParques;
	}
	public int[] getIdProductos() {
		return idProductos;
	}
	public float getPrecio() {
		return precio;
	}
	
	
}

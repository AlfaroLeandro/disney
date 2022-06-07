package entidad;

import entidad.enumerable.TipoLector;

public class LectorPulsera {
	private int id;
	private String ubicacion;
	private TipoLector tipo;
	public LectorPulsera(int id, String ubicacion, TipoLector tipo) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public TipoLector getTipo() {
		return tipo;
	}
	
}

package entidad;

import java.util.Date;

public class Parque {
	private int id;
	private String nombre;
	private String ubicacion;
	private Date horaApertura;
	private Date horaCierre;
	private PrecioParque precio;
	private int cantidadMaximaAsistentes;
	public Parque(int id, String nombre, String ubicacion, Date horaApertura, Date horaCierre, PrecioParque precio,
			int cantidadMaximaAsistentes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.precio = precio;
		this.cantidadMaximaAsistentes = cantidadMaximaAsistentes;
	}
	
	
}

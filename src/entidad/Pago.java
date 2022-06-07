package entidad;

import java.util.Date;

import entidad.enumerable.EstadoPago;

public class Pago {
	private int id;
	private Date fecha;
	private Date hora;
	private float importe;
	private int idVentaAsociada;
	private EstadoPago estado;
	public Pago(int id, Date fecha, Date hora, float importe, int idVentaAsociada, EstadoPago estado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.importe = importe;
		this.idVentaAsociada = idVentaAsociada;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public Date getFecha() {
		return fecha;
	}
	public Date getHora() {
		return hora;
	}
	public float getImporte() {
		return importe;
	}
	public int getIdVentaAsociada() {
		return idVentaAsociada;
	}
	public EstadoPago getEstado() {
		return estado;
	}
	
}

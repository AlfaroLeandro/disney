package entidad;

import java.util.Date;

import entidad.enumerable.EstadoVenta;

public class Venta {
	private int id;
	private int idClienteAsociado;
	private Date fecha;
	private Date hora;
	private float importe;
	private Pago pago;
	private String descripcion;
	private EstadoVenta estado;

	public Venta(int id, int idClienteAsociado, Date fecha, Date hora, float importe, String descripcion,
			EstadoVenta estado) {
		super();
		this.id = id;
		this.idClienteAsociado = idClienteAsociado;
		this.fecha = fecha;
		this.hora = hora;
		this.importe = importe;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public EstadoVenta getEstado() {
		return estado;
	}
	public void setEstado(EstadoVenta estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public int getIdClienteAsociado() {
		return idClienteAsociado;
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
	public String getDescripcion() {
		return descripcion;
	}
	public Pago getPago() {
		return pago;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
}

package entidad;

import entidad.enumerable.TipoMedioDePago;

public class MedioDePago {
	private int idCliente;
	private String banco;
	private TipoMedioDePago tipo;
	private String nombreTitular;
	private int numeroTarjeta;
	private int codigoSeguridad;
	public MedioDePago(int idCliente, String banco, TipoMedioDePago tipo, String nombreTitular, int numeroTarjeta,
			int codigoSeguridad) {
		super();
		this.idCliente = idCliente;
		this.banco = banco;
		this.tipo = tipo;
		this.nombreTitular = nombreTitular;
		this.numeroTarjeta = numeroTarjeta;
		this.codigoSeguridad = codigoSeguridad;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public String getBanco() {
		return banco;
	}
	public TipoMedioDePago getTipo() {
		return tipo;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}
	
	
}

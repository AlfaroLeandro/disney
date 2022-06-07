package entidad;

import entidad.enumerable.TipoProducto;

public class Producto {
	private int id ;
	private String nombre;
	private String descripcion;
	private TipoProducto tipo;
	private float precio;
	public Producto(int id, String nombre, String descripcion, TipoProducto tipo, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public TipoProducto getTipo() {
		return tipo;
	}
	public float getPrecio() {
		return precio;
	}
	
	
}

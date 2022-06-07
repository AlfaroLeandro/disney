package entidad;

public class Cliente {

	private int id;
	private String nombre;
	private String segundoNombre;
	private String apellido;
	private String email;
	private PaisOrigen paisOrigen;
	private String ciudad;
	private int codigoPostal;
	private Ticket[] ticketsAsociados;
	private Pulsera[] pulserasAsociadas;
	private Carrito carrito;
	
	
	
	public Cliente(int id, String nombre, String segundoNombre, String apellido, String email, PaisOrigen paisOrigen,
			String ciudad, int codigoPostal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		this.email = email;
		this.paisOrigen = paisOrigen;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}
	public Ticket[] getTicketsAsociados() {
		return ticketsAsociados;
	}
	public void setTicketsAsociados(Ticket[] ticketsAsociados) {
		this.ticketsAsociados = ticketsAsociados;
	}
	public Pulsera[] getPulserasAsociadas() {
		return pulserasAsociadas;
	}
	public void setPulserasAsociadas(Pulsera[] pulserasAsociadas) {
		this.pulserasAsociadas = pulserasAsociadas;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getEmail() {
		return email;
	}
	public PaisOrigen getPaisOrigen() {
		return paisOrigen;
	}
	public String getCiudad() {
		return ciudad;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
}

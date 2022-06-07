package entidad;

public class Carrito {
	private Cliente cliente;
	private Ticket[] tickets;
	private Paquete[] paquete;
	public Carrito(Cliente cliente, Ticket[] tickets, Paquete[] paquete) {
		super();
		this.cliente = cliente;
		this.tickets = tickets;
		this.paquete = paquete;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Ticket[] getTickets() {
		return tickets;
	}
	public Paquete[] getPaquete() {
		return paquete;
	}
	
	
}

package entidad;
import java.util.Date;

public class Ticket {
	private int id;
	private int idClienteAsociado;
	private int idParque;
	private Date fecha;
	public Ticket(int id, int idClienteAsociado, int idParque, Date fecha) {
		super();
		this.id = id;
		this.idClienteAsociado = idClienteAsociado;
		this.idParque = idParque;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public int getIdClienteAsociado() {
		return idClienteAsociado;
	}
	public int getIdParque() {
		return idParque;
	}
	public Date getFecha() {
		return fecha;
	}
}

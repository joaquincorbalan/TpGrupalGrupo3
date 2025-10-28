package ar.edu.unrn.seminario.modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoDeDonacion {
	private Donante donante;
	private Date fechaEmision;
	private boolean esPesado; 
	private  List<Donacion> donaciones = new ArrayList<>();
	public PedidoDeDonacion(boolean esPesado, Donante undonante) {
		this.fechaEmision = new Date();
		this.esPesado = esPesado;
		this.donante=undonante;
	}
	/*public Donante getDonante() {
		return donante;
	}*/
	public void asignarDonacion(Donacion unadonacion) {
		this.donaciones.add(unadonacion);
	}
}

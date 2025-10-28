package ar.edu.unrn.seminario.api;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unrn.seminario.dto.DonacionDTO;
import ar.edu.unrn.seminario.dto.VisitaDTO;
import ar.edu.unrn.seminario.dto.VoluntarioDTO;
import ar.edu.unrn.seminario.modelo.Visita;
import ar.edu.unrn.seminario.modelo.Voluntario;
import ar.edu.unrn.seminario.modelo.OrdenDeRetiro;

public class Memoryapi implements IApi {
	private static List<Visita> visitas = new ArrayList<>();
	private static List<Voluntario> voluntarios = new ArrayList<>();
	private static List<OrdenDeRetiro> OrdenesRetirar = new ArrayList<>();
	@Override
	public void OrdenDeRetiro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public OrdenDeRetiro agregarVisita(VisitaDTO unavisita) {

		return null;
	}
	@Override
	public OrdenDeRetiro agregarVoluntario(VoluntarioDTO unVoluntario) {
		return null;
		
		
	}
	@Override
	public void ejecutarOrdenDeRetiro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void finalizarPedido() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarDonacion(DonacionDTO unaDonacion) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void RegistrarVisita(String fecha, String hora, String cantidad, String tipo, String observaciones) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void imprimirVisita(VisitaDTO unavisita) {
		// TODO Auto-generated method stub
		
	}
}
	
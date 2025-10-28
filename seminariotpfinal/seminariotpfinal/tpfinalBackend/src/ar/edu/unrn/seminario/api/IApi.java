package ar.edu.unrn.seminario.api;
import ar.edu.unrn.seminario.dto.DonacionDTO;
import ar.edu.unrn.seminario.dto.VisitaDTO;
import ar.edu.unrn.seminario.dto.VoluntarioDTO;
import ar.edu.unrn.seminario.modelo.OrdenDeRetiro;
public interface IApi {
	//metodos de orden de retiro
 void OrdenDeRetiro(); 
 OrdenDeRetiro agregarVisita(VisitaDTO unavisita);
 OrdenDeRetiro agregarVoluntario(VoluntarioDTO unVoluntario);
 void ejecutarOrdenDeRetiro();
 void finalizarPedido();
//metodos de pedido de donacion
 void agregarDonacion(DonacionDTO unaDonacion);
//metodos de visista
 void RegistrarVisita(String fecha, String hora, String cantidad, String tipo, String observaciones);
 void imprimirVisita(VisitaDTO unavisita);
 
}

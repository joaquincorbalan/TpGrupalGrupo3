package ar.edu.unrn.seminario.servicios;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unrn.seminario.repositorios.RepositorioVisitas;
import ar.edu.unrn.seminario.dtos.VisitaDTO;
import ar.edu.unrn.seminario.modelo.Visita;

public class ServicioVisita {

    public static List<VisitaDTO> obtenerVisitas() {
        List<Visita> visitas = RepositorioVisitas.obtenerVisitas();
        return visitas.stream()
                .map(v -> new VisitaDTO(v.getFecha(), v.getHora(), v.getCantidad(), v.getTipoBien(), v.getObservaciones()))
                .collect(Collectors.toList());
    }
    
    public static void agregarVisita(VisitaDTO dto) {
        Visita visita = new Visita(
                dto.getFecha(),
                dto.getHora(),
                dto.getCantidad(),
                dto.getTipoBien(),
                dto.getObservaciones()
        );
        RepositorioVisitas.agregar(visita);
    }

    public static void eliminarVisita(int fila) {
        RepositorioVisitas.eliminarVisita(fila);
    }
}

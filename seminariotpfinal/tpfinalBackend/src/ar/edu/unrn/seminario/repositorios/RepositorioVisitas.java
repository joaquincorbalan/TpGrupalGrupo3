package ar.edu.unrn.seminario.repositorios;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unrn.seminario.modelo.Visita;

public class RepositorioVisitas {
	private static List<Visita> visitas = new ArrayList<>();
	
	public static void agregar(Visita v) {
		visitas.add(v);
	}
	
	public static List<Visita> obtenerVisitas(){
		return visitas;
	}
	
	public static void eliminarVisita(int fila) {
		visitas.remove(fila);
	}
}

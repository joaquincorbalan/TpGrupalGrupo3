package ar.edu.unrn.seminario.dto;

public class VisitaDTO {
	private String fecha;
	private String hora;
	private String cantidad;
	private String tipo;
	private String observaciones;
	public VisitaDTO(String fecha, String hora, String cantidad, String tipo, String observaciones) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.observaciones = observaciones;
	}
	
	
	
}

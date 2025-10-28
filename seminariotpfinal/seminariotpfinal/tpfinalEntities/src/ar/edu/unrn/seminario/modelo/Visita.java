package ar.edu.unrn.seminario.modelo;
import java.sql.Time;
import java.util.Date;

public class Visita {
	private Date fecha;
	private Time hora;
	private int cantidad;
	private int tipo;
	private String observaciones;
	
	public Visita(Date fecha, Time hora, int cantidad, int tipo, String observaciones) {
		this.fecha = fecha;
		this.hora = hora;
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.observaciones = observaciones;
	}


	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

    public String getTipo() {
        switch (this.tipo) {
            case 1: return "Alimentos";
            case 2: return "Muebles";
            case 3: return "Ropa";
            case 4: return "Otro";
            default: return "Desconocido";
        }
        }
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String imprimirVisita() {
		return "Visita [fecha=" + fecha + ", hora=" + hora + ", cantidad=" + cantidad + ", tipo=" + tipo
				+ ", observaciones=" + observaciones + "]";
	}
	
	
}

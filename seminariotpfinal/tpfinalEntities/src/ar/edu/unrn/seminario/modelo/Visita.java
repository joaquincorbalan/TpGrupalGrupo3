package ar.edu.unrn.seminario.modelo;
import java.sql.Time;
import java.util.Date;

public class Visita {
	private static int nroVisita=0;
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
		Visita.nroVisita+=1; 
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
	/*public String imprimirVisita() {
		return "Visita [fecha=" + fecha + ", hora=" + hora + ", cantidad=" + cantidad + ", tipo=" + tipo
				+ ", observaciones=" + observaciones + "]";
	}*/
	 public StringBuffer imprimirVisita() {
	        StringBuffer s = new StringBuffer();
	        s.append("Visita " + Visita.nroVisita).append("\n");
	        s.append("Fecha de retiro: " + fecha).append("\n");
	        s.append("Hora de retiro: "+ hora).append("n");
	        s.append("Observaciones: " + observaciones).append("\n");
	        s.append("Tipo: " + getTipo()).append("\n");
	        return s;
	    }
}


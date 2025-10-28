package ar.edu.unrn.seminario.dtos;

import java.sql.Time;
import java.util.Date;

public class VisitaDTO {
	private Date fecha;
	private Time hora;
	private int cantidad;
	private String tipoBien;
	private String observaciones;
	
	public VisitaDTO() {
	}
	public VisitaDTO(Date fecha, Time hora, int cantidad, String tipoBien, String observaciones) {
		this.fecha = fecha;
		this.hora = hora;
		this.cantidad = cantidad;
		this.tipoBien = tipoBien;
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

    public String getTipoBienes() {
        return tipoBien;
    }

    public void setTipoBienes(String tipo) {
        this.tipoBien = tipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
	
	
}

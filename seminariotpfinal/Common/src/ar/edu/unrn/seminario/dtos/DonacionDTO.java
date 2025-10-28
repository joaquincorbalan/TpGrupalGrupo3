package ar.edu.unrn.seminario.dtos;
public class DonacionDTO {
	private int tipo;
	private double puntuacion;
	
	public DonacionDTO() {
	}
	
	public DonacionDTO(int tipo, double puntacion) {
	   this.tipo=tipo;
	   this.puntuacion=puntacion;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
}

// 
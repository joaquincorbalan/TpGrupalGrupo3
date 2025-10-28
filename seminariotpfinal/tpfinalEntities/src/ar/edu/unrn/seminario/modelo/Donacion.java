package ar.edu.unrn.seminario.modelo;

public class Donacion {
	public static final int TIPO_ALIMENTOS=1;
	public static final int TIPO_ROPA=2;
	public static final int TIPO_MUEBLE=3;
	public static final int TIPO_OTRO=4;
	private int tipo;
	private double puntuacion;
	public Donacion(int tipo, double puntacion) {
	   this.tipo=tipo;
	   this.puntuacion=puntacion;
	}
}

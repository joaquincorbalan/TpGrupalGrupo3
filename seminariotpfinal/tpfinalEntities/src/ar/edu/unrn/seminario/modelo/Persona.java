package ar.edu.unrn.seminario.modelo;

public abstract class Persona {
	protected int DNI;
	protected String nombre;
	protected String apellido;
	public Persona(int dNI, String nombre, String apellido) {
		this.DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
}

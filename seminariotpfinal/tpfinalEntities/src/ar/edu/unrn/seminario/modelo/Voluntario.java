package ar.edu.unrn.seminario.modelo;


public class Voluntario extends Persona{

	public Voluntario(int dNI, String nombre, String apellido) {
		super(dNI, nombre, apellido);
	}
	
	public String obtenerNombre() {
		return (this.nombre + " " + this.apellido); 
	}
	
}


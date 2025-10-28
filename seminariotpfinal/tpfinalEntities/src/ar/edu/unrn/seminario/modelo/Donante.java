package ar.edu.unrn.seminario.modelo;

public class Donante extends Persona{
	private Vivienda unaVivienda;
	
	public Donante(int dNI, String nombre, String apellido, Vivienda unaVivienda) {
		super(dNI, nombre, apellido);
		this.unaVivienda = unaVivienda;
	}
	public Vivienda getVivienda() {
		return this.unaVivienda;
	}
}
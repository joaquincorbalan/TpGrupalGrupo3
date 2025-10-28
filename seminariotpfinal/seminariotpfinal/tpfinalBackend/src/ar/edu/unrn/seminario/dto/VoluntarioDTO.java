package ar.edu.unrn.seminario.dto;

public class VoluntarioDTO {
private  int DNI;
private String nombre;
private String apellido;

public VoluntarioDTO(int dNI, String nombre, String apellido) {
	DNI = dNI;
	this.nombre = nombre;
	this.apellido = apellido;
}

}

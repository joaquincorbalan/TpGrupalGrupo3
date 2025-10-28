package ar.edu.unrn.seminario.dtos;

public class VoluntarioDTO {
private  int DNI;
private String nombre;
private String apellido;

public VoluntarioDTO() {
}

public VoluntarioDTO(int dNI, String nombre, String apellido) {
	DNI = dNI;
	this.nombre = nombre;
	this.apellido = apellido;
}

public int getDNI() {
	return DNI;
}

public void setDNI(int dNI) {
	DNI = dNI;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

}

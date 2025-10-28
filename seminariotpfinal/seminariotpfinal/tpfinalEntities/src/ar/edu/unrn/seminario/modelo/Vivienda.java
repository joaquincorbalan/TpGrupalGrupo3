package ar.edu.unrn.seminario.modelo;

public class Vivienda {
 private Direccion direccion; 
 private String barrio;
 private String zona;
 private Coordenada coordenada;
public Vivienda(String calle, int numero, String barrio, String zona, double d, double e){
	this.barrio = barrio;
	this.zona = zona;
	this.coordenada= new Coordenada(d, e);
	this.direccion = new Direccion(calle, numero);
	}
}

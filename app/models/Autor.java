package models;

import javax.persistence.Entity;

import play.db.jpa.*;


@Entity

public class Autor extends Model{
	private String nombre;
	private String apellido;
	private String edad;


public Autor(String nombre, String apellido, String edad){
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
}


}
package models;

import javax.persistence.Entity;

import play.db.jpa.*;


@Entity

public class Autor extends Model{
	public String nombre;
	public String apellido;
	public int edad;
	public String mail;
	public String password;
	


public Autor(String nombre, String apellido,int edad,String mail){
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
	this.mail=mail;
}

public String toString(){
	return nombre+" "+apellido;
}




}
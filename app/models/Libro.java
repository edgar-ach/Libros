package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
@Entity
public class Libro extends Model{
	public String titulo;
	public String numeroPaginas;
	public String categoria;
	@ManyToOne
	public Autor autor;	
	
	public String toString(){
		
		return titulo;
	}
}
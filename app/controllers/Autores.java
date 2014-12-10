package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Scope.RenderArgs;

import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import models.*;

public class Autores extends Controller {

    public static void index() {
    	List<Autor> autores=Autor.findAll();
    	render(autores);
        
    }
    
    public static void detallar(Long id ){
    	Autor autor=Autor.findById(id);
    	render (autor);

    }


   public static void search(String buscando){
	   	String var=buscando;	    
	   	//evitando error al recargar
	   	try{
	   		buscando=buscando.toLowerCase();
	    }catch(Exception ex){
	    	
	    }
	    
    	List<Autor> autores=Autor.find("lower(apellido) like ?","%"+buscando+"%").fetch(); 
    	renderTemplate("/Autores/index.html",var,autores);
     }
   
   
    public static void create(){  	
        
    	
    	render();
    }
    
    public static void postCreate(String nombre,String apellido,int edad,String mail){
    	Autor a1=new Autor(nombre,apellido,edad,mail);
    	a1.save();
        redirect("/autores");
        
    }
    
    
    public static void update(Long id){
    	Autor autor=Autor.findById(id);
    	render(autor);
    }
    
    public static void postUpdate(Long id,String nombre,String apellido,int edad,String mail){
    	Autor a1=Autor.findById(id);
    	a1.apellido=apellido;
    	a1.edad=edad;
    	a1.nombre=nombre;
    	a1.mail=mail;
    	a1.save();
    	redirect("/autores");
    	
    }
    
    public static void delete(Long id){
    	Autor a1=Autor.findById(id);
    	a1.delete();
    	redirect("/autores");
    }
    


}
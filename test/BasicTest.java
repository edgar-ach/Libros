import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

	/*
    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
    */
	 @Test
	public void crearRecuperarAutor(){
		
		//creando Usuario
		new Autor("Jose","Diaz",40,"jdiaz@gmail.com").save();
		
		//Recuperando Usuario
		Autor jose=Autor.find("byMail","jdiaz@gmail.com").first();
		
		assertNotNull(jose);
		assertEquals("Jose",jose.nombre);
		
		
	}

}

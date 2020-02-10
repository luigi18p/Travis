package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.Annuncio;
import domain.CatalogoPersonale;



public class UnitTest {   	

	
	@BeforeClass							//FONDAMENTALE: I METODI BEFORECLASS e AFTERCLASS DEVONO ESSERE STATIC!!!
	public static void setupGeneral() {
		System.out.println(" ");
	
	}
	
	@Before
	public void setupMethod() {
		System.out.println("\n ");
						//Posso creare oggetti (con operatore "new") da usare poi nei Test solo in BEFORE e non in BEFORECLASS
	}
	
	@Test
	public void test_SetElencoAnn() {
		Annuncio ann0 = new Annuncio (0, "gioa", null, 0, null);
		Annuncio ann1 = new Annuncio (1, "lui", null, 0, null);
		Annuncio ann2 = new Annuncio (2, "guest", null, 0, null);
		List<Annuncio> lista = new ArrayList<Annuncio>();
		lista.add(ann0);
		lista.add(ann1);
		lista.add(ann2);
		
		CatalogoPersonale cp = new CatalogoPersonale();
		cp.setElencoAnnunci(lista);
		int x = 2;
		assertEquals(3,x);
		
		
	}
	
	@Test
	public void test2_pass() {
		
		int y =3;
		assertEquals(3,y);
				
	}
	
	@Test
	public void test3_fail() {
		
		int z = 0;
		assertEquals(0,z);
		System.out.println("ammoorrr mijjj ");
		
			
	}
	
	@After
	public void TeardownMethod() {
		System.out.println("ciao ");
		
	}
	
	@AfterClass							//FONDAMENTALE: I METODI BEFORECLASS e AFTERCLASS DEVONO ESSERE STATIC!!!
	public static void TeardownGeneral() {
		System.out.println("\n ohi " );
		
		
	}
}

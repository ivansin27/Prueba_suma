//package suma;

//import static org.junit.Assert.*;

//import org.junit.Test;

public class SumaClaseTest {

	
	public static void main(String[] args){
		
		System.out.print("###  Suma Test  ###\n");
		System.out.print("\n\n");
		SumaClaseTest r=new SumaClaseTest();
		r.sumaPositivoNegativo();
		r.sumaPositivos();
		r.sumaNegativos();
		

	}
	   //@Test
	   public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	       SumaClase S = new SumaClase(2,3);
	      // assertTrue("Es correcta la suma",S.sumar() == 5);
	        //assertEquals("diferentes numeros",n1,n2);
	       System.out.printf("\nresultado");
	   }

	   //@Test
	   public void sumaNegativos() {
	       System.out.println("Sumando dos números negativos ...");
	       SumaClase S = new SumaClase(-2, -3);
	      // assertTrue(S.sumar() == -5);
	   }

	   //@Test
	   public void sumaPositivoNegativo() {
	       System.out.println("Sumando un número positivo y un número negativo ...");
	       SumaClase S = new SumaClase(2, -3);
	       //assertTrue(S.sumar() == -1);
	   }
}
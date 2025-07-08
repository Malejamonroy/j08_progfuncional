package interfaces;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrden {
	
	
//ESTE MECANISMO NO SE UTILIZA
	public static void main(String[] args) {
		
//	Set<String> set = new TreeSet<String>(new Comparator<String>() {   //es una inferfaz funcional 
//		public int compare(String o1, String o2) {	
//			return o1.length() - o2.length();
//		}
//		});
		
		
		//ahora hacemos lo de arriba con una exprecion lambal
//		
//		Set<String> set = new TreeSet<String> ((String o1, String o2) ->{
//			return o2.length() - o1.length();
//		});
		
		
		//ahora lo vamos achicar un poco mas:
		Set<String> set = new TreeSet<String> ((o1, o2) -> o2.length() - o1.length());
		//como sabemos lo que va a devolver puedo quitar el tipo de dato ya que esta definido afuera, tambien podemos quitar los {} el cuerpo del metodo
		//si el metodo tiene solo una linea puedes quitar el retour y quitar el punto y coma ;
		//si hay dos lineas de codigo si es obligacion hacerlo como el de arriba 
		//al TreeSet le estamoa pasando una funcion 
	
		
			
			set.add("uno");
			set.add("dos");
			set.add("tres");
			set.add("cuatro");
			set.add("cinco");
			set.add("seis");
			set.add("siete");
			set.add("AS");
			set.add("Zapato");
			set.add("ZAPATO");
			set.add("Ávila");
			set.add("ágil");
			
//			for(String s: set) {
//				System.out.println(s);
//			}
			 set.forEach((s) -> System.out.println(s));
			 
			 //otra exprecion lamdal
			 set.forEach(System.out::println); //en vez de ponerle la implementacion del metodo, le pongo un metodo que hace lo mismo de la implementacion
		
	}

}

package interfaces;

public interface EjemploInterfaz {
	
	static int numerito = 34; //tambien se puede ...preguntar???
	
	//Antes de java8, sólo existian métodos abstractos en una interfaz
	//java8 incorpora métodos estaticos y default
	//java11 incorpora métodos private
	
	// Métodos abstractos
	void procesa(String str);
	
	int otroProceso();
	
	// Métodos default: cualquier clase que implemente esta interface lo utilice y que se pueda sobre escrubir
	default void haceAlgo() {
		System.out.println("soy el método default");
		//un método con cuerpo
	}
	
	//Método static
	static void metodoEstatico() {
		System.out.println("yo soy estático");
	}
	
	//Métodos privados: que solo afectan a la logica de adentro 
	private String metodoPrivado() {
		return "soy privado";  //este se queja hay que hacer el método defaul para que funcione 
		
	}
	
	default void metodoDefaulUsaPrivate() {
		System.out.println(metodoPrivado());
		
	}
	//Métodos private static
	private static String metodoStatringPrivado() {
		return "soy privado y estatico";
		
	}
	static void metodoStaticUsaPrivate() {
		System.out.println(metodoStatringPrivado());
		
	}
}

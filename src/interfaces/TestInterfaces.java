package interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		
		//EjemploInterfaz INormal = //un objeto de una calse que implemente ejemplo interface
		EjemploInterfaz iNormal = new EjemploInterfaz() {
			
			@Override
			public void procesa(String str) {
				System.out.println("desde procesa      " + str);	
			}
			
			@Override
			public int otroProceso() {
				return 2025;
			}
		};
		
		iNormal.procesa("hola que tal");
		System.out.println(iNormal.otroProceso()); 
		
		MiInterfazFuncional iFuncional = new MiInterfazFuncional() {
			
			@Override
			public void haceAlgo() {
				System.out.println("Haciendo algo");
				
			}
		};
		iFuncional.haceAlgo();
		
		//PODEMOS UTILIZAR UNA EXPRESIÓN LAMBDA es una mecanismo para simplificar esto  new MiInterfazFuncional() {
																						//		
																						//		@Override
																						//		public void haceAlgo() {
																						//			
		//asi se hace una funcion lamda y solo sirve para las interfaces funcionales que tiene solo un metodo 																				//	};
		MiInterfazFuncional iFuncional2 = () -> { 
			//el cuerpo del metodo 
		System.out.println("soy haceAlgo desde lamda");	
		};
		
		iFuncional2.haceAlgo();
	}

}

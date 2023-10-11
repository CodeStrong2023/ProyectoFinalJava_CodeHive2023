package proyectoIntegrador;

public class CartaDigital {

	//Definimos los atributos de la clase, o caracteristicas. Basicamente son todas las variables que contendra el menu
	 	
		private String [] entradas;
		private double[] preciosEntradas ;
	    private int [] cantidadEntrada;
	    
	  /*  private String[] platosPrincipales = {"Milanesa","Lomito","Filette de salmon","Sorrentinos"};
	    private double[] preciosPlatosPrincipales = {3400,4100,6400,2900};
	    private int [] cantidadPlatosPrincipales;
	    
	    private String[] postres = {"Flan","Bombon escoces","Ensalada de frutas","Tiramisu"};
	    private double[] preciosPostres={1300,1500,900,2000};
	    private int [] cantidadPostres;
	    
	    private String[] bebidas = {"Agua sin Gas","Gaseosa","Vino de la casa","Cerveza"};
	    private double[] preciosBebidas={900,1000,2100,1200};
	    private int [] cantidadBebidas;*/
	
	
	
	//Armamos el constructor
	
	public CartaDigital() {
		
	entradas= new String[] {"Ensalada","Empanada","Bruschetta","Sopa"};
	preciosEntradas=new double [] {1250,700,1450,1900};
		
		}
	
	
public String dimeProductoPrecio() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
		
	for (int i = 0; i < entradas.length; i++) {
        System.out.println((i+1)+" - "+entradas[i] + "......... $" + preciosEntradas[i]); 
				
	}
	return "Menu de entradas";
	}

public void estableceCantidades() {
	
	while (i !=0) {
		
		
		
	}
}


}

	
	
	

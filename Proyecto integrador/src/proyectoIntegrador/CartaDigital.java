package proyectoIntegrador;
import java.util.Scanner;


public class CartaDigital {

	//Definimos los atributos de la clase, o caracteristicas. Basicamente son todas las variables que contendra el menu
	 	
		private String [] entradas;
		private double[] preciosEntradas ;
		int[] cantidadEntrada ;
	    
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
	
	System.out.println(" ------------ MENU ENTRADAS -----------");
	
	for (int i = 0; i < entradas.length; i++) {
        System.out.println((i+1)+" - "+entradas[i] + "......... $" + preciosEntradas[i]); 
				
	}
	System.out.println("0 - Volver al menu principal");

	
	return "Menu de entradas";
	}


public void cantidadEntrada() {//Setter establece cantidades entrada
	
	
	int opcionEntrada;
	cantidadEntrada=new int [4];
	
	Scanner opcionEntradaBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
	Scanner opcionCantidadBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
	
	System.out.println("Indique una opcion: ");
	opcionEntrada=Integer.parseInt(opcionEntradaBis.nextLine());
	
	
	
	do {
		
	
	
	switch (opcionEntrada) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
	   						{
	      
	   case 1:
           System.out.println("Has elegido "+entradas[0]+". Indique cantidad: ");
           cantidadEntrada[0]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[0]+" por "+cantidadEntrada[0]+" unidades.");
           dimeProductoPrecio();
           cantidadEntrada();
           
       case 2:
           System.out.println("Has elegido "+entradas[1]+". Indique cantidad: ");
           cantidadEntrada[1]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[1]+" por "+cantidadEntrada[1]+" unidades.");
           dimeProductoPrecio();
           cantidadEntrada();
           
       case 3:
    	   System.out.println("Has elegido "+entradas[2]+". Indique cantidad: ");
           cantidadEntrada[2]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[2]+" por "+cantidadEntrada[2]+" unidades.");
           dimeProductoPrecio();
           cantidadEntrada();
           
       case 4:
    	   System.out.println("Has elegido "+entradas[3]+". Indique cantidad: ");
           cantidadEntrada[3]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[3]+" por "+cantidadEntrada[3]+" unidades.");
           dimeProductoPrecio();
           cantidadEntrada();
              
       
       case 0:
           // Salir del bucle si se elige la opción 0
           System.out.println("Volviendo al menu principal");
          
           System.exit(0);
           
       default:
           System.out.println("Opción no válida. Por favor, elige del 0 al 5.");
           dimeProductoPrecio();
           cantidadEntrada();
	   }
	
	} while(opcionEntrada !=0);
	
	
}



}

	
	
	

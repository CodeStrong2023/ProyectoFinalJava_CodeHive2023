package proyectoIntegrador;
import javax.swing.JOptionPane;
import java.util.Scanner;

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
	
	System.out.println("Elige una opcion"); 
	
	return "Menu de entradas";
	}


public void cantidadEntrada() {//Setter establece cantidades entrada
	
	
	int opcionEntrada;
	Scanner opcionEntradaa=new Scanner(System.in);
	opcionEntrada=Integer.parseInt(opcionEntradaa.nextLine());
	
	   switch (opcionEntrada) {
	   
	   case 1:
           System.out.println("Has elegido "+entradas[0]);
           cantidadEntrada[opcionEntrada-1]=Integer.parseInt(JOptionPane.showInputDialog("Indique cantidad"));
           break;
           
       case 2:
    	   System.out.println("Has elegido "+entradas[1]);
           cantidadEntrada[opcionEntrada-1]=Integer.parseInt(JOptionPane.showInputDialog("Indique cantidad"));
           break;
           
       case 3:
    	   System.out.println("Has elegido "+entradas[2]);
           cantidadEntrada[opcionEntrada-1]=Integer.parseInt(JOptionPane.showInputDialog("Indique cantidad"));
           break;
           
       case 4:
    	   System.out.println("Has elegido "+entradas[3]);
           cantidadEntrada[opcionEntrada-1]=Integer.parseInt(JOptionPane.showInputDialog("Indique cantidad"));
           break;
       
       case 0:
           // Salir del bucle si se elige la opción 0
           System.out.println("Volviendo al menu principal");
          
           System.exit(0);
	   
	   }
       
	
	
}






}

	
	
	

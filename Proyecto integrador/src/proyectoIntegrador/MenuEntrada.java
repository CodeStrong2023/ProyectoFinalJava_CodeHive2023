package proyectoIntegrador;
import java.util.Scanner;


public class MenuEntrada extends CartaDigital {

	//Definimos los atributos de la clase, o caracteristicas. Basicamente son todas las variables que contendra el menu
	 	
		private String [] entradas;
		private double[] preciosEntradas ;
		public int[] cantidadEntrada ;	
	
	//Armamos el constructor
	
	public MenuEntrada() {
		
		entradas= new String[] {"Ensalada","Empanada","Bruschetta","Sopa"};
		preciosEntradas=new double [] {1250,700,1450,1900};
		cantidadEntrada=new int [4];
	}
	
	
public String dimeProductoPrecioEntrada() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
	
	System.out.println(" ------------ MENU ENTRADAS ----------- \n");
	
	for (int i = 0; i < entradas.length; i++) {
        System.out.println((i+1)+" - "+entradas[i] + "......... $" + preciosEntradas[i]); 
				
	}
	System.out.println("0 - Volver al menu principal \n");

	
	return "Menu de entradas";
	}


public void cantidadEntrada() {//Setter establece cantidades entrada
	
	
	int opcionEntrada;
	
	
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
           System.out.println("Usted ha seleccionado "+entradas[0]+" por "+cantidadEntrada[0]+" unidades. \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           
       case 2:
           System.out.println("Has elegido "+entradas[1]+". Indique cantidad: ");
           cantidadEntrada[1]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[1]+" por "+cantidadEntrada[1]+" unidades. \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           
       case 3:
    	   System.out.println("Has elegido "+entradas[2]+". Indique cantidad: ");
           cantidadEntrada[2]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[2]+" por "+cantidadEntrada[2]+" unidades. \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           
       case 4:
    	   System.out.println("Has elegido "+entradas[3]+". Indique cantidad: ");
           cantidadEntrada[3]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[3]+" por "+cantidadEntrada[3]+" unidades. \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
              
       
       case 0:
           // Salir del bucle si se elige la opción 0
           System.out.println("Volviendo al menu principal \n");
           dimeMenu();
         
           
       default:
           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
           dimeProductoPrecioEntrada();
           
	   }
	
	} while(opcionEntrada !=0);
	
	
}



}

	
	
	
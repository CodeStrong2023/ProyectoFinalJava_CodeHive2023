package proyectoIntegrador;
import java.util.Scanner;


public class MenuEntrada extends CartaDigital {

	//Definimos los atributos de la clase, o caracteristicas. Basicamente son todas las variables que contendra el menu
	 	
		private String [] entradas;
		private double[] preciosEntradas ;
		public static int[] cantidadEntrada=new int [4]; 
		public static double subtotalEntrada=0;
	
	//Armamos el constructor
	
	public MenuEntrada() {
		
		entradas= new String[] {"Ensalada","Empanada","Bruschetta","Sopa"};
		preciosEntradas=new double [] {1250,700,1450,1900};
		
	}
	
	
public String dimeProductoPrecioEntrada() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
	
	System.out.println(" ------------ MENU ENTRADAS ----------- \n");
	
	for (int i = 0; i < entradas.length; i++) {
        System.out.println((i+1)+" - "+entradas[i] + "......... $" + preciosEntradas[i]); 
				
	}
	
	System.out.println("5 - Ver pedido de entrada");
	System.out.println("0 - Volver al menu principal \n");

	
	return "Menu de entradas";
	}


public void cantidadEntrada() {//Setter establece cantidades entrada
	
	
	int opcionEntrada;
	
	
	Scanner opcionEntradaBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
	Scanner opcionCantidadBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
	
	System.out.println("Indique una opcion: ");
	
	opcionEntrada=Integer.parseInt(opcionEntradaBis.nextLine());
	
	
	
		
	
	
	switch (opcionEntrada) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
	   						{
	      
	   case 1:
		   
		 
           System.out.println("Has elegido "+entradas[0]+". Indique cantidad: ");
           cantidadEntrada[0]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[(opcionEntrada-1)]+" por "+cantidadEntrada[(opcionEntrada-1)]+" unidades por un subtotal de "+cantidadEntrada[(opcionEntrada-1)]*preciosEntradas[(opcionEntrada-1)] +". \n");
         
           
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           break;
           
       case 2:
           System.out.println("Has elegido "+entradas[1]+". Indique cantidad: ");
           cantidadEntrada[1]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[(opcionEntrada-1)]+" por "+cantidadEntrada[(opcionEntrada-1)]+" unidades por un subtotal de "+cantidadEntrada[(opcionEntrada-1)]*preciosEntradas[(opcionEntrada-1)] +". \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           break;
           
       case 3:
    	   System.out.println("Has elegido "+entradas[2]+". Indique cantidad: ");
           cantidadEntrada[2]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[(opcionEntrada-1)]+" por "+cantidadEntrada[(opcionEntrada-1)]+" unidades por un subtotal de "+cantidadEntrada[(opcionEntrada-1)]*preciosEntradas[(opcionEntrada-1)] +". \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           break;
           
       case 4:
    	   System.out.println("Has elegido "+entradas[3]+". Indique cantidad: ");
           cantidadEntrada[3]=Integer.parseInt(opcionCantidadBis.nextLine());
           System.out.println("Usted ha seleccionado "+entradas[(opcionEntrada-1)]+" por "+cantidadEntrada[(opcionEntrada-1)]+" unidades por un subtotal de "+cantidadEntrada[(opcionEntrada-1)]*preciosEntradas[(opcionEntrada-1)] +". \n");
           dimeProductoPrecioEntrada();
           cantidadEntrada();
           break;
              
       case 5:
    	   verPedidoEntrada();
    	   dimeProductoPrecioEntrada();
           cantidadEntrada();
           break;
           
       case 0:
           // Salir del bucle si se elige la opción 0
           System.out.println("Volviendo al menu principal \n");
           break;
         
           
       default:
           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
           dimeProductoPrecioEntrada();
           break;
           
	   }
	
	
	
	
}




public double verPedidoEntrada() {
	
	
	for (int i=0;i<entradas.length;i++) {
		
		if(cantidadEntrada[i]!=0) {
			
			System.out.println("Usted ha seleccionado: "+entradas[i]+" ----- "+cantidadEntrada[i]);
			
			subtotalEntrada=subtotalEntrada+cantidadEntrada[i]*preciosEntradas[i];
		}
		
		
	}
	
	return subtotalEntrada;
	
}	
public void anularPedidoEntrada() {
	
	
	for (int i=0;i<entradas.length;i++) {
		
		if(cantidadEntrada[i]!=0) {
			
			cantidadEntrada[i]=0;
			
			
		}
		
		
	}
	

}

}

	
	
	

package proyectoIntegrador;

import java.util.Scanner;

public class menuPrincipal extends CartaDigital {
	
	//Damos los atributos del menuPrincipal
	private String [] principal;
	private double[] preciosPrincipal ;
	int[] cantidadPrincipal ;

	
public menuPrincipal() {//Constructor del menu principal
		
		principal= new String[] {"Milanea","Lomito","Ravioles con salsa","Sanguche veggie"};
		preciosPrincipal=new double [] {3500,4100,3150,2700};
		
	}



public String dimeProductoPrecioPrincipal() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
	
	System.out.println(" --------- PLATOS PRINCIPALES -------");
	
	for (int i = 0; i < principal.length; i++) {
        System.out.println((i+1)+" - "+principal[i] + "......... $" + preciosPrincipal[i]); 
				
	}
	System.out.println("0 - Volver al menu principal");

	
	return "Menu de platos principales";
	}


public void cantidadPrincipal() {//Setter establece cantidades principal
	
	
	int opcionPrincipal;
	cantidadPrincipal=new int [4];
	
	Scanner opcionPrincipalBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
	Scanner opcionCantidadPrincipalBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
	
	System.out.println("Indique una opcion: ");
	opcionPrincipal=Integer.parseInt(opcionPrincipalBis.nextLine());
	
	
	
	do {
		
	
	
	switch (opcionPrincipal) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
	   						{
	      
	   case 1:
           System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades.");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
         
       case 2:
    	   System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades.");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           
       case 3:
    	   System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades.");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           
       case 4:
    	   System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades.");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
       
       case 0:
           // Salir del bucle si se elige la opción 0
           System.out.println("Volviendo al menu principal");
          
           System.exit(0);
           
       default:
           System.out.println("Opción no válida. Por favor, elige del 0 al 5.");
           dimeProductoPrecioPrincipal();
           cantidadEntrada();
	   }
	
	} while(opcionPrincipal !=0);
	
	
}



}

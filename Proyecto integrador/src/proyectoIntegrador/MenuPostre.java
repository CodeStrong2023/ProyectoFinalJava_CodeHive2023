package proyectoIntegrador;

import java.util.Scanner;


public class MenuPostre extends CartaDigital {
	
    	//Damos los atributos del menuPrincipal
		private String [] postre;
		private double[] preciosPostre ;
		int[] cantidadPostre ;

		
	public MenuPostre() {//Constructor del menu principal
			
			postre= new String[] {"Flan","Helado a eleccion","Cheescake","Ensalada de frutas"};
			preciosPostre=new double [] {1300,1600,1800,950};
			cantidadPostre = new int [4];
		}



	public String dimeProductoPrecioPostre() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
		
		System.out.println(" --------- POSTRES ------- \n");
		
		for (int i = 0; i < postre.length; i++) {
	        System.out.println((i+1)+" - "+postre[i] + "......... $" + preciosPostre[i]); 
					
		}
		System.out.println("0 - Volver al menu principal \n");

		
		return "Menu de Postres";
		}


	public void cantidadPostre() {//Setter establece cantidades principal
		
		
		int opcionPostre;
		
		
		Scanner opcionPostreBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
		Scanner opcionCantidadPostreBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
		
		System.out.println("Indique una opcion: ");
		opcionPostre=Integer.parseInt(opcionPostreBis.nextLine());
		
		
		
		do {
			
		
		
		switch (opcionPostre) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
		   						{
		      
		   case 1:
	           System.out.println("Has elegido "+postre[(opcionPostre-1)]+". Indique cantidad: ");
	           cantidadPostre[(opcionPostre-1)]=Integer.parseInt(opcionPostreBis.nextLine());
	           System.out.println("Usted ha seleccionado "+postre[(opcionPostre-1)]+" por "+cantidadPostre[(opcionPostre-1)]+" unidades. \n");
	           dimeProductoPrecioPostre();
	           cantidadPostre();
	       
	       case 2:
	    	   System.out.println("Has elegido "+postre[(opcionPostre-1)]+". Indique cantidad: ");
	           cantidadPostre[(opcionPostre-1)]=Integer.parseInt(opcionPostreBis.nextLine());
	           System.out.println("Usted ha seleccionado "+postre[(opcionPostre-1)]+" por "+cantidadPostre[(opcionPostre-1)]+" unidades. \n");
	           dimeProductoPrecioPostre();
	           cantidadPostre();
	           
	       case 3:
	    	   System.out.println("Has elegido "+postre[(opcionPostre-1)]+". Indique cantidad: ");
	           cantidadPostre[(opcionPostre-1)]=Integer.parseInt(opcionPostreBis.nextLine());
	           System.out.println("Usted ha seleccionado "+postre[(opcionPostre-1)]+" por "+cantidadPostre[(opcionPostre-1)]+" unidades. \n");
	           dimeProductoPrecioPostre();
	           cantidadPostre();
	           
	       case 4:
	    	   System.out.println("Has elegido "+postre[(opcionPostre-1)]+". Indique cantidad: ");
	           cantidadPostre[(opcionPostre-1)]=Integer.parseInt(opcionPostreBis.nextLine());
	           System.out.println("Usted ha seleccionado "+postre[(opcionPostre-1)]+" por "+cantidadPostre[(opcionPostre-1)]+" unidades. \n");
	           dimeProductoPrecioPostre();
	           cantidadPostre();
	       
	       case 0:
	           // Salir del bucle si se elige la opción 0
	           System.out.println("Volviendo al menu principal \n");
	          
	           dimeMenu(null,null,null,null);
	           
	       default:
	           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
	           dimeProductoPrecioPostre();
	           cantidadPostre();
		   }
		
		} while(opcionPostre !=0);
		
	}	
}

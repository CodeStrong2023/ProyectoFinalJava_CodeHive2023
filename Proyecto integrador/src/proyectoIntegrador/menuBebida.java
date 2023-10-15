package proyectoIntegrador;

import java.util.Scanner;

public class menuBebida extends CartaDigital{

        	//Damos los atributos del menuPrincipal
			private String [] bebida;
			private double[] preciosBebida ;
			int[] cantidadBebida ;

			
		public menuBebida() {//Constructor del menu principal
				
				bebida= new String[] {"Agua sin Gas","Cerveza","Vino de la casa","Gaseosa"};
				preciosBebida=new double [] {900,1300,1900,1050};
				
			}



		public String dimeProductoPrecioBebida() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
			
			System.out.println(" --------- BEBIDAS -------");
			
			for (int i = 0; i < bebida.length; i++) {
		        System.out.println((i+1)+" - "+bebida[i] + "......... $" + preciosBebida[i]); 
						
			}
			System.out.println("0 - Volver al menu principal");

			
			return "Menu de Bebidas";
			}


		public void cantidadBebida() {//Setter establece cantidades principal
			
			
			int opcionBebida;
			cantidadBebida = new int [4];
			
			Scanner opcionBebidaBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
			Scanner opcionCantidadBebidaBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
			
			System.out.println("Indique una opcion: ");
			opcionBebida=Integer.parseInt(opcionBebidaBis.nextLine());
			
			
			
			do {
				
			
			
			switch (opcionBebida) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
			   						{
			      
			   case 1:
		           System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades.");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		       
		       case 2:
		    	   System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades.");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		           
		       case 3:
		    	   System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades.");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		           
		       case 4:
		    	   System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades.");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		       
		       case 0:
		           // Salir del bucle si se elige la opción 0
		           System.out.println("Volviendo al menu principal");
		          
		           System.exit(0);
		           
		       default:
		           System.out.println("Opción no válida. Por favor, elige del 0 al 5.");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
			   }
			
			} while(opcionBebida !=0);
			
		}	
	}


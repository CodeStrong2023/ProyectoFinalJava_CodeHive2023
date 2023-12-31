package proyectoIntegrador;

import java.util.Scanner;//Para poder otorgar variables en consola clase Scanner

public class MenuBebida extends CartaDigital{

	//Damos los atributos del menuPrincipal
	//Generamos arreglos que estan relacionados en cuanto a posicion con otro,
	//es decir, posicion 0 de bebida corresponde a posicion 0 de precio y a pos 0 de cantidad y subtotal
        	
			private String [] bebida; //Con los modificadores private nos aseguramos que
			//solo se pueda modificar estas variables desde la clase correspondiente.
			//(Encapsulacion de variable)
			private double[] preciosBebida ;
			public static int[] cantidadBebida= new int [4]; //al ser estatica permite almacenar el valor cuando vos te salis de la clase
			public static double[] subtotalBebida= new double[4];//idem variable anterior
			public double subtotalBebidaTotal;
			
			
			
		public MenuBebida() {//Constructor del menu principal
				
				bebida= new String[] {"Agua sin Gas","Cerveza","Vino de la casa","Gaseosa"};
				preciosBebida=new double [] {900,1300,1900,1050};
				
			}



		public String dimeProductoPrecioBebida() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
			
			System.out.println(" --------- BEBIDAS --------- \n");
			
			//Con el bucle se recorre automaticamente. Si hubieran 50 bebidas, recorre 50 posiciones
			for (int i = 0; i < bebida.length; i++) {//Recorriendo el ciclo, podemos mostrar el contenido de las listas
		        System.out.println((i+1)+" - "+bebida[i] + "......... $" + preciosBebida[i]); 
						
			}
			
			System.out.println("5 - Ver pedido de bebidas");
			System.out.println("0 - Volver al menu principal \n");

			
			return "Menu de Bebidas";//
			}


		public void cantidadBebida() {//Setter establece cantidades principal
			
			
			int opcionBebida;//variable que se declara dentro del metodo y solo se puede ver dentro del mismo
			
			
			Scanner opcionBebidaBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
			Scanner opcionCantidadBebidaBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
			
			System.out.println("Indique una opcion: ");
			opcionBebida=Integer.parseInt(opcionBebidaBis.nextLine());
			
			
			
		
			
			
			switch (opcionBebida) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
			   						{
			      
			   case 1:
				   
				  
				   subtotalBebida[opcionBebida-1]=0;//Cada vez que ingresamos a el case1, el valor subtotal de la posicion 0 se resetea a 0
		           System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");//Muestra en pantalla lo seleccionado
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades por un subtotal de $"+cantidadBebida[(opcionBebida-1)]*preciosBebida[(opcionBebida-1)] +". \n");
		           dimeProductoPrecioBebida();//vuelve a leer el metodo y nos indica los productos
		           cantidadBebida();
		           break;
		       
		       case 2:
		    	   
		    	
		    	   subtotalBebida[opcionBebida-1]=0;
		    	   System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades por un subtotal de $"+cantidadBebida[(opcionBebida-1)]*preciosBebida[(opcionBebida-1)] +". \n");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		           break;
		           
		       case 3:
		    	   
		    	   subtotalBebida[opcionBebida-1]=0;
		    	   System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades por un subtotal de $"+cantidadBebida[(opcionBebida-1)]*preciosBebida[(opcionBebida-1)] +". \n");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		           break;
		           
		       case 4:
		    	   
		    	   subtotalBebida[opcionBebida-1]=0;
		    	   System.out.println("Has elegido "+bebida[(opcionBebida-1)]+". Indique cantidad: ");
		           cantidadBebida[(opcionBebida-1)]=Integer.parseInt(opcionBebidaBis.nextLine());
		           System.out.println("Usted ha seleccionado "+bebida[(opcionBebida-1)]+" por "+cantidadBebida[(opcionBebida-1)]+" unidades por un subtotal de $"+cantidadBebida[(opcionBebida-1)]*preciosBebida[(opcionBebida-1)] +". \n");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		           break;
		         
		       case 5:
		    	   verPedidoBebida();
		    	   dimeProductoPrecioBebida();
		           cantidadBebida();
		           break;
		       
		       case 0:
		           // Salir del bucle si se elige la opción 0
		           System.out.println("Volviendo al menu principal \n");
		           break;
		           
		     
		           
		       default:
		           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
		           dimeProductoPrecioBebida();
		           cantidadBebida();
		           break;
			   }
			
			
			
			
			
			
		}	
		
		
		public double verPedidoBebida() {//Getter que muestra el pedido
			
			
			for (int i=0;i<bebida.length;i++) {//a traves del bucle, recorre el arreglo cantidadBebida[]
				
				if(cantidadBebida[i]!=0) {
					
					System.out.println("Usted ha seleccionado: "+bebida[i]+" ----- "+cantidadBebida[i]+" unidad/es.\n");
					subtotalBebida[i]=cantidadBebida[i]*preciosBebida[i];//es el subtotal de cada bebida posicion x posicion
					
				}
				
				
			}
			
			//System.out.println("Subtotal bebidas ---------- $"+subtotalBebida);
			
			return subtotalBebidaTotal=subtotalBebida[0]+subtotalBebida[1]+subtotalBebida[2]+subtotalBebida[3];
			
		}	
		
	public void anularPedidoBebida() {
			
			
			for (int i=0;i<bebida.length;i++) {
				
				if(cantidadBebida[i]!=0) {
					
					cantidadBebida[i]=0;
					
					
				}
				
				
			}
			
			
	 
	 
		
	}
		
		
		
		
		
		
	}




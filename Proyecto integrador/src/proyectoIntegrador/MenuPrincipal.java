package proyectoIntegrador;

import java.util.Scanner;

public class MenuPrincipal extends CartaDigital {
	
	//Damos los atributos del menuPrincipal
	private String [] principal;
	private double[] preciosPrincipal ;
	public static int[] cantidadPrincipal=new int [4]; 
    public static double [] subtotalPrincipal=new double [4];
    public double subtotalPrincipalTotal;

	
public MenuPrincipal() {//Constructor del menu principal
		
		principal= new String[] {"Milanesa","Lomito","Ravioles con salsa","Sanguche veggie"};
		preciosPrincipal=new double [] {3500,4100,3150,2700};
		
	}



public String dimeProductoPrecioPrincipal() { //GETTER Al llamar este metodo nos mostrará los datos precargados en el constructor
	
	System.out.println(" --------- PLATOS PRINCIPALES -------\n");
	
	for (int i = 0; i < principal.length; i++) {
        System.out.println((i+1)+" - "+principal[i] + "......... $" + preciosPrincipal[i]); 
				
	}
	System.out.println("5 - Ver pedido de plato principal");
	System.out.println("0 - Volver al menu principal \n");

	
	return "Menu de platos principales";
	}


public void cantidadPrincipal() {//Setter establece cantidades principal
	
	
	int opcionPrincipal;
	
	
	Scanner opcionPrincipalBis=new Scanner(System.in);//esta opcion de consola elige una de las 4 opciones de entrada
	Scanner opcionCantidadPrincipalBis=new Scanner(System.in);//Esta opcion de consola settea cantidades
	
	System.out.println("Indique una opcion: ");
	opcionPrincipal=Integer.parseInt(opcionPrincipalBis.nextLine());
	
	
	
	
	
	
	switch (opcionPrincipal) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
	   						{
	      
	   case 1:
		   subtotalPrincipal[opcionPrincipal-1]=0;
           System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades por un subtotal de $"+cantidadPrincipal[(opcionPrincipal-1)]*preciosPrincipal[(opcionPrincipal-1)] +". \n");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           break;
         
       case 2:
    	   subtotalPrincipal[opcionPrincipal-1]=0;
    	   System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades por un subtotal de $"+cantidadPrincipal[(opcionPrincipal-1)]*preciosPrincipal[(opcionPrincipal-1)] +". \n");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           break;
           
       case 3:
    	   subtotalPrincipal[opcionPrincipal-1]=0;
    	   System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades por un subtotal de $"+cantidadPrincipal[(opcionPrincipal-1)]*preciosPrincipal[(opcionPrincipal-1)] +". \n");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           break;
           
       case 4:
    	   subtotalPrincipal[opcionPrincipal-1]=0;
    	   System.out.println("Has elegido "+principal[(opcionPrincipal-1)]+". Indique cantidad: ");
           cantidadPrincipal[(opcionPrincipal-1)]=Integer.parseInt(opcionPrincipalBis.nextLine());
           System.out.println("Usted ha seleccionado "+principal[(opcionPrincipal-1)]+" por "+cantidadPrincipal[(opcionPrincipal-1)]+" unidades por un subtotal de $"+cantidadPrincipal[(opcionPrincipal-1)]*preciosPrincipal[(opcionPrincipal-1)] +". \n");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           break;
           
       case 5:
    	   verPedidoPrincipal();
    	   dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           break;
           
       case 0:
           // Salir del bucle si se elige la opción 0
           System.out.println("Volviendo al menu principal \n");
          break;
          
           
       default:
           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
           dimeProductoPrecioPrincipal();
           cantidadPrincipal();
           break;
	   }
	
	
	
	
}

public double verPedidoPrincipal() {
	
	//subtotalPrincipalTotal=0; habria que probar si metiendo el return dentro del if con subtotalPrincipalTotal=subtotalPrincipalTotal+subtotalPrincipal[i]
	for (int i=0;i<principal.length;i++) {
		
		if(cantidadPrincipal[i]!=0) {
			
			System.out.println("Usted ha seleccionado: "+principal[i]+" ----- "+cantidadPrincipal[i]+" unidad/es.\n");
			subtotalPrincipal[i]=cantidadPrincipal[i]*preciosPrincipal[i];
			
			
		}
		
		
	}
	
	return subtotalPrincipalTotal=subtotalPrincipal[0]+subtotalPrincipal[1]+subtotalPrincipal[2]+subtotalPrincipal[3];
	
}	

public void anularPedidoPrincipal() {
	
	
	for (int i=0;i<principal.length;i++) {
		
		if(cantidadPrincipal[i]!=0) {
			
			cantidadPrincipal[i]=0;
			
			
		}
		
		
	}
	

}

}

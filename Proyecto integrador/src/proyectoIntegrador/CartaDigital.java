package proyectoIntegrador;
import java.util.Scanner;

public class CartaDigital {
	
	int opcionMenu;

	public CartaDigital() {//Constructor vacio
		
	
	}
	
	//Para poder ver los metodos de un objeto desde una clase que no es la main
	//debemos meter en el argumento del metodo a los objetos. Eso se hace de la siguiente forma:
	//nombre de la clase y nombre del objeto
	public String dimeMenu(MenuEntrada menuEntrada, MenuPrincipal menuPrincipal, MenuPostre menuPostre, MenuBebida menuBebida) {  //GETTER Muestra las opciones posibles del menu principal
		
		
		System.out.println(" --------- NUESTRO MENU --------- \n");
		System.out.println("1 - Entradas ");
		System.out.println("2 - Platos Principales ");
		System.out.println("3 - Postres ");
		System.out.println("4 - Bebidas ");
		System.out.println("5 - Ver Pedido ");
		System.out.println("6 - Anular Pedido ");
		System.out.println("7 - Finalizar Pedido ");
		System.out.println("8 - Salir  \n");
		
		System.out.println("Elija una opcion");
		
		Scanner opcionMenuBis=new Scanner(System.in);
		opcionMenu=Integer.parseInt(opcionMenuBis.nextLine());
		
		do {
		
		switch (opcionMenu) //Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
		   						{
		      
		   case 1:
				menuEntrada.dimeProductoPrecioEntrada();//Getter menu entrada
				menuEntrada.cantidadEntrada();//setter clase entrada
	       
	       case 2:
	    	    menuPrincipal.dimeProductoPrecioPrincipal();
			    menuPrincipal.cantidadPrincipal();
	           
	       case 3:
	    	    menuPostre.dimeProductoPrecioPostre();
				menuPostre.cantidadPostre();
	           
	       case 4:
	    	    menuBebida.dimeProductoPrecioBebida();
	    	    menuBebida.cantidadBebida();
	       
	       case 0:
	           // Salir del bucle si se elige la opción 0
	           System.out.println("Lo esperamos pronto");
	          
	          
	           
		    default:
		           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
		          
	           
		} 

		}while(opcionMenu !=0);
		return "Menu";
	}
	
}

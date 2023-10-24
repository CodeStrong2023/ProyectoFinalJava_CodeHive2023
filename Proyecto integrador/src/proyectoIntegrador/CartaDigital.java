package proyectoIntegrador;
import java.util.Scanner;

public class CartaDigital {
	
	int opcionMenu;
	int borrar;
	
	
	public CartaDigital() {//Constructor vacio
		

	}
	
	//Para poder ver los metodos de un objeto desde una clase que no es la main
	//debemos meter en el argumento del metodo a los objetos. Eso se hace de la siguiente forma:
	//nombre de la clase y nombre del objeto
	public String dimeMenu( ) {  //GETTER Muestra las opciones posibles del menu principal
		
		MenuEntrada menuEntrada = new MenuEntrada();//instanciamos objeto menu entrada
		MenuPrincipal menuPrincipal= new MenuPrincipal();//instanciamos objeto menu plato principal
		MenuPostre menuPostre = new MenuPostre();//Instanciamos objeto menu postre
		MenuBebida menuBebida = new MenuBebida();
		
		
		System.out.println(" --------- NUESTRO MENU --------- \n");
		System.out.println("1 - Entradas ");
		System.out.println("2 - Platos Principales ");
		System.out.println("3 - Postres ");
		System.out.println("4 - Bebidas ");
		System.out.println("5 - Ver Pedido ");
		System.out.println("6 - Anular Pedido ");
		System.out.println("7 - Finalizar Pedido ");
		System.out.println("0 - Salir  \n");
		
		System.out.println("Elija una opcion");
		
		Scanner opcionMenuBis=new Scanner(System.in);
		opcionMenu=Integer.parseInt(opcionMenuBis.nextLine());
		
			
		
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
	    	    
	    	    
	       case 5:
	    	  
	    	  
	    	   menuEntrada.verPedidoEntrada();
	    	   menuPrincipal.verPedidoPrincipal();
	    	   menuBebida.verPedidoBebida();
	    	   menuPostre.verPedidoPostre();
	    	   dimeMenu();
	    	   
	       case 6:
	    	  
	    	   do {  
	    	System.out.println(" --------- ANULAR PEDIDO --------- \n");
	   		System.out.println("1 - Anular Entradas ");
	   		System.out.println("2 - Anular Platos Principales ");
	   		System.out.println("3 - Anular Bebidas ");
	   		System.out.println("4 - Anular Postres ");
	   		System.out.println("5 - Anular todo el pedido ");
	   		System.out.println("0 - Volver al Menu ");
	   		
	    	      	   
	   		Scanner opcionBorrarBis=new Scanner(System.in);
			borrar=Integer.parseInt(opcionBorrarBis.nextLine());
	    		   
	    		   
	    		   switch (borrar) {
	    		   
	    		   case 1:
	    			   menuEntrada.anularPedidoEntrada();
	    			   System.out.println("Sus pedidos de Entrada han sido anulados ");
	    			   dimeMenu();
	    		   case 2:
	    			   menuPrincipal.anularPedidoPrincipal();
	    			   System.out.println("Sus pedidos de Plato Principal han sido anulados ");
	    			   dimeMenu();
	    		   case 3:
	    			   menuBebida.anularPedidoBebida();
	    			   System.out.println("Sus pedidos de Bebidas han sido anulados ");
	    			   dimeMenu();
	    		   case 4:
	    			   menuPostre.anularPedidoPostre();
	    			   System.out.println("Sus pedidos de Postre han sido anulados ");
	    			   dimeMenu();
	    			   
	    		   case 5:
	    			   menuEntrada.anularPedidoEntrada();
	    			   menuPrincipal.anularPedidoPrincipal();
	    			   menuBebida.anularPedidoBebida();
	    			   menuPostre.anularPedidoPostre();
	    			   System.out.println("Todos sus pedidos han sido anulados ");
	    			   dimeMenu();
	    		   default:
			           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
			           break;
	    		   case 0:
	    			   dimeMenu();
	    		   }
	    		   }while(borrar!=0);
	    		   
	    		  
		    	   
	       case 7:
	    	   
	    	   System.out.println("RESUMEN DE PEDIDO");
	    	   menuEntrada.verPedidoEntrada();
	    	   menuPrincipal.verPedidoPrincipal();
	    	   menuBebida.verPedidoBebida();
	    	   menuPostre.verPedidoPostre();
	    	   
	    	   double subtotal=menuBebida.subtotalBebida+menuEntrada.subtotalEntrada+menuPostre.subtotalPostre+menuPrincipal.subtotalPrincipal;
	    	   System.out.println("El total de su pedido es de "+subtotal+"$");
	    	   System.out.println("Su pedido sera enviado tan pronto como sea posible");
	    	   break;  
	    	  
	       
	       case 0:
	           // Salir del bucle si se elige la opción 0
	           System.out.println("Lo esperamos pronto");
	           break;
	          
	           
		    default:
		           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
		          dimeMenu();
	           
		} 

		
		return "Menu";
	}
	

	
	
	
}

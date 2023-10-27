package proyectoIntegrador;
import java.util.Scanner;

public class UsoCartaDigital {

	public static void main(String[] args) {
		
		int opcionMenu;
		int borrar;
		
		
		
		
		System.out.println("Bienvenido a la Carta Virtual de CODEHIVE!!!\n");
		
	
		MenuEntrada menuEntrada = new MenuEntrada();//instanciamos objeto menu entrada
		MenuPrincipal menuPrincipal= new MenuPrincipal();//instanciamos objeto menu plato principal
		MenuPostre menuPostre = new MenuPostre();//Instanciamos objeto menu postre
		MenuBebida menuBebida = new MenuBebida();//Instanciamos objeto menu bebida
	    CartaDigital cartaDigital= new CartaDigital();//Instanciamos objeto que se conforma de los objetos anteriores.
		
	//Se ponen en los argumentos los objetos para poder ver las propiedades del mismo
	//desde otra clase que no es la main. Tambine se podria haber hecho poniendo estos
	//mismos argumentos dentro del objeto CartaDigital() y pasando dichas propiedades a
	//su constructor. Es mas o menos lo mismo. A esto se lo conoce como "composicion".
	
		
		
		
		
		
		do	{
			System.out.println(cartaDigital.dimeMenu());
			
			Scanner opcionMenuBis=new Scanner(System.in);
			opcionMenu=Integer.parseInt(opcionMenuBis.nextLine());
		
		switch (opcionMenu) {//Segun la opcion que elija, sera la posicion dela rray cantidadEntrada[] que se llene
		   				
		      
		   case 1:
				menuEntrada.dimeProductoPrecioEntrada();//Getter menu entrada
				menuEntrada.cantidadEntrada();//setter clase entrada
				break;
	       
	       case 2:
	    	    menuPrincipal.dimeProductoPrecioPrincipal();
			    menuPrincipal.cantidadPrincipal();
			    break;
	           
	       case 3:
	    	    menuPostre.dimeProductoPrecioPostre();
				menuPostre.cantidadPostre();
				break;
	           
	       case 4:
	    	    menuBebida.dimeProductoPrecioBebida();
	    	    menuBebida.cantidadBebida();
	    	    break;
	    	    
	       case 5:
	    	  
	    	  
	    	//   menuEntrada.verPedidoEntrada();
	    	//   menuPrincipal.verPedidoPrincipal();
	    	 //  menuBebida.verPedidoBebida();
	    	 //  menuPostre.verPedidoPostre();
	    	   double subtotalVerPedido=menuBebida.verPedidoBebida()+menuPrincipal.verPedidoPrincipal()+menuPostre.verPedidoPostre()+menuEntrada.verPedidoEntrada();
	    	   System.out.println("El total de su pedido es de "+subtotalVerPedido+"$\n");
	    	   break;
	    	   
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
	    			   System.out.println("Sus pedidos de Entrada han sido anulados \n");
	    			   break;
	    		   case 2:
	    			   menuPrincipal.anularPedidoPrincipal();
	    			   System.out.println("Sus pedidos de Plato Principal han sido anulados \n");
	    			   break;
	    		   case 3:
	    			   menuBebida.anularPedidoBebida();
	    			   System.out.println("Sus pedidos de Bebidas han sido anulados \n");
	    			   break;
	    		   case 4:
	    			   menuPostre.anularPedidoPostre();
	    			   System.out.println("Sus pedidos de Postre han sido anulados \n");
	    			   break;
	    			   
	    		   case 5:
	    			   menuEntrada.anularPedidoEntrada();
	    			   menuPrincipal.anularPedidoPrincipal();
	    			   menuBebida.anularPedidoBebida();
	    			   menuPostre.anularPedidoPostre();
	    			  
	    			   
	    			   System.out.println("Todos sus pedidos han sido anulados \n");
	    			  
	    		   default:
			           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
			           break;
	    		   case 0:
	    			   break;
	    		   }
	    		   }while(borrar!=0);
	    		   
	    		  
		    	   
	       case 7:
	    	   
	    	   System.out.println("RESUMEN DE PEDIDO \n");
	    	 // menuEntrada.verPedidoEntrada();
	    	  // menuPrincipal.verPedidoPrincipal();
	    	  // menuBebida.verPedidoBebida();
	    	 //  menuPostre.verPedidoPostre();
	    	   
	    	   double subtotal=menuBebida.verPedidoBebida()+menuPrincipal.verPedidoPrincipal()+menuPostre.verPedidoPostre()+menuEntrada.verPedidoEntrada();
	    	   
	    	   System.out.println("El total de su pedido es de "+subtotal+"$");
	    	   System.out.println("Su pedido sera enviado tan pronto como sea posible");
	    	   break;  
	    	  
	       
	       case 0:
	           // Salir del bucle si se elige la opción 0
	           System.out.println("Lo esperamos pronto");
	           break;
	          
	           
		    default:
		           System.out.println("Opción no válida. Por favor, elige del 0 al 5. \n");
		          break;
	           
		} 

		
		
	} while(opcionMenu !=7);
	


		
	}

	
	
}

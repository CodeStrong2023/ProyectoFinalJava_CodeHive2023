package proyectoIntegrador;
import java.util.Scanner;

public class CartaDigital {
	
	
	
	
	
	public CartaDigital() {//Constructor vacio
		

	}
	
	//Para poder ver los metodos de un objeto desde una clase que no es la main
	//debemos meter en el argumento del metodo a los objetos. Eso se hace de la siguiente forma:
	//nombre de la clase y nombre del objeto
	public String dimeMenu( ) {  //GETTER Muestra las opciones posibles del menu principal
		
		
		
		
		System.out.println(" --------- NUESTRO MENU --------- \n");
		System.out.println("1 - Entradas ");
		System.out.println("2 - Platos Principales ");
		System.out.println("3 - Postres ");
		System.out.println("4 - Bebidas ");
		System.out.println("5 - Ver Pedido ");
		System.out.println("6 - Anular Pedido ");
		System.out.println("7 - Finalizar Pedido ");
		System.out.println("0 - Salir  \n");
		
		
		
		return "Elija una opcion";
	
	}
	
}

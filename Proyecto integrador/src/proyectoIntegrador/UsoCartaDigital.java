package proyectoIntegrador;

public class UsoCartaDigital {

	public static void main(String[] args) {
		
		int opcionMenuPrincipal;
		
		System.out.println("Bienvenido a la Carta Virtual de CODEHIVE");
		
	
		MenuEntrada menuEntrada = new MenuEntrada();//instanciamos objeto menu entrada
		MenuPrincipal menuPrincipal= new MenuPrincipal();//instanciamos objeto menu plato principal
		MenuPostre menuPostre = new MenuPostre();//Instanciamos objeto menu postre
		MenuBebida menuBebida = new MenuBebida();//Instanciamos objeto menu bebida
		CartaDigital cartaDigital= new CartaDigital();//Instanciamos objeto que se conforma de los objetos anteriores.
		
	//Se ponen en los argumentos los objetos para poder ver las propiedades del mismo
	//desde otra clase que no es la main. Tambine se podria haber hecho poniendo estos
	//mismos argumentos dentro del objeto CartaDigital() y pasando dichas propiedades a
	//su constructor. Es mas o menos lo mismo. A esto se lo conoce como "composicion".
	
		cartaDigital.dimeMenu();
		

		
	}

	

}

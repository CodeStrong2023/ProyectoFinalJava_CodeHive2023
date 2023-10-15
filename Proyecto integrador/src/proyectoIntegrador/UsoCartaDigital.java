package proyectoIntegrador;

public class UsoCartaDigital {

	public static void main(String[] args) {
		
		int opcionMenuPrincipal;
		
		
		
	
		MenuEntrada menuEntrada = new MenuEntrada();//instanciamos objeto menu entrada
		MenuPrincipal menuPlatoPrincipal= new MenuPrincipal();//instanciamos objeto menu plato principal
		MenuPostre menuPostre = new MenuPostre();//Instanciamos objeto menu postre
		MenuBebida menuBebida = new MenuBebida();
		
		/*menuEntrada.dimeProductoPrecioEntrada();
		menuEntrada.cantidadEntrada();*/
		
	/*	menuPlatoPrincipal.dimeProductoPrecioPrincipal();
		menuPlatoPrincipal.cantidadPrincipal();*/
		
		/*menuPostre.dimeProductoPrecioPostre();
		menuPostre.cantidadPostre();*/
		
		menuBebida.dimeProductoPrecioBebida();
		menuBebida.cantidadBebida();
		
	}

	

}

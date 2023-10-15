package proyectoIntegrador;

public class UsoCartaDigital {

	public static void main(String[] args) {
		
		int opcionMenuPrincipal;
		
		
		
	
		CartaDigital menuEntrada = new CartaDigital();//instanciamos objeto menu entrada
		menuPrincipal menuPlatoPrincipal= new menuPrincipal();//instanciamos objeto menu plato principal
		menuPostre menuPostre = new menuPostre();//Instanciamos objeto menu postre
		menuBebida menuBebida = new menuBebida();
		
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

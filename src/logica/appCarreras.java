package logica;
import java.awt.Component;

import gui.GenerarPista;
import gui.Pantalla;
import gui.SeleccionarVehiculos;
import gui.VerResultados;

public class appCarreras {
	
	public static ListaVehiculos lista;
	public static Pantalla dashboard = new Pantalla();
	
	public static void main(String[] args) {
		lista = new ListaVehiculos();
		
		dashboard.setVisible(true);
		
	}
}

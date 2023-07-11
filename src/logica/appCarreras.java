package logica;
import java.awt.Component;

import gui.Pantalla;

public class appCarreras {
	
	public static ListaVehiculos lista;
	
	public static void main(String[] args) {
		lista = new ListaVehiculos();
		
		Vehiculos carro1 = new Vehiculos();
		carro1.setNombre("periquero");
		carro1.setNombreCoductores("periquero maximo");
		carro1.setNombreIngles("HIGH AF");
		lista.agregar(carro1);
		
		
		Pantalla dashboard = new Pantalla();
		dashboard.setVisible(true);
	}
}

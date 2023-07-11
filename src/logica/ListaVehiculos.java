package logica;

/**
 * La clase ListaVehiculos representa una lista enlazada de vehículos.
 */
public class ListaVehiculos {
	
	private Vehiculos primero;
	
	/**
	 * Crea una instancia de ListaVehiculos.
	 * La lista se inicializa vacía.
	 */
	public ListaVehiculos() {
		this.primero = null;
	}
	
	/**
	 * Verifica si la lista de vehículos está vacía.
	 * 
	 * @return true si la lista está vacía, false de lo contrario.
	 */
	public boolean esVacia() {
		return primero == null;
	}
	
	/**
	 * Crea un nuevo vehículo a partir de otro vehículo dado.
	 * 
	 * @param temp el vehículo del cual se copiarán los datos.
	 * @return el nuevo vehículo creado.
	 */
	public Vehiculos crearVehiculo(Vehiculos temp) {
		Vehiculos carro = new Vehiculos();
		carro.setNombre(temp.getNombre());
		carro.setNombreIngles(temp.getNombreIngles());
		carro.setNombreCoductores(temp.getNombreCoductores());
		carro.setVelocidad(temp.getVelocidad());
		carro.setResistenciaObstaculos(temp.getResistenciaObstaculos());
		carro.setResistenciaLiquido(temp.getResistenciaLiquido());
		carro.setResistenciaExplosivos(temp.getResistenciaObstaculos());
		carro.setProx(null);
		return carro;
	}
	
	/**
	 * Agrega un vehículo a la lista.
	 * 
	 * @param carro el vehículo a agregar.
	 */
	public void agregar(Vehiculos carro) {
		carro.setProx(this.primero);
		this.primero = carro;
	}
	
	/**
	 * Elimina un vehículo de la lista según su nombre.
	 * Si hay varios vehículos con el mismo nombre, se elimina el primero que se encuentra.
	 * 
	 * @param nombre el nombre del vehículo a eliminar.
	 */
	public void eliminar(String nombre) {
		if (this.primero == null) {
			return;
		} else if (this.primero.getNombre().equals(nombre)) {
			this.primero = this.primero.getProx();
			return;
		} else {
			Vehiculos anterior = this.primero;
			Vehiculos actual = this.primero.getProx();
			while ((actual != null) && !actual.getNombre().equals(nombre)) {
				anterior = actual;
				actual = actual.getProx();
			}
			if (actual != null) {
				anterior.setProx(actual);
			}
		}
	}
	
	/**
	 * Cuenta el número de nodos (vehículos) en la lista.
	 * 
	 * @return el número de nodos en la lista.
	 */
	public int contarNodos() {
		int contador = 0;
		Vehiculos actual = this.primero;
		while (actual != null) {
			contador++;
			actual = actual.getProx();
		}
		return contador;
	}
	
	/**
	 * Obtiene el elemento de la lista en la posición especificada.
	 * 
	 * @param posicion la posición del elemento a obtener (índice basado en 0).
	 * @return el vehículo en la posición dada, o null si la posición es inválida.
	 */
	public Vehiculos obtenerElemento(int posicion) {
		if (posicion < 0 || posicion >= contarNodos()) {
			return null;
		}
		Vehiculos actual = this.primero;
		for (int i = 0; i < posicion; i++) {
			actual = actual.getProx();
		}
		return actual;
	}
	
}

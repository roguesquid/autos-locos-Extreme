package logica;

public class Vehiculos {
	
	private boolean juega;
	private String nombre;
	private String nombreIngles;
	private String nombreCoductores;
	private String tamanoCaucho;
	private String tipoDeCaucho;
	private int velocidad;
	private int resistenciaObstaculos;
	private int resistenciaLiquido;
	private int resistenciaExplosivos;
	private Vehiculos prox;
	
	//constructor de Vehiculos
	public Vehiculos() {

	}
	
	//-------------------------------------------------------------------------------------------
	
	//setter de nombreEspanol
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//getter de nombreEspanol
	public String getNombre() {		
		return nombre;
	}
	
	//-------------------------------------------------------------------------------------------
	
	//setter de nombreIngles
	public void setNombreIngles(String nombre) {
		this.nombreIngles = nombre;
	}
	//getter de nombreIngles
	public String getNombreIngles() {		
		return nombreIngles;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setNombreCoductores(String nombre) {
		this.nombreCoductores = nombre;
	}
	
	public String getNombreCoductores() {		
		return nombreCoductores;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setTipoDeCaucho(String nombre) {
		this.tipoDeCaucho = nombre;
	}
	
	public String getTipoDeCaucho() {		
		return tipoDeCaucho;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setVelocidad(int numero) {
		this.velocidad = numero;
	}
		
	public int getVelocidad() {		
		return velocidad;
	}
		
	//-------------------------------------------------------------------------------------------
		
	public void setResistenciaObstaculos(int numero) {
		this.resistenciaObstaculos = numero;
	}
			
	public int getResistenciaObstaculos() {		
		return resistenciaObstaculos;
	} 
	
	//-------------------------------------------------------------------------------------------
	
	public void setResistenciaLiquido(int numero) {
		this.resistenciaLiquido = numero;
	}
			
	public int getResistenciaLiquido() {		
		return resistenciaLiquido;
	} 
	
	//-------------------------------------------------------------------------------------------
	
	public void setResistenciaExplosivos(int numero) {
		this.resistenciaExplosivos = numero;
	}
			
	public int getResistenciaExplosivos() {		
		return resistenciaExplosivos;
	} 
	
	//-------------------------------------------------------------------------------------------
	
	public void setProx(Vehiculos siguiente) {
		this.prox = siguiente;
	}
			
	public Vehiculos getProx() {		
		return prox;
	}
	//-------------------------------------------------------------------------------------------
	public String getTamanoCaucho() {
		return tamanoCaucho;
	}

	public void setTamanoCaucho(String tamanoCaucho) {
		this.tamanoCaucho = tamanoCaucho;
	}
	//-------------------------------------------------------------------------------------------
	public boolean isJuega() {
		return juega;
	}

	public void setJuega(boolean juega) {
		this.juega = juega;
	} 
}

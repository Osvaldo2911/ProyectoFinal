package Modelo;

public class Registro {
	
	private String nombre;
	private String Contraseña;
	
	public Registro(String nombre, String contraseña) {
		super();
		this.nombre = nombre;
		Contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	
	
	

}

package Modelo;

public class Cliente {
	
	private int cliente_ID;
	private String nombre;
	private String apellido;
	private String edad;
	private String direccion;
	private String cp;
	private String telefono;
	
	public Cliente(int cliente_ID, String nombre, String apellido, String edad, String direccion, String cp,
			String telefono) {
		super();
		this.cliente_ID = cliente_ID;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.cp = cp;
		this.telefono = telefono;
	}
	
	public Cliente(String nombre, String apellido, String edad, String direccion, String cp,
			String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.cp = cp;
		this.telefono = telefono;
	}
	
	public int getCliente_ID() {
		return cliente_ID;
	}
	public void setCliente_ID(int cliente_ID) {
		this.cliente_ID = cliente_ID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}

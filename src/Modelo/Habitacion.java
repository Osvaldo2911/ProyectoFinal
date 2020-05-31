package Modelo;

public class Habitacion {
	
	private int habitacion_ID;
	private String tipoHabitacion;
	private String NroHabitacion;
	private String NroPiso;
	private String Precio;
	
	public Habitacion(int habitacion_ID, String tipoHabitacion, String nroHabitacion, String nroPiso, String precio) {
		super();
		this.habitacion_ID = habitacion_ID;
		this.tipoHabitacion = tipoHabitacion;
		NroHabitacion = nroHabitacion;
		NroPiso = nroPiso;
		Precio = precio;
	}

	public int getHabitacion_ID() {
		return habitacion_ID;
	}

	public void setHabitacion_ID(int habitacion_ID) {
		this.habitacion_ID = habitacion_ID;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public String getNroHabitacion() {
		return NroHabitacion;
	}

	public void setNroHabitacion(String nroHabitacion) {
		NroHabitacion = nroHabitacion;
	}

	public String getNroPiso() {
		return NroPiso;
	}

	public void setNroPiso(String nroPiso) {
		NroPiso = nroPiso;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	
}

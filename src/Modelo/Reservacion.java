package Modelo;

public class Reservacion {
	
	private int reserva_ID;
	private String fechaIngreso;
	private String fechaSalida;
	private String cantidadPersonas;
	private String tipoHabitacion;
	private int cliente_ID;
	
	public Reservacion(int reserva_ID, String fechaIngreso, String fechaSalida, String cantidadPersonas,
			String tipoHabitacion, int cliente_ID) {
		super();
		this.reserva_ID = reserva_ID;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cantidadPersonas = cantidadPersonas;
		this.tipoHabitacion = tipoHabitacion;
		this.cliente_ID = cliente_ID;
	}

	public int getReserva_ID() {
		return reserva_ID;
	}

	public void setReserva_ID(int reserva_ID) {
		this.reserva_ID = reserva_ID;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(String cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public int getCliente_ID() {
		return cliente_ID;
	}

	public void setCliente_ID(int cliente_ID) {
		this.cliente_ID = cliente_ID;
	}
	
	
	
}

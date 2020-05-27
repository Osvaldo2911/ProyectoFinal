package Modelo;

public class Reservacion {
	
	private String reserva_ID;
	private String fechaIngreso;
	private String fechaSalida;
	private String cantidadPersonas;
	private String tipoHabitacion;
	private String cliente_ID;
	
	public Reservacion(String reserva_ID, String fechaIngreso, String fechaSalida, String cantidadPersonas,
			String tipoHabitacion, String cliente_ID) {
		super();
		this.reserva_ID = reserva_ID;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cantidadPersonas = cantidadPersonas;
		this.tipoHabitacion = tipoHabitacion;
		this.cliente_ID = cliente_ID;
	}

	public String getReserva_ID() {
		return reserva_ID;
	}

	public void setReserva_ID(String reserva_ID) {
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

	public String getCliente_ID() {
		return cliente_ID;
	}

	public void setCliente_ID(String cliente_ID) {
		this.cliente_ID = cliente_ID;
	}
	
	
	
}

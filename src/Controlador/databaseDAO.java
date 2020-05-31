package Controlador;

import ConecciónBaseDeDatos.ConexionBD;
import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Reservacion;

public class databaseDAO {
	
	
	//AGREGAR
	public boolean agregarCliente(Cliente a) {
		String sql = "insert into clientes Values('"+a.getCliente_ID()+"','"+a.getNombre()+"','"+a.getApellido()+"','"+a.getEdad()+"',"+a.getDireccion()+","+a.getCp()+",'"+a.getTelefono()+ 	"')";
		
		return new ConexionBD().ejInstr(sql);
		
	}
	
	public boolean agregarReservacion(Reservacion a) {
		String sql = "insert into reservacion Values('"+a.getReserva_ID()+"','"+a.getFechaIngreso()+"','"+a.getFechaSalida()+"','"+a.getCantidadPersonas()+","+a.getTipoHabitacion()+","+a.getCliente_ID()+"')";
		
		return new ConexionBD().ejInstr(sql);
		
	}
	
	public boolean agregarHabitacion(Habitacion a) {
		String sql = "insert into habitacion Values('"+a.getHabitacion_ID()+"','"+a.getTipoHabitacion()+"','"+a.getNroHabitacion()+"','"+a.getNroPiso()+","+a.getPrecio()+"')";
		
		return new ConexionBD().ejInstr(sql);
		
	}
	
	
	//ELIMINAR
	public boolean eliminarCliente(int cliente_ID) {
		
		String sql = "INSERT INTO clienteborrado SELECT * FROM cliente WHERE cliente_ID = '"+cliente_ID+"'";
		boolean duplicado =  new ConexionBD().ejInstr(sql);
		
		sql = "Delete From cliente where cliente_ID = '"+cliente_ID+"'";
		boolean res =  new ConexionBD().ejInstr(sql);
		
		return false;
		
	} 
	
	public boolean eliminarReservacion(int reserva_ID) {
		
		String sql = "INSERT INTO reseracionborrada SELECT * FROM reservacion WHERE reserva_ID = '"+reserva_ID+"'";
		boolean duplicado =  new ConexionBD().ejInstr(sql);
		
		sql = "Delete From reservacion where reserva_ID = '"+reserva_ID+"'";
		boolean res =  new ConexionBD().ejInstr(sql);
		
		return false;
		
	}
	
	
}

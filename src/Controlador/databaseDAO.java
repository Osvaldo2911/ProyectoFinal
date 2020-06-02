package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	//MODIFICAR 
	public boolean modificarCliente(Cliente a) {
		
		String sql = "Update cliente Set Nombre = '"+a.getNombre()+"'"
				+ ", Apellido = '"+ a.getApellido()+"'"
				+ ", Edad = '"+a.getEdad()+"'"
				+ ", Direccion = "+a.getDireccion()+""
				+ ", CP = "+a.getCp()+""
				+ ", Telefono = '"+a.getTelefono()+ "' WHERE cliente_ID='"+a.getCliente_ID()+"'";
		
		boolean res =  new ConexionBD().ejInstr(sql);
		return res;
	}
	
	public boolean modificarReservacion(Reservacion a) {
		
		String sql = "Update reservacion Set Fecha_Ingreso = '"+a.getFechaIngreso()+"'"
				+ ", Fecha_Salida = '"+ a.getFechaSalida()+"'"
				+ ", Cantidad_Personas = '"+a.getCantidadPersonas()+"'"
				+ ", Tipo_Habitacion = "+a.getTipoHabitacion()+ "' WHERE Reserva_ID ='"+a.getReserva_ID()+"'";
		
		boolean res =  new ConexionBD().ejInstr(sql);
		return res;
	}
	
	public Cliente buscarCliente(int cliente_ID) {
		
		
		String sql = "SELECT * FROM cliente WHERE cliente_ID = '"+cliente_ID+"'";
		
		ResultSet res = new ConexionBD().ejecutarConsulta(sql);
		
		try {
			res.last();
			
			return new Cliente(res.getInt(cliente_ID), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}
	
}

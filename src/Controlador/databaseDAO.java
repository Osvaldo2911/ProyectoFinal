package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import ConexionBaseDato.ConexionBD;
import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Registro;
import Modelo.Reservacion;

public class databaseDAO {
	
	
	//AGREGAR
	public boolean agregarCliente(Cliente a) {
		String sql = "insert into clientes Values('"+a.getCliente_ID()+"','"+a.getNombre()+"','"+a.getApellido()+"','"+a.getEdad()+"',"+a.getDireccion()+","+a.getCp()+",'"+a.getTelefono()+ 	"')";
		
		boolean resultado = new ConexionBD().ejecutarInstruccion(sql);
        System.out.println("ALUMNO DAO: " + resultado);

        return resultado;
		
	}
	
	public boolean agregarReservacion(Reservacion a) {
		String sql = "insert into reservacion Values('"+a.getReserva_ID()+"','"+a.getFechaIngreso()+"','"+a.getFechaSalida()+"','"+a.getCantidadPersonas()+","+a.getTipoHabitacion()+","+a.getCliente_ID()+"')";
		
		boolean resultado = new ConexionBD().ejecutarInstruccion(sql);
        System.out.println("ALUMNO DAO: " + resultado);

        return resultado;
		
	}
	
	public boolean agregarHabitacion(Habitacion a) {
		String sql = "insert into habitacion Values('"+a.getHabitacion_ID()+"','"+a.getTipoHabitacion()+"','"+a.getNroHabitacion()+"','"+a.getNroPiso()+","+a.getPrecio()+"')";
		
		boolean resultado = new ConexionBD().ejecutarInstruccion(sql);
        System.out.println("ALUMNO DAO: " + resultado);

        return resultado;
		
	}
	
	public boolean agregarRegistro(Registro a) {
	
		String sql ="INSERT INTO registro (Nombre, Contraseña) VALUES ('"+a.getNombre()+"','"+a.getContraseña()+"')";
		
		boolean resultado = new ConexionBD().ejecutarInstruccion(sql);
        System.out.println("ALUMNO DAO: " + resultado);

        return resultado;
		
	}
	
	
	//ELIMINAR
	public boolean eliminarCliente(int cliente_ID) {
		
		String sql = "INSERT INTO clienteborrado SELECT * FROM cliente WHERE cliente_ID = '"+cliente_ID+"'";
		boolean duplicado =  new ConexionBD().ejecutarInstruccion(sql);
		
		sql = "Delete From cliente where cliente_ID = '"+cliente_ID+"'";
		boolean res =  new ConexionBD().ejecutarInstruccion(sql);
		
		return res;
		
	} 
	
	public boolean eliminarReservacion(int reserva_ID) {
		
		String sql = "INSERT INTO reseracionborrada SELECT * FROM reservacion WHERE reserva_ID = '"+reserva_ID+"'";
		boolean duplicado =  new ConexionBD().ejecutarInstruccion(sql);
		
		sql = "Delete From reservacion where reserva_ID = '"+reserva_ID+"'";
		boolean res =  new ConexionBD().ejecutarInstruccion(sql);
		
		return res;
		
	}
	
	public boolean eliminarRegistro(String a) {
		
		String sql = "Delete From registro where nombre = '"+a+"'";
		boolean res =  new ConexionBD().ejecutarInstruccion(sql);
		
		return res;
		
	} 
	
	//MODIFICAR 
	public boolean modificarCliente(Cliente a) {
		
		String sql = "Update cliente Set Nombre = '"+a.getNombre()+"'"
				+ ", Apellido = '"+ a.getApellido()+"'"
				+ ", Edad = '"+a.getEdad()+"'"
				+ ", Direccion = "+a.getDireccion()+""
				+ ", CP = "+a.getCp()+""
				+ ", Telefono = '"+a.getTelefono()+ "' WHERE cliente_ID='"+a.getCliente_ID()+"'";
		
		boolean res =  new ConexionBD().ejecutarInstruccion(sql);
		return res;
	}
	
	public boolean modificarReservacion(Reservacion a) {
		
		String sql = "Update reservacion Set Fecha_Ingreso = '"+a.getFechaIngreso()+"'"
				+ ", Fecha_Salida = '"+ a.getFechaSalida()+"'"
				+ ", Cantidad_Personas = '"+a.getCantidadPersonas()+"'"
				+ ", Tipo_Habitacion = "+a.getTipoHabitacion()+ "' WHERE Reserva_ID ='"+a.getReserva_ID()+"'";
		
		boolean res =  new ConexionBD().ejecutarInstruccion(sql);
		return res;
	}
	
	public Cliente buscarCliente(int cliente_ID) {
		
		
		String sql = "SELECT * FROM cliente WHERE cliente_ID = '"+cliente_ID+"'";
		
		ResultSet res = new ConexionBD().ejecutarConsultaRegistros(sql);
		
		try {
			res.last();
			
			return new Cliente(res.getInt(cliente_ID), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}
	
	public Reservacion buscarReservacion(int reserva_ID) {
		
		
		String sql = "SELECT * FROM reservacion WHERE reserva_ID = '"+reserva_ID+"'";
		
		ResultSet res = new ConexionBD().ejecutarConsultaRegistros(sql);
		
		try {
			res.last();
			
			return new Reservacion(res.getInt(reserva_ID), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getInt(6));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}
	
	public Registro buscarRegistro(String nombre) {
		
		String sql = "SELECT * FROM registro WHERE nombre = BINARY '"+nombre+"'";
		
		ResultSet res = new ConexionBD().ejecutarConsultaRegistros(sql);
		
		try {
			res.last();
			
			return new Registro (res.getString("Nombre"), res.getString(2));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}
	
	public Registro buscarRegistroLogin(String nombre, String contraseña) {
		
		String sql = "SELECT * FROM registro WHERE nombre = BINARY '"+nombre+"'"+" AND "+"contraseña = BINARY '"+contraseña+"'";
		
		ResultSet res = new ConexionBD().ejecutarConsultaRegistros(sql);
		
		try {
			res.last();
			
			return new Registro (res.getString("Nombre"), res.getString(2));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}
	
}

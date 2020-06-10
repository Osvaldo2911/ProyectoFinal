package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ConexionBaseDato.ConexionBD;
import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Registro;
import Modelo.Reservacion;

public class databaseDAO {
	
	
	//AGREGAR
	public boolean agregarCliente(Cliente a) {
		String sql = "insert into cliente Values('"+a.getCliente_ID()+"','"+a.getNombre()+"','"+a.getApellido()+"','"+a.getEdad()+"','"+a.getDireccion()+"',"+a.getCp()+",'"+a.getTelefono()+ "')";
		System.out.println(sql);
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
				+ ", Direccion = '"+a.getDireccion()+"'"
				+ ", CP = '"+a.getCp()+"'"
				+ ", Telefono = '"+a.getTelefono()+ "' WHERE cliente_ID='"+a.getCliente_ID()+"'";
		
		boolean res =  new ConexionBD().ejecutarInstruccion(sql);
		return res;
	}
	
	//Buscar
	
	public ArrayList<Cliente> buscarUsuariosConMatriz() {
		ArrayList<Cliente> miLista = new ArrayList<Cliente>();
		
		Cliente c1;
		
		try {
			ResultSet rs = new ConexionBD().ejecutarConsultaRegistros("SELECT * FROM cliente ");

			while (rs.next()) {
				c1 = new Cliente(0, null, null, null, null, null, null);
				c1.setCliente_ID(rs.getInt("cliente_ID"));
				c1.setNombre(rs.getString("Nombre"));
				c1.setApellido(rs.getString("Apellido"));
				c1.setEdad(rs.getString("Edad"));
				c1.setDireccion(rs.getString("Direccion"));
				c1.setCp(rs.getString("CP"));
				c1.setTelefono(rs.getString("Telefono"));
				miLista.add(c1);
			}
			rs.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return miLista;
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
	
public Cliente buscarCliente(int id) {
		
		String sql = "SELECT * FROM cliente WHERE cliente_ID = '"+id+"'";
		
		ResultSet res = new ConexionBD().ejecutarConsultaRegistros(sql);
		
		try {
			res.last();
			
			return new Cliente(res.getInt("cliente_ID"), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7));
			
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

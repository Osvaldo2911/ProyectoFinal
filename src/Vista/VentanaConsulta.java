package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;

import javax.management.StringValueExp;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.protocol.Resultset;

import ConexionBaseDato.ConexionBD;
import Controlador.databaseDAO;
import Modelo.Cliente;

class Consultas extends JFrame{
	
	private void construirTabla1() {
		String titulos[]={ "cliente_ID", "Nombre", "Apellido", "Edad","Direccion","CP","Telefono" };// aqui el nombre de las columnas
		String informacion[][]=obtenerMatriz();

		JTable miTabla1=new JTable(informacion,titulos);
		miTabla1.setFillsViewportHeight(true);
		
		JScrollPane mibarrita = new JScrollPane(miTabla1);
		
		add(mibarrita);
	}

	private String[][] obtenerMatriz() {

		databaseDAO c=new databaseDAO();
		ArrayList<Cliente>miLista=c.buscarUsuariosConMatriz();

		String matrizInfo[][]=new String[miLista.size()][7]; // aui le pones tus cajas que son we 

		for (int i = 0; i < miLista.size(); i++) {
			matrizInfo[i][0]=miLista.get(i).getCliente_ID()+"";
			matrizInfo[i][1]=miLista.get(i).getNombre()+"";
			matrizInfo[i][2]=miLista.get(i).getApellido()+"";
			matrizInfo[i][3]=miLista.get(i).getEdad()+"";
			matrizInfo[i][4]=miLista.get(i).getDireccion()+"";
			matrizInfo[i][5]=miLista.get(i).getCp()+"";
			matrizInfo[i][6]=miLista.get(i).getTelefono()+"";
		}

		return matrizInfo;
	}



	public JPanel ConsultarTabla(boolean visible) {



		JPanel ac = new JPanel();

		ac.setLayout(null);
		ac.setSize(400, 400);
		ac.setVisible(visible);
		ac.setBackground(new Color(214, 219, 223));
		ac.setOpaque(true);

		databaseDAO b = new databaseDAO();

		JLabel lT = new JLabel("Consultar Tablas");
		lT.setFont(new Font("Arial", Font.ITALIC, 18));
		lT.setBounds(300, 5, 200, 30);
		ac.add(lT);

		JLabel lCo = new JLabel("Buscar");
		lCo.setBounds(20, 30, 250, 30);
		ac.add(lCo);

		JTextField filtro = new JTextField(10);
		filtro.setBounds(20, 60, 250, 30);
		ac.add(filtro);

		JButton Consultar = new JButton("Consultar");
		Consultar.setBounds(20, 160, 250, 30);
		ac.add(Consultar);
		
		construirTabla1();

		return ac;
	}
}

public class VentanaConsulta {
	Consultas c1 = new Consultas();
}
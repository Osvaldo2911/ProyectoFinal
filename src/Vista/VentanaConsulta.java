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

	

	public String[][] obtenerMatriz() {
		
		databaseDAO b=new databaseDAO();
		ArrayList<Cliente>miLista=b.buscarUsuariosConMatriz();
		
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

	public JInternalFrame ConsultarTabla(boolean visible) {



		JInternalFrame ac = new JInternalFrame();
		ac.getContentPane().setLayout(null);
		ac.setDefaultCloseOperation(HIDE_ON_CLOSE);
		ac.setTitle("Consultas");
		ac.setMaximizable(true);
		ac.setIconifiable(true);
		ac.setClosable(true);
		ac.setResizable(true);
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
		
		
		
		JLabel Cancelar = new JLabel("Cancelar");
		Cancelar.setFont(new Font("Arial", Font.BOLD, 12));
		Cancelar.setBounds(20, 190, 90, 20);
		Cancelar.setForeground(new Color(56, 53, 52 ));
		ac.add(Cancelar);
		Cancelar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Cancelar.setForeground(new Color(48, 102, 190));
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				Cancelar.setForeground(new Color(133, 193, 233));
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				Cancelar.setForeground(new Color(56, 53, 52));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Cancelar.setForeground(new Color(48, 102, 190));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ac.setVisible(false);
				
			}
		});
		
		JScrollPane miBarra1 = new JScrollPane();
		miBarra1.setBounds(300, 30, 600, 450);
		ac.add(miBarra1);
		construirTabla1(miBarra1);

		return ac;
	}
	
	public void construirTabla1(JScrollPane a) {
		
		String titulos[]={ "Folio", "Nombre", "Primer Ap", "Segundo Ap","Domicilio","Numero Cel" };// aqui el nombre de las columnas
		String informacion[][]=obtenerMatriz();
		
		JTable t= new JTable(informacion,titulos);
		a.setViewportView(t);
		
	}
}

public class VentanaConsulta {
	Consultas c1 = new Consultas();
}
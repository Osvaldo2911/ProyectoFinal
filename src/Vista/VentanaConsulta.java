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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;

import javax.management.StringValueExp;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.protocol.Resultset;

import ConexionBaseDato.ConexionBD;
import Controlador.databaseDAO;
import Modelo.Cliente;

class Consultas extends JFrame{
	
	JTable t;
	
	
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
		JScrollPane miBarra1 = new JScrollPane();
		miBarra1.setBounds(300, 50, 600, 450);
		ac.add(miBarra1);
		construirTabla1(miBarra1);
		
		JLabel lT = new JLabel("Consultar Tablas");
		lT.setFont(new Font("Arial", Font.ITALIC, 18));
		lT.setBounds(400, 5, 200, 30);
		ac.add(lT);
		
		//--------------------- 
		
		JLabel tituloR = new JLabel();
		tituloR.setText("Locania");
		tituloR.setFont(new Font("Edwardian Script ITC", Font.BOLD, 25));
		tituloR.setBounds(25, 5, 80, 20);
		tituloR.setForeground(new Color(236, 240, 241  ));
		ac.add(tituloR);

		JLabel subTR = new JLabel();
		subTR.setText("Hotel");
		subTR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 8));
		subTR.setBounds(50, 20, 40, 20);
		subTR.setForeground(new Color(236, 240, 241 ));
		ac.add(subTR);

		JLabel lTR = new JLabel("");
		lTR.setBounds(20, 0, 5, 40);
		lTR.setBackground(new Color(10, 134, 238));
		lTR.setOpaque(true);
		ac.add(lTR);

		JLabel lT2R = new JLabel("");
		lT2R.setBounds(970, 0, 5, 40);
		lT2R.setBackground(new Color(10, 134, 238));
		lT2R.setOpaque(true);
		ac.add(lT2R);

		JLabel fTR = new JLabel("");
		fTR.setBounds(0, 0, 1000, 40);
		fTR.setBackground(new Color(48, 102, 190));
		fTR.setOpaque(true);
		ac.add(fTR);
		
		//----------------------



		JLabel lCo = new JLabel("Buscar (ID)");
		lCo.setBounds(20, 30, 250, 30);
		ac.add(lCo);

		JTextField filtro = new JTextField(10);
		filtro.setBounds(20, 60, 250, 30);
		ac.add(filtro);

		JButton Consultar = new JButton("Consultar");
		Consultar.setBounds(20, 160, 250, 30);
		ac.add(Consultar);
		Consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				buscarFolio(filtro.getText());
				construirTabla1(miBarra1);
				
			}
		});
		
		
		
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
		


		return ac;
	}
	
	public void buscarFolio(String filtro) {
		DefaultTableModel tabla;
		String t_Columna[]= {"cliente_ID", "Nombre", 
				             "Apellido", "Edad",
				             "Direccion","CP", "Telefono"};
		String filas[]= new String [7];
		Connection con = null;
		PreparedStatement pst;
		ResultSet rs;
		tabla = new DefaultTableModel(null,t_Columna);
		try {
			String consulta = "SELECT * FROM cliente WHERE nombre LIKE"+ '"'+ filtro + "%" +'"';
			pst= con.prepareStatement(consulta);
			rs=pst.executeQuery();
			while(rs.next()) {
				filas[0]= rs.getString(1);
				filas[1]= rs.getString(2);
				filas[2]= rs.getString(3);
				filas[3]= rs.getString(4);
				filas[4]= rs.getString(5);
				filas[5]= rs.getString(6);
				filas[6]= rs.getString(7);

				tabla.addRow(filas);
			}
			t.setModel(tabla);	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void construirTabla1(JScrollPane a) {
		
		String titulos[]={ "Folio", "Nombre", "Primer Ap", "Segundo Ap","Domicilio","Numero Cel" };// aqui el nombre de las columnas
		String informacion[][]=obtenerMatriz();
		
		 t= new JTable(informacion,titulos);
		a.setViewportView(t);
		
	}
}

public class VentanaConsulta {
	Consultas c1 = new Consultas();
}
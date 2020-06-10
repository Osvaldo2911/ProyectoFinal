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
import java.text.ParseException;
import java.util.ArrayList;

import javax.management.StringValueExp;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import javax.swing.text.StyledEditorKit.BoldAction;

import Controlador.databaseDAO;
import Modelo.Cliente;

class EliminarC extends JFrame{
	
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

	public void construirTabla1(JScrollPane a) {
	
	String titulos[]={ "Folio", "Nombre", "Primer Ap", "Segundo Ap","Domicilio","Numero Cel" };// aqui el nombre de las columnas
	String informacion[][]=obtenerMatriz();
	
	JTable t= new JTable(informacion,titulos);
	a.setViewportView(t);
	
	}
	
	public JInternalFrame EliminarCliente(boolean visible) {
		
	
		
		JInternalFrame ac = new JInternalFrame();
		
		ac.getContentPane().setLayout(null);
		ac.setDefaultCloseOperation(HIDE_ON_CLOSE);
		ac.setTitle("Eliminacion");
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
			miBarra1.setBounds(300, 30, 600, 450);
			ac.add(miBarra1);
			construirTabla1(miBarra1);
			
		//Retroalimentacion
			
			JLabel ra1 = new JLabel("<html><body style='text-align: center'>No se encontro el Usuario");
			ra1.setFont(new Font("Arial", Font.BOLD, 10));
			ra1.setBounds(90, 480, 250, 25);
			ra1.setForeground(new Color(56, 53, 52 ));
			ra1.setVisible(false);
			ac.add(ra1);
			
			JLabel fo1 = new JLabel(" ");
			fo1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo1.setBounds(0, 480, 400, 25);
			fo1.setBackground(new Color(169, 50, 38, 50));
			fo1.setOpaque(true);
			fo1.setVisible(false);
			ac.add(fo1);
			
			JLabel ra2 = new JLabel("<html><body style='text-align: center'>Usuario eliminado con exito");
			ra2.setFont(new Font("Arial", Font.BOLD, 10));
			ra2.setBounds(50, 480, 250, 25);
			ra2.setForeground(new Color(25, 111, 61));
			ra2.setVisible(false);
			ac.add(ra2);
			
			JLabel fo2 = new JLabel(" ");
			fo2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo2.setBounds(0, 480, 400, 25);
			fo2.setBackground(new Color(169, 50, 38 , 50));
			fo2.setOpaque(true);
			fo2.setVisible(false);
			ac.add(fo2);
			
			JLabel ra3 = new JLabel("<html><body style='text-align: center'>Fallo la eliminacion");
			ra3.setFont(new Font("Arial", Font.BOLD, 10));
			ra3.setBounds(90, 480, 250, 25);
			ra3.setForeground(new Color(56, 53, 52 ));
			ra3.setVisible(false);
			ac.add(ra3);
			
			JLabel fo3 = new JLabel(" ");
			fo3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo3.setBounds(0, 480, 400, 25);
			fo3.setBackground(new Color(169, 50, 38, 50));
			fo3.setOpaque(true);
			fo3.setVisible(false);
			ac.add(fo3);
			
		//Retroalimentacion END
			
		
			
		JLabel lT = new JLabel("Eliminar un cliente");
		lT.setFont(new Font("Arial", Font.ITALIC, 18));
		lT.setBounds(60, 5, 200, 30);
		ac.add(lT);
			
		JLabel lID = new JLabel("ID de cliente");
		lID.setBounds(20, 30, 200, 30);
		ac.add(lID);
		
		JLabel lNo = new JLabel("Nombre");
		lNo.setBounds(20, 90, 200, 30);
		ac.add(lNo);
		
		JTextField Nombre = new JTextField(10);
		Nombre.setBounds(20, 120, 250, 30);
		ac.add(Nombre);
		Nombre.setEnabled(false);
		
		JLabel lAp = new JLabel("Apellido");
		lAp.setBounds(20, 150, 200, 30);
		ac.add(lAp);
		
		JTextField Apellido = new JTextField(10);
		Apellido.setBounds(20, 180, 250, 30);
		ac.add(Apellido);
		Apellido.setEnabled(false);
		
		JLabel lEd = new JLabel("Edad");
		lEd.setBounds(20, 210, 200, 30);
		ac.add(lEd);
		
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("## años");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField Edad = new JFormattedTextField(mask);
		Edad.setBounds(20, 240, 250, 30);
		ac.add(Edad);
		Edad.setEnabled(false);
		
		JLabel lCo = new JLabel("Codigo Postal");
		lCo.setBounds(20, 270, 200, 30);
		ac.add(lCo);
		
		MaskFormatter mask2 = null;
		try {
			mask2 = new MaskFormatter("#####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField CP = new JFormattedTextField(mask2);
		CP.setBounds(20, 300, 250, 30);
		ac.add(CP);
		CP.setEnabled(false);
		
		JLabel lTe = new JLabel("Telefono");
		lTe.setBounds(20, 330, 200, 30);
		ac.add(lTe);
		
		MaskFormatter mask3 = null;
		try {
			mask3 = new MaskFormatter("###-###-####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField Telefono = new JFormattedTextField(mask3);
		Telefono.setBounds(20, 360, 250, 30);
		ac.add(Telefono);
		Telefono.setEnabled(false);
		
		JButton Registrar = new JButton("Buscar");
		Registrar.setBounds(20, 400, 250, 30);
		ac.add(Registrar);
		Registrar.setVisible(true);
		
		JButton Confirmar = new JButton("Confirmar");
		Confirmar.setBounds(20, 400, 250, 30);
		ac.add(Confirmar);
		Confirmar.setVisible(false);
		
		JTextField ID = new JTextField(10);
		ID.setBounds(20, 60, 250, 30);
		ac.add(ID);
		ID.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				ra3.setVisible(false);
				fo3.setVisible(false);
				
			}
		});
		ID.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char car = e.getKeyChar();
		        if((car<'0' || car>'9')) {
		            	e.consume();
		        }
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		Registrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente en = null;
				boolean encontrado = false;
				try {
					en = b.buscarCliente(Integer.parseInt(ID.getText()));
					 if (en.getCliente_ID() == Integer.parseInt(ID.getText()) && ID.getText().length() !=0) {
							Nombre.setText(en.getNombre());
							Apellido.setText(en.getApellido());
							Edad.setText(en.getEdad());
							CP.setText(en.getCp());
							Telefono.setText(en.getTelefono());
							Registrar.setVisible(false);
							Confirmar.setVisible(true);
							
							Confirmar.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									boolean c = b.eliminarCliente(Integer.parseInt(ID.getText()));
									if (c) {
										construirTabla1(miBarra1);
										Nombre.setText("");
										Apellido.setText("");
										Edad.setText("");
										ID.setText("");
										CP.setText("");
										Telefono.setText("");
										
										Registrar.setVisible(true);
										Confirmar.setVisible(false);
										
										ra2.setVisible(true);
										fo2.setVisible(true);
									}else {
										ra3.setVisible(true);
										fo3.setVisible(true);
									}
									
								}
							});
							
						} else {
							ra1.setVisible(true);
							fo1.setVisible(true);
						}
				}catch (Exception e1) {
					ra1.setVisible(true);
					fo1.setVisible(true);
				}
			}
		});
		

		
		
		JLabel Cancelar = new JLabel("Cancelar");
		Cancelar.setFont(new Font("Arial", Font.BOLD, 12));
		Cancelar.setBounds(20, 430, 90, 20);
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
				Nombre.setText("");
				Apellido.setText("");
				Edad.setText("");
				ID.setText("");
				CP.setText("");
				Telefono.setText("");
				ac.setVisible(false);
				
			}
		});
		
		return ac;
	}
}

public class VentanasEliminar {
	EliminarC ec = new EliminarC();
}
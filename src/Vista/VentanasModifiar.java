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

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import Controlador.databaseDAO;
import Modelo.Cliente;

class ModificarC extends JFrame{
	
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
	
	public JInternalFrame ModificarCliente(boolean visible) {
		
	
		
		JInternalFrame ac = new JInternalFrame();
		
		ac.getContentPane().setLayout(null);
		ac.setDefaultCloseOperation(HIDE_ON_CLOSE);
		ac.setTitle("Modificaciones");
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
			
			JLabel lT = new JLabel("Modificar un cliente");
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
			
		//Retroalimentacion
			
			JLabel ra1 = new JLabel("<html><body style='text-align: center'>Condiciones:<br> - Mayor de 3 caracteres");
			ra1.setFont(new Font("Arial", Font.BOLD, 10));
			ra1.setBounds(90, 530, 250, 25);
			ra1.setForeground(new Color(56, 53, 52 ));
			ra1.setVisible(false);
			ac.add(ra1);
			
			JLabel fo1 = new JLabel(" ");
			fo1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo1.setBounds(0, 530, 400, 25);
			fo1.setBackground(new Color(40, 116, 166 , 50));
			fo1.setOpaque(true);
			fo1.setVisible(false);
			ac.add(fo1);
			
			JLabel ra2 = new JLabel("<html><body style='text-align: center'>El nombre no cumple con condiciones<br> - Mayor de 3 caracteres");
			ra2.setFont(new Font("Arial", Font.BOLD, 10));
			ra2.setBounds(50, 530, 250, 25);
			ra2.setForeground(new Color(56, 53, 52));
			ra2.setVisible(false);
			ac.add(ra2);
			
			JLabel fo2 = new JLabel(" ");
			fo2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo2.setBounds(0, 530, 400, 25);
			fo2.setBackground(new Color(169, 50, 38  , 50));
			fo2.setOpaque(true);
			fo2.setVisible(false);
			ac.add(fo2);
			
			JLabel alimentacion3 = new JLabel("<html><body style='text-align: center'>Apellido Paterno Apellido Materno ");
			alimentacion3.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion3.setBounds(50, 530, 250, 25);
			alimentacion3.setForeground(new Color(56, 53, 52 ));
			alimentacion3.setVisible(false);
			ac.add(alimentacion3);
			
			JLabel fondo3 = new JLabel(" ");
			fondo3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo3.setBounds(0, 530, 400, 25);
			fondo3.setBackground(new Color(40, 116, 166 , 50));
			fondo3.setOpaque(true);
			fondo3.setVisible(false);
			ac.add(fondo3);
			
			
			JLabel alimentacion4 = new JLabel("<html><body style='text-align: center'>Numero, Nombre de la calle, Municipio, Estado");
			alimentacion4.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion4.setBounds(25, 530, 250, 25);
			alimentacion4.setForeground(new Color(56, 53, 52 ));
			alimentacion4.setVisible(false);
			ac.add(alimentacion4);
			
			JLabel fondo4 = new JLabel(" ");
			fondo4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo4.setBounds(0, 530, 400, 25);
			fondo4.setBackground(new Color(40, 116, 166 , 50));
			fondo4.setOpaque(true);
			fondo4.setVisible(false);
			ac.add(fondo4);
			
			
			JLabel alimentacion5 = new JLabel("<html><body style='text-align: center'># # # -# # # -# # # #");
			alimentacion5.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion5.setBounds(50, 530, 250, 25);
			alimentacion5.setForeground(new Color(56, 53, 52 ));
			alimentacion5.setVisible(false);
			ac.add(alimentacion5);
			
			JLabel fondo5 = new JLabel(" ");
			fondo5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo5.setBounds(0, 530, 400, 25);
			fondo5.setBackground(new Color(40, 116, 166 , 50));
			fondo5.setOpaque(true);
			fondo5.setVisible(false);
			ac.add(fondo5);
			
			
			JLabel alimentacion6 = new JLabel("<html><body style='text-align: center'>Numero de telefono Incorecto");
			alimentacion6.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion6.setBounds(50, 530, 250, 25);
			alimentacion6.setForeground(new Color(236, 112, 99 ));
			alimentacion6.setVisible(false);
			ac.add(alimentacion6);
			
			JLabel fondo6 = new JLabel(" ");
			fondo6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo6.setBounds(0, 530, 400, 25);
			fondo6.setBackground(new Color(40, 116, 166 , 50));
			fondo6.setOpaque(true);
			fondo6.setVisible(false);
			ac.add(fondo6);
			
			JLabel alimentacion7 = new JLabel("<html><body style='text-align: center'>Registro con exito");
			alimentacion7.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion7.setBounds(50, 530, 250, 25);
			alimentacion7.setForeground(new Color(24, 106, 59 ));
			alimentacion7.setVisible(false);
			ac.add(alimentacion7);
			
			JLabel fondo7 = new JLabel(" ");
			fondo7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo7.setBounds(0, 530, 400, 25);
			fondo7.setBackground(new Color(40, 116, 166 , 50));
			fondo7.setOpaque(true);
			fondo7.setVisible(false);
			ac.add(fondo7);
			
			JLabel alimentacion8 = new JLabel("<html><body style='text-align: center'>Registro fallido");
			alimentacion8.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion8.setBounds(50, 530, 250, 25);
			alimentacion8.setForeground(new Color(236, 112, 99 ));
			alimentacion8.setVisible(false);
			ac.add(alimentacion8);
			
			JLabel fondo8 = new JLabel(" ");
			fondo8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo8.setBounds(0, 530, 400, 25);
			fondo8.setBackground(new Color(40, 116, 166 , 50));
			fondo8.setOpaque(true);
			fondo8.setVisible(false);
			ac.add(fondo8);
			
			JLabel alimentacion9 = new JLabel("<html><body style='text-align: center'>Campo Vacio");
			alimentacion9.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion9.setBounds(50, 530, 250, 25);
			alimentacion9.setForeground(new Color(56, 53, 52 ));
			alimentacion9.setVisible(false);
			ac.add(alimentacion9);
			
			JLabel fondo9 = new JLabel(" ");
			fondo9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo9.setBounds(0, 530, 400, 25);
			fondo9.setBackground(new Color(40, 116, 166 , 50));
			fondo9.setOpaque(true);
			fondo9.setVisible(false);
			ac.add(fondo9);
			
			JLabel rab1 = new JLabel("<html><body style='text-align: center'>No se encontro el Usuario");
			rab1.setFont(new Font("Arial", Font.BOLD, 10));
			rab1.setBounds(90, 530, 250, 25);
			rab1.setForeground(new Color(56, 53, 52 ));
			rab1.setVisible(false);
			ac.add(rab1);
			
			JLabel fob1 = new JLabel(" ");
			fob1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fob1.setBounds(0, 530, 400, 25);
			fob1.setBackground(new Color(169, 50, 38, 50));
			fob1.setOpaque(true);
			fob1.setVisible(false);
			ac.add(fob1);
			
			
		//Retroalimentacion END
			
		
			

			
		JLabel lID = new JLabel("ID de cliente");
		lID.setBounds(20, 30, 200, 30);
		ac.add(lID);
		
		JTextField ID = new JTextField(10);
		ID.setBounds(20, 60, 250, 30);
		ac.add(ID);
		
		JLabel lNo = new JLabel("Nombre");
		lNo.setBounds(20, 90, 200, 30);
		ac.add(lNo);
		
		JTextField Nombre = new JTextField(10);
		Nombre.setBounds(20, 120, 250, 30);
		ac.add(Nombre);
		Nombre.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				ra1.setVisible(true);
				fo1.setVisible(true);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
		});
		Nombre.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char car = e.getKeyChar();
				int c = car;
		        if((car<'a' || car>'z') && (car<'A' || car>'Z')) {
		        	
						e.consume();
		        }
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				char car = e.getKeyChar();
				if (car == ' ') {
					Nombre.setText(Nombre.getText()+" ");
				}
			}
		});
		
		JLabel lAp = new JLabel("Apellido");
		lAp.setBounds(20, 150, 200, 30);
		ac.add(lAp);
		
		JTextField Apellido = new JTextField(10);
		Apellido.setBounds(20, 180, 250, 30);
		ac.add(Apellido);
		Apellido.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(true);
				fondo3.setVisible(true);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
		});
		Apellido.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char car = e.getKeyChar();
		        if((car<'a' || car>'z') && (car<'A' || car>'Z')) {
		            	e.consume();
		        }
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				char car = e.getKeyChar();
				if (car == ' ') {
					Apellido.setText(Apellido.getText()+" ");
				}
				
			}
		});
		
		JLabel lEd = new JLabel("Edad");
		lEd.setBounds(20, 210, 200, 30);
		ac.add(lEd);
		
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("## a�os");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField Edad = new JFormattedTextField(mask);
		Edad.setBounds(20, 240, 250, 30);
		ac.add(Edad);
		Edad.addKeyListener(new KeyListener() {
			
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
		
		JLabel lDi = new JLabel("Direccion");
		lDi.setBounds(20, 270, 200, 30);
		ac.add(lDi);
		
		JTextField Direccion = new JTextField(10);
		Direccion.setBounds(20, 300, 250, 30);
		ac.add(Direccion);
		Direccion.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(true);
				fondo4.setVisible(true);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
		});
		
		JLabel lCo = new JLabel("Codigo Postal");
		lCo.setBounds(20, 330, 200, 30);
		ac.add(lCo);
		
		MaskFormatter mask2 = null;
		try {
			mask2 = new MaskFormatter("#####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField CP = new JFormattedTextField(mask2);
		CP.setBounds(20, 360, 250, 30);
		ac.add(CP);
		CP.addKeyListener(new KeyListener() {
			
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
		
		JLabel lTe = new JLabel("Telefono");
		lTe.setBounds(20, 390, 200, 30);
		ac.add(lTe);
		
		MaskFormatter mask3 = null;
		try {
			mask3 = new MaskFormatter("###-###-####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField Telefono = new JFormattedTextField(mask3);
		Telefono.setBounds(20, 420, 250, 30);
		ac.add(Telefono);
		Telefono.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(false);
				fondo5.setVisible(false);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				ra1.setVisible(false);
				fo1.setVisible(false);
				ra2.setVisible(false);
				fo2.setVisible(false);
				alimentacion3.setVisible(false);
				fondo3.setVisible(false);
				alimentacion4.setVisible(false);
				fondo4.setVisible(false);
				alimentacion5.setVisible(true);
				fondo5.setVisible(true);
				alimentacion6.setVisible(false);
				fondo6.setVisible(false);
				alimentacion7.setVisible(false);
				fondo7.setVisible(false);
				alimentacion8.setVisible(false);
				fondo8.setVisible(false);
				alimentacion9.setVisible(false);
				fondo9.setVisible(false);
				
			}
		});
		Telefono.addKeyListener(new KeyListener() {
			
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
		
		JButton Buscar = new JButton("Buscar");
		Buscar.setBounds(20, 470, 250, 30);
		ac.add(Buscar);
		Buscar.setVisible(true);
		
		JButton Registrar = new JButton("Actualizar");
		Registrar.setBounds(20, 470, 250, 30);
		ac.add(Registrar);
		Registrar.setVisible(false);
		Registrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String n,a,d,e,cp,te;
				int Id = 0;
				
				if(Nombre.getText().length() >=3) {
					n=Nombre.getText();
					if (Apellido.getText().length() >0) {
						a=Apellido.getText();
							String ec = Edad.getText().substring(0, 2);
							int u = ec.charAt(0);
							int dos = ec.charAt(1);
						if (u >= 48 && u <= 57 && dos >= 48 && dos <= 57) {
							e=Edad.getText();
							if (Direccion.getText().length() >0) {
								d= Direccion.getText();
								if (CP.getText().length() >0) {
									cp= CP.getText();
									int cont = 0;
									for (int i = 0; i < Telefono.getText().length(); i++) {
										if (Telefono.getText().charAt(i)>=48 && Telefono.getText().charAt(i)<=57) {
											
											cont++;
										}
									}
									if (!Telefono.getText().equals("   -   -    ") && cont == 10 ) {
										te=Telefono.getText();
										Id = Id+1;
										boolean res= b.modificarCliente(new Cliente(Integer.parseInt(ID.getText()),n, a, e.substring(0, 2), d, cp, te.replace("-", "")));
										if (res) {
											construirTabla1(miBarra1);
											ID.setText("");
											Nombre.setText("");
											Apellido.setText("");
											Edad.setText("");
											Direccion.setText("");
											CP.setText("");
											Telefono.setText("");
											
											Registrar.setVisible(false);
											Buscar.setVisible(true);
											
											
											ra1.setVisible(false);
											fo1.setVisible(false);
											ra2.setVisible(false);
											fo2.setVisible(false);
											alimentacion3.setVisible(false);
											fondo3.setVisible(false);
											alimentacion4.setVisible(false);
											fondo4.setVisible(false);
											alimentacion5.setVisible(false);
											fondo5.setVisible(false);
											alimentacion6.setVisible(false);
											fondo6.setVisible(false);
											alimentacion7.setVisible(true);
											fondo7.setVisible(true);
											alimentacion8.setVisible(false);
											fondo8.setVisible(false);
											alimentacion9.setVisible(false);
											fondo9.setVisible(false);
										}else {
											ra1.setVisible(false);
											fo1.setVisible(false);
											ra2.setVisible(false);
											fo2.setVisible(false);
											alimentacion3.setVisible(false);
											fondo3.setVisible(false);
											alimentacion4.setVisible(false);
											fondo4.setVisible(false);
											alimentacion5.setVisible(false);
											fondo5.setVisible(false);
											alimentacion6.setVisible(false);
											fondo6.setVisible(false);
											alimentacion7.setVisible(false);
											fondo7.setVisible(false);
											alimentacion8.setVisible(true);
											fondo8.setVisible(true);
											alimentacion9.setVisible(false);
											fondo9.setVisible(false);
										}
										
									} else {
										ra1.setVisible(false);
										fo1.setVisible(false);
										ra2.setVisible(false);
										fo2.setVisible(false);
										alimentacion3.setVisible(false);
										fondo3.setVisible(false);
										alimentacion4.setVisible(false);
										fondo4.setVisible(false);
										alimentacion5.setVisible(false);
										fondo5.setVisible(false);
										alimentacion6.setVisible(false);
										fondo6.setVisible(false);
										alimentacion7.setVisible(false);
										fondo7.setVisible(false);
										alimentacion8.setVisible(false);
										fondo8.setVisible(false);
										alimentacion9.setVisible(true);
										fondo9.setVisible(true);
									}
								} else {
									ra1.setVisible(false);
									fo1.setVisible(false);
									ra2.setVisible(false);
									fo2.setVisible(false);
									alimentacion3.setVisible(false);
									fondo3.setVisible(false);
									alimentacion4.setVisible(false);
									fondo4.setVisible(false);
									alimentacion5.setVisible(false);
									fondo5.setVisible(false);
									alimentacion6.setVisible(false);
									fondo6.setVisible(false);
									alimentacion7.setVisible(false);
									fondo7.setVisible(false);
									alimentacion8.setVisible(false);
									fondo8.setVisible(false);
									alimentacion9.setVisible(true);
									fondo9.setVisible(true);
								}
								
							} else {
								ra1.setVisible(false);
								fo1.setVisible(false);
								ra2.setVisible(false);
								fo2.setVisible(false);
								alimentacion3.setVisible(false);
								fondo3.setVisible(false);
								alimentacion4.setVisible(false);
								fondo4.setVisible(false);
								alimentacion5.setVisible(false);
								fondo5.setVisible(false);
								alimentacion6.setVisible(false);
								fondo6.setVisible(false);
								alimentacion7.setVisible(false);
								fondo7.setVisible(false);
								alimentacion8.setVisible(false);
								fondo8.setVisible(false);
								alimentacion9.setVisible(true);
								fondo9.setVisible(true);
							}
							
						} else {
							ra1.setVisible(false);
							fo1.setVisible(false);
							ra2.setVisible(false);
							fo2.setVisible(false);
							alimentacion3.setVisible(false);
							fondo3.setVisible(false);
							alimentacion4.setVisible(false);
							fondo4.setVisible(false);
							alimentacion5.setVisible(false);
							fondo5.setVisible(false);
							alimentacion6.setVisible(false);
							fondo6.setVisible(false);
							alimentacion7.setVisible(false);
							fondo7.setVisible(false);
							alimentacion8.setVisible(false);
							fondo8.setVisible(false);
							alimentacion9.setVisible(true);
							fondo9.setVisible(true);
						}
						
					} else {
						ra1.setVisible(false);
						fo1.setVisible(false);
						ra2.setVisible(false);
						fo2.setVisible(false);
						alimentacion3.setVisible(false);
						fondo3.setVisible(false);
						alimentacion4.setVisible(false);
						fondo4.setVisible(false);
						alimentacion5.setVisible(false);
						fondo5.setVisible(false);
						alimentacion6.setVisible(false);
						fondo6.setVisible(false);
						alimentacion7.setVisible(false);
						fondo7.setVisible(false);
						alimentacion8.setVisible(false);
						fondo8.setVisible(false);
						alimentacion9.setVisible(true);
						fondo9.setVisible(true);
					}
					
				}else {
					ra1.setVisible(false);
					fo1.setVisible(false);
					ra2.setVisible(true);
					fo2.setVisible(true);
					alimentacion3.setVisible(false);
					fondo3.setVisible(false);
					alimentacion4.setVisible(false);
					fondo4.setVisible(false);
					alimentacion5.setVisible(false);
					fondo5.setVisible(false);
					alimentacion6.setVisible(false);
					fondo6.setVisible(false);
					alimentacion7.setVisible(false);
					fondo7.setVisible(false);
					alimentacion8.setVisible(false);
					fondo8.setVisible(false);
					alimentacion9.setVisible(false);
					fondo9.setVisible(false);
				}
				
			}
		});
		
		Buscar.addActionListener(new ActionListener() {
			
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
							Direccion.setText(en.getDireccion());
							Telefono.setText(en.getTelefono());
							
							Registrar.setVisible(true);
							Buscar.setVisible(false);
							
							
						} else {
							ra1.setVisible(false);
							fo1.setVisible(false);
							ra2.setVisible(false);
							fo2.setVisible(false);
							alimentacion3.setVisible(false);
							fondo3.setVisible(false);
							alimentacion4.setVisible(false);
							fondo4.setVisible(false);
							alimentacion5.setVisible(false);
							fondo5.setVisible(false);
							alimentacion6.setVisible(false);
							fondo6.setVisible(false);
							alimentacion7.setVisible(true);
							fondo7.setVisible(true);
							alimentacion8.setVisible(false);
							fondo8.setVisible(false);
							alimentacion9.setVisible(false);
							fondo9.setVisible(false);
							rab1.setVisible(true);
							fob1.setVisible(true);
						}
				}catch (Exception e1) {
					ra1.setVisible(false);
					fo1.setVisible(false);
					ra2.setVisible(false);
					fo2.setVisible(false);
					alimentacion3.setVisible(false);
					fondo3.setVisible(false);
					alimentacion4.setVisible(false);
					fondo4.setVisible(false);
					alimentacion5.setVisible(false);
					fondo5.setVisible(false);
					alimentacion6.setVisible(false);
					fondo6.setVisible(false);
					alimentacion7.setVisible(true);
					fondo7.setVisible(true);
					alimentacion8.setVisible(false);
					fondo8.setVisible(false);
					alimentacion9.setVisible(false);
					fondo9.setVisible(false);
					rab1.setVisible(true);
					fob1.setVisible(true);
				}
			}
		});
		
		JLabel Cancelar = new JLabel("Cancelar");
		Cancelar.setFont(new Font("Arial", Font.BOLD, 12));
		Cancelar.setBounds(20, 500, 90, 20);
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
				Direccion.setText("");
				CP.setText("");
				Telefono.setText("");
				ac.setVisible(false);
				
			}
		});
		
		return ac;
	}
}

public class VentanasModifiar {
	ModificarC mc = new ModificarC();
}
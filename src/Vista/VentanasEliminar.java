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

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import Controlador.databaseDAO;
import Modelo.Cliente;

class EliminarC extends JFrame{
	
	
	
	public JPanel EliminarCliente(boolean visible) {
		
	
		
		JPanel ac = new JPanel();
		
			ac.setLayout(null);
			ac.setSize(400, 400);
			ac.setVisible(visible);
			ac.setBackground(new Color(214, 219, 223));
			ac.setOpaque(true);
			
			databaseDAO b = new databaseDAO();
			
		//Retroalimentacion
			
			JLabel ra1 = new JLabel("<html><body style='text-align: center'>Condiciones:<br> - Mayor de 3 caracteres");
			ra1.setFont(new Font("Arial", Font.BOLD, 10));
			ra1.setBounds(90, 480, 250, 25);
			ra1.setForeground(new Color(56, 53, 52 ));
			ra1.setVisible(false);
			ac.add(ra1);
			
			JLabel fo1 = new JLabel(" ");
			fo1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo1.setBounds(0, 480, 400, 25);
			fo1.setBackground(new Color(40, 116, 166 , 50));
			fo1.setOpaque(true);
			fo1.setVisible(false);
			ac.add(fo1);
			
			JLabel ra2 = new JLabel("<html><body style='text-align: center'>El nombre no cumple con condiciones<br> - Mayor de 3 caracteres");
			ra2.setFont(new Font("Arial", Font.BOLD, 10));
			ra2.setBounds(50, 480, 250, 25);
			ra2.setForeground(new Color(56, 53, 52));
			ra2.setVisible(false);
			ac.add(ra2);
			
			JLabel fo2 = new JLabel(" ");
			fo2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo2.setBounds(0, 480, 400, 25);
			fo2.setBackground(new Color(169, 50, 38  , 50));
			fo2.setOpaque(true);
			fo2.setVisible(false);
			ac.add(fo2);
			
			JLabel alimentacion3 = new JLabel("<html><body style='text-align: center'>Apellido Paterno Apellido Materno ");
			alimentacion3.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion3.setBounds(50, 480, 250, 25);
			alimentacion3.setForeground(new Color(56, 53, 52 ));
			alimentacion3.setVisible(false);
			ac.add(alimentacion3);
			
			JLabel fondo3 = new JLabel(" ");
			fondo3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo3.setBounds(0, 480, 400, 25);
			fondo3.setBackground(new Color(40, 116, 166 , 50));
			fondo3.setOpaque(true);
			fondo3.setVisible(false);
			ac.add(fondo3);
			
			
			JLabel alimentacion4 = new JLabel("<html><body style='text-align: center'>Numero, Nombre de la calle, Municipio, Estado");
			alimentacion4.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion4.setBounds(25, 480, 250, 25);
			alimentacion4.setForeground(new Color(56, 53, 52 ));
			alimentacion4.setVisible(false);
			ac.add(alimentacion4);
			
			JLabel fondo4 = new JLabel(" ");
			fondo4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo4.setBounds(0, 480, 400, 25);
			fondo4.setBackground(new Color(40, 116, 166 , 50));
			fondo4.setOpaque(true);
			fondo4.setVisible(false);
			ac.add(fondo4);
			
			
			JLabel alimentacion5 = new JLabel("<html><body style='text-align: center'># # # -# # # -# # # #");
			alimentacion5.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion5.setBounds(50, 480, 250, 25);
			alimentacion5.setForeground(new Color(56, 53, 52 ));
			alimentacion5.setVisible(false);
			ac.add(alimentacion5);
			
			JLabel fondo5 = new JLabel(" ");
			fondo5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo5.setBounds(0, 480, 400, 25);
			fondo5.setBackground(new Color(40, 116, 166 , 50));
			fondo5.setOpaque(true);
			fondo5.setVisible(false);
			ac.add(fondo5);
			
			
			JLabel alimentacion6 = new JLabel("<html><body style='text-align: center'>Numero de telefono Incorecto");
			alimentacion6.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion6.setBounds(50, 480, 250, 25);
			alimentacion6.setForeground(new Color(236, 112, 99 ));
			alimentacion6.setVisible(false);
			ac.add(alimentacion6);
			
			JLabel fondo6 = new JLabel(" ");
			fondo6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo6.setBounds(0, 480, 400, 25);
			fondo6.setBackground(new Color(40, 116, 166 , 50));
			fondo6.setOpaque(true);
			fondo6.setVisible(false);
			ac.add(fondo6);
			
			JLabel alimentacion7 = new JLabel("<html><body style='text-align: center'>Registro con exito");
			alimentacion7.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion7.setBounds(50, 480, 250, 25);
			alimentacion7.setForeground(new Color(24, 106, 59 ));
			alimentacion7.setVisible(false);
			ac.add(alimentacion7);
			
			JLabel fondo7 = new JLabel(" ");
			fondo7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo7.setBounds(0, 480, 400, 25);
			fondo7.setBackground(new Color(40, 116, 166 , 50));
			fondo7.setOpaque(true);
			fondo7.setVisible(false);
			ac.add(fondo7);
			
			JLabel alimentacion8 = new JLabel("<html><body style='text-align: center'>Registro fallido");
			alimentacion8.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion8.setBounds(50, 480, 250, 25);
			alimentacion8.setForeground(new Color(236, 112, 99 ));
			alimentacion8.setVisible(false);
			ac.add(alimentacion8);
			
			JLabel fondo8 = new JLabel(" ");
			fondo8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo8.setBounds(0, 480, 400, 25);
			fondo8.setBackground(new Color(40, 116, 166 , 50));
			fondo8.setOpaque(true);
			fondo8.setVisible(false);
			ac.add(fondo8);
			
			JLabel alimentacion9 = new JLabel("<html><body style='text-align: center'>Campo Vacio");
			alimentacion9.setFont(new Font("Arial", Font.BOLD, 10));
			alimentacion9.setBounds(50, 480, 250, 25);
			alimentacion9.setForeground(new Color(56, 53, 52 ));
			alimentacion9.setVisible(false);
			ac.add(alimentacion9);
			
			JLabel fondo9 = new JLabel(" ");
			fondo9.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fondo9.setBounds(0, 480, 400, 25);
			fondo9.setBackground(new Color(40, 116, 166 , 50));
			fondo9.setOpaque(true);
			fondo9.setVisible(false);
			ac.add(fondo9);
			
			
		//Retroalimentacion END
			
		
			
		JLabel lT = new JLabel("Registro de un cliente");
		lT.setFont(new Font("Arial", Font.ITALIC, 18));
		lT.setBounds(60, 5, 200, 30);
		ac.add(lT);
			
		JLabel lNo = new JLabel("Nombre");
		lNo.setBounds(20, 30, 200, 30);
		ac.add(lNo);
		
		JTextField Nombre = new JTextField(10);
		Nombre.setBounds(20, 60, 250, 30);
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
		lAp.setBounds(20, 90, 200, 30);
		ac.add(lAp);
		
		JTextField Apellido = new JTextField(10);
		Apellido.setBounds(20, 120, 250, 30);
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
		lEd.setBounds(20, 150, 200, 30);
		ac.add(lEd);
		
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("## años");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField Edad = new JFormattedTextField(mask);
		Edad.setBounds(20, 180, 250, 30);
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
		lDi.setBounds(20, 210, 200, 30);
		ac.add(lDi);
		
		JTextField Direccion = new JTextField(10);
		Direccion.setBounds(20, 240, 250, 30);
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
		

		
		JButton Registrar = new JButton("Registrar");
		Registrar.setBounds(20, 420, 250, 30);
		ac.add(Registrar);
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
										boolean res= b.agregarCliente(new Cliente(n, a, e.substring(0, 2), d, cp, te.replace("-", "")));
										if (res) {
											
											Nombre.setText("");
											Apellido.setText("");
											Edad.setText("");
											Direccion.setText("");
											CP.setText("");
											Telefono.setText("");
											
											
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
		
		JLabel Cancelar = new JLabel("Cancelar");
		Cancelar.setFont(new Font("Arial", Font.BOLD, 12));
		Cancelar.setBounds(20, 450, 90, 20);
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

public class VentanasEliminar {
	EliminarC ec = new EliminarC();
}
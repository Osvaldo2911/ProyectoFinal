 package Vista;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import Controlador.databaseDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class Login extends JFrame{
	
	public Login() {
		
		// Ventana de registro
		JFrame Registro = new JFrame();
		Registro.getContentPane().setLayout(null);
		Registro.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Registro.setTitle("Registro");

		Registro.setSize(400, 370);
		Registro.setLocationRelativeTo(null);
		Registro.setVisible(false);
		Registro.getContentPane().setBackground(new Color(241, 236, 235 ));
		Registro.setResizable(false);
		
		databaseDAO b = new databaseDAO();
		
		// ALIMENTAION
		
		JLabel alimentacion1 = new JLabel("<html><body style='text-align: center'>Condiciones:<br> - Mayor de 6 caracteres");
		alimentacion1.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion1.setBounds(132, 280, 250, 25);
		alimentacion1.setForeground(new Color(56, 53, 52 ));
		alimentacion1.setVisible(false);
		Registro.add(alimentacion1);
		
		JLabel fondo1 = new JLabel(" ");
		fondo1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo1.setBounds(0, 280, 400, 25);
		fondo1.setBackground(new Color(40, 116, 166 , 50));
		fondo1.setOpaque(true);
		fondo1.setVisible(false);
		Registro.add(fondo1);
		
		
		JLabel alimentacion2 = new JLabel("<html><body style='text-align: center'>Condiciones:<br> - Mayor de 8 caracteres <br> - Contener mayusculas y minusculas <br> - Contener numeros");
		alimentacion2.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion2.setBounds(100, 280, 250, 50);
		alimentacion2.setForeground(new Color(56, 53, 52 ));
		alimentacion2.setVisible(false);
		Registro.add(alimentacion2);
		
		JLabel fondo2 = new JLabel(" ");
		fondo2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo2.setBounds(0, 280, 400, 50);
		fondo2.setBackground(new Color(40, 116, 166 , 50));
		fondo2.setOpaque(true);
		fondo2.setVisible(false);
		Registro.add(fondo2);
		
		
		JLabel alimentacion3 = new JLabel("<html><body style='text-align: center'>Contraseña incorrecta");
		alimentacion3.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion3.setBounds(132, 280, 250, 25);
		alimentacion3.setForeground(new Color(236, 112, 99 ));
		alimentacion3.setVisible(false);
		Registro.add(alimentacion3);
		
		JLabel fondo3 = new JLabel(" ");
		fondo3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo3.setBounds(0, 280, 400, 25);
		fondo3.setBackground(new Color(40, 116, 166 , 50));
		fondo3.setOpaque(true);
		fondo3.setVisible(false);
		Registro.add(fondo3);
		
		
		JLabel alimentacion4 = new JLabel("<html><body style='text-align: center'>Nombre de usuario en uso");
		alimentacion4.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion4.setBounds(125, 273, 250, 25);
		alimentacion4.setForeground(new Color(56, 53, 52 ));
		alimentacion4.setVisible(false);
		Registro.add(alimentacion4);
		
		JLabel fondo4 = new JLabel(" ");
		fondo4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo4.setBounds(0, 275, 400, 25);
		fondo4.setBackground(new Color(146, 43, 33, 50));
		fondo4.setOpaque(true);
		fondo4.setVisible(false);
		Registro.add(fondo4);
		
		
		JLabel alimentacion5 = new JLabel("<html><body style='text-align: center'>La contraseña no cumple <br> con las condiciones ");
		alimentacion5.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion5.setBounds(125, 280, 250, 25);
		alimentacion5.setForeground(new Color(236, 112, 99 ));
		alimentacion5.setVisible(false);
		Registro.add(alimentacion5);
		
		JLabel fondo5 = new JLabel(" ");
		fondo5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo5.setBounds(0, 280, 400, 25);
		fondo5.setBackground(new Color(40, 116, 166 , 50));
		fondo5.setOpaque(true);
		fondo5.setVisible(false);
		Registro.add(fondo5);
		
		
		JLabel alimentacion6 = new JLabel("<html><body style='text-align: center'>El usuario no cumple <br> con las condiciones ");
		alimentacion6.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion6.setBounds(140, 280, 250, 25);
		alimentacion6.setForeground(new Color(236, 112, 99 ));
		alimentacion6.setVisible(false);
		Registro.add(alimentacion6);
		
		JLabel fondo6 = new JLabel(" ");
		fondo6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo6.setBounds(0, 280, 400, 25);
		fondo6.setBackground(new Color(40, 116, 166 , 50));
		fondo6.setOpaque(true);
		fondo6.setVisible(false);
		Registro.add(fondo6);
		
		JLabel alimentacion7 = new JLabel("<html><body style='text-align: center'>Registro con exito");
		alimentacion7.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion7.setBounds(140, 280, 250, 25);
		alimentacion7.setForeground(new Color(24, 106, 59 ));
		alimentacion7.setVisible(false);
		Registro.add(alimentacion7);
		
		JLabel fondo7 = new JLabel(" ");
		fondo7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo7.setBounds(0, 280, 400, 25);
		fondo7.setBackground(new Color(40, 116, 166 , 50));
		fondo7.setOpaque(true);
		fondo7.setVisible(false);
		Registro.add(fondo7);
		
		JLabel alimentacion8 = new JLabel("<html><body style='text-align: center'>Registro fallido");
		alimentacion8.setFont(new Font("Arial", Font.BOLD, 10));
		alimentacion8.setBounds(140, 280, 250, 25);
		alimentacion8.setForeground(new Color(236, 112, 99 ));
		alimentacion8.setVisible(false);
		Registro.add(alimentacion8);
		
		JLabel fondo8 = new JLabel(" ");
		fondo8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fondo8.setBounds(0, 280, 400, 25);
		fondo8.setBackground(new Color(40, 116, 166 , 50));
		fondo8.setOpaque(true);
		fondo8.setVisible(false);
		Registro.add(fondo8);
		
		// ALIMENTACION END
		
		JLabel tituloR = new JLabel();
		tituloR.setText("Locania");
		tituloR.setFont(new Font("Edwardian Script ITC", Font.BOLD, 25));
		tituloR.setBounds(25, 5, 80, 20);
		tituloR.setForeground(new Color(236, 240, 241  ));
		Registro.add(tituloR);
		
		JLabel subTR = new JLabel();
		subTR.setText("Hotel");
		subTR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 8));
		subTR.setBounds(50, 20, 40, 20);
		subTR.setForeground(new Color(236, 240, 241 ));
		Registro.add(subTR);
		
		JLabel lTR = new JLabel("");
		lTR.setBounds(20, 0, 5, 40);
		lTR.setBackground(new Color(10, 134, 238));
		lTR.setOpaque(true);
		Registro.add(lTR);
		
		JLabel lT2R = new JLabel("");
		lT2R.setBounds(370, 0, 5, 40);
		lT2R.setBackground(new Color(10, 134, 238));
		lT2R.setOpaque(true);
		Registro.add(lT2R);
		
		JLabel fTR = new JLabel("");
		fTR.setBounds(0, 0, 400, 40);
		fTR.setBackground(new Color(48, 102, 190));
		fTR.setOpaque(true);
		Registro.add(fTR);
		
		JLabel lvUsuarioR = new JLabel("Nombre de usuario");
		lvUsuarioR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		lvUsuarioR.setBounds(85, 50, 120, 20);
		lvUsuarioR.setForeground(new Color(56, 53, 52 ));
		Registro.add(lvUsuarioR);
		
		JTextField UsuarioR = new JTextField(10);
		UsuarioR.setBounds(85, 70, 200, 30);
		Registro.add(UsuarioR);
		UsuarioR.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				alimentacion1.setVisible(false);
				fondo1.setVisible(false);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				alimentacion1.setVisible(true);
				fondo1.setVisible(true);
				alimentacion2.setVisible(false);
				fondo2.setVisible(false);
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
			}
		});
		UsuarioR.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char car = e.getKeyChar();
		        if((car<'a' || car>'z') && (car<'A' || car>'Z')) {
		            if((car<'0' || car>'9')) {
		            	e.consume();
		            }
		        }
		        	
		        
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {

				
			}
		});
		
		JLabel lvContraseñaR = new JLabel("Contraseña");
		lvContraseñaR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		lvContraseñaR.setBounds(85, 100, 100, 20);
		lvContraseñaR.setForeground(new Color(56, 53, 52 ));
		Registro.add(lvContraseñaR);
		
		JPasswordField ContraR = new JPasswordField(10);
		ContraR.setText("");
		ContraR.setEchoChar('*');
		ContraR.setBounds(85, 120, 200, 30);
		Registro.add(ContraR);
		ContraR.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				alimentacion2.setVisible(false);
				fondo2.setVisible(false);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				alimentacion1.setVisible(false);
				fondo1.setVisible(false);
				alimentacion2.setVisible(true);
				fondo2.setVisible(true);
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
			}
		});
		
		ContraR.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char car = e.getKeyChar();
		        if((car<'!' || car>'@') && (car<'A' || car>'}')) e.consume();
		        	
		        
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {

				
			}
		});
		
		JLabel lvContraseñaRC = new JLabel("Confirmar contraseña");
		lvContraseñaRC.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		lvContraseñaRC.setBounds(85, 150, 150, 20);
		lvContraseñaRC.setForeground(new Color(56, 53, 52 ));
		Registro.add(lvContraseñaRC);
		
		JPasswordField ContraRC = new JPasswordField(10);
		ContraRC.setText("");
		ContraRC.setEchoChar('*');
		ContraRC.setBounds(85, 170, 200, 30);
		Registro.add(ContraRC);
		
		ContraRC.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char car = e.getKeyChar();
		        if((car<'!' || car>'@') && (car<'A' || car>'}')) e.consume();
		        	
		        
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {

				
			}
		});
		
		
		
		JButton ISR = new JButton("Registrar");
		ISR.setBounds(85, 210, 200, 30);
		Registro.add(ISR);
		ISR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Timer t = null;
				String n;
				String c;
				
				if (UsuarioR.getText().length() >= 6) {
					
					String UsR = UsuarioR.getText().replace(" ", "");
					Modelo.Registro encontrado = b.buscarRegistro(UsR);
					boolean en;
					try {
						en = encontrado.getNombre().equals(UsR);
					} catch (java.lang.NullPointerException e2) {
						en = false;
					}
					
					if (en) {
						//4
						alimentacion1.setVisible(false);
						fondo1.setVisible(false);
						alimentacion2.setVisible(false);
						fondo2.setVisible(false);
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
					}else {
						System.out.println("Nombre disponible");
						n = UsR;
						String con = ContraR.getText()+"".replace(" ", "");
						boolean M = false;
						boolean m = false;
						boolean num = false;
						boolean condicion = false;
						
						if (con.length()>8) {
							for (int i = 0; i < con.length(); i++) {
								int nl = con.charAt(i);
								if (nl > 65 && nl < 90) {
									M = true;
								} else if (nl > 97 && nl < 122) {
									m = true;
								} else if (nl > 48 && nl < 57) {
									num = true;
								} else {
									
								}
								if (M && m && num ) {
									condicion = true;
									break;
								}
							}
							
							if (condicion) {
								c = con;
								String conC = ContraRC.getText()+"".replace(" ", "");
								
								System.out.println(con + "----" + conC);
								
								if (conC.equals(c)) {
									
									boolean reEx = b.agregarRegistro(new Modelo.Registro(n, c));
									UsuarioR.setText("");
									ContraR.setText("");
									ContraRC.setText("");
									
									if (reEx) {
										//7
										alimentacion1.setVisible(false);
										fondo1.setVisible(false);
										alimentacion2.setVisible(false);
										fondo2.setVisible(false);
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
									} else {
										//8
										alimentacion1.setVisible(false);
										fondo1.setVisible(false);
										alimentacion2.setVisible(false);
										fondo2.setVisible(false);
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
									}
									
								} else {
									//3
									alimentacion1.setVisible(false);
									fondo1.setVisible(false);
									alimentacion2.setVisible(false);
									fondo2.setVisible(false);
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
								}
							}else {
								
								alimentacion1.setVisible(false);
								fondo1.setVisible(false);
								alimentacion2.setVisible(false);
								fondo2.setVisible(false);
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
							}
							
						} else {
							alimentacion1.setVisible(false);
							fondo1.setVisible(false);
							alimentacion2.setVisible(false);
							fondo2.setVisible(false);
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
						}
						
					}
					
				} else {
					alimentacion1.setVisible(false);
					fondo1.setVisible(false);
					alimentacion2.setVisible(false);
					fondo2.setVisible(false);
					alimentacion3.setVisible(false);
					fondo3.setVisible(false);
					alimentacion4.setVisible(false);
					fondo4.setVisible(false);
					alimentacion5.setVisible(false);
					fondo5.setVisible(false);
					alimentacion6.setVisible(true);
					fondo6.setVisible(true);
					alimentacion7.setVisible(false);
					fondo7.setVisible(false);
					alimentacion8.setVisible(false);
					fondo8.setVisible(false);
				}
			}
		});
		
		
		JLabel iniciaSecion = new JLabel("Iniciar sesion");
		iniciaSecion.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		iniciaSecion.setBounds(85, 250, 90, 20);
		iniciaSecion.setForeground(new Color(56, 53, 52 ));
		Registro.add(iniciaSecion);
		iniciaSecion.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				iniciaSecion.setForeground(new Color(48, 102, 190));
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				iniciaSecion.setForeground(new Color(133, 193, 233));
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				iniciaSecion.setForeground(new Color(56, 53, 52));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				iniciaSecion.setForeground(new Color(48, 102, 190));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Registro.setVisible(false);
				setVisible(true);
				
				
			}
		});
		
		
		

		
		
		
		// Ventana de Inicio de sesion
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Login");

		setSize(400, 370);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(new Color(241, 236, 235 ));
		setResizable(false);
		
		//Retroalimentacion
		
		JLabel ali1 = new JLabel("<html><body style='text-align: center'>El Usuario o la contraseña<br>son incorrectos");
		ali1.setFont(new Font("Arial", Font.BOLD, 10));
		ali1.setBounds(125, 280, 250, 25);
		ali1.setForeground(new Color(236, 112, 99 ));
		ali1.setVisible(false);
		add(ali1);
		
		JLabel fo1 = new JLabel(" ");
		fo1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		fo1.setBounds(0, 280, 400, 25);
		fo1.setBackground(new Color(40, 116, 166 , 50));
		fo1.setOpaque(true);
		fo1.setVisible(false);
		add(fo1);
		
		//Retroalimentacion END
		
		JLabel titulo = new JLabel();
		titulo.setText("Locania");
		titulo.setFont(new Font("Edwardian Script ITC", Font.BOLD, 60));
		titulo.setBounds(90, 10, 200, 50);
		titulo.setForeground(new Color(236, 240, 241  ));
		add(titulo);
		
		JLabel subT = new JLabel();
		subT.setText("Hotel");
		subT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		subT.setBounds(160, 55, 60, 20);
		subT.setForeground(new Color(236, 240, 241 ));
		add(subT);
		
		JLabel lT = new JLabel("");
		lT.setBounds(20, 0, 5, 90);
		lT.setBackground(new Color(10, 134, 238));
		lT.setOpaque(true);
		add(lT);
		
		JLabel lT2 = new JLabel("");
		lT2.setBounds(370, 0, 5, 90);
		lT2.setBackground(new Color(10, 134, 238));
		lT2.setOpaque(true);
		add(lT2);
		
		JLabel fT = new JLabel("");
		fT.setBounds(0, 0, 400, 90);
		fT.setBackground(new Color(48, 102, 190));
		fT.setOpaque(true);
		add(fT);
		
		JLabel lvUsuario = new JLabel("Usuario");
		lvUsuario.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		lvUsuario.setBounds(85, 100, 100, 20);
		lvUsuario.setForeground(new Color(56, 53, 52 ));
		add(lvUsuario);
		
		JTextField Usuario = new JTextField(10);
		Usuario.setText("");
		Usuario.setBounds(85, 120, 200, 30);
		add(Usuario);
		Usuario.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				ali1.setVisible(false);
				fo1.setVisible(false);
				
			}
		});
		
		JLabel lvContraseña = new JLabel("Contraseña");
		lvContraseña.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		lvContraseña.setBounds(85, 150, 100, 20);
		lvContraseña.setForeground(new Color(56, 53, 52 ));
		add(lvContraseña);
		
		JPasswordField Contra = new JPasswordField(10);
		Contra.setText("");
		Contra.setEchoChar('*');
		Contra.setBounds(85, 170, 200, 30);
		add(Contra);
		Contra.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				ali1.setVisible(false);
				fo1.setVisible(false);
				
			}
		});
		
		JButton IS = new JButton("Iniciar Sesion");
		IS.setBounds(85, 210, 200, 30);
		add(IS);
		IS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String us = Usuario.getText().replace(" ", "");
				String co = Contra.getText().replace(" ", "");
				Modelo.Registro enc = b.buscarRegistroLogin(us, co);
				
				boolean enl;
				try {
					enl = enc.getNombre().equals(us) && enc.getContraseña().equals(co);
				} catch (java.lang.NullPointerException e2) {
					enl = false;
				}
				
				if (enl) {
					// programa
					System.out.println("Entraste");
				} else {
					ali1.setVisible(true);
					fo1.setVisible(true);
					Usuario.setText("");
					Contra.setText("");
				}
				
			}
		});

		JLabel registrate = new JLabel("Registrate");
		registrate.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
		registrate.setBounds(85, 250, 70, 20);
		registrate.setForeground(new Color(56, 53, 52 ));
		add(registrate);
		registrate.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				registrate.setForeground(new Color(48, 102, 190));
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				registrate.setForeground(new Color(133, 193, 233));
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				registrate.setForeground(new Color(56, 53, 52));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				registrate.setForeground(new Color(48, 102, 190));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Registro.setVisible(true);
				setVisible(false);
				
				
			}
		});
		
		
		
	}
}

public class InicioSeg {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Login();

			}// metodo override
		});

	}

}

 package Vista;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

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

		Registro.setSize(400, 300);
		Registro.setLocationRelativeTo(null);
		Registro.setVisible(false);
		Registro.getContentPane().setBackground(new Color(241, 236, 235 ));
		Registro.setResizable(false);
		
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
				if(true) {
					
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

		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(new Color(241, 236, 235 ));
		setResizable(false);
		
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
		
		JButton IS = new JButton("Iniciar Sesion");
		IS.setBounds(85, 210, 200, 30);
		add(IS);

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

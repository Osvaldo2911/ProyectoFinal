 package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Login extends JFrame{
	
	public Login() {
		
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

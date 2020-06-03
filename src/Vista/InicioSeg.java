package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class Login extends JFrame{
	
	public Login() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Login");

		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(new Color(160,111,111));
		setResizable(false);
		
		JLabel titulo = new JLabel();
		titulo.setText("Locania");
		titulo.setFont(new Font("Edwardian Script ITC", Font.BOLD, 60));
		titulo.setBounds(90, 10, 200, 50);
		titulo.setForeground(Color.WHITE);
		add(titulo);
		
		JLabel subT = new JLabel();
		subT.setText("Hotel");
		subT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		subT.setBounds(160, 55, 60, 20);
		subT.setForeground(Color.WHITE);
		add(subT);
		
		JTextField Usuario = new JTextField(10);
		Usuario.setText("Usuario");
		Usuario.setBounds(85, 80, 200, 30);
		add(Usuario);
		
			Usuario.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					Usuario.setText("");
					
				}
			});
		
		
		JPasswordField Contra = new JPasswordField(10);
		Contra.setText("Contraseña");
		Contra.setEchoChar('*');
		Contra.setBounds(85, 120, 200, 30);
		add(Contra);
		Contra.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				Contra.setText("");
				
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

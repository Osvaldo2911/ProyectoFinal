package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame {

	JMenuBar menuBar;
	JMenu menuView;
	JMenu menuInicio;
	JMenuItem menuAltas,menuCambio, menuBajas, menuConsultas;
	JInternalFrame IF_Altas,IF_Cambio, IF_Bajas, IF_Consultas;

	public VentanaInicio() {

		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("DB Hotel");

		setSize(1000, 460);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);

		menuBar = new JMenuBar();
		menuInicio = new JMenu("Inicio");
		menuView = new JMenu("View");
		menuAltas = new JMenuItem("Altas");
		menuCambio = new JMenuItem("Cambio");
		menuBajas = new JMenuItem("Bajas");
		menuConsultas = new JMenuItem("Consultas");
		
		menuAltas.setMnemonic(KeyEvent.VK_S);
		menuAltas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

		menuAltas.addActionListener(new ActionListener() {
			@Override

			public void actionPerformed(ActionEvent e) {

				IF_Altas.setVisible(true);
			}
		});

		menuCambio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				IF_Cambio.setVisible(true);

			}
		});
		
		menuBajas.addActionListener(new ActionListener() {
			
			@Override	
			public void actionPerformed(ActionEvent arg0) {
				IF_Bajas.setVisible(true);
				
			}
		});	
		
		menuConsultas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IF_Consultas.setVisible(true);
				
			}
		});

		menuView.add(menuAltas);
		menuView.add(menuCambio);
		menuView.add(menuBajas);
		menuView.add(menuConsultas);
		menuBar.add(menuInicio);
		menuBar.add(menuView);
		
		setJMenuBar(menuBar);
		
	}
}

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new VentanaInicio();

			}// metodo override
		});
	}

}

package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame {

	JMenuBar mBar;
	
	JMenu mInicio;
		JMenuItem menuACliente,menuAReservacion,menuAHabitacion,menuSalir;
	JMenu mBajas;
		JMenuItem menuBajas,menuECliente,menuEReservacion,menuEHabitacion,menuECuenta;
	JMenu mModificaciones;
		JMenuItem menuMCliente, menuMReservacion, menuMHabitacion;
	JMenu mConsulta;
		JMenuItem menuConsulta;
	

	public VentanaInicio() {

		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("DB Hotel");

		setSize(1000, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);

		mBar = new JMenuBar();
		
		mInicio = new JMenu("Inicio");
			menuACliente = new JMenuItem("Agregar Cliente");
			menuAReservacion= new JMenuItem("Agregar Reservacion");
			menuAHabitacion = new JMenuItem("Agregar Habitacion");
			menuSalir = new JMenuItem("Salir");
			
		mBajas = new JMenu("Bajas");
			menuECliente = new JMenuItem("Eliminar un cliente");
			menuEReservacion = new JMenuItem("Eliminar Reservacion");
			menuEHabitacion = new JMenuItem("Eliminar Habitacion");
			menuECuenta = new JMenuItem("Eliminar tu cuenta de Usuario");
			
		mModificaciones = new JMenu("Cambios");
			menuMCliente = new JMenuItem("Modificar cliente");
			menuMHabitacion = new JMenuItem("Modificar Reservacion");
			menuMReservacion = new JMenuItem("Modificar Habitacion");
			
		mConsulta = new JMenu("Consultas");
			menuConsulta = new JMenuItem("Realizar consulta");
		 
		
			mInicio.add(menuACliente);
			mInicio.add(menuAReservacion);
			mInicio.add(menuAHabitacion);
			//mInicio.add(menuConsulta);
			mInicio.add(menuSalir);
		mBar.add(mInicio);
		
			mBajas.add(menuECliente);
			mBajas.add(menuEReservacion);
			mBajas.add(menuEHabitacion);
			mBajas.add(menuECuenta);
		mBar.add(mBajas);
		
			mModificaciones.add(menuMCliente);
			mModificaciones.add(menuMReservacion);
			mModificaciones.add(menuMHabitacion);
		mBar.add(mModificaciones);
		
			mConsulta.add(menuConsulta);
		mBar.add(mConsulta);
		
		setJMenuBar(mBar);
	
		menuACliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		menuAReservacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		menuAHabitacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		menuConsulta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		menuSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		
		menuECliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		menuEReservacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		menuEHabitacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		menuECuenta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		
		menuMCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, ActionEvent.CTRL_MASK));
		menuMHabitacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK));
		menuMReservacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		
		//setBackground(new Color(133, 193, 233));
		
		JLabel tituloR = new JLabel();
		tituloR.setText("Locania");
		tituloR.setFont(new Font("Edwardian Script ITC", Font.BOLD, 25));
		tituloR.setBounds(25, 5, 80, 20);
		tituloR.setForeground(new Color(236, 240, 241  ));
		add(tituloR);
		
		JLabel subTR = new JLabel();
		subTR.setText("Hotel");
		subTR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 8));
		subTR.setBounds(50, 20, 40, 20);
		subTR.setForeground(new Color(236, 240, 241 ));
		add(subTR);
		
		JLabel lTR = new JLabel("");
		lTR.setBounds(20, 0, 5, 40);
		lTR.setBackground(new Color(10, 134, 238));
		lTR.setOpaque(true);
		add(lTR);
		
		JLabel lT2R = new JLabel("");
		lT2R.setBounds(970, 0, 5, 40);
		lT2R.setBackground(new Color(10, 134, 238));
		lT2R.setOpaque(true);
		add(lT2R);
		
		JLabel fTR = new JLabel("");
		fTR.setBounds(0, 0, 1000, 40);
		fTR.setBackground(new Color(48, 102, 190));
		fTR.setOpaque(true);
		add(fTR);
		
		JLabel f2 = new JLabel("");
		f2.setBounds(0, 0, 400, 40);
		f2.setBackground(new Color(93, 173, 226, 50 ));
		f2.setOpaque(true);
		add(f2);
		
		JDesktopPane desktopPane = new JDesktopPane();
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

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

		getContentPane().setLayout(null);
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
		
		JLabel titulo = new JLabel();
		titulo.setText("Locania");
		titulo.setFont(new Font("Edwardian Script ITC", Font.BOLD, 60));
		titulo.setBounds(20, 90, 200, 50);
		titulo.setForeground(new Color(52, 73, 94));
		add(titulo);
		
		JLabel subT = new JLabel();
		subT.setText("Hotel");
		subT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		subT.setBounds(90, 135, 60, 20);
		subT.setForeground(new Color(52, 73, 94 ));
		add(subT);
		
		JLabel tT = new JLabel();
		tT.setText("Bienvenidos a Locania Hotel BD");
		tT.setFont(new Font("Arial", Font.BOLD, 25));
		tT.setBounds(300, 120, 400, 20);
		tT.setForeground(new Color(52, 73, 94 ));
		add(tT);
		
		
		
		JLabel tt = new JLabel();
		tt.setText("<html><body style='text-align: left'>Bienvenidos a Locania Hotel BD, nosotros queremos ofrecerte la mejor experiencia <br> a la hora de realizar tu trabajo, para lograr nuestro objetivo hemos tratado de facilitar y agilizar tus tareas. <br> De parte de Locania Hotel te damos las gracias por formar parte de nuestra familia.");
		tt.setFont(new Font("Arial", Font.BOLD, 16));
		tt.setBounds(300, 170, 650, 75);
		tt.setForeground(new Color(23, 32, 42 ));
		add(tt);
		
		JLabel tg = new JLabel();
		tg.setText("¡GRACIAS!");
		tg.setFont(new Font("Arial", Font.BOLD, 35));
		tg.setBounds(300, 260, 400, 30);
		tg.setForeground(new Color(23, 32, 42 ));
		add(tg);
		
		JLabel f1 = new JLabel();
		f1.setText(" ");
		f1.setFont(new Font("Arial", Font.BOLD, 16));
		f1.setBounds(250, 100, 750, 220);
		f1.setBackground(new Color(93, 173, 226, 60));
		f1.setOpaque(true);
		add(f1);
		

		
		JLabel tD = new JLabel();
		tD.setText("Doumentacion");
		tD.setFont(new Font("Arial", Font.BOLD, 14));
		tD.setBounds(300, 350, 120, 20);
		tD.setForeground(new Color(23, 32, 42 ));
		add(tD);
		
		JLabel tn = new JLabel();
		tn.setText("Novedades");
		tn.setFont(new Font("Arial", Font.BOLD, 12));
		tn.setBounds(300, 380, 100, 20);
		tn.setForeground(new Color(23, 32, 42 ));
		add(tn);
		
		JLabel tp = new JLabel();
		tp.setText("Problemas");
		tp.setFont(new Font("Arial", Font.BOLD, 12));
		tp.setBounds(300, 410, 100, 20);
		tp.setForeground(new Color(23, 32, 42  ));
		add(tp);
		
		JLabel tguia = new JLabel();
		tguia.setText("Guia de uso");
		tguia.setFont(new Font("Arial", Font.BOLD, 12));
		tguia.setBounds(300, 440, 100, 20);
		tguia.setForeground(new Color(23, 32, 42 ));
		add(tguia);
		
		
		JLabel ts = new JLabel();
		ts.setText("Soporte");
		ts.setFont(new Font("Arial", Font.BOLD, 14));
		ts.setBounds(450, 350, 120, 20);
		ts.setForeground(new Color(23, 32, 42 ));
		add(ts);
		
		JLabel tto = new JLabel();
		tto.setText("Tutoriales");
		tto.setFont(new Font("Arial", Font.BOLD, 12));
		tto.setBounds(450, 380, 100, 20);
		tto.setForeground(new Color(23, 32, 42 ));
		add(tto);
		
		
		JLabel ver = new JLabel();
		ver.setText(" Version 1.0.0");
		ver.setFont(new Font("Arial", Font.BOLD, 12));
		ver.setBounds(20, 600, 400, 30);
		ver.setForeground(new Color(23, 32, 42 ));
		add(ver);
		
		JLabel ed = new JLabel();
		ed.setText(" Edicion Global 32 bit, 64bits");
		ed.setFont(new Font("Arial", Font.BOLD, 12));
		ed.setBounds(120, 600, 400, 30);
		ed.setForeground(new Color(23, 32, 42 ));
		add(ed);
		
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

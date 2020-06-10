package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
		
	JPanel aCliente,eCliente,mCliente;

	JInternalFrame aReservacion,aHabitacion,IF_Altas;

	public VentanaInicio() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("DB Hotel");

		setSize(1000, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);
		
		
		VentanasAgregar va = new VentanasAgregar();
		VentanasEliminar ve = new VentanasEliminar();
		VentanasModifiar vm = new VentanasModifiar();
		
		JDesktopPane desktopPane = new JDesktopPane();
		
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
		
		
		
		
	
		menuACliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		menuACliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				aCliente = va.ac.AgregarCliente1(true);
				aCliente.setBounds(250, 40, 300, 670);
				aCliente.repaint();
				add(aCliente);
				aCliente.repaint();
				
				aCliente.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						aCliente.setBackground(new Color(242, 243, 244));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						aCliente.setBackground(new Color(242, 243, 244));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
					}
				});
				
			}
		});
		
		
		menuAReservacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		menuAHabitacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		menuConsulta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		menuSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		
		menuECliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		menuECliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				eCliente = ve.ec.EliminarCliente(true);
				eCliente.setBounds(250, 40, 300, 670);
				eCliente.repaint();
				add(eCliente);
				eCliente.repaint();
				
				eCliente.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						eCliente.setBackground(new Color(242, 243, 244));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						eCliente.setBackground(new Color(242, 243, 244));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
					}
				});
				
			}
		});
		menuEReservacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		menuEHabitacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		menuECuenta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		
		menuMCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, ActionEvent.CTRL_MASK));
		menuMCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mCliente = vm.mc.ModificarCliente(true);
				mCliente.setBounds(250, 40, 300, 570);
				mCliente.repaint();
				add(mCliente);
				mCliente.repaint();
				
				mCliente.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						mCliente.setBackground(new Color(242, 243, 244));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						mCliente.setBackground(new Color(242, 243, 244));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
					}
				});
				
			}
		});
		menuMHabitacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK));
		menuMReservacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		
		setJMenuBar(mBar);
		
		
		add(desktopPane);
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

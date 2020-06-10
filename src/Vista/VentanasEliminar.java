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
			
			JLabel ra1 = new JLabel("<html><body style='text-align: center'>No se encontro el Usuario");
			ra1.setFont(new Font("Arial", Font.BOLD, 10));
			ra1.setBounds(90, 480, 250, 25);
			ra1.setForeground(new Color(56, 53, 52 ));
			ra1.setVisible(false);
			ac.add(ra1);
			
			JLabel fo1 = new JLabel(" ");
			fo1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo1.setBounds(0, 480, 400, 25);
			fo1.setBackground(new Color(169, 50, 38, 50));
			fo1.setOpaque(true);
			fo1.setVisible(false);
			ac.add(fo1);
			
			JLabel ra2 = new JLabel("<html><body style='text-align: center'>Usuario eliminado con exito");
			ra2.setFont(new Font("Arial", Font.BOLD, 10));
			ra2.setBounds(50, 480, 250, 25);
			ra2.setForeground(new Color(25, 111, 61));
			ra2.setVisible(false);
			ac.add(ra2);
			
			JLabel fo2 = new JLabel(" ");
			fo2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 10));
			fo2.setBounds(0, 480, 400, 25);
			fo2.setBackground(new Color(169, 50, 38 , 50));
			fo2.setOpaque(true);
			fo2.setVisible(false);
			ac.add(fo2);
			
		//Retroalimentacion END
			
		
			
		JLabel lT = new JLabel("Eliminar un cliente");
		lT.setFont(new Font("Arial", Font.ITALIC, 18));
		lT.setBounds(60, 5, 200, 30);
		ac.add(lT);
			
		JLabel lID = new JLabel("ID de cliente");
		lID.setBounds(20, 30, 200, 30);
		ac.add(lID);
		
		JTextField ID = new JTextField(10);
		ID.setBounds(20, 60, 250, 30);
		ac.add(ID);
		ID.addKeyListener(new KeyListener() {
			
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
		
		
		JLabel lNo = new JLabel("Nombre");
		lNo.setBounds(20, 90, 200, 30);
		ac.add(lNo);
		
		JTextField Nombre = new JTextField(10);
		Nombre.setBounds(20, 120, 250, 30);
		ac.add(Nombre);
		Nombre.setEnabled(false);
		
		JLabel lAp = new JLabel("Apellido");
		lAp.setBounds(20, 150, 200, 30);
		ac.add(lAp);
		
		JTextField Apellido = new JTextField(10);
		Apellido.setBounds(20, 180, 250, 30);
		ac.add(Apellido);
		Apellido.setEnabled(false);
		
		JLabel lEd = new JLabel("Edad");
		lEd.setBounds(20, 210, 200, 30);
		ac.add(lEd);
		
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("## años");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField Edad = new JFormattedTextField(mask);
		Edad.setBounds(20, 240, 250, 30);
		ac.add(Edad);
		Edad.setEnabled(false);
		
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
		CP.setEnabled(false);
		
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
		Telefono.setEnabled(false);
		
		JButton Registrar = new JButton("Eliminar");
		Registrar.setBounds(20, 400, 250, 30);
		ac.add(Registrar);
		
		Registrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente en = b.buscarRegistro2(Integer.parseInt(ID.getText()));
				
				if (en.getCliente_ID() == Integer.parseInt(ID.getText())) {
					Nombre.setText(en.getNombre());
					Apellido.setText(en.getApellido());
					Edad.setText(en.getEdad());
					CP.setText(en.getCp());
					Telefono.setText(en.getTelefono());
					
				} else {
					ra1.setVisible(true);
					fo1.setVisible(true);
				}
			}
		});
		
		
		JLabel Cancelar = new JLabel("Cancelar");
		Cancelar.setFont(new Font("Arial", Font.BOLD, 12));
		Cancelar.setBounds(20, 430, 90, 20);
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
				ID.setText("");
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
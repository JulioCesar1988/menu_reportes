package menu;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Coordinacion_vista extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coordinacion_vista frame = new Coordinacion_vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Coordinacion_vista() {
		setFrameIcon(new ImageIcon("C:\\Users\\jcontreras\\eclipse-workspace\\ManuReportes\\logo\\logoHeader.png"));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblObras = new JLabel("Obras");
		lblObras.setBounds(10, 22, 46, 14);
		getContentPane().add(lblObras);
		
		JLabel lblPaquetes = new JLabel("paquetes");
		lblPaquetes.setBounds(10, 64, 46, 14);
		getContentPane().add(lblPaquetes);
		
		JLabel lblEdificio = new JLabel("edificio");
		lblEdificio.setBounds(10, 111, 46, 14);
		getContentPane().add(lblEdificio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 22, 213, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(66, 61, 213, 20);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(66, 108, 213, 20);
		getContentPane().add(comboBox_2);
		
		JButton btnGenerar = new JButton("generar");
		btnGenerar.setBounds(66, 161, 89, 23);
		getContentPane().add(btnGenerar);
		setTitle("Coordinacion informes");
		setBounds(100, 100, 727, 377);

	}

}

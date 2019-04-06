package menu;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

//Los siguientes son los informes que utilizo:
//-	REPORTE PROTO 2018
//o	Produccion 
//o	Coordinacion
//o	Control Produccion 2018
//-	APLICACIÓN 2016 PINTURA

public class Tecnica_vista extends JInternalFrame {
	
	
	JDateChooser dateChooser;            // APLICAR FILTROS DE FECHAS
	JDateChooser dateChooser_1;          // APLICAR FILTROS DE FECHAS
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pintura_vista frame = new Pintura_vista();
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
	public Tecnica_vista() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setFrameIcon(new ImageIcon("C:\\Users\\jcontreras\\eclipse-workspace\\ManuReportes\\logo\\logoHeader.png"));
		setMaximizable(true);
		setClosable(true);
		setTitle("Oficina Tecnica ");
		setBounds(100, 100, 978, 466);
		getContentPane().setLayout(null);
		
		JLabel lblObras = new JLabel("Obras");
		lblObras.setBounds(10, 11, 46, 14);
		getContentPane().add(lblObras);
		
		JLabel lblNewLabel = new JLabel("Edificio");
		lblNewLabel.setBounds(10, 60, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSistema = new JLabel("sistema");
		lblSistema.setBounds(232, 11, 46, 14);
		getContentPane().add(lblSistema);
		
		textField = new JTextField();
		textField.setBounds(10, 103, 513, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcionDePaquete = new JLabel("Descripcion de paquete");
		lblDescripcionDePaquete.setBounds(10, 85, 310, 14);
		getContentPane().add(lblDescripcionDePaquete);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 8, 156, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(66, 57, 156, 20);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(292, 8, 156, 20);
		getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione el archivo");
		lblNewLabel_1.setBounds(10, 125, 513, 14);
		getContentPane().add(lblNewLabel_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(10, 216, 167, 23);
		getContentPane().add(dateChooser_2);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(255, 216, 167, 23);
		getContentPane().add(dateChooser_3);
		
		JLabel lblFechaDeFabricacion = new JLabel("fecha de fabricacion");
		lblFechaDeFabricacion.setBounds(25, 191, 152, 14);
		getContentPane().add(lblFechaDeFabricacion);
		
		JLabel lblFechaDeDespacho = new JLabel("fecha de despacho");
		lblFechaDeDespacho.setBounds(255, 191, 167, 14);
		getContentPane().add(lblFechaDeDespacho);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(10, 293, 89, 23);
		getContentPane().add(btnCargar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 147, 513, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSeleccionarArchivocsv = new JButton("seleccionar archivo.csv");
		btnSeleccionarArchivocsv.setBounds(533, 146, 178, 23);
		getContentPane().add(btnSeleccionarArchivocsv);

	}
}
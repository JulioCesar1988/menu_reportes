package menu;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import herramientas.CargadorCombobox;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import net.sf.jasperreports.engine.JRException;
import reportes.ReporteGenerador;

import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

//Los siguientes son los informes que utilizo:
//-	REPORTE PROTO 2018
//o	Produccion 
//o	Coordinacion
//o	Control Produccion 2018
//-	APLICACIÓN 2016 PINTURA

public class ControlProducccion_vista extends JInternalFrame {
	
	
	JDateChooser dateChooser;            // APLICAR FILTROS DE FECHAS
	JDateChooser dateChooser_1;          // APLICAR FILTROS DE FECHAS

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
	public ControlProducccion_vista() {
		setFrameIcon(new ImageIcon("C:\\Users\\jcontreras\\eclipse-workspace\\ManuReportes\\logo\\logoHeader.png"));
		setMaximizable(true);
		getContentPane().setBackground(new Color(255, 255, 255));
		setClosable(true);
		setTitle("Control de Produccion");
		setBounds(100, 100, 774, 450);
		getContentPane().setLayout(new MigLayout("", "[46px][10px][145px][7px][133px][71px][485px]", "[27px][11px][23px][21px][23px][25px][1px][10px][14px][11px][23px][23px][14px][23px]"));
		
		JButton btnNewButton = new JButton("Generar Reporte");
		
		
	
		
		
		getContentPane().add(btnNewButton, "cell 2 13,growx,aligny top");
		
		JLabel lblObras = new JLabel("Obras");
		getContentPane().add(lblObras, "cell 0 2,growx,aligny center");
		
		JLabel lblPaquete = new JLabel("Paquete");
		getContentPane().add(lblPaquete, "cell 0 4,growx,aligny center");
		
		JLabel lblRangoDeFechas = new JLabel("RANGO DE FECHAS");
		getContentPane().add(lblRangoDeFechas, "cell 2 8 3 1,growx,aligny top");
		
		JLabel lblDesde = new JLabel("DESDE");
		getContentPane().add(lblDesde, "cell 4 10,alignx left,aligny top");
		
		JLabel lblHasta = new JLabel("HASTA");
		getContentPane().add(lblHasta, "cell 4 11,alignx left,aligny top");
		CargadorCombobox cc = new CargadorCombobox();
		JComboBox comboBoxObra = new JComboBox(cc.generarContenidoObra());
		
		
		getContentPane().add(comboBoxObra, "cell 2 2,growx,aligny center");
		
		
		JComboBox comboBoxPaquete = new JComboBox();
		getContentPane().add(comboBoxPaquete, "cell 2 4,growx,aligny center");
		
		JRadioButton rdbtnAplicar = new JRadioButton("Aplicar");
		getContentPane().add(rdbtnAplicar, "cell 4 2,growx,aligny top");
		
		JRadioButton rdbtnAplicar_1 = new JRadioButton("Aplicar");
		getContentPane().add(rdbtnAplicar_1, "cell 4 4,growx,aligny top");
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setEnabled(true);
		dateChooser_2.setBackground(Color.WHITE);
		getContentPane().add(dateChooser_2, "cell 2 10,grow");
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setEnabled(true);
		dateChooser_3.setBackground(Color.WHITE);
		getContentPane().add(dateChooser_3, "cell 2 11,grow");
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\jcontreras\\eclipse-workspace\\ManuReportes\\logo\\logoHeader.png"));
		getContentPane().add(label, "cell 6 0 1 11,alignx center,growy");
		
		
		comboBoxObra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String obra = (String) comboBoxObra.getSelectedItem();
				StringTokenizer tk2 = new StringTokenizer(obra, " - ");
				int obra_num=Integer.parseInt(tk2.nextToken());
				CargadorCombobox cc = new CargadorCombobox();
				comboBoxPaquete.setModel(new DefaultComboBoxModel(cc.generarContenidoPaquetesConDescripcion(obra_num)));
			
			}
		});
		
		// Generamos el 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ReporteGenerador rp = new ReporteGenerador();
				try {
					rp.generarReporteObras();
				} catch (JRException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		

	}
}
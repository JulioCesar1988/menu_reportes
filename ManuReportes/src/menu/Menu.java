package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		
		
		setFont(new Font("Dialog", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jcontreras\\eclipse-workspace\\ManuReportes\\logo\\logoHeader.png"));
		setBackground(Color.BLACK);
		setTitle("Informes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 734);
		try{
			  
			  JFrame.setDefaultLookAndFeelDecorated(true);
			  JDialog.setDefaultLookAndFeelDecorated(true);
			  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			  //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			}
			catch (Exception e)
			 {
			  e.printStackTrace();
			 }
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProduccion = new JMenu("Control de Produccion");
		menuBar.add(mnProduccion);
		
		JMenuItem mntmReportesDeIrina = new JMenuItem("Generacion de informes");
		
	
		mnProduccion.add(mntmReportesDeIrina);
		
		JMenu mnCoordinacion = new JMenu("Coordinacion");
		menuBar.add(mnCoordinacion);
		
		JMenuItem mntmReportes = new JMenuItem("Reportes paquetes por obra");
		mnCoordinacion.add(mntmReportes);
		
		JMenu mnPintura = new JMenu("Pintura ");
		menuBar.add(mnPintura);
		
		JMenuItem mntmReporteDePiezas = new JMenuItem("Reporte Pintadas");
		
		
		mnPintura.add(mntmReporteDePiezas);
		
		JMenu mnDespacho = new JMenu("Despacho");
		menuBar.add(mnDespacho);
		
		JMenuItem mntmReportesDespacho = new JMenuItem("Reportes despacho");
		mnDespacho.add(mntmReportesDespacho);
		
		JMenu mnOficinaTecnica = new JMenu("Oficina Tecnica");
		menuBar.add(mnOficinaTecnica);
		
		JMenuItem mntmExportarArchivocsv = new JMenuItem("Importar fileOfTekla.csv  -> proto");
		
		
	
		
		
		mnOficinaTecnica.add(mntmExportarArchivocsv);
		
		JMenu mnAlmacen = new JMenu("Almacen");
		menuBar.add(mnAlmacen);
		
		JMenuItem mntmReporteDeAlmacen = new JMenuItem("Reporte de Almacen");
		mnAlmacen.add(mntmReporteDeAlmacen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\jcontreras\\eclipse-workspace\\ManuReportes\\logo\\logoHeader.png"));
		label.setBounds(924, 465, 187, 178);
		desktopPane.add(label);
		
		JLabel lblDesarrolloPorOfina = new JLabel("sistemas@millerbi.net");
		lblDesarrolloPorOfina.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblDesarrolloPorOfina.setBounds(903, 649, 218, 14);
		desktopPane.add(lblDesarrolloPorOfina);
		
		mntmReporteDePiezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pintura_vista pi = new Pintura_vista();
				pi.setVisible(true);
				desktopPane.add(pi);
				
			}
		});
		
		
		mntmReportesDeIrina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlProducccion_vista ct = new ControlProducccion_vista();
				ct.setVisible(true);
				desktopPane.add(ct);
			}
		});
		
		mntmExportarArchivocsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tecnica_vista tv = new Tecnica_vista();
				tv.setVisible(true);
				desktopPane.add(tv);
				
				
			}
		});
		
		
	}
}

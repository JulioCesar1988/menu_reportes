package menu;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Almacen_vista extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Almacen_vista frame = new Almacen_vista();
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
	public Almacen_vista() {
		setBounds(100, 100, 450, 300);

	}

}

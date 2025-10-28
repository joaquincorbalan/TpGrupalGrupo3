package regentarVehiculo;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.CardLayout;

import fondos.PanelConFondo;

public class RegentarVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//private PanelConFondo contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegentarVehiculos frame = new RegentarVehiculos();
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
	public RegentarVehiculos() {
		setTitle("Menu Vehiculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 442);
		
		contentPane = new JPanel();
        //contentPane = new PanelConFondo("C:\\Users\\Lio\\Downloads\\hq720.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
        // Botones
		JButton btnRegVehi = new JButton("Registrar vehiculo");
		btnRegVehi.setBounds(233, 73, 153, 44);
		contentPane.add(btnRegVehi);
		
		JButton btnRegVehi_1 = new JButton("Listar vehiculo");
		btnRegVehi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegVehi_1.setBounds(234, 164, 153, 44);
		contentPane.add(btnRegVehi_1);
		
		JButton btnRegVehi_2 = new JButton("Eliminar Vehiculo");
		btnRegVehi_2.setBounds(237, 262, 153, 44);
		contentPane.add(btnRegVehi_2);

	}
	
}
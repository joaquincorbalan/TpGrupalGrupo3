package ar.edu.unrn.seminario.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaRegistrarVisita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrarVisita frame = new VentanaRegistrarVisita();
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
	public VentanaRegistrarVisita() {
		setTitle("Registrar Visita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));//espacio entre zonas
		
		JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 10, 10));//5 filas, 2 columnas, espacio entre componentes
		panelFormulario.setBorder(new EmptyBorder(20, 40, 20, 40)); // margen interno
		
		panelFormulario.add(new JLabel("Fecha"));
		JTextField txtFecha = new JTextField();
		panelFormulario.add(txtFecha);
		
		panelFormulario.add(new JLabel("Hora"));
		JTextField txtHora = new JTextField();
		panelFormulario.add(txtHora);
		
		panelFormulario.add(new JLabel("Tipos de bienes"));
		JTextField txtTipo = new JTextField();
		panelFormulario.add(txtTipo);
		
		panelFormulario.add(new JLabel("Cantidad"));
		JTextField txtCantidad = new JTextField();
		panelFormulario.add(txtCantidad);
		
		panelFormulario.add(new JLabel("Observaciones"));
		JTextField txtObservaciones = new JTextField();
		panelFormulario.add(txtObservaciones);
		
		//Botones
		JButton aceptarVisita = new JButton("Aceptar");
		JButton cancelarVisita = new JButton("Cancelar");
		
		JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		panelBotones.add(aceptarVisita);
		panelBotones.add(cancelarVisita);
		
		contentPane.add(panelFormulario, BorderLayout.CENTER);
		contentPane.add(panelBotones, BorderLayout.SOUTH);

	}
}
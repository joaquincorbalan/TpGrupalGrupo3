package ar.edu.unrn.seminario.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ar.edu.unrn.seminario.api.RepositorioVisitas;
import ar.edu.unrn.seminario.modelo.Visita;

public class VentanaGestionarVisitas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaVisitas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestionarVisitas frame = new VentanaGestionarVisitas();
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
	public VentanaGestionarVisitas() {
		setTitle("Gestionar Visitas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tablaVisitas = new JTable();
		
		List<Visita> listaVisitas = RepositorioVisitas.obtenerVisitas();
		
		String[] visitas = {"Fecha", "Hora", "Cantidad", "Tipo", "Observaciones"};
		DefaultTableModel modelo = new DefaultTableModel(visitas, 0);
		
		for(Visita v : listaVisitas) {
			Object[] fila = {v.getFecha(), v.getHora(), v.getCantidad(), v.getTipo(), v.getObservaciones()};
			modelo.addRow(fila);
		}
		tablaVisitas.setModel(modelo);
		
		JScrollPane scrollpane = new JScrollPane(tablaVisitas);
		contentPane.setLayout(new BorderLayout());
		contentPane.add(scrollpane, BorderLayout.NORTH);
		
		//Botones
		JButton agregarVisita = new JButton("Agregar");
		JButton eliminarVisita = new JButton("Eliminar");
		JButton editarVisita = new JButton("Editar");
		JButton guardarCambios = new JButton("Guardar Cambios");
		// Crear panel de botones con separación y estilo
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20)); // espacio horizontal y vertical

		agregarVisita.setFont(new Font("Arial", Font.PLAIN, 14));
		editarVisita.setFont(new Font("Arial", Font.PLAIN, 14));
		eliminarVisita.setFont(new Font("Arial", Font.PLAIN, 14));
		guardarCambios.setFont(new Font("Arial", Font.PLAIN, 14));

		agregarVisita.setBackground(new Color(220, 240, 255));
		editarVisita.setBackground(new Color(220, 240, 255));
		eliminarVisita.setBackground(new Color(220, 240, 255));
		guardarCambios.setBackground(new Color(220, 240, 255));

		panelBotones.add(agregarVisita);
		panelBotones.add(eliminarVisita);
		panelBotones.add(editarVisita);
		panelBotones.add(guardarCambios);

		// Envolver el panel en otro con margen
		JPanel contenedorBotones = new JPanel(new BorderLayout());
		contenedorBotones.setBorder(new EmptyBorder(10, 20, 10, 20));
		contenedorBotones.add(panelBotones, BorderLayout.CENTER);

		contentPane.add(contenedorBotones, BorderLayout.SOUTH);
		

	}

}

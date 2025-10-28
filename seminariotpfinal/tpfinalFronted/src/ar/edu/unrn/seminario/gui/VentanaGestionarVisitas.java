package ar.edu.unrn.seminario.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ar.edu.unrn.seminario.dtos.VisitaDTO;
import ar.edu.unrn.seminario.servicios.ServicioVisita;


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
		
		List<VisitaDTO> listaVisitas = ServicioVisita.obtenerVisitas();
		
		String[] visitas = {"Fecha", "Hora", "Cantidad", "Tipo", "Observaciones"};
		DefaultTableModel modelo = new DefaultTableModel(visitas, 0);
		
		for (VisitaDTO v : listaVisitas) {
		    Object[] fila = {v.getFecha(), v.getHora(), v.getCantidad(), v.getTipoBien(), v.getObservaciones()};
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
		
		actualizarTabla();
		
		agregarVisita.addActionListener(e -> {
		    VentanaRegistrarVisita ventana = new VentanaRegistrarVisita(this);
		    ventana.setVisible(true);
		    actualizarTabla(); // refresca la tabla después de cerrar
		});
		
		eliminarVisita.addActionListener(e -> {
		    int filaSeleccionada = tablaVisitas.getSelectedRow();

		    if (filaSeleccionada != -1) {
		        // Confirmación opcional
		        int confirm = JOptionPane.showConfirmDialog(
		            this,
		            "¿Seguro que querés eliminar la visita seleccionada?",
		            "Confirmar eliminación",
		            JOptionPane.YES_NO_OPTION
		        );

		        if (confirm == JOptionPane.YES_OPTION) {
		            // Eliminar en backend
		            ServicioVisita.eliminarVisita(filaSeleccionada);

		            // Refrescar tabla
		            actualizarTabla();
		        }
		    } else {
		        JOptionPane.showMessageDialog(this, "Seleccioná una fila para eliminar");
		    }
		});
		
	}
	//Metodo para actualizar la tabla
	private void actualizarTabla() {
        List<VisitaDTO> listaVisitas = ServicioVisita.obtenerVisitas();

        String[] columnas = {"Fecha", "Hora", "Cantidad", "Tipo", "Observaciones"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (VisitaDTO v : listaVisitas) {
            Object[] fila = {
                v.getFecha(),        // si es Date, podés formatear con FechaConverter.formatearFecha()
                v.getHora(),         // si es Time, idem con FechaConverter.formatearHora()
                v.getCantidad(),
                v.getTipoBien(),   // asegurate de usar el getter correcto
                v.getObservaciones()
            };
            modelo.addRow(fila);
        }

        tablaVisitas.setModel(modelo);
    }
}

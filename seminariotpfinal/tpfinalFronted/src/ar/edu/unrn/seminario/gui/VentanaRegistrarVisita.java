package ar.edu.unrn.seminario.gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import ar.edu.unrn.seminario.dtos.VisitaDTO;
import ar.edu.unrn.seminario.servicios.ServicioVisita;
import ar.edu.unrn.seminario.utilidades.FechasConverter;

public class VentanaRegistrarVisita extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JTextField txtTipo;
	private JTextField txtCantidad;
	private JTextField txtObservaciones;
	

	/**
	 * Create the frame.
	 */
	public VentanaRegistrarVisita(JFrame parent) {
        super(parent, "Registrar Visita", true); // true = modal
        setSize(500, 400);
        setLocationRelativeTo(parent);

        JPanel contentPane = new JPanel(new BorderLayout(10, 10));
        setContentPane(contentPane);

        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 10, 10));
        panelFormulario.setBorder(new EmptyBorder(20, 40, 20, 40));

        panelFormulario.add(new JLabel("Fecha (dd/MM/yyyy)"));
        txtFecha = new JTextField();
        panelFormulario.add(txtFecha);

        panelFormulario.add(new JLabel("Hora (HH:mm)"));
        txtHora = new JTextField();
        panelFormulario.add(txtHora);

        panelFormulario.add(new JLabel("Tipos de bienes"));
        txtTipo = new JTextField();
        panelFormulario.add(txtTipo);

        panelFormulario.add(new JLabel("Cantidad"));
        txtCantidad = new JTextField();
        panelFormulario.add(txtCantidad);

        panelFormulario.add(new JLabel("Observaciones"));
        txtObservaciones = new JTextField();
        panelFormulario.add(txtObservaciones);

        JButton aceptarVisita = new JButton("Aceptar");
        JButton cancelarVisita = new JButton("Cancelar");

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.add(aceptarVisita);
        panelBotones.add(cancelarVisita);

        contentPane.add(panelFormulario, BorderLayout.CENTER);
        contentPane.add(panelBotones, BorderLayout.SOUTH);

        // Acción aceptar
        aceptarVisita.addActionListener(e -> {
            try {
                VisitaDTO dto = new VisitaDTO(
                    FechasConverter.parsearFecha(txtFecha.getText()),
                    FechasConverter.parsearHora(txtHora.getText()),
                    Integer.parseInt(txtCantidad.getText()),
                    txtTipo.getText(),
                    txtObservaciones.getText()
                );
                ServicioVisita.agregarVisita(dto);
                dispose(); // cierro el diálogo
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos ingresados");
            }
        });

        cancelarVisita.addActionListener(e ->
        	dispose());
        
	}
}
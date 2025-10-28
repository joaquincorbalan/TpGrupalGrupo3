package notificacion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class notificacionAutomaticas extends JFrame {
    private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notificacionAutomaticas frame = new notificacionAutomaticas();
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
	public notificacionAutomaticas() {
        setTitle("Notificaciones Automáticas");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout principal
        getContentPane().setLayout(new BorderLayout(10, 10));

        // Panel superior: Preferencias de contacto
        JPanel panelPreferencias = new JPanel(new GridLayout(3, 2, 5, 5));
        JCheckBox emailCheck = new JCheckBox("Email");
        JTextField emailField = new JTextField();
        JTextField phoneField = new JTextField();
        JCheckBox smsCheck = new JCheckBox("SMS");
        JCheckBox pushCheck = new JCheckBox("Notificación Push");

        panelPreferencias.setBorder(BorderFactory.createTitledBorder("Preferencias de contacto"));
        panelPreferencias.add(emailCheck);
        panelPreferencias.add(emailField);
        panelPreferencias.add(new JLabel("Teléfono:"));
        panelPreferencias.add(phoneField);
        panelPreferencias.add(smsCheck);
        panelPreferencias.add(pushCheck);

        // Panel medio: Tipos de notificación
        JPanel panelTipos = new JPanel(new GridLayout(3, 1));
        JCheckBox donanteCheck = new JCheckBox("Confirmación de recepción para donante");
        JCheckBox voluntarioCheck = new JCheckBox("Asignación de tareas a voluntario");
        JCheckBox beneficiarioCheck = new JCheckBox("Aviso de disponibilidad para beneficiario");

        panelTipos.setBorder(BorderFactory.createTitledBorder("Tipos de notificación"));
        panelTipos.add(donanteCheck);
        panelTipos.add(voluntarioCheck);
        panelTipos.add(beneficiarioCheck);

        // Panel central: unir preferencias + tipos
        JPanel panelCentral = new JPanel(new GridLayout(2, 1, 10, 10));
        panelCentral.add(panelPreferencias);
        panelCentral.add(panelTipos);

        // Panel historial: JTable
        String[] columnas = {"Fecha", "Usuario", "Canal", "Estado"};
        Object[][] datos = {
                {"2023-10-26", "Marian", "SMS", "Enviado"},
                {"2023-10-26", "Rocio", "Email", "Fallido"},
                {"2023-10-25", "Lio", "Push", "Enviado"},
                {"2023-10-24", "Augusto", "Email", "Enviado"}
        };

        JTable tabla = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scrollTabla = new JScrollPane(tabla);
        scrollTabla.setBorder(BorderFactory.createTitledBorder("Historial de notificaciones"));

        // Panel inferior: Botones
        JPanel panelBotones = new JPanel();
        JButton btnGuardar = new JButton("Guardar configuración");
        JButton btnCancelar = new JButton("Cancelar");
        panelBotones.add(btnGuardar);
        panelBotones.add(btnCancelar);

        // Agregar todo al frame
        getContentPane().add(panelCentral, BorderLayout.NORTH);
        getContentPane().add(scrollTabla, BorderLayout.CENTER);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
    }
}
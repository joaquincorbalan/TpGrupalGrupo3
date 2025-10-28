package ar.edu.unrn.seminario.gui;
import javax.swing.*;
import java.awt.*;

public class VentanaRegistrarVisitass extends JFrame {

    private JTable tablaVisitas;
    private JTextField txtFecha, txtHora, txtCantidad;
    private JComboBox<String> comboTipo;
    private JTextArea txtObservaciones;

    public VentanaRegistrarVisitass() {
        setTitle("Gestionar Visitas");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout principal
        setLayout(new BorderLayout());

        // Panel de formulario
        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 5, 5));
        panelFormulario.add(new JLabel("Fecha:"));
        txtFecha = new JTextField();
        panelFormulario.add(txtFecha);

        panelFormulario.add(new JLabel("Hora:"));
        txtHora = new JTextField();
        panelFormulario.add(txtHora);

        panelFormulario.add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField();
        panelFormulario.add(txtCantidad);

        panelFormulario.add(new JLabel("Tipo de Bienes:"));
        comboTipo = new JComboBox<>(new String[]{"Alimentos", "Ropa", "Juguetes", "Otros"});
        panelFormulario.add(comboTipo);

        panelFormulario.add(new JLabel("Observaciones:"));
        txtObservaciones = new JTextArea(3, 20);
        panelFormulario.add(new JScrollPane(txtObservaciones));

        add(panelFormulario, BorderLayout.NORTH);

        // Tabla
        String[] columnas = {"Fecha", "Hora", "Cantidad", "Tipo", "Observaciones"};
        Object[][] datos = {};
        tablaVisitas = new JTable(datos, columnas);
        add(new JScrollPane(tablaVisitas), BorderLayout.CENTER);

        // Botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(new JButton("Agregar Visita"));
        panelBotones.add(new JButton("Editar Visita"));
        panelBotones.add(new JButton("Eliminar Visita"));
        panelBotones.add(new JButton("Guardar Cambios"));
        panelBotones.add(new JButton("Cancelar"));

        add(panelBotones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaRegistrarVisitass().setVisible(true));
    }
}

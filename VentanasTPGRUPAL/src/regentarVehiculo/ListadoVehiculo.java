package regentarVehiculo;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class ListadoVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tabla = new JTable();
	
	private Object[] titulos = {"Patente", "Tipo de vehiculo", "Modelo", "capacidad maxima", "estado", "mantenimiento", "voluntario"};
	private DefaultTableModel modelo = new DefaultTableModel(titulos, 0){
	    @Override
	    public boolean isCellEditable(int row, int column) {
	        return false; // bloquea edición
	    }
	};
	private JPanel panelSurBoton;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoVehiculo frame = new ListadoVehiculo();
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
	public ListadoVehiculo() {
		setTitle("lista de los vehiculos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 813, 538);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		tabla.setFont(new Font("Tahoma", Font.BOLD, 10));
		tabla.setModel(modelo);
		JScrollPane scrollPane = new JScrollPane(tabla);
		contentPane.add(scrollPane, BorderLayout.NORTH);
		
		panelSurBoton = new JPanel();
		contentPane.add(panelSurBoton, BorderLayout.SOUTH);
		tabla.getTableHeader().setReorderingAllowed(false); // para que no se mueva
		
		JButton btnRestablece = new JButton ("Actualizar activo/inactivo");
		btnRestablece.setForeground(new Color(0, 0, 0));
		btnRestablece.setBackground(new Color(128, 255, 128));
		btnRestablece.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRestablece.setBounds(20,20,20,20);
		panelSurBoton.add(btnRestablece);
		
		btnNewButton_1 = new JButton("Actualizar/Eliminar");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelSurBoton.add(btnNewButton_1);
		
		btnNewButton = new JButton("salir");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 0, 0));
		panelSurBoton.add(btnNewButton);
		//btnRestablece.addActionListener(new ActionListener();

	}
}

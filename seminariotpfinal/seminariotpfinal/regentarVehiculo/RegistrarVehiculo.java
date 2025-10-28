package regentarVehiculo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;

public class RegistrarVehiculo extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarVehiculo dialog = new RegistrarVehiculo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarVehiculo() {
		setTitle("Registrar Vehiculo");
		setBounds(100, 100, 659, 415);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTipoDeVehiculo = new JLabel("Tipo de vehiculo:");
		lblTipoDeVehiculo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipoDeVehiculo.setBounds(114, 97, 151, 23);
		contentPanel.add(lblTipoDeVehiculo);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblModelo.setBounds(114, 124, 85, 23);
		contentPanel.add(lblModelo);
		
		JLabel lblPatente = new JLabel("Patente:");
		lblPatente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPatente.setBounds(114, 69, 62, 23);
		contentPanel.add(lblPatente);
		
		JLabel lblCapacidadMax = new JLabel("Capacidad max:");
		lblCapacidadMax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCapacidadMax.setBounds(114, 151, 151, 23);
		contentPanel.add(lblCapacidadMax);
		
		JLabel lblVoluntarioAsignado = new JLabel("Voluntario asignado:");
		lblVoluntarioAsignado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVoluntarioAsignado.setBounds(115, 252, 151, 23);
		contentPanel.add(lblVoluntarioAsignado);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(289, 126, 240, 23);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(289, 153, 240, 23);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(289, 71, 240, 23);
		contentPanel.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(290, 255, 163, 20);
		contentPanel.add(comboBox);
		
		JLabel lblIntro = new JLabel("Registrar datos del vehículos");
		lblIntro.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblIntro.setBounds(114, 20, 240, 23);
		contentPanel.add(lblIntro);
		
		JLabel lblCronogramaDe = new JLabel("Mantenimientos:");
		lblCronogramaDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCronogramaDe.setBounds(114, 216, 151, 23);
		contentPanel.add(lblCronogramaDe);
		
		JComboBox comboBoxVehi = new JComboBox();
		comboBoxVehi.setBounds(289, 99, 240, 20);
		contentPanel.add(comboBoxVehi);
		comboBoxVehi.addItem("Automóvil - Clase B");
		comboBoxVehi.addItem("Camioneta/SUV - Clase B");
		comboBoxVehi.addItem("Camión - Clase C");
		comboBoxVehi.addItem("Motocicleta - Clase A");
		comboBoxVehi.addItem("Microbús/Minibus/Van - Clase D");
		comboBoxVehi.addItem("Ómnibus/Bus grande - Clase D");
		comboBoxVehi.addItem("Vehículo especial (grúa, ambulancia, etc.) - Según tipo");
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstado.setBounds(114, 181, 151, 23);
		contentPanel.add(lblEstado);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Activo");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(289, 183, 75, 21);
		contentPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnInactivo = new JRadioButton("Inactivo");
		rdbtnInactivo.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnInactivo.setBounds(366, 183, 102, 21);
		contentPanel.add(rdbtnInactivo);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

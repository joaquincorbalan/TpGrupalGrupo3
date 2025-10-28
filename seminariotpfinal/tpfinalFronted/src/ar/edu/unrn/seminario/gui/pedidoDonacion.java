package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.Color;

public class pedidoDonacion extends JFrame {

	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pedidoDonacion frame = new pedidoDonacion();
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
	public pedidoDonacion() {
		setTitle("Pedido Donacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 428);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblIntro = new JLabel("Registrar pedido de donacion");
		lblIntro.setBackground(new Color(255, 255, 255));
		lblIntro.setForeground(new Color(0, 0, 0));
		lblIntro.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblIntro.setBounds(55, 23, 240, 23);
		panel.add(lblIntro);
		
		JLabel lblPatente = new JLabel("Fecha de emision:");
		lblPatente.setForeground(new Color(0, 0, 0));
		lblPatente.setBackground(new Color(255, 255, 255));
		lblPatente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPatente.setBounds(55, 76, 151, 23);
		panel.add(lblPatente);
		
		JLabel lblTipoDeVehiculo = new JLabel("Tipo de donacion");
		lblTipoDeVehiculo.setBackground(new Color(0, 0, 0));
		lblTipoDeVehiculo.setForeground(new Color(0, 0, 0));
		lblTipoDeVehiculo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTipoDeVehiculo.setBounds(55, 104, 151, 23);
		panel.add(lblTipoDeVehiculo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(230, 78, 240, 23);
		panel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(230, 160, 240, 23);
		panel.add(textField_2);
		
		JLabel lblCapacidadMax = new JLabel("Observaciones");
		lblCapacidadMax.setForeground(new Color(0, 0, 0));
		lblCapacidadMax.setBackground(new Color(255, 255, 255));
		lblCapacidadMax.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCapacidadMax.setBounds(55, 158, 151, 23);
		panel.add(lblCapacidadMax);
		
		JLabel lblModelo = new JLabel("Carga pesada");
		lblModelo.setForeground(new Color(0, 0, 0));
		lblModelo.setBackground(new Color(255, 255, 255));
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblModelo.setBounds(55, 131, 151, 23);
		panel.add(lblModelo);
		
		String[] items = {"Alimento", "Ropa", "Muebles", "etc"};		
		JComboBox<String> comboBox = new JComboBox<>(items);
		comboBox.setOpaque(false);
		comboBox.setBounds(230, 106, 128, 20);
		panel.add(comboBox);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnSi.setBounds(230, 131, 40, 21);
		panel.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNo.setBounds(307, 131, 40, 21);
		panel.add(rdbtnNo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255, 150)); // Color de fondo semi-transparente
		panel_1.setBounds(42, 10, 463, 257);
		panel.add(panel_1);
		
		
		JPanel buttonPane = new JPanel();
		contentPane.add(buttonPane, BorderLayout.SOUTH);
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton okButton = new JButton("Aceptar");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		
		JButton cancelButton = new JButton("Cancelar");
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);

	}
}
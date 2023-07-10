package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class Pantalla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
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
	public Pantalla() {
		setTitle("AutosLocos - EndGame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(15, 23, 42));
		panelTitulo.setBounds(0, 0, 1019, 290);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(null);
		
		JLabel titulo1 = new JLabel("AutosLocos");
		titulo1.setForeground(new Color(255, 255, 255));
		titulo1.setFont(new Font("Public Sans", Font.BOLD, 64));
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(332, 88, 363, 75);
		panelTitulo.add(titulo1);
		
		JLabel titulo2 = new JLabel("EndGame");
		titulo2.setForeground(new Color(255, 255, 255));
		titulo2.setFont(new Font("Public Sans Thin", Font.BOLD | Font.ITALIC, 32));
		titulo2.setBounds(332, 148, 139, 39);
		panelTitulo.add(titulo2);
		
		JPanel panelBoton = new JPanel();
		panelBoton.setBackground(new Color(255, 255, 255));
		panelBoton.setBounds(0, 289, 1018, 322);
		contentPane.add(panelBoton);
		panelBoton.setLayout(null);
		
		JPanel creditos = new JPanel();
		creditos.setBackground(new Color(7, 10, 19));
		creditos.setBounds(0, 291, 1019, 32);
		panelBoton.add(creditos);
		creditos.setLayout(null);
		
		JLabel labelCreditos = new JLabel("© Luis Martin - Levin Jiménez - Wuinder Colmenares");
		labelCreditos.setHorizontalAlignment(SwingConstants.CENTER);
		labelCreditos.setBounds(368, 8, 384, 15);
		labelCreditos.setFont(new Font("Public Sans Thin", Font.PLAIN, 16));
		labelCreditos.setForeground(new Color(255, 255, 255));
		creditos.add(labelCreditos);
		
		JPanel btnSeleccionarVehiculos = new JPanel();
		btnSeleccionarVehiculos.setBackground(new Color(15, 23, 42));
		btnSeleccionarVehiculos.setBounds(380, 58, 228, 60);
		panelBoton.add(btnSeleccionarVehiculos);
		btnSeleccionarVehiculos.setLayout(null);
		Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
		btnSeleccionarVehiculos.setCursor(cursorHand);
		
		JLabel labelBtnSeleccionarVehiculos = new JLabel("Seleccionar Vehiculos");
		labelBtnSeleccionarVehiculos.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnSeleccionarVehiculos.setForeground(new Color(255, 255, 255));
		labelBtnSeleccionarVehiculos.setBounds(23, 19, 187, 23);
		btnSeleccionarVehiculos.add(labelBtnSeleccionarVehiculos);
		
		JPanel btnResultados = new JPanel();
		btnResultados.setLayout(null);
		btnResultados.setBackground(new Color(15, 23, 42));
		btnResultados.setBounds(636, 58, 166, 60);
		panelBoton.add(btnResultados);
		btnResultados.setCursor(cursorHand);
		
		JLabel labelBtnResultados = new JLabel("Resultados");
		labelBtnResultados.setForeground(Color.WHITE);
		labelBtnResultados.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnResultados.setBounds(33, 19, 96, 23);
		btnResultados.add(labelBtnResultados);
		
		JPanel btnSalir = new JPanel();
		btnSalir.setLayout(null);
		btnSalir.setBackground(new Color(15, 23, 42));
		btnSalir.setBounds(411, 148, 166, 60);
		panelBoton.add(btnSalir);
		btnSalir.setCursor(cursorHand);
		
		JLabel labelBtnSalir = new JLabel("Salir");
		labelBtnSalir.setForeground(Color.WHITE);
		labelBtnSalir.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnSalir.setBounds(60, 19, 46, 23);
		btnSalir.add(labelBtnSalir);
		
		JPanel btnGenerarPista = new JPanel();
		btnGenerarPista.setLayout(null);
		btnGenerarPista.setBackground(new Color(15, 23, 42));
		btnGenerarPista.setBounds(180, 58, 166, 60);
		panelBoton.add(btnGenerarPista);
		btnGenerarPista.setCursor(cursorHand);
		
		JLabel labelBtnGenerarPista = new JLabel("Generar Pista");
		labelBtnGenerarPista.setForeground(Color.WHITE);
		labelBtnGenerarPista.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnGenerarPista.setBounds(25, 19, 114, 23);
		btnGenerarPista.add(labelBtnGenerarPista);
	}
}

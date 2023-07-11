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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 * Clase principal de la interfaz gráfica de usuario (GUI) para la aplicación AutosLocos - EndGame.
 * Muestra la pantalla principal con varios botones y paneles.
 */
public class Pantalla extends JFrame {

	private JPanel contentPane;

	/**
	 * Método principal para ejecutar la aplicación.
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
	 * Crea el marco de la interfaz gráfica.
	 */
	public Pantalla() {
		setTitle("AutosLocos - EndGame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1060);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Panel para el título
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(15, 23, 42));
		panelTitulo.setBounds(0, 0, 1920, 290);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(null);
		
		// Etiqueta del título 1
		JLabel titulo1 = new JLabel("AutosLocos");
		titulo1.setForeground(new Color(255, 255, 255));
		titulo1.setFont(new Font("Public Sans", Font.BOLD, 64));
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(781, 88, 363, 75);
		panelTitulo.add(titulo1);
		
		// Etiqueta del título 2
		JLabel titulo2 = new JLabel("EndGame");
		titulo2.setForeground(new Color(255, 255, 255));
		titulo2.setFont(new Font("Public Sans Thin", Font.BOLD | Font.ITALIC, 32));
		titulo2.setBounds(781, 148, 139, 39);
		panelTitulo.add(titulo2);
		
		// Panel para los botones
		JPanel panelBoton = new JPanel();
		panelBoton.setBackground(new Color(255, 255, 255));
		panelBoton.setBounds(0, 289, 1920, 728);
		contentPane.add(panelBoton);
		panelBoton.setLayout(null);
		
		// Panel para los créditos
		JPanel creditos = new JPanel();
		creditos.setBounds(0, 688, 1920, 40);
		creditos.setBackground(new Color(7, 10, 19));
		panelBoton.add(creditos);
		creditos.setLayout(null);
		
		// Etiqueta de los créditos
		JLabel labelCreditos = new JLabel("© Luis Martin - Levin Jiménez - Wuinder Colmenares");
		labelCreditos.setHorizontalAlignment(SwingConstants.CENTER);
		labelCreditos.setBounds(726, 10, 475, 15);
		labelCreditos.setFont(new Font("Public Sans Thin", Font.PLAIN, 20));
		labelCreditos.setForeground(new Color(255, 255, 255));
		creditos.add(labelCreditos);
		
		// Botón para seleccionar vehículos
		JPanel btnSeleccionarVehiculos = new JPanel();
		// Agrega ActionListener al botón btnResultados
		btnSeleccionarVehiculos.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseClicked(MouseEvent e) {
		             // Cierra el JFrame actual
		              dispose();
		                
		              // Crea una instancia del JFrame GenerarPista y lo muestra
		              SeleccionarVehiculos SeleccionarVehiculosFrame = new SeleccionarVehiculos();
		              SeleccionarVehiculosFrame.setVisible(true);
		          }
		      });
		btnSeleccionarVehiculos.setBounds(840, 128, 228, 60);
		btnSeleccionarVehiculos.setBackground(new Color(15, 23, 42));
		panelBoton.add(btnSeleccionarVehiculos);
		btnSeleccionarVehiculos.setLayout(null);
		Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
		btnSeleccionarVehiculos.setCursor(cursorHand);
		
		JLabel labelBtnSeleccionarVehiculos = new JLabel("Seleccionar Vehículos");
		labelBtnSeleccionarVehiculos.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnSeleccionarVehiculos.setForeground(new Color(255, 255, 255));
		labelBtnSeleccionarVehiculos.setBounds(23, 19, 187, 23);
		btnSeleccionarVehiculos.add(labelBtnSeleccionarVehiculos);
		
		// Botón para ver resultados
		JPanel btnResultados = new JPanel();
		// Agrega ActionListener al botón btnResultados
		btnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Cierra el JFrame actual
                dispose();
                
                // Crea una instancia del JFrame GenerarPista y lo muestra
                VerResultados VerResultadosFrame = new VerResultados();
                VerResultadosFrame.setVisible(true);
            }
        });
		btnResultados.setBounds(1120, 128, 166, 60);
		btnResultados.setLayout(null);
		btnResultados.setBackground(new Color(15, 23, 42));
		panelBoton.add(btnResultados);
		btnResultados.setCursor(cursorHand);
		
		JLabel labelBtnResultados = new JLabel("Resultados");
		labelBtnResultados.setForeground(Color.WHITE);
		labelBtnResultados.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnResultados.setBounds(33, 19, 96, 23);
		btnResultados.add(labelBtnResultados);
		
		// Botón para salir
		JPanel btnSalir = new JPanel();
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(875, 236, 166, 60);
		btnSalir.setLayout(null);
		btnSalir.setBackground(new Color(15, 23, 42));
		panelBoton.add(btnSalir);
		btnSalir.setCursor(cursorHand);
		
		JLabel labelBtnSalir = new JLabel("Salir");
		labelBtnSalir.setForeground(Color.WHITE);
		labelBtnSalir.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnSalir.setBounds(60, 19, 46, 23);
		btnSalir.add(labelBtnSalir);
		
		// Botón para generar pista
		JPanel btnGenerarPista = new JPanel();    
		// Agrega ActionListener al botón btnGenerarPista
        btnGenerarPista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Cierra el JFrame actual
                dispose();
                
                // Crea una instancia del JFrame GenerarPista y lo muestra
                GenerarPista generarPistaFrame = new GenerarPista();
                generarPistaFrame.setVisible(true);
            }
        });
		btnGenerarPista.setBounds(610, 128, 166, 60);
		btnGenerarPista.setLayout(null);
		btnGenerarPista.setBackground(new Color(15, 23, 42));
		panelBoton.add(btnGenerarPista);
		btnGenerarPista.setCursor(cursorHand);
		
		JLabel labelBtnGenerarPista = new JLabel("Generar Pista");
		labelBtnGenerarPista.setForeground(Color.WHITE);
		labelBtnGenerarPista.setFont(new Font("Public Sans Medium", Font.PLAIN, 18));
		labelBtnGenerarPista.setBounds(25, 19, 114, 23);
		btnGenerarPista.add(labelBtnGenerarPista);
	}
}

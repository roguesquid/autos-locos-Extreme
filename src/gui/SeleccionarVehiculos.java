package gui;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import logica.Vehiculos;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeleccionarVehiculos extends JFrame {

	private JPanel contentPane;
	private JTable tablaVehiculos;

	/**
	 * Create the frame.
	 */
	public SeleccionarVehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1060);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setForeground(Color.WHITE);
		header.setBackground(new Color(15, 23, 42));
		header.setBounds(0, 0, 1920, 96);
		contentPane.add(header);
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon("C:\\Users\\luisr\\eclipse-workspace\\autosLocos2\\resources\\logo.png"));
		logoLabel.setBounds(13, 6, 261, 84);
		header.add(logoLabel);
		
		JPanel creditos = new JPanel();
		creditos.setLayout(null);
		creditos.setBackground(new Color(7, 10, 19));
		creditos.setBounds(0, 981, 1920, 40);
		contentPane.add(creditos);
		
		JLabel labelCreditos = new JLabel("© Luis Martin - Levin Jiménez - Wuinder Colmenares");
		labelCreditos.setHorizontalAlignment(SwingConstants.CENTER);
		labelCreditos.setForeground(Color.WHITE);
		labelCreditos.setFont(new Font("Public Sans Thin", Font.PLAIN, 20));
		labelCreditos.setBounds(726, 10, 475, 15);
		creditos.add(labelCreditos);
		
		JPanel content = new JPanel();
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(0, 96, 1920, 883);
		contentPane.add(content);
		content.setLayout(null);
		
		JLabel tituloPagina = new JLabel("Seleccione los vehiculos que correrán");
		tituloPagina.setBounds(23, 116, 652, 44);
		tituloPagina.setFont(new Font("Public Sans", Font.BOLD, 36));
		content.add(tituloPagina);
		
		JLabel btnRegresar = new JLabel("New label");
		btnRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	             // Cierra el JFrame actual
	              dispose();
	                
	              // Crea una instancia del JFrame pantalla y lo muestra
	              Pantalla dashboard = new Pantalla();
	              dashboard.setVisible(true);
			}
		});
		btnRegresar.setIcon(new ImageIcon("C:\\Users\\luisr\\eclipse-workspace\\autosLocos2\\resources\\Group 4.png"));
		btnRegresar.setBounds(23, 34, 177, 53);
		content.add(btnRegresar);
		Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
		btnRegresar.setCursor(cursorHand);
		
        // Crea la tabla de vehículos
        tablaVehiculos = new JTable();
        tablaVehiculos.setFillsViewportHeight(true);
        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Jugara", "Nombre", "Nombre ingles", "Coductores", "Tamano de Caucho", "Tipo de Caucho", "Velocidad", "Liquidos", "Piedras", "Bombas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

        // Crea un JScrollPane y agrega la tabla a él
        JScrollPane scrollPane = new JScrollPane(tablaVehiculos);
        scrollPane.setBounds(33, 173, 1313, 600);
        content.add(scrollPane);
        
        
        llenarTabla();
	}
	
	/**
	 * Llena la tabla de vehículos con los datos de la lista.
	 * Utiliza un renderizador personalizado para mostrar checkboxes en la primera columna.
	 */
	private void llenarTabla() {
	    DefaultTableModel modeloDefault = new DefaultTableModel(
	        new String[] {
	            "Jugara", "Nombre", "Nombre ingles", "Coductores", "Tamano de Caucho",
	            "Tipo de Caucho", "Velocidad", "Liquidos", "Piedras", "Bombas"
	        },
	        logica.appCarreras.lista.contarNodos()
	    );
	    tablaVehiculos.setModel(modeloDefault);

	    TableModel modeloDatos = tablaVehiculos.getModel();
	    for (int i = 0; i < logica.appCarreras.lista.contarNodos(); i++) {
	        Vehiculos vehiculo = logica.appCarreras.lista.obtenerElemento(i);

	        // Renderizador personalizado para mostrar checkboxes en la primera columna
	        DefaultTableCellRenderer checkboxRenderer = new DefaultTableCellRenderer();
	        checkboxRenderer.setHorizontalAlignment(JLabel.CENTER);
	        tablaVehiculos.getColumnModel().getColumn(0).setCellRenderer(checkboxRenderer);

	        modeloDatos.setValueAt(vehiculo.isJuega(), i, 0);
	        modeloDatos.setValueAt(vehiculo.getNombre(), i, 1);
	        modeloDatos.setValueAt(vehiculo.getNombreIngles(), i, 2);
	        modeloDatos.setValueAt(vehiculo.getNombreCoductores(), i, 3);
	        modeloDatos.setValueAt(vehiculo.getTamanoCaucho(), i, 4);
	        modeloDatos.setValueAt(vehiculo.getTipoDeCaucho(), i, 5);
	        modeloDatos.setValueAt(vehiculo.getVelocidad(), i, 6);
	        modeloDatos.setValueAt(vehiculo.getResistenciaLiquido(), i, 7);
	        modeloDatos.setValueAt(vehiculo.getResistenciaObstaculos(), i, 8);
	        modeloDatos.setValueAt(vehiculo.getResistenciaExplosivos(), i, 9);
	    }
	}
}

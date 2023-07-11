package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class GenerarPista extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GenerarPista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1060);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(15, 23, 42));
		header.setForeground(new Color(255, 255, 255));
		header.setBounds(0, 0, 1920, 96);
		contentPane.add(header);
		header.setLayout(null);
		
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
	}
}

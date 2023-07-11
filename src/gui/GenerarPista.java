package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
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
		
		JLabel logoLabel = new JLabel("New label");
		logoLabel.setIcon(new ImageIcon("C:\\Users\\luisr\\eclipse-workspace\\autosLocos2\\resources\\logo.png"));
		logoLabel.setBounds(13, 6, 1061, 84);
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
	}
}

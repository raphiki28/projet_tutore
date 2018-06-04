package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FenetreFrise extends JFrame {
	public FenetreFrise(String parTitre) {
		super(parTitre);
		PanelChrono contentPane = new PanelChrono();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(0,0,0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		setLocation(200,300);
	}
	
	public static void main(String [] args) {
		new FenetreFrise("Cool&Frise");
	}
	
}
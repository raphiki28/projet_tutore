package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class FenetreFrise extends JFrame {
	public FenetreFrise (String parTitre) {
		super(parTitre);
		PanelChronologie contentPane = new PanelChronologie();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(0,0,0));
		
		final String [] items = {"Evenement","Frise","Affichage","Quitter"};
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		for (String i: items) {
			JMenuItem menuItem = new JMenuItem(i, i.charAt(0));
			menuItem.setAccelerator(KeyStroke.getKeyStroke(i.charAt(0), java.awt.Event.CTRL_MASK));
			menuItem.addActionListener(contentPane);
			menuItem.setActionCommand(i);
			menuBar.add(menuItem);
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,650);
		setVisible(true);
		setLocation(100,100);
	}
	
	public static void main (String [] args) {
		new FenetreFrise("Cool&Frise");
	}
}
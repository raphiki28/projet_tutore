package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FenetreFrise extends JFrame{
	public FenetreFrise(String parTitre) {
		super(parTitre);
		PanelChronologie contentPane = new PanelChronologie();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(0,0,0));
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenuItem menuItemEvenement = new JMenuItem("Evenement", 'E');
		menuItemEvenement.addActionListener(contentPane);
		menuItemEvenement.setActionCommand("Evenement");
		menuBar.add(menuItemEvenement);
		
		JMenuItem menuItemFrise = new JMenuItem("Frise", 'F');
		menuItemFrise.addActionListener(contentPane);
		menuItemFrise.setActionCommand("Frise");
		menuBar.add(menuItemFrise);
		
		JMenuItem menuItemAffichage = new JMenuItem("Affichage", 'A');
		menuItemAffichage.addActionListener(contentPane);
		menuItemAffichage.setActionCommand("Affichage");
		menuBar.add(menuItemAffichage);
		
		JMenuItem menuItemFermer = new JMenuItem("Fermer", 'e');
		menuItemFermer.addActionListener(contentPane);
		menuItemFermer.setActionCommand("Fermer");
		menuBar.add(menuItemFermer);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,650);
		setVisible(true);
		setLocation(100,100);
	}
	public static void main(String [] args) {
		new FenetreFrise("Cool&Frise");
	}
}
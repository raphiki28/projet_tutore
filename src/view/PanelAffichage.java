package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Evenement;
import model.Chronologie;

public class PanelAffichage extends JPanel {

	public PanelAffichage(Evenement evt, Chronologie frise1) {
		
		setLayout(new BorderLayout());
		
		JPanel panelNord = new JPanel();
		panelNord.setLayout(new BorderLayout());
		PanelAffichageFrise panelSud = new PanelAffichageFrise(frise1);
		PanelAffichageEvenement panelCentre = new PanelAffichageEvenement(evt);
		JButton boutonSuivant = new JButton(">");
		JButton boutonPrecedant = new JButton("<");
		
		panelNord.add(boutonSuivant,BorderLayout.EAST);
		panelNord.add(boutonPrecedant, BorderLayout.WEST);
		panelNord.add(panelCentre,BorderLayout.CENTER);
		add(panelSud,BorderLayout.SOUTH);
		add(panelNord, BorderLayout.NORTH);
	}
}

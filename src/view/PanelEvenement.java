package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEvenement extends JPanel {
	public PanelEvenement () {
		setLayout(new BorderLayout(10,10));
		
		JLabel labelNord = new JLabel("NOM DE LA FRISE", JLabel.CENTER);
		labelNord.setFont (new Font ("Verdana",Font.PLAIN,20));
		labelNord.setOpaque(true);
		
		PanelFormulaireEvenement panelOuest = new PanelFormulaireEvenement();
		//PanelListeEvenement panelEst = new PanelListeEvenement();
		
		JLabel panelEst = new JLabel("LISTE DES EVENEMENTS", JLabel.CENTER);
		panelEst.setOpaque(true);
		
		add(labelNord, BorderLayout.NORTH);
		add(panelOuest, BorderLayout.WEST);
		add(panelEst, BorderLayout.CENTER);
		
		setBackground(new Color(100,67,98));
	}
}




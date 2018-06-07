package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import model.Evenement;
import model.Chronologie;

public class PanelAffichage extends JPanel {

	public PanelAffichage(Chronologie frise) {
		setLayout(new BorderLayout());
		
		JPanel panelNord = new JPanel();
		panelNord.setLayout(new BorderLayout());
		PanelAffichageFrise panelSud = new PanelAffichageFrise(frise);
		PanelAffichageEvenement panelCentre = new PanelAffichageEvenement(frise);

		panelNord.add(panelCentre,BorderLayout.CENTER);
		add(panelSud,BorderLayout.SOUTH);
		add(panelNord, BorderLayout.NORTH);
	}
}

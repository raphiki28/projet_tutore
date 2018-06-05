package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Evenement;
import model.Chronologie;


public class PanelEvenement extends JPanel{
	
	public PanelEvenement(Chronologie frise1) {
		setLayout(new BorderLayout());

		PanelFormulaireEvenement panelOuest = new PanelFormulaireEvenement();
		PanelListeEvenement panelEst = new PanelListeEvenement(frise1);
		
	
		add(panelOuest,BorderLayout.WEST);
		add(panelEst, BorderLayout.EAST);
	}
		
}




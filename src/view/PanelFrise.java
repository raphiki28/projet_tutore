package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Evenement;
import model.Chronologie;


public class PanelFrise extends JPanel{
	
	public PanelFrise() {
		setLayout(new BorderLayout());

		PanelFormulaireFrise panelOuest = new PanelFormulaireFrise();
		PanelListeFrise panelEst = new PanelListeFrise();
		
	
		add(panelOuest,BorderLayout.WEST);
		add(panelEst, BorderLayout.EAST);
	}
		
}




package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelFrise extends JPanel {
	public PanelFrise() {
		setLayout(new BorderLayout(10,10));
		
		PanelFormulaireFrise panelOuest = new PanelFormulaireFrise();
		//PanelListeFrise panelEst = new PanelListeFrise();
		
		JLabel panelEst = new JLabel("LISTE DES FRISES", JLabel.CENTER);
		panelEst.setOpaque(true);
		
		add(panelOuest, BorderLayout.WEST);
		add(panelEst, BorderLayout.CENTER);
		
		setBackground(new Color(100,67,98));
	}
		
}
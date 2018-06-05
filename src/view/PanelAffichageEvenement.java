package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Date;
import model.Evenement;

public class PanelAffichageEvenement extends JPanel {
	
	public PanelAffichageEvenement(Evenement evt) {
		setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(6,6,6,6);
		contrainte.anchor = GridBagConstraints.WEST;
		
		JLabel image = new JLabel(new ImageIcon(evt.getChImage()),JLabel.LEFT);
		JLabel date = new JLabel (evt.getChDate().toString(),JLabel.LEFT);
		JLabel titre = new JLabel(evt.getChTitre(),JLabel.LEFT);
		JLabel description =new JLabel (evt.getChDescription(),JLabel.LEFT);
		
		//labelTitre
		add(titre, contrainte);
		
		contrainte.gridy=1; contrainte.gridwidth=3; contrainte.gridheight=3;
		add(image, contrainte);
		
		contrainte.gridy=1; contrainte.gridx=3;
		add(date,contrainte);
		
		contrainte.gridy=2; contrainte.gridx=3;
		add(description,contrainte );
	}
}

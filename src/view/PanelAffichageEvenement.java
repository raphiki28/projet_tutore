package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Date;
import model.Evenement;

public class PanelAffichageEvenement extends JPanel {
	
	final static Font FONT_14 = new Font ("Verdana", Font.BOLD,14);
	final static Font FONT_12 = new Font ("Verdana", Font.BOLD,12);
	final static Font FONT_11 = new Font ("Verdana", Font.BOLD,11);
	
	public PanelAffichageEvenement(Evenement evt) {
		setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(6,6,6,6);
		contrainte.anchor = GridBagConstraints.WEST;
		ImageIcon image = new ImageIcon(new ImageIcon(evt.getChImage()).getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		
		JLabel labelImage = new JLabel(image,JLabel.LEFT);
		
		JLabel labelDate = new JLabel (evt.getChDate().toString(),JLabel.LEFT);
		JLabel labelTitre = new JLabel(evt.getChTitre(),JLabel.LEFT);
		JLabel labelDescription =new JLabel (evt.getChDescription(),JLabel.LEFT);
		
		//labelTitre
		add(labelTitre, contrainte);
		
		//labelImage
		contrainte.gridy=1; contrainte.gridwidth=3; contrainte.gridheight=3;
		add(labelImage, contrainte);
		
		//labelTitre
		contrainte.gridy=1; contrainte.gridx=3; contrainte.gridheight=1;
		add(labelDate,contrainte);
		
		//labelDescription
		contrainte.gridy=2; contrainte.gridx=3;
		add(labelDescription,contrainte );
		
		labelTitre.setFont(FONT_14);
		labelDate.setFont(FONT_12);
		labelDescription.setFont(FONT_11);
		
	}
}

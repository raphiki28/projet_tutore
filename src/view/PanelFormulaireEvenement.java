package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import controller.Controleur;
//import model.Chronologie;
import model.Date;
import model.Evenement;

public class PanelFormulaireEvenement extends JPanel {


	final static Font FONT_14 = new Font ("Verdana", Font.BOLD,14);
	final static Font FONT_12 = new Font ("Verdana", Font.BOLD,12);
	final static Font FONT_11 = new Font ("Verdana", Font.BOLD,11);
	final String [] POIDS = {" 1 "," 2 "," 3 "," 4 "} ;
	
	JButton boutonAjout = new JButton("Ajouter");
	JTextField champTitre = new JTextField(4);
	JTextField champJour = new JTextField(3);
	JTextField champMois = new JTextField(3);
	JTextField champAnnee = new JTextField(3);	
	JTextField champImage = new JTextField(4);
	JComboBox <String> champPoids = new JComboBox<String>(POIDS);
	JTextArea champDescription = new JTextArea(8,8);
	
	public PanelFormulaireEvenement() {
					
			//Le gestionnaire de répartition
		setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(6,6,6,6);
		contrainte.anchor = GridBagConstraints.WEST;
		
		//Les éléments graphiques
		JLabel labelImage = new JLabel ("Image", JLabel.LEFT);
		JLabel labelPoids = new JLabel("Poids", JLabel.LEFT);
		JLabel labelDate = new JLabel ("Date", JLabel.LEFT);
		JLabel labelTitre = new JLabel("Titre", JLabel.LEFT);
		JLabel labelDescription = new JLabel("Description", JLabel.LEFT);
		
		//***********************Couleurs temps***********************
				
	
		
		//************************************************************
		
		//labelTitre et champTitre
		contrainte.gridwidth= 1; contrainte.gridx = 0;
		this.add(labelTitre,contrainte);
		contrainte.gridx = 2; contrainte.gridwidth=4;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		this.add(champTitre,contrainte);
		contrainte.fill = GridBagConstraints.NONE;
		
		//labelDate et champDate
		contrainte.gridy = 1; contrainte.gridwidth= 1; contrainte.gridx = 0;
		this.add(labelDate,contrainte);
		contrainte.gridx = 2; contrainte.gridwidth=1;
		this.add(champJour,contrainte);
		contrainte.gridx = 3; contrainte.gridwidth=1;
		this.add(champMois, contrainte);
		contrainte.gridx = 4; contrainte.gridwidth=1;
		this.add(champAnnee, contrainte);
		
		//labelPoids et champPoids
		contrainte.gridy=2; contrainte.gridwidth=2; contrainte.gridx=0;
		this.add(labelPoids, contrainte);
		contrainte.gridx=2;contrainte.gridwidth=4;
		this.add(champPoids, contrainte);
		
		
		//labeImage et champImage
		contrainte.gridy=3; contrainte.gridx=0;contrainte.gridwidth=2;
		this.add(labelImage, contrainte);
		contrainte.gridx=2;contrainte.gridwidth=4;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		this.add(champImage, contrainte);
		
		//labelDescription et champDescription
		contrainte.gridy = 4; contrainte.gridx = 0; contrainte.gridwidth=2;
		contrainte.anchor = GridBagConstraints.NORTHWEST;
		this.add(labelDescription,contrainte);
		contrainte.gridx = 2; contrainte.gridwidth=4; contrainte.gridheight=3;
		contrainte.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(champDescription),contrainte);

		//boutonAjout
		contrainte.gridy=8; contrainte.gridwidth=1; contrainte.gridx = 4;
		boutonAjout.setForeground(Color.white);
		boutonAjout.setBackground(Color.gray);
		this.add(boutonAjout,contrainte);
		
		//fontes, couleurs, aspect, accessibilité
		labelDate.setFont(FONT_12);
		labelDate.setDisplayedMnemonic('D');
		champJour.setOpaque(false);
		champMois.setOpaque(false);
		champAnnee.setOpaque(false);
		
		labelPoids.setFont(FONT_12);
		labelPoids.setDisplayedMnemonic('P');
		champPoids.setOpaque(false);

		labelImage.setFont(FONT_12);
		labelImage.setDisplayedMnemonic('I');
		champImage.setOpaque(false);

		boutonAjout.setFont(FONT_12);

		
		labelTitre.setFont(FONT_12);
		labelTitre.setDisplayedMnemonic('T');
		labelTitre.setLabelFor(champTitre);
		champTitre.setFocusable(true);
		champTitre.setOpaque(false);
		
		labelDescription.setFont(FONT_12);
		labelDescription.setDisplayedMnemonic('L');
		labelDescription.setLabelFor(champDescription);
		champDescription.setOpaque(false);
		
		reset();
	}

	public void reset(){
		champTitre.setText(new String());
		champDescription.setText(new String());
		
		//le focus est donné au premier champ de saisie
		champTitre.requestFocus();
	}
	
	/*public Evenement getEvenement() {		
		return new Evenement (new Date(Integer.parseInt(champJour.getText()),Integer.parseInt(champMois.getText()),Integer.parseInt(champAnnee.getText())),champTitre.getText(),champDescription.getText());
	}
	
	public void enregistreEcouteur(Controleur parC){
		boutonAjout.addActionListener(parC);
	}*/
	
	public JTextField getChampRecevantFocus(){
		return champTitre;
	}

	
}

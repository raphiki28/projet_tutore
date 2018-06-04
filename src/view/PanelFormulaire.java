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

public class PanelFormulaire extends JPanel {


	final static Font FONT_14 = new Font ("Verdana", Font.BOLD,14);
	final static Font FONT_12 = new Font ("Verdana", Font.BOLD,12);
	final static Font FONT_11 = new Font ("Verdana", Font.BOLD,11);
	
	Date date;
	JLabel labelDate;
	JButton boutonAjout = new JButton("+");
	JTextField champTitre = new JTextField(4);
	JTextField champJour = new JTextField(4);
	JTextField champMois = new JTextField(4);
	JTextField champAnnee = new JTextField(4);	
	JTextArea champDescription = new JTextArea(8,8);
	
	public PanelFormulaire() {
		date = new Date();
		
		//à l'ouverture le formulaire de saisie contient la date courante
		labelDate = new JLabel (date.toString(), JLabel.LEFT);
		
		//Le gestionnaire de répartition
		setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(6,6,6,6);
		contrainte.anchor = GridBagConstraints.WEST;
		
		//Les éléments graphiques
		JLabel labelTitre = new JLabel("Titre", JLabel.LEFT);
		JLabel Date = new JLabel("Date", JLabel.LEFT);
		JLabel labelDescription = new JLabel("Description", JLabel.LEFT);
		
		//***********************Couleurs temps***********************
				
	
		
		//************************************************************
		
		//labelDate
		contrainte.gridy=0; contrainte.gridwidth = 4; contrainte.gridx=0;
		this.add(labelDate,contrainte);
		
		//boutonAjout
		contrainte.gridwidth=1; contrainte.gridx = 4;
		boutonAjout.setForeground(Color.white);
		boutonAjout.setBackground(Color.gray);
		this.add(boutonAjout,contrainte);
		
		//labelTitre et champTitre
		contrainte.gridy = 1; contrainte.gridwidth= 1; contrainte.gridx = 0;
		this.add(labelTitre,contrainte);
		contrainte.gridx = 1; contrainte.gridwidth=4;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		this.add(champTitre,contrainte);
		contrainte.fill = GridBagConstraints.NONE;
		
		//labelDate et champDate
		contrainte.gridy = 2; contrainte.gridwidth= 1; contrainte.gridx = 0;
		this.add(labelDate,contrainte);
		contrainte.gridx = 1; contrainte.gridwidth=4;
		contrainte.fill = GridBagConstraints.HORIZONTAL;
		this.add(champJour,contrainte);
		contrainte.gridx = 1; contrainte.gridwidth=4;contrainte.gridy=1;
		this.add(champMois, contrainte);
		contrainte.gridx = 1; contrainte.gridwidth=4;contrainte.gridy=2;
		this.add(champAnnee, contrainte);
		contrainte.fill = GridBagConstraints.NONE;
		
		//labelDescription et champDescription
		contrainte.gridy = 5; contrainte.gridx = 0;
		contrainte.anchor = GridBagConstraints.NORTHWEST;
		this.add(labelDescription,contrainte);
		contrainte.gridx = 1; contrainte.gridwidth=4;
		contrainte.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(champDescription),contrainte);
		
		//fontes, couleurs, aspect, accessibilité
		labelDate.setFont(FONT_14);
		boutonAjout.setFont(FONT_12);
		boutonAjout.setFocusPainted(false);
		
		labelTitre.setFont(FONT_12);
		labelTitre.setDisplayedMnemonic('T');
		labelTitre.setLabelFor(champTitre);
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
	
	public Evenement getEvenement() {		
		return new Evenement (new Date(Integer.parseInt(champJour.getText()),Integer.parseInt(champMois.getText()),Integer.parseInt(champAnnee.getText())),champTitre.getText(),champDescription.getText());
	}
	
	/*public void enregistreEcouteur(Controleur parC){
		boutonAjout.addActionListener(parC);
	}*/
	
	
	public void setDate(Date parDate){
		date = parDate;
		labelDate.setText(date.toString());
	}
	
	public JTextField getChampRecevantFocus(){
		return champTitre;
	}

	
}

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
import model.Chronologie;
import model.Date;
import model.Evenement;



public class PanelFormulaireFrise extends JPanel {
	
	final static Font FONT_14 = new Font ("Verdana", Font.BOLD,14);
	final static Font FONT_12 = new Font ("Verdana", Font.BOLD,12);
	final static Font FONT_11 = new Font ("Verdana", Font.BOLD,11);
	JButton boutonAjout = new JButton("Créer");
	JTextField champTitre = new JTextField(4);
	JTextField champDebut =new JTextField(4);
	JTextField champFin =new JTextField(4);
	JTextField champFichier =new JTextField(4);
	JTextField champPeriode =new JTextField(4);

		public PanelFormulaireFrise() {
			setLayout(new GridBagLayout());
			GridBagConstraints contrainte = new GridBagConstraints();
			contrainte.insets = new Insets(6,6,6,6);
			contrainte.anchor = GridBagConstraints.WEST;
			
			
			//Les éléments graphiques
			JLabel labelTitre = new JLabel("Titre", JLabel.LEFT);
			JLabel labelDebut = new JLabel ("Debut", JLabel.LEFT);
			JLabel labelFin = new JLabel("Fin", JLabel.LEFT);
			JLabel labelFichier = new JLabel ("Fichier", JLabel.LEFT);
			JLabel labelPeriode = new JLabel("Periode", JLabel.LEFT);
	
		
		//***********************Couleurs temps***********************
				
	
		
		//************************************************************
			
			
			//labelTitre et champTitre
			contrainte.gridwidth= 1; contrainte.gridx = 0;
			this.add(labelTitre,contrainte);
			contrainte.gridx = 2; contrainte.gridwidth=4;
			contrainte.fill = GridBagConstraints.HORIZONTAL;
			this.add(champTitre,contrainte);
			contrainte.fill = GridBagConstraints.NONE;

			
			//labelDedbut et champDebut
			contrainte.gridy = 1; contrainte.gridwidth= 1; contrainte.gridx = 0;
			this.add(labelDebut,contrainte);
			contrainte.gridx = 2; contrainte.gridwidth=4;
			contrainte.fill = GridBagConstraints.HORIZONTAL;
			this.add(champDebut,contrainte);
			contrainte.fill = GridBagConstraints.NONE;

			
			//labelFin et champFin
			contrainte.gridy=2; contrainte.gridwidth=2; contrainte.gridx=0;
			this.add(labelFin, contrainte);
			contrainte.gridx=2;contrainte.gridwidth=4;
			this.add(champFin, contrainte);
			
			//labeFichier et champFichier
			contrainte.gridy=3; contrainte.gridx=0;contrainte.gridwidth=2;
			this.add(labelFichier, contrainte);
			contrainte.gridx=2;contrainte.gridwidth=4;
			contrainte.fill = GridBagConstraints.HORIZONTAL;
			this.add(champFichier, contrainte);
			
			//labePeriode et champPeriode
			contrainte.gridy=4; contrainte.gridx=0;contrainte.gridwidth=2;
			this.add(labelPeriode, contrainte);
			contrainte.gridx=2;contrainte.gridwidth=4;
			contrainte.fill = GridBagConstraints.HORIZONTAL;
			this.add(champPeriode, contrainte);


			//boutonAjout
			contrainte.gridy=8; contrainte.gridwidth=1; contrainte.gridx = 4;
			boutonAjout.setForeground(Color.white);
			boutonAjout.setBackground(Color.gray);
			this.add(boutonAjout,contrainte);
			
			//fontes, couleurs, aspect, accessibilité

			labelTitre.setFont(FONT_12);
			labelTitre.setDisplayedMnemonic('T');
			labelTitre.setLabelFor(champTitre);
			champTitre.setFocusable(true);
			champTitre.setOpaque(false);
			
			labelDebut.setFont(FONT_12);
			labelDebut.setDisplayedMnemonic('D');
			champDebut.setOpaque(false);

			labelFin.setFont(FONT_12);
			labelFin.setDisplayedMnemonic('F');
			champFin.setOpaque(false);

			labelFichier.setFont(FONT_12);
			labelFichier.setDisplayedMnemonic('F');
			champFichier.setOpaque(false);
			
			labelPeriode.setFont(FONT_12);
			labelPeriode.setDisplayedMnemonic('F');
			champPeriode.setOpaque(false);
			
			boutonAjout.setFont(FONT_12);

			
			reset();
}

	

	public void reset(){
		champTitre.setText(new String());
		champDebut.setText(new String());
		champFin.setText(new String());
		champFichier.setText(new String());
		champPeriode.setText(new String());
		//le focus est donné au premier champ de saisie
		champTitre.requestFocus();
	}
	public Chronologie getFrise() {
		return new Chronologie(champTitre.getText(),Integer.parseInt(champDebut.getText()),Integer.parseInt(champFin.getText()),Integer.parseInt(champPeriode.getText()),champFichier.getText());
	}
	

	
	public void enregistreEcouteur(Controleur parC){
		boutonAjout.addActionListener(parC);
	}
	
	public JTextField getChampRecevantFocus(){
		return champTitre;
	}

	
}

package model;

public class Evenement implements Comparable <Evenement> {
	private Date date;
	private String titre;
	private int poids;
	private String description;
	private String lienImage;
	
	public Evenement(Date parDate, String parTitre, String parDesc, int parPoids, String parImg) {
		date = parDate;
		titre = parTitre;
		poids = parPoids;
		description = parDesc;
		lienImage = parImg;
	}
	
	public String toString() {
		return date.toString() + " | " + titre + " ("+ poids + ") | " + description + " | " + lienImage;
	}
	
	public int compareTo (Evenement parEvt) {
		if (date.compareTo(parEvt.date) < 0)
			return -1;
		if (date.compareTo(parEvt.date) > 0)
			return 1;
		if (poids < parEvt.poids)
			return -1;
		if (poids > parEvt.poids)
			return 1;
		if (titre.compareTo(parEvt.titre) < 0)
			return -1;
		if (titre.compareTo(parEvt.titre) > 0)
			return 1;

		return 0;
	}
	
	public static Evenement lireEvenement () {
		System.out.println("Entrer la date de l'évenement");
		Date parDate = Date.lireDate();
		System.out.println("Entrer le titre de l'évenement");
		String parTitre = Clavier.lireString();
		System.out.println("Entrer la description de l'évenement");
		String parDesc = Clavier.lireString();
		System.out.println("Entrer le poids de l'évenement");
		int parPoids = Clavier.lireInt();
		System.out.println("Entrer le lien de l'image");
		String parImg = Clavier.lireString();
		return new Evenement(parDate, parTitre, parDesc, parPoids, parImg);
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getLienImage() {
		return lienImage;
	}
	
	public void setDate(Date parDate) {
		date = parDate;
	}
	
	public void setTitre(String parTitre) {
		titre = parTitre;
	}
	
	public void setPoids(int parPoids) {
		poids = parPoids;
	}
	
	public void setDescription(String parDesc) {
		description = parDesc;
	}
	
	public void setLienImage(String parImage) {
		lienImage = parImage;
	}
}
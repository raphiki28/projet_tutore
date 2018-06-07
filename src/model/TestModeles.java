package model;

public class TestModeles {
	public static void main (String [] args) {
		// CLASSE DATE
		/*
		Date d0 = Date.lireDate2();
		System.out.println(d0.toString());
		System.out.println(d0.estValide());
		
		Date d1 = Date.lireDate2();
		for (int i=0 ; i<2 ; i++) {
			Date d2 = Date.lireDate2();
			if (d1.compareTo(d2) >= 0)
				d1 = d2;
		}
		
		System.out.println("Date la plus ancienne : "+d1.toString());
		
		// CLASSE EVENEMENT
		Evenement evt0 = new Evenement(new Date(11,9,2001), "Attentats", "Le jour ou tout a basculé", 4, "twintower.png");
		System.out.println(evt0.toString());
		
		Evenement evt1 = Evenement.lireEvenement();
		for (int i=0 ; i<2 ; i++) {
			Evenement evt2 = Evenement.lireEvenement();
			if (evt1.compareTo(evt2) >= 0)
				evt1 = evt2;
		}
		
		System.out.println("Premier évenement : "+evt1.toString());
		*/
		// CLASSE CHRONOLOGIE
		Chronologie chr0 = new Chronologie("ChronoTest", 1990, 2020, 1, "save.txt");
		chr0.ajout(new Evenement (new Date(14,07,1789), "Revolution", "prise de la bastille et emeute dans les rue", 1, "image/image_evt.png"));
		chr0.ajout(new Evenement (new Date(11,9,2001), "Attentats", "Le jour ou tout a basculé", 4, "twintower.png"));
		chr0.ajout(new Evenement (new Date(22,7,1991), "Creation de l'UVSQ", "L’acte de naissance officiel de l’université de Versailles Saint-Quentin-en-Yvelines est signé aux services centraux rue du refuge.", 4, "signature.png"));
		chr0.ajout(new Evenement (new Date(13,6,1992), "Inauguration du batiment Leclerc", "Michel Garnier coupe le ruban du bâtiment destiné à la faculté de droit et de science politique à Guyaucourt.", 2, "inauguration.png"));
		chr0.ajout(new Evenement (new Date(28,9,2016), "Inauguration de la MDE à Guyancourt", "Un evenement très attendu à l'UVSQ.", 2, "MDE.png"));
		System.out.println(chr0.toString());
		System.out.println(chr0.nbEvtParAnnee(1992));
		System.out.println(chr0.nbEvtTotal());		
	}
}
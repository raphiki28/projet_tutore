package model;

import model.Date;

public class Evenement{
	private Date chDate;
	private String chTitre;
	private String chDescription;
	private int chPoids;
	private String chImage;
	
	
	public Evenement(Date parDate,String parTitre,String parDescription, int parPoids, String parImage){
		this.chDate = parDate;
		this.chTitre = parTitre;
		this.chDescription= parDescription;
		this.chPoids= parPoids;
		this.chImage= parImage;
	}
	
	public String toString(){
		return chTitre+"/"+chDescription;
	}

	//accesseur de la classe
	public Date getChDate(){
		return this.chDate;
	}

	public String getChTitre(){
		return this.chTitre;
	}
	
	public String getChDescription(){
		return this.chDescription;
	}
	public String getChImage() {
		return this.chImage;
	}
	public int getChPoids() {
		return this.chPoids;
	}

	
	//modifieur de la classe
	public void setChDate(Date parDate){
		this.chDate = parDate;
	}

	public void setChTitre(String parTitre){
		this.chTitre = parTitre;
	}

	public void setChLieu(String parDescription){
		this.chDescription = parDescription;
	}

}

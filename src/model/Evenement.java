package model;

import model.Date;

public class Evenement{
	private Date chDate;
	private String chTitre;
	private String chDescription;
	
	
	public Evenement(Date parDate,String parTitre,String parDescription){
		this.chDate = parDate;
		this.chTitre = parTitre;
		this.chDescription= parDescription;
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

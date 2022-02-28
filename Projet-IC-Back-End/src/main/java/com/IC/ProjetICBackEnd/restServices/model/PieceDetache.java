package com.IC.ProjetICBackEnd.restServices.model;

public class PieceDetache {
	
	private int pd_id;
	private String pd_libelle;
	private int pd_prix;

	public int getPd_id() {
		return pd_id;
	}

	public void setPd_id(int pd_id) {
		this.pd_id = pd_id;
	}

	public String getPd_libelle() {
		return pd_libelle;
	}

	public void setPd_libelle(String pd_libelle) {
		this.pd_libelle = pd_libelle;
	}

	public int getPd_prix() {
		return pd_prix;
	}

	public void setPd_prix(int pd_prix) {
		this.pd_prix = pd_prix;
	}
}

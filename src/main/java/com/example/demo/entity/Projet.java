
package com.example.demo.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;


@Document("Projet")
public class Projet {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String idP;
	private String nomP;
	private Categorie category;
	private String descriptionP;

	private Float budget;
	@Temporal(TemporalType.DATE)
	private Date dateDebutP;
	@Temporal(TemporalType.DATE)
	private Date dateFinP;
	public Projet() {

	}
	public Projet(String nomP, Categorie category, String descriptionP, Float budget, Date dateDebutP, Date dateFinP) {
		super();
		this.nomP = nomP;
		this.category = category;
		this.descriptionP = descriptionP;
		this.budget = budget;
		this.dateDebutP = dateDebutP;
		this.dateFinP = dateFinP;
	}
	public String getIdP() {
		return idP;
	}
	public void setIdP(String idP) {
		this.idP = idP;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public Categorie getCategory() {
		return category;
	}
	public void setCategory(Categorie category) {
		this.category = category;
	}
	public String getDescriptionP() {
		return descriptionP;
	}
	public void setDescriptionP(String descriptionP) {
		this.descriptionP = descriptionP;
	}
	public Float getBudget() {
		return budget;
	}
	public void setBudget(Float budget) {
		this.budget = budget;
	}
	public Date getDateDebutP() {
		return dateDebutP;
	}
	public void setDateDebutP(Date dateDebutP) {
		this.dateDebutP = dateDebutP;
	}
	public Date getDateFinP() {
		return dateFinP;
	}
	public void setDateFinP(Date dateFinP) {
		this.dateFinP = dateFinP;
	}
	@Override
	public String toString() {
		return "Projet [idP=" + idP + ", nomP=" + nomP + ", category=" + category + ", descriptionP=" + descriptionP
				+ ", budget=" + budget + ", dateDebutP=" + dateDebutP + ", dateFinP=" + dateFinP + "]";
	}


}
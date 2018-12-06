package tn.esprit.epione.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Consultations database table.
 * 
 */
@Entity
@Table(name="Consultations")
@NamedQuery(name="Consultation.findAll", query="SELECT c FROM Consultation c")
public class Consultation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Date")
	private Timestamp date;

	@Column(name="Desease")
	private String desease;

	@Column(name="Treatment")
	private String treatment;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="DocFK")
	private AspNetUser aspNetUser1;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="PatFK")
	private AspNetUser aspNetUser2;

	public Consultation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getDesease() {
		return this.desease;
	}

	public void setDesease(String desease) {
		this.desease = desease;
	}

	public String getTreatment() {
		return this.treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public AspNetUser getAspNetUser1() {
		return this.aspNetUser1;
	}

	public void setAspNetUser1(AspNetUser aspNetUser1) {
		this.aspNetUser1 = aspNetUser1;
	}

	public AspNetUser getAspNetUser2() {
		return this.aspNetUser2;
	}

	public void setAspNetUser2(AspNetUser aspNetUser2) {
		this.aspNetUser2 = aspNetUser2;
	}

}
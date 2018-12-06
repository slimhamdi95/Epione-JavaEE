package tn.esprit.epione.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Reclamations database table.
 * 
 */
@Entity
@Table(name="Reclamations")
@NamedQuery(name="Reclamation.findAll", query="SELECT r FROM Reclamation r")
public class Reclamation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Desc")
	private String desc;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="DocDest_Id")
	private AspNetUser aspNetUser1;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="DocSrc_Id")
	private AspNetUser aspNetUser2;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="Pat_Id")
	private AspNetUser aspNetUser3;

	public Reclamation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

	public AspNetUser getAspNetUser3() {
		return this.aspNetUser3;
	}

	public void setAspNetUser3(AspNetUser aspNetUser3) {
		this.aspNetUser3 = aspNetUser3;
	}

}
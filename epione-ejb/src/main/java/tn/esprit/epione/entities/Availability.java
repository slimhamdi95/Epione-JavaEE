package tn.esprit.epione.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Availabilities database table.
 * 
 */
@Entity
@Table(name="Availabilities")
@NamedQuery(name="Availability.findAll", query="SELECT a FROM Availability a")
public class Availability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AvailabilityId")
	private int availabilityId;

	@Column(name="Date")
	private Timestamp date;

	@Column(name="Description")
	private String description;

	@Column(name="EndTime")
	private Timestamp endTime;

	@Column(name="StartTime")
	private Timestamp startTime;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="DocFK")
	private AspNetUser aspNetUser;

	public Availability() {
	}

	public int getAvailabilityId() {
		return this.availabilityId;
	}

	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

}
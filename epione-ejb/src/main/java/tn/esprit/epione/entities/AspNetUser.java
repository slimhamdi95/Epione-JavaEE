package tn.esprit.epione.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the AspNetUsers database table.
 * 
 */
@Entity
@Table(name="AspNetUsers")
@NamedQuery(name="AspNetUser.findAll", query="SELECT a FROM AspNetUser a")
public class AspNetUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private String id;

	@Column(name="AccessFailedCount")
	private int accessFailedCount;

	@Column(name="Adress")
	private String adress;

	private String allergies;

	private String antecedents;

	@Column(name="Birthday")
	private Timestamp birthday;

	private String comments;

	@Column(name="ConsultingFees")
	private float consultingFees;

	@Column(name="Discriminator")
	private String discriminator;

	@Column(name="Email")
	private String email;

	@Column(name="EmailConfirmed")
	private boolean emailConfirmed;

	@Column(name="FirstName")
	private String firstName;

	private float height;

	@Column(name="Img")
	private String img;

	@Column(name="LastName")
	private String lastName;

	@Column(name="LockoutEnabled")
	private boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private Timestamp lockoutEndDateUtc;

	@Column(name="PasswordHash")
	private String passwordHash;

	@Column(name="PhoneNumber")
	private String phoneNumber;

	@Column(name="PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed;

	private String profession;

	@Column(name="SecurityStamp")
	private String securityStamp;

	@Column(name="Sexe")
	private String sexe;

	@Column(name="SocialSecurityNumber")
	private int socialSecurityNumber;

	@Column(name="Specialty")
	private String specialty;

	private String treatments;

	@Column(name="TwoFactorEnabled")
	private boolean twoFactorEnabled;

	@Column(name="UserName")
	private String userName;

	private int validation;

	@Column(name="Ville")
	private String ville;

	private float weight;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="aspNetUser1")
	private List<Appointment> appointments1;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="aspNetUser2")
	private List<Appointment> appointments2;

	//bi-directional many-to-one association to AspNetUserClaim
	@OneToMany(mappedBy="aspNetUser")
	private List<AspNetUserClaim> aspNetUserClaims;

	//bi-directional many-to-one association to AspNetUserLogin
	@OneToMany(mappedBy="aspNetUser")
	private List<AspNetUserLogin> aspNetUserLogins;

	//bi-directional many-to-many association to AspNetRole
	@ManyToMany
	@JoinTable(
		name="AspNetUserRoles"
		, joinColumns={
			@JoinColumn(name="UserId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="RoleId")
			}
		)
	private List<AspNetRole> aspNetRoles;

	//bi-directional many-to-one association to Availability
	@OneToMany(mappedBy="aspNetUser")
	private List<Availability> availabilities;

	//bi-directional many-to-one association to Consultation
	@OneToMany(mappedBy="aspNetUser1")
	private List<Consultation> consultations1;

	//bi-directional many-to-one association to Consultation
	@OneToMany(mappedBy="aspNetUser2")
	private List<Consultation> consultations2;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="aspNetUser1")
	private List<Rating> ratings1;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="aspNetUser2")
	private List<Rating> ratings2;

	//bi-directional many-to-one association to Reclamation
	@OneToMany(mappedBy="aspNetUser1")
	private List<Reclamation> reclamations1;

	//bi-directional many-to-one association to Reclamation
	@OneToMany(mappedBy="aspNetUser2")
	private List<Reclamation> reclamations2;

	//bi-directional many-to-one association to Reclamation
	@OneToMany(mappedBy="aspNetUser3")
	private List<Reclamation> reclamations3;

	public AspNetUser() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAllergies() {
		return this.allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getAntecedents() {
		return this.antecedents;
	}

	public void setAntecedents(String antecedents) {
		this.antecedents = antecedents;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public float getConsultingFees() {
		return this.consultingFees;
	}

	public void setConsultingFees(float consultingFees) {
		this.consultingFees = consultingFees;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Timestamp getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Timestamp lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getTreatments() {
		return this.treatments;
	}

	public void setTreatments(String treatments) {
		this.treatments = treatments;
	}

	public boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getValidation() {
		return this.validation;
	}

	public void setValidation(int validation) {
		this.validation = validation;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public List<Appointment> getAppointments1() {
		return this.appointments1;
	}

	public void setAppointments1(List<Appointment> appointments1) {
		this.appointments1 = appointments1;
	}

	public Appointment addAppointments1(Appointment appointments1) {
		getAppointments1().add(appointments1);
		appointments1.setAspNetUser1(this);

		return appointments1;
	}

	public Appointment removeAppointments1(Appointment appointments1) {
		getAppointments1().remove(appointments1);
		appointments1.setAspNetUser1(null);

		return appointments1;
	}

	public List<Appointment> getAppointments2() {
		return this.appointments2;
	}

	public void setAppointments2(List<Appointment> appointments2) {
		this.appointments2 = appointments2;
	}

	public Appointment addAppointments2(Appointment appointments2) {
		getAppointments2().add(appointments2);
		appointments2.setAspNetUser2(this);

		return appointments2;
	}

	public Appointment removeAppointments2(Appointment appointments2) {
		getAppointments2().remove(appointments2);
		appointments2.setAspNetUser2(null);

		return appointments2;
	}

	public List<AspNetUserClaim> getAspNetUserClaims() {
		return this.aspNetUserClaims;
	}

	public void setAspNetUserClaims(List<AspNetUserClaim> aspNetUserClaims) {
		this.aspNetUserClaims = aspNetUserClaims;
	}

	public AspNetUserClaim addAspNetUserClaim(AspNetUserClaim aspNetUserClaim) {
		getAspNetUserClaims().add(aspNetUserClaim);
		aspNetUserClaim.setAspNetUser(this);

		return aspNetUserClaim;
	}

	public AspNetUserClaim removeAspNetUserClaim(AspNetUserClaim aspNetUserClaim) {
		getAspNetUserClaims().remove(aspNetUserClaim);
		aspNetUserClaim.setAspNetUser(null);

		return aspNetUserClaim;
	}

	public List<AspNetUserLogin> getAspNetUserLogins() {
		return this.aspNetUserLogins;
	}

	public void setAspNetUserLogins(List<AspNetUserLogin> aspNetUserLogins) {
		this.aspNetUserLogins = aspNetUserLogins;
	}

	public AspNetUserLogin addAspNetUserLogin(AspNetUserLogin aspNetUserLogin) {
		getAspNetUserLogins().add(aspNetUserLogin);
		aspNetUserLogin.setAspNetUser(this);

		return aspNetUserLogin;
	}

	public AspNetUserLogin removeAspNetUserLogin(AspNetUserLogin aspNetUserLogin) {
		getAspNetUserLogins().remove(aspNetUserLogin);
		aspNetUserLogin.setAspNetUser(null);

		return aspNetUserLogin;
	}

	public List<AspNetRole> getAspNetRoles() {
		return this.aspNetRoles;
	}

	public void setAspNetRoles(List<AspNetRole> aspNetRoles) {
		this.aspNetRoles = aspNetRoles;
	}

	public List<Availability> getAvailabilities() {
		return this.availabilities;
	}

	public void setAvailabilities(List<Availability> availabilities) {
		this.availabilities = availabilities;
	}

	public Availability addAvailability(Availability availability) {
		getAvailabilities().add(availability);
		availability.setAspNetUser(this);

		return availability;
	}

	public Availability removeAvailability(Availability availability) {
		getAvailabilities().remove(availability);
		availability.setAspNetUser(null);

		return availability;
	}

	public List<Consultation> getConsultations1() {
		return this.consultations1;
	}

	public void setConsultations1(List<Consultation> consultations1) {
		this.consultations1 = consultations1;
	}

	public Consultation addConsultations1(Consultation consultations1) {
		getConsultations1().add(consultations1);
		consultations1.setAspNetUser1(this);

		return consultations1;
	}

	public Consultation removeConsultations1(Consultation consultations1) {
		getConsultations1().remove(consultations1);
		consultations1.setAspNetUser1(null);

		return consultations1;
	}

	public List<Consultation> getConsultations2() {
		return this.consultations2;
	}

	public void setConsultations2(List<Consultation> consultations2) {
		this.consultations2 = consultations2;
	}

	public Consultation addConsultations2(Consultation consultations2) {
		getConsultations2().add(consultations2);
		consultations2.setAspNetUser2(this);

		return consultations2;
	}

	public Consultation removeConsultations2(Consultation consultations2) {
		getConsultations2().remove(consultations2);
		consultations2.setAspNetUser2(null);

		return consultations2;
	}

	public List<Rating> getRatings1() {
		return this.ratings1;
	}

	public void setRatings1(List<Rating> ratings1) {
		this.ratings1 = ratings1;
	}

	public Rating addRatings1(Rating ratings1) {
		getRatings1().add(ratings1);
		ratings1.setAspNetUser1(this);

		return ratings1;
	}

	public Rating removeRatings1(Rating ratings1) {
		getRatings1().remove(ratings1);
		ratings1.setAspNetUser1(null);

		return ratings1;
	}

	public List<Rating> getRatings2() {
		return this.ratings2;
	}

	public void setRatings2(List<Rating> ratings2) {
		this.ratings2 = ratings2;
	}

	public Rating addRatings2(Rating ratings2) {
		getRatings2().add(ratings2);
		ratings2.setAspNetUser2(this);

		return ratings2;
	}

	public Rating removeRatings2(Rating ratings2) {
		getRatings2().remove(ratings2);
		ratings2.setAspNetUser2(null);

		return ratings2;
	}

	public List<Reclamation> getReclamations1() {
		return this.reclamations1;
	}

	public void setReclamations1(List<Reclamation> reclamations1) {
		this.reclamations1 = reclamations1;
	}

	public Reclamation addReclamations1(Reclamation reclamations1) {
		getReclamations1().add(reclamations1);
		reclamations1.setAspNetUser1(this);

		return reclamations1;
	}

	public Reclamation removeReclamations1(Reclamation reclamations1) {
		getReclamations1().remove(reclamations1);
		reclamations1.setAspNetUser1(null);

		return reclamations1;
	}

	public List<Reclamation> getReclamations2() {
		return this.reclamations2;
	}

	public void setReclamations2(List<Reclamation> reclamations2) {
		this.reclamations2 = reclamations2;
	}

	public Reclamation addReclamations2(Reclamation reclamations2) {
		getReclamations2().add(reclamations2);
		reclamations2.setAspNetUser2(this);

		return reclamations2;
	}

	public Reclamation removeReclamations2(Reclamation reclamations2) {
		getReclamations2().remove(reclamations2);
		reclamations2.setAspNetUser2(null);

		return reclamations2;
	}

	public List<Reclamation> getReclamations3() {
		return this.reclamations3;
	}

	public void setReclamations3(List<Reclamation> reclamations3) {
		this.reclamations3 = reclamations3;
	}

	public Reclamation addReclamations3(Reclamation reclamations3) {
		getReclamations3().add(reclamations3);
		reclamations3.setAspNetUser3(this);

		return reclamations3;
	}

	public Reclamation removeReclamations3(Reclamation reclamations3) {
		getReclamations3().remove(reclamations3);
		reclamations3.setAspNetUser3(null);

		return reclamations3;
	}

}
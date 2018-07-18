package fr.silvharm.sysfortheque.common.model.pojo.author;

import java.util.Date;

public class Author {
	
	private Integer id;
	private String pseudo;
	private String surname;
	private String firstName;
	private Date birthDate;
	private Date deathDate;
	
	private Nationality nationality;
	
	
	public Author() {}
	
	
	/**
	 * Used when a new Author need to be added to the database
	 * 
	 * @param pseudo
	 * @param surname
	 * @param firstName
	 * @param birthDate
	 * @param deathDate
	 * @param nationality
	 */
	public Author(String pseudo, String surname, String firstName, Date birthDate, Date deathDate, Nationality nationality) {
		this.pseudo = pseudo;
		this.surname = surname;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.nationality = nationality;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	
	/**
	 * @param id
	 *           the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}
	
	
	/**
	 * @param pseudo
	 *           the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	
	/**
	 * @param surname
	 *           the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	
	/**
	 * @param firstName
	 *           the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	
	
	/**
	 * @param birthDate
	 *           the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	/**
	 * @return the deathDate
	 */
	public Date getDeathDate() {
		return deathDate;
	}
	
	
	/**
	 * @param deathDate
	 *           the deathDate to set
	 */
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}
	
	
	/**
	 * @return the nationality
	 */
	public Nationality getNationality() {
		return nationality;
	}
	
	
	/**
	 * @param nationality
	 *           the nationality to set
	 */
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	
}

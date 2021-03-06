package fr.silvharm.sysfortheque.common.model.pojo.author;

import java.util.Date;

public class Author {
	
	protected Integer id;
	protected String pseudo;
	protected String surname;
	protected String firstName;
	protected Date birthDate;
	protected Date deathDate;
	
	
	public Author() {}
	
	
	/**
	 * @param pseudo
	 * @param surname
	 * @param firstName
	 * @param birthDate
	 * @param deathDate
	 */
	public Author(String pseudo, String surname, String firstName, Date birthDate, Date deathDate) {
		this.pseudo = pseudo;
		this.surname = surname;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
	}
	
	
	/**
	 * @param id
	 * @param pseudo
	 * @param surname
	 * @param firstName
	 * @param birthDate
	 * @param deathDate
	 */
	public Author(Integer id, String pseudo, String surname, String firstName, Date birthDate, Date deathDate) {
		this.id = id;
		this.pseudo = pseudo;
		this.surname = surname;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
	}
	
	
	/********************************
	 * Methods
	 *******************************/
	
	/**
	 * Copy the attributes from the Author (author) into the one calling the method
	 * 
	 * @param author
	 *           the Author whom we want to copy the attributes
	 */
	public void copyFromAuthor(Author author) {
		this.id = author.getId();
		this.pseudo = author.getPseudo();
		this.surname = author.getSurname();
		this.firstName = author.getFirstName();
		this.birthDate = author.getBirthDate();
		this.deathDate = author.getDeathDate();
	}
	
	
	/**
	 * Copy the attributes from the Author (author) into a new one
	 * 
	 * @param author
	 *           the Author whom we want to copy the attributes
	 * @return a new Author with the attributes of (author)
	 */
	public static Author copyIntoAuthor(Author author) {
		Author toReturn = new Author();
		toReturn.copyFromAuthor(author);
		return toReturn;
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
	
}

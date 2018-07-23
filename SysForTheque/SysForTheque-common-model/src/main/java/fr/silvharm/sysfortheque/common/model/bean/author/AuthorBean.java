package fr.silvharm.sysfortheque.common.model.bean.author;

import java.util.Date;
import java.util.List;

import fr.silvharm.sysfortheque.common.model.pojo.author.Author;
import fr.silvharm.sysfortheque.common.model.pojo.author.Nationality;

public class AuthorBean extends Author {
	
	protected List<Nationality> nationalities;
	
	
	public AuthorBean() {
		super();
	}
	
	
	/**
	 * @param pseudo
	 * @param surname
	 * @param firstName
	 * @param birthDate
	 * @param deathDate
	 * @param nationalities
	 */
	public AuthorBean(String pseudo, String surname, String firstName, Date birthDate, Date deathDate,
			List<Nationality> nationalities) {
		super(pseudo, surname, firstName, birthDate, deathDate);
		this.nationalities = nationalities;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the nationalities
	 */
	public List<Nationality> getNationalities() {
		return nationalities;
	}
	
	
	/**
	 * @param nationalities
	 *           the nationalities to set
	 */
	public void setNationalities(List<Nationality> nationalities) {
		this.nationalities = nationalities;
	}
	
}

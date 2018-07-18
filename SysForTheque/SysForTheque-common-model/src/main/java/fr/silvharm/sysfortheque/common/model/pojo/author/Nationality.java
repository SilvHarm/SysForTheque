package fr.silvharm.sysfortheque.common.model.pojo.author;

public class Nationality {
	
	private Integer id;
	private String nationality;
	private String country;
	private String isoCode;
	
	
	public Nationality() {}
	
	
	/**
	 * Used when a new Nationality need to be added to the database
	 * 
	 * @param nationality
	 * @param country
	 * @param isoCode
	 */
	public Nationality(String nationality, String country, String isoCode) {
		this.nationality = nationality;
		this.country = country;
		this.isoCode = isoCode;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	
	/**
	 * @param country
	 *           the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	/**
	 * @return the isoCode
	 */
	public String getIsoCode() {
		return isoCode;
	}
	
	
	/**
	 * @param isoCode
	 *           the isoCode to set
	 */
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	
	
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	
	
	/**
	 * @param nationality
	 *           the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}

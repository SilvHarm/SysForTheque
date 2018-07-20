package fr.silvharm.sysfortheque.common.model.pojo.library;


public class Language {
	
	protected Integer id;
	protected String language;
	protected String code;
	
	
	public Language() {}
	
	
	/**
	 * Used when a new Language need to be added to the database
	 * 
	 * @param language
	 * @param code
	 */
	public Language(String language, String code) {
		this.language = language;
		this.code = code;
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	
	
	/**
	 * @param language
	 *           the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	
	/**
	 * @param code
	 *           the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
}

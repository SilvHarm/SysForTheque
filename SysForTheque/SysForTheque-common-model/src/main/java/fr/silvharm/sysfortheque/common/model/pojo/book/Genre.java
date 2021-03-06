package fr.silvharm.sysfortheque.common.model.pojo.book;


public class Genre {
	
	protected Integer id;
	protected String genre;
	
	
	public Genre() {}
	
	
	/**
	 * @param genre
	 */
	public Genre(String genre) {
		this.genre = genre;
	}
	
	
	/**
	 * @param id
	 * @param genre
	 */
	public Genre(Integer id, String genre) {
		this.id = id;
		this.genre = genre;
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
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	
	
	/**
	 * @param genre
	 *           the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}

package fr.silvharm.sysfortheque.common.model.pojo.library;


public class LibraryBook {
	
	private Integer id;
	private String reference;
	private int bookId;
	private int languageId;
	
	
	public LibraryBook() {}
	
	
	/**
	 * Used when a new LibraryBook need to be added to the database
	 * 
	 * @param reference
	 * @param bookId
	 * @param languageId
	 */
	public LibraryBook(String reference, int bookId, int languageId) {
		this.reference = reference;
		this.bookId = bookId;
		this.languageId = languageId;
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
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	
	
	/**
	 * @param reference
	 *           the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	
	
	/**
	 * @param bookId
	 *           the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	/**
	 * @return the languageId
	 */
	public int getLanguageId() {
		return languageId;
	}
	
	
	/**
	 * @param languageId
	 *           the languageId to set
	 */
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	
}

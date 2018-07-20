package fr.silvharm.sysfortheque.common.model.pojo.book;


public class BookType {
	
	protected Integer id;
	protected String bookType;
	
	
	public BookType() {}
	
	
	/**
	 * Used when a new BookType need to be added to the database
	 * 
	 * @param bookType
	 */
	public BookType(String bookType) {
		this.bookType = bookType;
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
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}
	
	
	/**
	 * @param bookType
	 *           the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}

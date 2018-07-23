package fr.silvharm.sysfortheque.common.model.pojo.library;


public class LibraryBook {
	
	protected Integer id;
	protected String reference;
	protected int bookId;
	protected int languageId;
	
	
	public LibraryBook() {}
	
	
	/**
	 * @param reference
	 * @param bookId
	 * @param languageId
	 */
	public LibraryBook(String reference, int bookId, int languageId) {
		this.reference = reference;
		this.bookId = bookId;
		this.languageId = languageId;
	}
	
	
	/**
	 * @param id
	 * @param reference
	 * @param bookId
	 * @param languageId
	 */
	public LibraryBook(Integer id, String reference, int bookId, int languageId) {
		this.id = id;
		this.reference = reference;
		this.bookId = bookId;
		this.languageId = languageId;
	}
	
	
	/********************************
	 * Methods
	 *******************************/
	
	/**
	 * Copy the attributes from the LibraryBook (libraryBook) into the one calling the method
	 * 
	 * @param libraryBook
	 *           the LibraryBook whom we want to copy the attributes
	 */
	public void copyFromLibraryBook(LibraryBook libraryBook) {
		this.id = libraryBook.getId();
		this.reference = libraryBook.getReference();
		this.bookId = libraryBook.getBookId();
		this.languageId = libraryBook.getLanguageId();
	}
	
	
	/**
	 * Copy the attributes from the LibraryBook (libraryBook) into a new one
	 * 
	 * @param libraryBook
	 *           the LibraryBook whom we want to copy the attributes
	 * @return a new LibraryBook with the attributes of (libraryBook)
	 */
	public static LibraryBook copyIntoLibraryBook(LibraryBook libraryBook) {
		LibraryBook toReturn = new LibraryBook();
		toReturn.copyFromLibraryBook(libraryBook);
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

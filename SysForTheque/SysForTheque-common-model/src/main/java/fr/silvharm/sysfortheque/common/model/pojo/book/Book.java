package fr.silvharm.sysfortheque.common.model.pojo.book;

import java.util.Date;

public class Book {
	
	private Integer id;
	private String title;
	private Integer editorId;
	private Integer collectionId;
	private Integer serieId;
	private Integer serieNumber;
	private Date releaseDate;
	private Integer formatTypeId;
	private Integer pageCount;
	private Integer bookTypeId;
	private String isbn;
	private String description;
	private String covertFileName;
	
	
	public Book() {}
	
	
	/**
	 * Used when a new Book need to be added to the database
	 * 
	 * @param title
	 * @param editorId
	 * @param collectionId
	 * @param serieId
	 * @param serieNumber
	 * @param releaseDate
	 * @param formatTypeId
	 * @param pageCount
	 * @param bookTypeId
	 * @param isbn
	 * @param description
	 * @param covertFileName
	 */
	public Book(String title, Integer editorId, Integer collectionId, Integer serieId, Integer serieNumber,
			Date releaseDate, Integer formatTypeId, Integer pageCount, Integer bookTypeId, String isbn, String description,
			String covertFileName) {
		this.title = title;
		this.editorId = editorId;
		this.collectionId = collectionId;
		this.serieId = serieId;
		this.serieNumber = serieNumber;
		this.releaseDate = releaseDate;
		this.formatTypeId = formatTypeId;
		this.pageCount = pageCount;
		this.bookTypeId = bookTypeId;
		this.isbn = isbn;
		this.description = description;
		this.covertFileName = covertFileName;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	
	/**
	 * @param title
	 *           the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/**
	 * @return the editorId
	 */
	public Integer getEditorId() {
		return editorId;
	}
	
	
	/**
	 * @param editorId
	 *           the editorId to set
	 */
	public void setEditorId(Integer editorId) {
		this.editorId = editorId;
	}
	
	
	/**
	 * @return the collectionId
	 */
	public Integer getCollectionId() {
		return collectionId;
	}
	
	
	/**
	 * @param collectionId
	 *           the collectionId to set
	 */
	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}
	
	
	/**
	 * @return the serieId
	 */
	public Integer getSerieId() {
		return serieId;
	}
	
	
	/**
	 * @param serieId
	 *           the serieId to set
	 */
	public void setSerieId(Integer serieId) {
		this.serieId = serieId;
	}
	
	
	/**
	 * @return the serieNumber
	 */
	public Integer getSerieNumber() {
		return serieNumber;
	}
	
	
	/**
	 * @param serieNumber
	 *           the serieNumber to set
	 */
	public void setSerieNumber(Integer serieNumber) {
		this.serieNumber = serieNumber;
	}
	
	
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	
	/**
	 * @param releaseDate
	 *           the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	/**
	 * @return the formatTypeId
	 */
	public Integer getFormatTypeId() {
		return formatTypeId;
	}
	
	
	/**
	 * @param formatTypeId
	 *           the formatTypeId to set
	 */
	public void setFormatTypeId(Integer formatTypeId) {
		this.formatTypeId = formatTypeId;
	}
	
	
	/**
	 * @return the pageCount
	 */
	public Integer getPageCount() {
		return pageCount;
	}
	
	
	/**
	 * @param pageCount
	 *           the pageCount to set
	 */
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	
	
	/**
	 * @return the bookTypeId
	 */
	public Integer getBookTypeId() {
		return bookTypeId;
	}
	
	
	/**
	 * @param bookTypeId
	 *           the bookTypeId to set
	 */
	public void setBookTypeId(Integer bookTypeId) {
		this.bookTypeId = bookTypeId;
	}
	
	
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	
	
	/**
	 * @param isbn
	 *           the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	/**
	 * @param description
	 *           the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/**
	 * @return the covertFileName
	 */
	public String getCovertFileName() {
		return covertFileName;
	}
	
	
	/**
	 * @param covertFileName
	 *           the covertFileName to set
	 */
	public void setCovertFileName(String covertFileName) {
		this.covertFileName = covertFileName;
	}
	
}

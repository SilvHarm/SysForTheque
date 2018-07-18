package fr.silvharm.sysfortheque.common.model.bean.library;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.pojo.library.Language;

public class LibraryBookBean {
	
	private Integer id;
	private String reference;
	private BookBean book;
	private Language language;
	
	
	public LibraryBookBean() {}
	
	
	/**
	 * @param id
	 * @param reference
	 * @param book
	 * @param language
	 */
	public LibraryBookBean(Integer id, String reference, BookBean book, Language language) {
		this.id = id;
		this.reference = reference;
		this.book = book;
		this.language = language;
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
	 * @return the book
	 */
	public BookBean getBook() {
		return book;
	}
	
	
	/**
	 * @param book
	 *           the book to set
	 */
	public void setBook(BookBean book) {
		this.book = book;
	}
	
	
	/**
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}
	
	
	/**
	 * @param language
	 *           the language to set
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}
	
}

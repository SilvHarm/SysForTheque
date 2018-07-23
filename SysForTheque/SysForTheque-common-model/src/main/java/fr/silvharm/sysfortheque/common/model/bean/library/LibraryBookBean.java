package fr.silvharm.sysfortheque.common.model.bean.library;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.pojo.library.Language;
import fr.silvharm.sysfortheque.common.model.pojo.library.LibraryBook;

public class LibraryBookBean extends LibraryBook {
	
	protected BookBean bookBean;
	protected Language language;
	
	
	public LibraryBookBean() {
		super();
	}
	
	
	/**
	 * @param libraryBook
	 * @param bookBean
	 * @param language
	 */
	public LibraryBookBean(LibraryBook libraryBook, BookBean bookBean, Language language) {
		this.copyFromLibraryBook(libraryBook);
		this.bookBean = bookBean;
		this.language = language;
	}
	
	
	/**
	 * @param id
	 * @param reference
	 * @param bookId
	 * @param languageId
	 * @param bookBean
	 * @param language
	 */
	public LibraryBookBean(Integer id, String reference, int bookId, int languageId, BookBean bookBean,
			Language language) {
		super(id, reference, bookId, languageId);
		this.bookBean = bookBean;
		this.language = language;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the bookBean
	 */
	public BookBean getBook() {
		return bookBean;
	}
	
	
	/**
	 * @param bookBean
	 *           the bookBean to set
	 */
	public void setBookBean(BookBean bookBean) {
		this.bookBean = bookBean;
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

package fr.silvharm.sysfortheque.common.model.bean.library;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.pojo.library.LibraryBook;

public class LibraryBookBean extends LibraryBook {
	
	protected BookBean bookBean;
	
	
	public LibraryBookBean() {
		super();
	}
	
	
	/**
	 * @param libraryBook
	 * @param bookBean
	 */
	public LibraryBookBean(LibraryBook libraryBook, BookBean bookBean) {
		this.copyFromLibraryBook(libraryBook);
		this.bookBean = bookBean;
	}
	
	
	/**
	 * @param id
	 * @param reference
	 * @param bookId
	 * @param bookBean
	 */
	public LibraryBookBean(Integer id, String reference, int bookId, int languageId, BookBean bookBean) {
		super(id, reference, bookId);
		this.bookBean = bookBean;
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
	
}

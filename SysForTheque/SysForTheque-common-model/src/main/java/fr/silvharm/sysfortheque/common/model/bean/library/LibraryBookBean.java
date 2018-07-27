package fr.silvharm.sysfortheque.common.model.bean.library;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.pojo.library.LibraryBook;

public class LibraryBookBean extends LibraryBook {
	
	protected BookBean bookBean;
	protected int availableCount;
	
	
	public LibraryBookBean() {
		super();
	}
	
	
	/**
	 * @param libraryBook
	 * @param bookBean
	 * @param availableCount
	 */
	public LibraryBookBean(LibraryBook libraryBook, BookBean bookBean, int availableCount) {
		this.copyFromLibraryBook(libraryBook);
		this.bookBean = bookBean;
		this.availableCount = availableCount;
	}
	
	
	/**
	 * @param id
	 * @param reference
	 * @param bookId
	 * @param bookBean
	 * @param availableCount
	 */
	public LibraryBookBean(Integer id, String reference, int bookId, int languageId, BookBean bookBean,
			int availableCount) {
		super(id, reference, bookId);
		this.bookBean = bookBean;
		this.availableCount = availableCount;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the bookBean
	 */
	public BookBean getBookBean() {
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
	 * @return the availableCount
	 */
	public int getAvailableCount() {
		return availableCount;
	}
	
	
	/**
	 * @param availableCount
	 *           the availableCount to set
	 */
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	
}

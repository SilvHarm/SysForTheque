package fr.silvharm.sysfortheque.webservice.webservice.contract.Library;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.bean.library.LibraryBookBean;
import fr.silvharm.sysfortheque.common.model.pojo.book.Book;
import fr.silvharm.sysfortheque.common.model.pojo.book.Genre;

@WebService(serviceName = "LibraryBook")
public interface LibraryBookService {
	
	/**
	 * Get all the BookBean whom the id where contained in (bookIdList)
	 * 
	 * @param bookIdList
	 *           a List containing all the id of the BookBean requested
	 * @return a List containing all the BookBean requested or null
	 */
	@WebMethod
	List<BookBean> getBookBeanListByIdList(List<Integer> bookIdList);
	
	
	/**
	 * Get all the Book who possess all the Genre contained in (bookGenresList)
	 * 
	 * @param bookGenresList
	 *           a List containing all the Genre that the Book returned shall have
	 * @return a List containing all the Book that have all the Genre passed or null
	 */
	@WebMethod
	List<Book> getBookListByGenreList(List<Genre> bookGenresList);
	
	
	/**
	 * Get all the Book whom the title match (title)
	 * 
	 * @param title
	 *           a part of the title of the Book sought-after
	 * @return a List containing all the Book that match the title or null
	 */
	@WebMethod
	List<Book> getBookListByTitle(String title);
	
	
	/**
	 * Get all the LibraryBookBean whom the id where contained in (bookIdList)
	 * 
	 * @param bookIdList
	 *           a List containing all the id of the LibraryBookBean requested
	 * @return a List containing all the LibraryBookBean requested or null
	 */
	@WebMethod
	List<LibraryBookBean> getLibraryBookBeanListByIdList(List<Integer> bookIdList);
	
}

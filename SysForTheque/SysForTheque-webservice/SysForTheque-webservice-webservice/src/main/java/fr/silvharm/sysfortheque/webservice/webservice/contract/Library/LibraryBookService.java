package fr.silvharm.sysfortheque.webservice.webservice.contract.Library;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.pojo.book.Book;
import fr.silvharm.sysfortheque.common.model.pojo.book.Genre;

@WebService(serviceName = "LibraryBook")
public interface LibraryBookService {
	
	/**
	 * Obtain the id of all the Book available and how many of them are remaining
	 * 
	 * @return a Map of type <bookId, availableBookCount> or null
	 */
	@WebMethod
	Map<Integer, Integer> getAvailableBooksMap();
	
	
	/**
	 * Obtain all the BookBean whom the id where contained in the List passed in parameter
	 * 
	 * @param bookIdList
	 *           a List containing all the id of the BookBean requested
	 * @return a List containing all the BookBean requested or null
	 */
	@WebMethod
	List<BookBean> getBookBeanListByIdList(List<Integer> bookIdList);
	
	
	/**
	 * Obtain all the Book who possess all the Genre passed in parameter
	 * 
	 * @param bookGenresList
	 *           a List containing all the Genre that the Book returned shall have
	 * @return a List containing all the Book that have all the Genre passed or null
	 */
	@WebMethod
	List<Book> getBookListByGenreList(List<Genre> bookGenresList);
	
	
	/**
	 * Obtain all the Book whom the title match the one passed in parameter
	 * 
	 * @param title
	 *           a part of the title of the Book sought-after
	 * @return a List containing all the Book that match the title or null
	 */
	@WebMethod
	List<Book> getBookListByTitle(String title);
}

package fr.silvharm.sysfortheque.webservice.webservice.contract.Library;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.pojo.library.UserBorrowedBook;
import fr.silvharm.sysfortheque.common.model.technical.pojo.RequestResult;

@WebService(serviceName = "LibraryBookBorrowing")
public interface LibraryBookBorrowingService {
	
	
	/**
	 * Add that the User (userId) borrowed the LibraryBook (libraryBookId)<br>
	 * <br>
	 * Error codes:
	 * <ul>
	 * <li>1 : the User do not exist</li>
	 * <li>2 : the LibraryBook do not exist</li>
	 * <li>3 : the LibraryBook is already borrowed</li>
	 * <li>4 : the LibraryBook still was not returned</li>
	 * </ul>
	 * 
	 * @param libraryBookId
	 *           the id of the LibraryBook that is borrowed
	 * @param userId
	 *           the id of the User that borrow the LibraryBook
	 * @return a RequestResult
	 */
	@WebMethod
	RequestResult borrowLibraryBook(int libraryBookId, int userId);
	
	
	/**
	 * Add another borrowing period for the LibraryBook (libraryBookId)<br>
	 * <br>
	 * Error codes:
	 * <ul>
	 * <li>1 : the LibraryBook do not exist</li>
	 * <li>2 : the LibraryBook do not have an ongoing borrowing</li>
	 * <li>3 : the LibraryBook borrowing period was already extended</li>
	 * </ul>
	 * 
	 * @param libraryBookId
	 *           the id of the LibraryBook that is currently borrowed and need an extended period
	 * @return a RequestResult
	 */
	@WebMethod
	RequestResult extendLibraryBookBorrowingPeriod(int libraryBookId);
	
	
	/**
	 * Get all the ongoing UserBorrowedBook of the User (userId)
	 * 
	 * @param userId
	 *           the id of User whom we wish to know the ongoing borrowing
	 * @return a List containing all the ongoing UserBorrowedBook of the User or null
	 */
	@WebMethod
	List<UserBorrowedBook> getUserBorrowedBookListOfUser(int userId);
	
	
	/**
	 * Get all the UserBorrowedBook who are ongoing
	 * 
	 * @return a List containing all the ongoing UserBorrowedBook or null
	 */
	@WebMethod
	List<UserBorrowedBook> getCurrentlyBorrowedUserBorrowedBookList();
	
	
	/**
	 * Get all the UserBorrowedBook who were extended
	 * 
	 * @return a List containing all the extended UserBorrowedBook or null
	 */
	@WebMethod
	List<UserBorrowedBook> getExtendedUserBorrowedBookList();
	
	
	/**
	 * Get all the UserBorrowedBook who were not returned in time and so are still considered ongoing
	 * 
	 * @return a List containing all the not returned UserBorrowedBook or null
	 */
	@WebMethod
	List<UserBorrowedBook> getNotReturnedUserBorrowedBookList();
	
	
	/**
	 * Save that the LibraryBook (borrowedLibraryBookId) was returned<br>
	 * <br>
	 * Error codes:
	 * <ul>
	 * <li>1 : the LibraryBook do not exist</li>
	 * <li>2 : the LibraryBook do not have an ongoing borrowing</li>
	 * <li>3 : the LibraryBook was already returned</li>
	 * </ul>
	 * 
	 * @param borrowedLibraryBookId
	 *           the id of the LibraryBook that is returned
	 * @return a RequestResult
	 */
	@WebMethod
	RequestResult returnLibraryBook(int borrowedLibraryBookId);
	
	
	/**
	 * Set the borrowing period time to the the new (borrowingPeriod) provided<br>
	 * <br>
	 * No error codes defined at the moment
	 * 
	 * @param borrowingPeriod
	 *           the new time, in days, of a borrowing period
	 * @return a RequestResult
	 */
	@WebMethod
	RequestResult setBorrowingPeriod(int borrowingPeriod);
	
}

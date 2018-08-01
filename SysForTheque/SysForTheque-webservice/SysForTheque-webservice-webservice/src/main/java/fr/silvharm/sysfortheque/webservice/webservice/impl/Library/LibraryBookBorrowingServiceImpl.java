package fr.silvharm.sysfortheque.webservice.webservice.impl.Library;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.pojo.library.UserBorrowedBook;
import fr.silvharm.sysfortheque.common.model.technical.pojo.RequestResult;
import fr.silvharm.sysfortheque.webservice.webservice.contract.Library.LibraryBookBorrowingService;

@WebService(serviceName = "LibraryBookBorrowing")
public class LibraryBookBorrowingServiceImpl implements LibraryBookBorrowingService {
	
	@Override
	@WebMethod
	public RequestResult borrowLibraryBook(int libraryBookId, int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public RequestResult extendLibraryBookBorrowingPeriod(int libraryBookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<UserBorrowedBook> getUserBorrowedBookListOfUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<UserBorrowedBook> getCurrentlyBorrowedUserBorrowedBookList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<UserBorrowedBook> getExtendedUserBorrowedBookList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<UserBorrowedBook> getNotReturnedUserBorrowedBookList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public RequestResult returnLibraryBook(int borrowedLibraryBookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public RequestResult setBorrowingPeriod(int borrowingPeriod) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

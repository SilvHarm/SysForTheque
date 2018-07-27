package fr.silvharm.sysfortheque.webservice.webservice.impl.Library;

import java.util.List;

import fr.silvharm.sysfortheque.common.model.pojo.library.UserBorrowedBook;
import fr.silvharm.sysfortheque.common.model.technical.pojo.RequestResult;
import fr.silvharm.sysfortheque.webservice.webservice.contract.Library.LibraryBookBorrowingService;


public class LibraryBookBorrowingServiceImpl implements LibraryBookBorrowingService {

	@Override
	public RequestResult borrowLibraryBook(int libraryBookId, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestResult extendLibraryBookBorrowingPeriod(int libraryBookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBorrowedBook> getUserBorrowedBookListOfUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBorrowedBook> getCurrentlyBorrowedUserBorrowedBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBorrowedBook> getExtendedUserBorrowedBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBorrowedBook> getNotReturnedUserBorrowedBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestResult returnLibraryBook(int borrowedLibraryBookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestResult setBorrowingPeriod(int borrowingPeriod) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

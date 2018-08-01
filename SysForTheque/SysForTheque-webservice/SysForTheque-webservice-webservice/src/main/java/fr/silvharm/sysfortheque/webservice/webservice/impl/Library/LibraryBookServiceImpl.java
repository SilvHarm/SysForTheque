package fr.silvharm.sysfortheque.webservice.webservice.impl.Library;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.bean.library.LibraryBookBean;
import fr.silvharm.sysfortheque.common.model.pojo.book.Book;
import fr.silvharm.sysfortheque.common.model.pojo.book.Genre;
import fr.silvharm.sysfortheque.webservice.webservice.contract.Library.LibraryBookService;

@WebService(serviceName = "LibraryBook")
public class LibraryBookServiceImpl implements LibraryBookService {
	
	@Override
	@WebMethod
	public List<BookBean> getBookBeanListByIdList(List<Integer> bookIdList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<Book> getBookListByGenreList(List<Genre> bookGenresList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<Book> getBookListByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public List<LibraryBookBean> getLibraryBookBeanListByIdList(List<Integer> bookIdList) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

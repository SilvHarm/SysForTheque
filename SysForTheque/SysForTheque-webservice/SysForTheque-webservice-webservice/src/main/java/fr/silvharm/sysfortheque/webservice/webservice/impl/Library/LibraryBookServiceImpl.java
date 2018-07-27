package fr.silvharm.sysfortheque.webservice.webservice.impl.Library;

import java.util.List;

import fr.silvharm.sysfortheque.common.model.bean.book.BookBean;
import fr.silvharm.sysfortheque.common.model.bean.library.LibraryBookBean;
import fr.silvharm.sysfortheque.common.model.pojo.book.Book;
import fr.silvharm.sysfortheque.common.model.pojo.book.Genre;
import fr.silvharm.sysfortheque.webservice.webservice.contract.Library.LibraryBookService;


public class LibraryBookServiceImpl implements LibraryBookService {
	
	@Override
	public List<BookBean> getBookBeanListByIdList(List<Integer> bookIdList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<Book> getBookListByGenreList(List<Genre> bookGenresList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<Book> getBookListByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<LibraryBookBean> getLibraryBookBeanListByIdList(List<Integer> bookIdList) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

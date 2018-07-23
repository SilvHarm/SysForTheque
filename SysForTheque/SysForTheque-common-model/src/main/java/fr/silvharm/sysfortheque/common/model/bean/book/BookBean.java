package fr.silvharm.sysfortheque.common.model.bean.book;

import java.util.Date;
import java.util.List;

import fr.silvharm.sysfortheque.common.model.pojo.book.Book;
import fr.silvharm.sysfortheque.common.model.pojo.book.BookType;
import fr.silvharm.sysfortheque.common.model.pojo.book.FormatType;
import fr.silvharm.sysfortheque.common.model.pojo.book.Genre;
import fr.silvharm.sysfortheque.common.model.pojo.editor.Collection;
import fr.silvharm.sysfortheque.common.model.pojo.editor.Editor;
import fr.silvharm.sysfortheque.common.model.pojo.editor.Serie;

public class BookBean extends Book {
	
	protected Editor editor;
	protected Collection collection;
	protected Serie serie;
	protected FormatType formatType;
	protected BookType bookType;
	protected List<Genre> genreList;
	private List<AuthorRoleBean> authorRoleBeanList;
	
	
	public BookBean() {
		super();
	}
	
	
	/**
	 * @param book
	 * @param editor
	 * @param collection
	 * @param serie
	 * @param formatType
	 * @param bookType
	 * @param genreList
	 * @param authorRoleBeanList
	 */
	public BookBean(Book book, Editor editor, Collection collection, Serie serie, FormatType formatType,
			BookType bookType, List<Genre> genreList, List<AuthorRoleBean> authorRoleBeanList) {
		this.copyFromBook(book);
		this.editor = editor;
		this.collection = collection;
		this.serie = serie;
		this.formatType = formatType;
		this.bookType = bookType;
		this.genreList = genreList;
		this.authorRoleBeanList = authorRoleBeanList;
	}
	
	
	/**
	 * @param id
	 * @param title
	 * @param editorId
	 * @param collectionId
	 * @param serieId
	 * @param serieNumber
	 * @param releaseDate
	 * @param formatTypeId
	 * @param pageCount
	 * @param bookTypeId
	 * @param isbn
	 * @param description
	 * @param covertFileName
	 * @param editor
	 * @param collection
	 * @param serie
	 * @param formatType
	 * @param bookType
	 * @param genreList
	 * @param authorRoleBeanList
	 */
	public BookBean(Integer id, String title, Integer editorId, Integer collectionId, Integer serieId,
			Integer serieNumber, Date releaseDate, Integer formatTypeId, Integer pageCount, Integer bookTypeId,
			String isbn, String description, String covertFileName, Editor editor, Collection collection, Serie serie,
			FormatType formatType, BookType bookType, List<Genre> genreList, List<AuthorRoleBean> authorRoleBeanList) {
		super(id, title, editorId, collectionId, serieId, serieNumber, releaseDate, formatTypeId, pageCount, bookTypeId,
				isbn, description, covertFileName);
		this.editor = editor;
		this.collection = collection;
		this.serie = serie;
		this.formatType = formatType;
		this.bookType = bookType;
		this.genreList = genreList;
		this.authorRoleBeanList = authorRoleBeanList;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	
	/**
	 * @return the editor
	 */
	public Editor getEditor() {
		return editor;
	}
	
	
	/**
	 * @param editor
	 *           the editor to set
	 */
	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	
	/**
	 * @return the collection
	 */
	public Collection getCollection() {
		return collection;
	}
	
	
	/**
	 * @param collection
	 *           the collection to set
	 */
	public void setCollection(Collection collection) {
		this.collection = collection;
	}
	
	
	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}
	
	
	/**
	 * @param serie
	 *           the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	
	/**
	 * @return the formatType
	 */
	public FormatType getFormatType() {
		return formatType;
	}
	
	
	/**
	 * @param formatType
	 *           the formatType to set
	 */
	public void setFormatType(FormatType formatType) {
		this.formatType = formatType;
	}
	
	
	/**
	 * @return the bookType
	 */
	public BookType getBookType() {
		return bookType;
	}
	
	
	/**
	 * @param bookType
	 *           the bookType to set
	 */
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	
	
	/**
	 * @return the genreList
	 */
	public List<Genre> getGenreList() {
		return genreList;
	}
	
	
	/**
	 * @param genreList
	 *           the genreList to set
	 */
	public void setGenreList(List<Genre> genreList) {
		this.genreList = genreList;
	}
	
	
	/**
	 * @return the authorRoleBeanList
	 */
	public List<AuthorRoleBean> getAuthorRoleBeanList() {
		return authorRoleBeanList;
	}
	
	
	/**
	 * @param authorRoleBeanList
	 *           the authorRoleBeanList to set
	 */
	public void setAuthorRoleBeanList(List<AuthorRoleBean> authorRoleBeanList) {
		this.authorRoleBeanList = authorRoleBeanList;
	}
	
}

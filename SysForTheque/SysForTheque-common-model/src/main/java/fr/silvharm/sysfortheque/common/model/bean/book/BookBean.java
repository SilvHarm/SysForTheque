package fr.silvharm.sysfortheque.common.model.bean.book;

import java.util.Date;
import java.util.List;

import fr.silvharm.sysfortheque.common.model.bean.author.AuthorRoleBean;
import fr.silvharm.sysfortheque.common.model.pojo.book.BookType;
import fr.silvharm.sysfortheque.common.model.pojo.book.FormatType;
import fr.silvharm.sysfortheque.common.model.pojo.book.Genre;
import fr.silvharm.sysfortheque.common.model.pojo.editor.Collection;
import fr.silvharm.sysfortheque.common.model.pojo.editor.Editor;
import fr.silvharm.sysfortheque.common.model.pojo.editor.Serie;

public class BookBean {
	
	private Integer id;
	private String title;
	private Editor editor;
	private Collection collection;
	private Serie serie;
	private Integer serieNumber;
	private Date releaseDate;
	private FormatType formatType;
	private Integer pageCount;
	private BookType bookType;
	private String isbn;
	private String description;
	private String covertFileName;
	private List<Genre> genreList;
	private List<AuthorRoleBean> authorRoleList;
	
	
	public BookBean() {}
	
	
	/**
	 * @param id
	 * @param title
	 * @param editor
	 * @param collection
	 * @param serie
	 * @param serieNumber
	 * @param releaseDate
	 * @param formatType
	 * @param pageCount
	 * @param bookType
	 * @param isbn
	 * @param description
	 * @param covertFileName
	 * @param genreList
	 * @param authorRoleList
	 */
	public BookBean(Integer id, String title, Editor editor, Collection collection, Serie serie, Integer serieNumber,
			Date releaseDate, FormatType formatType, Integer pageCount, BookType bookType, String isbn, String description,
			String covertFileName, List<Genre> genreList, List<AuthorRoleBean> authorRoleList) {
		this.id = id;
		this.title = title;
		this.editor = editor;
		this.collection = collection;
		this.serie = serie;
		this.serieNumber = serieNumber;
		this.releaseDate = releaseDate;
		this.formatType = formatType;
		this.pageCount = pageCount;
		this.bookType = bookType;
		this.isbn = isbn;
		this.description = description;
		this.covertFileName = covertFileName;
		this.genreList = genreList;
		this.authorRoleList = authorRoleList;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	
	/**
	 * @param id
	 *           the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	
	/**
	 * @param title
	 *           the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
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
	 * @return the serieNumber
	 */
	public Integer getSerieNumber() {
		return serieNumber;
	}
	
	
	/**
	 * @param serieNumber
	 *           the serieNumber to set
	 */
	public void setSerieNumber(Integer serieNumber) {
		this.serieNumber = serieNumber;
	}
	
	
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	
	/**
	 * @param releaseDate
	 *           the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
	 * @return the pageCount
	 */
	public Integer getPageCount() {
		return pageCount;
	}
	
	
	/**
	 * @param pageCount
	 *           the pageCount to set
	 */
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
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
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	
	
	/**
	 * @param isbn
	 *           the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	/**
	 * @param description
	 *           the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/**
	 * @return the covertFileName
	 */
	public String getCovertFileName() {
		return covertFileName;
	}
	
	
	/**
	 * @param covertFileName
	 *           the covertFileName to set
	 */
	public void setCovertFileName(String covertFileName) {
		this.covertFileName = covertFileName;
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
	 * @return the authorRoleList
	 */
	public List<AuthorRoleBean> getAuthorRoleList() {
		return authorRoleList;
	}
	
	
	/**
	 * @param authorRoleList
	 *           the authorRoleList to set
	 */
	public void setAuthorRoleList(List<AuthorRoleBean> authorRoleList) {
		this.authorRoleList = authorRoleList;
	}
	
}

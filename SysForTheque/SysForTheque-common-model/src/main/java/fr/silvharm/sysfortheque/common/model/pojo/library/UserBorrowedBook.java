package fr.silvharm.sysfortheque.common.model.pojo.library;

import java.util.Date;

public class UserBorrowedBook {
	
	protected Integer id;
	protected int userId;
	protected int libraryBookId;
	protected Date beginningDate;
	protected Date endDate;
	protected boolean extended;
	protected boolean returned;
	protected Date returnedDate;
	
	
	public UserBorrowedBook() {}
	
	
	/**
	 * @param userId
	 * @param libraryBookId
	 * @param beginningDate
	 * @param endDate
	 * @param extended
	 * @param returned
	 * @param returnedDate
	 */
	public UserBorrowedBook(int userId, int libraryBookId, Date beginningDate, Date endDate, boolean extended,
			boolean returned, Date returnedDate) {
		this.userId = userId;
		this.libraryBookId = libraryBookId;
		this.beginningDate = beginningDate;
		this.endDate = endDate;
		this.extended = extended;
		this.returned = returned;
		this.returnedDate = returnedDate;
	}
	
	
	/**
	 * @param id
	 * @param userId
	 * @param libraryBookId
	 * @param beginningDate
	 * @param endDate
	 * @param extended
	 * @param returned
	 * @param returnedDate
	 */
	public UserBorrowedBook(Integer id, int userId, int libraryBookId, Date beginningDate, Date endDate,
			boolean extended, boolean returned, Date returnedDate) {
		this.id = id;
		this.userId = userId;
		this.libraryBookId = libraryBookId;
		this.beginningDate = beginningDate;
		this.endDate = endDate;
		this.extended = extended;
		this.returned = returned;
		this.returnedDate = returnedDate;
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
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	
	
	/**
	 * @param userId
	 *           the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	/**
	 * @return the libraryBookId
	 */
	public int getLibraryBookId() {
		return libraryBookId;
	}
	
	
	/**
	 * @param libraryBookId
	 *           the libraryBookId to set
	 */
	public void setLibraryBookId(int libraryBookId) {
		this.libraryBookId = libraryBookId;
	}
	
	
	/**
	 * @return the beginningDate
	 */
	public Date getBeginningDate() {
		return beginningDate;
	}
	
	
	/**
	 * @param beginningDate
	 *           the beginningDate to set
	 */
	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}
	
	
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	
	
	/**
	 * @param endDate
	 *           the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	/**
	 * @return the extended
	 */
	public boolean isExtended() {
		return extended;
	}
	
	
	/**
	 * @param extended
	 *           the extended to set
	 */
	public void setExtended(boolean extended) {
		this.extended = extended;
	}
	
	
	/**
	 * @return the returned
	 */
	public boolean isReturned() {
		return returned;
	}
	
	
	/**
	 * @param returned
	 *           the returned to set
	 */
	public void setReturned(boolean returned) {
		this.returned = returned;
	}
	
	
	/**
	 * @return the returnedDate
	 */
	public Date getReturnedDate() {
		return returnedDate;
	}
	
	
	/**
	 * @param returnedDate
	 *           the returnedDate to set
	 */
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
	
}

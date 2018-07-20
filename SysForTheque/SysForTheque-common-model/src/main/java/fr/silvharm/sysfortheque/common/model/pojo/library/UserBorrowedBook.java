package fr.silvharm.sysfortheque.common.model.pojo.library;

import java.util.Date;

public class UserBorrowedBook {
	
	protected Integer id;
	protected int userId;
	protected int libraryBookId;
	protected Date beginning;
	protected Date end;
	protected boolean extended;
	protected boolean returned;
	protected Date dateReturned;
	
	
	public UserBorrowedBook() {}
	
	
	/**
	 * Used when a new UserBorrowedBook need to be added to the database
	 * 
	 * @param userId
	 * @param libraryBookId
	 * @param beginning
	 * @param end
	 * @param extended
	 * @param returned
	 * @param dateReturned
	 */
	public UserBorrowedBook(int userId, int libraryBookId, Date beginning, Date end, boolean extended, boolean returned,
			Date dateReturned) {
		this.userId = userId;
		this.libraryBookId = libraryBookId;
		this.beginning = beginning;
		this.end = end;
		this.extended = extended;
		this.returned = returned;
		this.dateReturned = dateReturned;
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
	 * @return the beginning
	 */
	public Date getBeginning() {
		return beginning;
	}
	
	
	/**
	 * @param beginning
	 *           the beginning to set
	 */
	public void setBeginning(Date beginning) {
		this.beginning = beginning;
	}
	
	
	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}
	
	
	/**
	 * @param end
	 *           the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
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
	 * @return the dateReturned
	 */
	public Date getDateReturned() {
		return dateReturned;
	}
	
	
	/**
	 * @param dateReturned
	 *           the dateReturned to set
	 */
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	
}

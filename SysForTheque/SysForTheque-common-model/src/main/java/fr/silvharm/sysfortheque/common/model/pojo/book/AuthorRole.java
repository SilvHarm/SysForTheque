package fr.silvharm.sysfortheque.common.model.pojo.book;

public class AuthorRole {
	
	protected Integer bookId;
	protected Integer authorId;
	protected Integer roleId;
	
	
	public AuthorRole() {}
	
	
	/**
	 * @param bookId
	 * @param authorId
	 * @param roleId
	 */
	public AuthorRole(Integer bookId, Integer authorId, Integer roleId) {
		this.bookId = bookId;
		this.authorId = authorId;
		this.roleId = roleId;
	}
	
	
	/********************************
	 * Methods
	 *******************************/
	
	/**
	 * Copy the attributes from the AuthorRole (authorRole) into the one calling the method
	 * 
	 * @param authorRole
	 *           the AuthorRole whom we want to copy the attributes
	 */
	public void copyFromAuthorRole(AuthorRole authorRole) {
		this.bookId = authorRole.getBookId();
		this.authorId = authorRole.getAuthorId();
		this.roleId = authorRole.getRoleId();
	}
	
	
	/**
	 * Copy the attributes from the AuthorRole (authorRole) into a new one
	 * 
	 * @param authorRole
	 *           the AuthorRole whom we want to copy the attributes
	 * @return a new AuthorRole with the attributes of (authorRole)
	 */
	public static AuthorRole copyIntoAuthorRole(AuthorRole authorRole) {
		AuthorRole toReturn = new AuthorRole();
		toReturn.copyFromAuthorRole(authorRole);
		return toReturn;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}
	
	
	/**
	 * @param bookId
	 *           the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	
	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}
	
	
	/**
	 * @param authorId
	 *           the authorId to set
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	
	
	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}
	
	
	/**
	 * @param roleId
	 *           the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
}

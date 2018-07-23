package fr.silvharm.sysfortheque.common.model.bean.book;

import fr.silvharm.sysfortheque.common.model.pojo.author.Author;
import fr.silvharm.sysfortheque.common.model.pojo.author.Role;
import fr.silvharm.sysfortheque.common.model.pojo.book.AuthorRole;

public class AuthorRoleBean extends AuthorRole {
	
	protected Author author;
	protected Role role;
	
	
	public AuthorRoleBean() {
		super();
	}
	
	
	/**
	 * @param authorRole
	 * @param author
	 * @param role
	 */
	public AuthorRoleBean(AuthorRole authorRole, Author author, Role role) {
		this.copyFromAuthorRole(authorRole);
		this.author = author;
		this.role = role;
	}
	
	
	/**
	 * @param bookId
	 * @param authorId
	 * @param roleId
	 * @param author
	 * @param role
	 */
	public AuthorRoleBean(Integer bookId, Integer authorId, Integer roleId, Author author, Role role) {
		super(bookId, authorId, roleId);
		this.author = author;
		this.role = role;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}
	
	
	/**
	 * @param author
	 *           the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	
	
	/**
	 * @param role
	 *           the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	
}

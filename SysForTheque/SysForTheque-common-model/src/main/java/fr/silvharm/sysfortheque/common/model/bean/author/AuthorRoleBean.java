package fr.silvharm.sysfortheque.common.model.bean.author;

import fr.silvharm.sysfortheque.common.model.pojo.author.Author;
import fr.silvharm.sysfortheque.common.model.pojo.author.Role;

public class AuthorRoleBean {
	
	private Author author;
	private Role role;
	
	
	/**
	 * @param author
	 * @param role
	 */
	public AuthorRoleBean(Author author, Role role) {
		super();
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

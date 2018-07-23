package fr.silvharm.sysfortheque.common.model.pojo.author;


public class Role {
	
	protected Integer id;
	protected String role;
	
	
	public Role() {}
	
	
	/**
	 * @param role
	 */
	public Role(String role) {
		this.role = role;
	}
	
	
	/**
	 * @param id
	 * @param role
	 */
	public Role(Integer id, String role) {
		this.id = id;
		this.role = role;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	
	
	/**
	 * @param role
	 *           the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
}

package fr.silvharm.sysfortheque.common.model.pojo.author;


public class Role {
	
	private Integer id;
	private String role;
	
	
	public Role() {}
	
	
	/**
	 * Used when a new Role need to be added to the database
	 * 
	 * @param role
	 */
	public Role(String role) {
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

package fr.silvharm.sysfortheque.common.model.pojo.editor;


public class Editor {
	
	private Integer id;
	private String name;
	
	
	public Editor() {}
	
	
	/**
	 * Used when a new Editor need to be added to the database
	 * 
	 * @param name
	 */
	public Editor(String name) {
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @param name
	 *           the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}

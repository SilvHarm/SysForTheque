package fr.silvharm.sysfortheque.common.model.pojo.editor;


public class Collection {
	
	private Integer id;
	private String name;
	private int editorId;
	
	
	public Collection() {}
	
	
	/**
	 * Used when a new Collection need to be added to the database
	 * 
	 * @param name
	 * @param editorId
	 */
	public Collection(String name, int editorId) {
		this.name = name;
		this.editorId = editorId;
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
	
	
	/**
	 * @return the editorId
	 */
	public int getEditorId() {
		return editorId;
	}
	
	
	/**
	 * @param editorId
	 *           the editorId to set
	 */
	public void setEditorId(int editorId) {
		this.editorId = editorId;
	}
	
}

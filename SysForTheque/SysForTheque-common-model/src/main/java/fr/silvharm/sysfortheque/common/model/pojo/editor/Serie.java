package fr.silvharm.sysfortheque.common.model.pojo.editor;


public class Serie {
	
	protected Integer id;
	protected String name;
	protected int editorId;
	
	
	public Serie() {}
	
	
	/**
	 * @param name
	 * @param editorId
	 */
	public Serie(String name, int editorId) {
		this.name = name;
		this.editorId = editorId;
	}
	
	
	/**
	 * @param id
	 * @param name
	 * @param editorId
	 */
	public Serie(Integer id, String name, int editorId) {
		this.id = id;
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

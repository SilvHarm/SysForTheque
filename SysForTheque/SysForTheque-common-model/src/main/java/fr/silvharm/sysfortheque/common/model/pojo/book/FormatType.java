package fr.silvharm.sysfortheque.common.model.pojo.book;


public class FormatType {
	
	protected Integer id;
	protected String format;
	
	
	public FormatType() {}
	
	
	/**
	 * @param format
	 */
	public FormatType(String format) {
		this.format = format;
	}
	
	
	/**
	 * @param id
	 * @param format
	 */
	public FormatType(Integer id, String format) {
		this.id = id;
		this.format = format;
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
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	
	
	/**
	 * @param format
	 *           the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	
}

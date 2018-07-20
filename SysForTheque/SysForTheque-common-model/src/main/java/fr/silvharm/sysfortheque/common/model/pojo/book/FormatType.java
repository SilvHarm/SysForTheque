package fr.silvharm.sysfortheque.common.model.pojo.book;


public class FormatType {
	
	protected Integer id;
	protected String format;
	
	
	public FormatType() {}
	
	
	/**
	 * Used when a new FormatType need to be added to the database
	 * 
	 * @param format
	 */
	public FormatType(String format) {
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

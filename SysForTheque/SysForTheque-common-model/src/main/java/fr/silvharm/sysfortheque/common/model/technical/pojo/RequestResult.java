package fr.silvharm.sysfortheque.common.model.technical.pojo;

/**
 * POJO used to indicate the result of a request and, in the case it did not go well, an error code and a message to
 * provide clearer information
 */
public class RequestResult {
	
	/**
	 * boolean indicating if the request ended successfully or not.<br>
	 * true is successful and false is not
	 */
	private boolean result;
	/**
	 * A code indicating what type of error was encountered
	 */
	private Integer errorCode;
	/**
	 * A message providing clearer informations about the error
	 */
	private String errorMessage;
	
	
	public RequestResult() {}
	
	
	/**
	 * @param result
	 *           {@link #result}
	 */
	public RequestResult(boolean result) {
		this.result = result;
	}
	
	
	/**
	 * @param result
	 *           {@link #result}
	 * @param errorCode
	 *           {@link #errorCode}
	 */
	public RequestResult(boolean result, int errorCode) {
		this.result = result;
		this.errorCode = errorCode;
	}
	
	
	/**
	 * 
	 * @param result
	 *           {@link #result}
	 * @param errorCode
	 *           {@link #errorCode}
	 * @param errorMessage
	 *           {@link #errorMessage}
	 */
	public RequestResult(boolean result, int errorCode, String errorMessage) {
		this.result = result;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	
	/********************************
	 * Methods
	 *******************************/
	
	@Override
	public String toString() {
		String toReturn = "";
		
		if (isResult()) {
			toReturn += "Successful !";
		}
		else {
			toReturn += "Failed !";
			
			if (errorCode != null) {
				toReturn += "\ncode: " + errorCode;
			}
			
			if (errorMessage != null && !errorMessage.isEmpty()) {
				toReturn += "\nmessage: " + errorMessage;
			}
		}
		
		return toReturn;
	}
	
	
	/********************************
	 * Getters & Setters
	 *******************************/
	
	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}
	
	
	/**
	 * @param result
	 *           the result to set
	 */
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	/**
	 * @return the errorCode
	 */
	public Integer getErrorCode() {
		return errorCode;
	}
	
	
	/**
	 * @param errorCode
	 *           the errorCode to set
	 */
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	
	
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	/**
	 * @param errorMessage
	 *           the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	};
	
}

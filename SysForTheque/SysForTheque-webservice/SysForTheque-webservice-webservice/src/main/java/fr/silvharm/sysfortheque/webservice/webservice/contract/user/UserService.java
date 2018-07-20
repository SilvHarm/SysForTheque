package fr.silvharm.sysfortheque.webservice.webservice.contract.user;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.technical.pojo.RequestResult;

@WebService(serviceName = "User")
public interface UserService {
	
	/**
	 * Obtain the email-address of all the User whom the id where in the List passed in parameter
	 * 
	 * @param userIdList
	 *           a List containing the id of all the User whom the email-address is requested
	 * @return a List containing all the email-address requested or null
	 */
	@WebMethod
	List<String> getUserEmailListById(List<Integer> userIdList);
	
	
	/**
	 * Verify if the User is valid<br>
	 * <br>
	 * Error codes:
	 * <ul>
	 * <li>1 : there is no couple username/password corresponding in the database</li>
	 * </ul>
	 * 
	 * @param username
	 *           the username of the User to verify
	 * @param password
	 *           the password of the User to verify
	 * @return a RequestResult
	 */
	@WebMethod
	RequestResult verifyUser(String username, String password);
	
}

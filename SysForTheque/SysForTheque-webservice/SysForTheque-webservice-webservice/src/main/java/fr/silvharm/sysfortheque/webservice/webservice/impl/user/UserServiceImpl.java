package fr.silvharm.sysfortheque.webservice.webservice.impl.user;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fr.silvharm.sysfortheque.common.model.technical.pojo.RequestResult;
import fr.silvharm.sysfortheque.webservice.webservice.contract.user.UserService;

@WebService(serviceName = "User")
public class UserServiceImpl implements UserService {
	
	@Override
	@WebMethod
	public List<String> getUserEmailListById(List<Integer> userIdList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	@WebMethod
	public RequestResult verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

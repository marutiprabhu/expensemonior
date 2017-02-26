/**
 * 
 */
package expensemonitor_service.expensemonitor_service.service.impl;

import org.springframework.stereotype.Component;

import expensemonitor_service.exception.ExpenseMonitorException;
import expensemonitor_service.expensemonitor_service.model.RestOutputVo;
import expensemonitor_service.expensemonitor_service.service.LoginService;

/**
 * @author PC
 *
 */
@Component
public class LoginSeviceImpl implements LoginService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see expensemonitor_service.expensemonitor_service.service.LoginService#
	 * validateUserLogin(java.lang.String, char[])
	 */
	@Override
	public RestOutputVo validateUserLogin(String userName, char[] password) throws ExpenseMonitorException {
		RestOutputVo vo = new RestOutputVo();
		if (userName != null && userName.equals("marutiprabhu") && password != null
				&& (new String(password)).equalsIgnoreCase("password")) {
			vo.setStatus("SUCCESS");
			vo.setJsonObject(null);
			vo.setJsonArray(null);
		} else {
			vo.setStatus("FAILED");
			vo.setJsonObject(null);
			vo.setJsonArray(null);
		}
		vo.setValidResult(true);
		return vo;
	}

}

/**
 * 
 */
package expensemonitor_service.expensemonitor_service.service;

import expensemonitor_service.exception.ExpenseMonitorException;
import expensemonitor_service.expensemonitor_service.model.RestOutputVo;

/**
 * @author PC
 *
 */
public interface LoginService {
	/**
	 * Method to validate user login based on username and password
	 * 
	 * @param userName
	 * @param password
	 * @return
	 * @throws ExpenseMonitorException
	 */
	public RestOutputVo validateUserLogin(String userName, char[] password) throws ExpenseMonitorException;
}

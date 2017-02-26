package expensemonitor_service.expensemonitor_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import expensemonitor_service.exception.ExpenseMonitorException;
import expensemonitor_service.expensemonitor_service.model.RestOutputVo;
import expensemonitor_service.expensemonitor_service.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/login")
	public RestOutputVo login(@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "password", required = true) char[] password) {
		RestOutputVo vo = null;
		try {
			vo = loginService.validateUserLogin(userName, password);
		} catch (ExpenseMonitorException e) {
			// TODO
		}
		return vo;
	}
}

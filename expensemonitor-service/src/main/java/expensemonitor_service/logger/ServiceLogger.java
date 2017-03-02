package expensemonitor_service.logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Maruti Prabhu
 */
@Aspect
@Component
public class ServiceLogger {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceLogger.class);

	@Before("execution(* expensemonitor_service.expensemonitor_service.service.impl.LoginSeviceImpl.*(..)) && args(userName, password)")
	public void beforeLogin(String userName, String password) {
		LOGGER.info("Login Attempted: " + userName);
	}
}
package expensemonitor_service.expensemonitor_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExpenseMonitor extends SpringBootServletInitializer 
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExpenseMonitor.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ExpenseMonitor.class, args);
	}
}

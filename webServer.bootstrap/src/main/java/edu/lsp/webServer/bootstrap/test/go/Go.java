package edu.lsp.webServer.bootstrap.test.go;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.lsp.webServer.bootstrap.test.bean.User;
import edu.lsp.webServer.bootstrap.test.serviceImpl.UserServiceImpl;

public class Go {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("app.xml");
		UserServiceImpl bean = classPathXmlApplicationContext.getBean("userService", UserServiceImpl.class);
		
			User user = new User(1,2);
			bean.insertUser(user);
		classPathXmlApplicationContext.close();

	}

}

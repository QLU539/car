package edu.lsp.webServer.bootstrap.test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.lsp.webServer.bootstrap.test.bean.User;
import edu.lsp.webServer.bootstrap.test.dao.UserDao;
import edu.lsp.webServer.bootstrap.test.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Service("userService") 
@Slf4j
public class UserServiceImpl implements UserService {
	@Autowired 
	private UserDao userDao;

	public Long insertUser(User user) {
		User savedUser = userDao.save(user);
		log.info(savedUser.toString());
		return null;
	}

	public User ReadUser(Long id) {
		User user = userDao.findOne(id);
		return user;
	}

	

	public void DeleteUser(User user) {
		userDao.delete(user);
	}
	

}
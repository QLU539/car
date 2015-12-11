package edu.lsp.webServer.bootstrap.test.service;

import edu.lsp.webServer.bootstrap.test.bean.User;

public interface UserService {
	
	public Long insertUser(User user);
	public User ReadUser(Long id);
	public void DeleteUser(User user);
	
	
	
}
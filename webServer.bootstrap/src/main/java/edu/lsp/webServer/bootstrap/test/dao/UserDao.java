package edu.lsp.webServer.bootstrap.test.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.lsp.webServer.bootstrap.test.bean.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	
}
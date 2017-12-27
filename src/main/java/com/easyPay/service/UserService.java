package com.easyPay.service;

import com.easyPay.Bean.User;
import com.easyPay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	private SessionRegistry sessionRegistry;

	@Autowired
	private UserDao userDao;

	public User getById(Integer id) {
		User user = userDao.getById(id);
		return user;
	}


}

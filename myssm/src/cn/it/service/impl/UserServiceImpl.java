package cn.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.it.dao.UserDao;
import cn.it.model.User;
import cn.it.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * Spring 2.5 引入了 @Autowired 注释，它可以对类成员变量、
	 *方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使
	 *用来消除 set ，get方法
	 */
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findlogin(User u){
		User user = userDao.findByUsernameAndPassWord(u);
		return user;
	}
}

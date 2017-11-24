package cn.it.dao;

import cn.it.model.User;

public interface UserDao {
	public void UserAdd(User u);

	public User findByUsernameAndPassWord(User u);

}

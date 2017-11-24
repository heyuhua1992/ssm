package cn.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.it.dao.UserDao;
import cn.it.model.User;
import cn.it.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * Spring 2.5 ������ @Autowired ע�ͣ������Զ����Ա������
	 *���������캯�����б�ע������Զ�װ��Ĺ����� ͨ�� @Autowired��ʹ
	 *�������� set ��get����
	 */
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findlogin(User u){
		User user = userDao.findByUsernameAndPassWord(u);
		return user;
	}
}

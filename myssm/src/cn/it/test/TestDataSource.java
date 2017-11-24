package cn.it.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.it.dao.UserDao;
import cn.it.model.User;
import cn.it.service.UserService;

public class TestDataSource {
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	
	@Test
	public void Test1(){
		DataSource dataSource = (DataSource) ac.getBean("dataSource");
		System.out.println(dataSource.toString());
	}
	
	@Test
	public void Test2(){
		System.out.println(ac.getBean("sqlSessionFactory"));
		
	}
	
	@Test
	public void Test3(){
		UserDao userDao=  (UserDao) ac.getBean("userDao");
		System.out.println(userDao.toString());
	}
	@Test
	public void Test4(){
		UserDao userDao=  (UserDao) ac.getBean("userDao");
		User user = new User();
		user.setPassword("123");
		user.setUsername("heyuhua");
		userDao.UserAdd(user);
	}
	@Test
	public void Test5(){
		UserService userService = (UserService) ac.getBean("userService");
		User user = new User();
		user.setPassword("123");
		user.setUsername("heyuhua");
		User u = userService.findlogin(user);
		System.out.println("-------------------------");
		System.out.println(u.getId());
		System.out.println("-------------------------");
	}
}

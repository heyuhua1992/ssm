package cn.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.it.model.User;
import cn.it.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * RequestMapping��һ���������������ַӳ���ע�⣬��������򷽷���
	 * valueָ�������ʵ�ʵ�ַ
	 */
	//������ҳ
	@RequestMapping(value="welcome.do",method={RequestMethod.GET,RequestMethod.POST})
	public String welcome(){
		System.out.println(userService.toString());
		return "welcome";
	}
	//��¼
	@RequestMapping(value="login.do",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login(User u){
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.findlogin(u);
		if(user==null){
			modelAndView.setViewName("welcome");
		}else{
			modelAndView.addObject("success", user);
			modelAndView.setViewName("success");
		}
		return modelAndView;
	}
}

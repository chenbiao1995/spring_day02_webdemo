package cn.itcast.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.service.UserService;

public class UserAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		System.out.println("action....");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
		return NONE;
	}
}

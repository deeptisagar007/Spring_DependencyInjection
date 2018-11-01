package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.impl.AccountImpl;

public class MainApp {

	public static void main(String[] args) {
		try {

			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			AccountImpl bean = (AccountImpl) context.getBean("account");
			bean.deposit(500);
			System.out.println(bean.displayinfo());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

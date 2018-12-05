package com.offcn;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;

public class TestService {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml","spring-service.xml");
		MobileService mobileService = context.getBean(MobileService.class);
		Mobile mobile = mobileService.get("1367457");
		
		System.out.println(mobile);
	}
}

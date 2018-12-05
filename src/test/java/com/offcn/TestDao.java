package com.offcn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.bean.Mobile;
import com.offcn.mapper.MobileMapper;

public class TestDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
		MobileMapper mobileMapper = context.getBean(MobileMapper.class);
		Mobile mobile = mobileMapper.getMobByNum("1367457");
		
		System.out.println(mobile);
	}

}

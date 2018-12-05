package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@RequestMapping("/getMess")
	@ResponseBody
	public Mobile getMess(String number){
		System.out.println("aaa");
		Mobile mobile = mobileService.get(number);
		return mobile;
	}
	
	
	
	//myeclipse新增加的方法
	@RequestMapping("/getaaa")
	public String get(String number){
		System.out.println("aaa");
		return "index";
	}
	
	//myeclipse新增加的方法2
		@RequestMapping("/getbbb")
		public String get2(String number){
			System.out.println("bbb");
			return "index";
		}
		
	
		//eclipse新增加的方法
		@RequestMapping("/getccc")
		public String get2(String number){
			System.out.println("ccc");
			return "index";
		}
	
	
}

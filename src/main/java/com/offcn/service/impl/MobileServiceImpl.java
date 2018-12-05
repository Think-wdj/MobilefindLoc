package com.offcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.bean.Mobile;
import com.offcn.mapper.MobileMapper;
import com.offcn.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileMapper mobileMapper;
	
	@Override
	public Mobile get(String num) {
		Mobile mobile = mobileMapper.getMobByNum(num.substring(0, 7));
		if(mobile!=null){
			return mobile;
		}
		return null;
	}

}

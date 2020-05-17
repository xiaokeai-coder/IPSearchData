package com;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tledu.tt.service.IIPAndLocationService;

public class TestA {
	@Test
	public void test(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IIPAndLocationService iService = (IIPAndLocationService) applicationContext.getBean("ipService");
		String aip="123.123.123.122";
		System.out.println(iService.load(aip));
	}
}

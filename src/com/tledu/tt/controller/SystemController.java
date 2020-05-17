package com.tledu.tt.controller;

import com.tledu.tt.service.IIPAndLocationService;
import com.tledu.tt.service.impl.IPAndLocationService;

public class SystemController {

		public static void main(String[] args) {
			// 1500 ~ 1600 之间
					if (args == null  || args.length == 0) {
						System.err.println("传入参数不正确,请传入要查询的IP地址!!");
						System.exit(-1);
					}
					IIPAndLocationService ipAndLocationService=new  IPAndLocationService();
					//IIPAndLocationDao ipAndLocationDao=new IPAndLocationDao();
					String aip = args[0];
					String location=ipAndLocationService.load (aip);
				System.out.println(location);
					
		}
}

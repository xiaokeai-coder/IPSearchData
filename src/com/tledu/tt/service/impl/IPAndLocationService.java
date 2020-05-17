package com.tledu.tt.service.impl;

import com.tledu.tt.dao.IIPAndLocationDao;
import com.tledu.tt.dao.impl.IPAndLocationDao;
import com.tledu.tt.service.IIPAndLocationService;
import com.tledu.tt.util.IPUtil;

public class IPAndLocationService implements IIPAndLocationService {

	@Override
	public String load(String aip) {
		
		IIPAndLocationDao ipAndLocationDao=new IPAndLocationDao();
		long aipLong = IPUtil.ipToLong(aip);
		
		return ipAndLocationDao.load(aipLong);
	}

}

package com.tledu.tt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tledu.tt.dao.IIPAndLocationDao;
import com.tledu.tt.dao.impl.IPAndLocationDao;
import com.tledu.tt.service.IIPAndLocationService;
import com.tledu.tt.util.IPUtil;



	@Service("ipService")
	public class IPAndLocationService implements IIPAndLocationService {
		private IIPAndLocationDao ipAndLocationDao;
		
		public IIPAndLocationDao getIpAndLocationDao() {
			return ipAndLocationDao;
		}
		@Autowired
		public void setIpAndLocationDao(IIPAndLocationDao ipAndLocationDao) {
			this.ipAndLocationDao = ipAndLocationDao;
		}

		@Override
		public String load(String aip) {
			
			long aipLong = IPUtil.ipToLong(aip);
			return ipAndLocationDao.load(aipLong);
		}

	}


package com.tledu.tt.dao.impl;




import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tledu.tt.dao.IIPAndLocationDao;


@Repository("iPAndLocationDao")
public class IPAndLocationDao extends SqlSessionDaoSupport implements IIPAndLocationDao{

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public String load(long aipLong) {

		return getSqlSession().getMapper(IIPAndLocationDao.class).load(aipLong);
	}
	}

	







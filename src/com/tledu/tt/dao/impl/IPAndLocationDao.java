package com.tledu.tt.dao.impl;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import org.springframework.stereotype.Repository;

import com.tledu.tt.dao.IIPAndLocationDao;


@Repository("iPAndLocationDao")
public class IPAndLocationDao extends SqlSessionDaoSupport implements IIPAndLocationDao{

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public String load(long aipLong) {

		return getSqlSession().getMapper(IIPAndLocationDao.class).load(aipLong);
	}
	}

	







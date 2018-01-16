/**
 * 
 */
package com.test.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.dao.UserDao;
import com.test.domain.User;

/**========================================================================
 * 
 * 版本:1.0
 *
 *创建日期:2017年6月19日 上午11:26:10
 *
 *作者:马天宇
 *
 *描述:
 *
 *
 *版权:T世界版权所有(c) 2017
 *
 *==========================================================================
 */

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	// 使用注解方式进行依赖注入
	@Resource
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	/* (non-Javadoc)
	 * @see com.test.dao.UserDao#save(com.test.domain.User)
	 */
	public void save(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
	}

	/* (non-Javadoc)
	 * @see com.test.dao.UserDao#delete(com.test.domain.User)
	 */
	public void delete(User user) {
		this.getHibernateTemplate().delete(user);
	}

}

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
 * �汾:1.0
 *
 *��������:2017��6��19�� ����11:26:10
 *
 *����:������
 *
 *����:
 *
 *
 *��Ȩ:T�����Ȩ����(c) 2017
 *
 *==========================================================================
 */

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	// ʹ��ע�ⷽʽ��������ע��
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

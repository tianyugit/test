/**
 * 
 */
package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.service.UserService;

/**========================================================================
 * 
 * 版本:1.0
 *
 *创建日期:2017年6月19日 下午12:13:23
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
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see com.test.service.UserService#save()
	 */
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	/* (non-Javadoc)
	 * @see com.test.service.UserService#dalete()
	 */
	public void dalete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

}

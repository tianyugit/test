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
 * �汾:1.0
 *
 *��������:2017��6��19�� ����12:13:23
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

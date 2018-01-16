/**
 * 
 */
package com.test.dao;

import com.test.domain.User;

/**========================================================================
 * 
 * 版本:1.0
 *
 *创建日期:2017年6月19日 上午11:24:19
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
public interface UserDao {
	
	public void save(User user);
	public void delete(User user);


}

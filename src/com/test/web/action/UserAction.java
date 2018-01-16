/**
 * 
 */
package com.test.web.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.test.domain.User;

/**========================================================================
 * 
 * 版本:1.0
 *
 *创建日期:2017年6月19日 下午12:20:15
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
@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	
	public String regist(){
		userService.save(model);
		return "home";
	}

}

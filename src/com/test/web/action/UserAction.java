/**
 * 
 */
package com.test.web.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.test.domain.User;

/**========================================================================
 * 
 * �汾:1.0
 *
 *��������:2017��6��19�� ����12:20:15
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
@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	
	public String regist(){
		userService.save(model);
		return "home";
	}

}

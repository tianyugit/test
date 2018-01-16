/**
 * 
 */
package com.test.web.action;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.service.UserService;

/**========================================================================
 * 
 * 版本:1.0
 *
 *创建日期:2017年6月19日 下午10:17:38
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
public class BaseAction <T> extends ActionSupport implements ModelDriven<T>{

	// 注入Service
	@Resource
	protected UserService userService;
	
	// 模型对象
	protected T model;
		
	public T getModel() {
		return model;
	}
	
	/**
	 * 在构造方法中动态获得实现类型，通过反射创建模型对象
	 */
	public BaseAction() {
		ParameterizedType genericSuperclass = null;
		
		if(this.getClass().getGenericSuperclass() instanceof ParameterizedType){
			genericSuperclass = (ParameterizedType) this
			.getClass().getGenericSuperclass();
		}else{//当前为Action创建了代理
			genericSuperclass = (ParameterizedType) this.getClass().getSuperclass().getGenericSuperclass();
		}
		
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		// 获得实体类型
		Class<T> entityClass = (Class<T>) actualTypeArguments[0];
		//detachedCriteria = DetachedCriteria.forClass(entityClass);
	//	pageBean.setDetachedCriteria(detachedCriteria);
		try {
			// 通过反射创建对象
			model = entityClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}

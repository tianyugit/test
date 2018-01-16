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
 * �汾:1.0
 *
 *��������:2017��6��19�� ����10:17:38
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
public class BaseAction <T> extends ActionSupport implements ModelDriven<T>{

	// ע��Service
	@Resource
	protected UserService userService;
	
	// ģ�Ͷ���
	protected T model;
		
	public T getModel() {
		return model;
	}
	
	/**
	 * �ڹ��췽���ж�̬���ʵ�����ͣ�ͨ�����䴴��ģ�Ͷ���
	 */
	public BaseAction() {
		ParameterizedType genericSuperclass = null;
		
		if(this.getClass().getGenericSuperclass() instanceof ParameterizedType){
			genericSuperclass = (ParameterizedType) this
			.getClass().getGenericSuperclass();
		}else{//��ǰΪAction�����˴���
			genericSuperclass = (ParameterizedType) this.getClass().getSuperclass().getGenericSuperclass();
		}
		
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		// ���ʵ������
		Class<T> entityClass = (Class<T>) actualTypeArguments[0];
		//detachedCriteria = DetachedCriteria.forClass(entityClass);
	//	pageBean.setDetachedCriteria(detachedCriteria);
		try {
			// ͨ�����䴴������
			model = entityClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}

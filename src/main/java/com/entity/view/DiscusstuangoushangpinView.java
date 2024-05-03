package com.entity.view;

import com.entity.DiscusstuangoushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 团购商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-27 21:55:40
 */
@TableName("discusstuangoushangpin")
public class DiscusstuangoushangpinView  extends DiscusstuangoushangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstuangoushangpinView(){
	}
 
 	public DiscusstuangoushangpinView(DiscusstuangoushangpinEntity discusstuangoushangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusstuangoushangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.BaoxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 保险信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-27
 */
@TableName("baoxian")
public class BaoxianView extends BaoxianEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 保险类型的值
		*/
		private String baoxianValue;



	public BaoxianView() {

	}

	public BaoxianView(BaoxianEntity baoxianEntity) {
		try {
			BeanUtils.copyProperties(this, baoxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 保险类型的值
			*/
			public String getBaoxianValue() {
				return baoxianValue;
			}
			/**
			* 设置： 保险类型的值
			*/
			public void setBaoxianValue(String baoxianValue) {
				this.baoxianValue = baoxianValue;
			}









}

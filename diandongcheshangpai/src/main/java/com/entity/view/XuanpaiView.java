package com.entity.view;

import com.entity.XuanpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 选牌信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-27
 */
@TableName("xuanpai")
public class XuanpaiView extends XuanpaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 车牌类型的值
		*/
		private String xuanpaiValue;
		/**
		* 车牌状态的值
		*/
		private String zhuangtaiValue;



	public XuanpaiView() {

	}

	public XuanpaiView(XuanpaiEntity xuanpaiEntity) {
		try {
			BeanUtils.copyProperties(this, xuanpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 车牌类型的值
			*/
			public String getXuanpaiValue() {
				return xuanpaiValue;
			}
			/**
			* 设置： 车牌类型的值
			*/
			public void setXuanpaiValue(String xuanpaiValue) {
				this.xuanpaiValue = xuanpaiValue;
			}
			/**
			* 获取： 车牌状态的值
			*/
			public String getZhuangtaiValue() {
				return zhuangtaiValue;
			}
			/**
			* 设置： 车牌状态的值
			*/
			public void setZhuangtaiValue(String zhuangtaiValue) {
				this.zhuangtaiValue = zhuangtaiValue;
			}









}

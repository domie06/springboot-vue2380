package com.entity.view;

import com.entity.ShangpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 上牌信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-27
 */
@TableName("shangpai")
public class ShangpaiView extends ShangpaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 审核状态的值
		*/
		private String shangpaiValue;



		//级联表 xuanpai
			/**
			* 车牌号
			*/
			private String xuanpaiName;
			/**
			* 车牌类型
			*/
			private Integer xuanpaiTypes;
				/**
				* 车牌类型的值
				*/
				private String xuanpaiValue;
			/**
			* 车牌状态
			*/
			private Integer zhuangtaiTypes;
				/**
				* 车牌状态的值
				*/
				private String zhuangtaiValue;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 发布时间
			*/
			private Date insertTime;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 电动车类型
			*/
			private Integer diandongcheTypes;
				/**
				* 电动车类型的值
				*/
				private String diandongcheValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public ShangpaiView() {

	}

	public ShangpaiView(ShangpaiEntity shangpaiEntity) {
		try {
			BeanUtils.copyProperties(this, shangpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getShangpaiValue() {
				return shangpaiValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setShangpaiValue(String shangpaiValue) {
				this.shangpaiValue = shangpaiValue;
			}

















				//级联表的get和set xuanpai
					/**
					* 获取： 车牌号
					*/
					public String getXuanpaiName() {
						return xuanpaiName;
					}
					/**
					* 设置： 车牌号
					*/
					public void setXuanpaiName(String xuanpaiName) {
						this.xuanpaiName = xuanpaiName;
					}
					/**
					* 获取： 车牌状态
					*/
					public Integer getZhuangtaiTypes() {
						return zhuangtaiTypes;
					}
					/**
					* 设置： 车牌状态
					*/
					public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
						this.zhuangtaiTypes = zhuangtaiTypes;
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
					/**
					* 获取： 发布时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 发布时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}


				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 电动车类型
					*/
					public Integer getDiandongcheTypes() {
						return diandongcheTypes;
					}
					/**
					* 设置： 电动车类型
					*/
					public void setDiandongcheTypes(Integer diandongcheTypes) {
						this.diandongcheTypes = diandongcheTypes;
					}


						/**
						* 获取： 电动车类型的值
						*/
						public String getDiandongcheValue() {
							return diandongcheValue;
						}
						/**
						* 设置： 电动车类型的值
						*/
						public void setDiandongcheValue(String diandongcheValue) {
							this.diandongcheValue = diandongcheValue;
						}
					/**
					* 获取： 驾照类型
					*/
					public Integer getXuanpaiTypes() {
						return xuanpaiTypes;
					}
					/**
					* 设置： 驾照类型
					*/
					public void setXuanpaiTypes(Integer xuanpaiTypes) {
						this.xuanpaiTypes = xuanpaiTypes;
					}


						/**
						* 获取： 驾照类型的值
						*/
						public String getXuanpaiValue() {
							return xuanpaiValue;
						}
						/**
						* 设置： 驾照类型的值
						*/
						public void setXuanpaiValue(String xuanpaiValue) {
							this.xuanpaiValue = xuanpaiValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}




}

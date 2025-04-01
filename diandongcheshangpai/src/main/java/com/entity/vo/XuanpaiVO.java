package com.entity.vo;

import com.entity.XuanpaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 选牌信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-27
 */
@TableName("xuanpai")
public class XuanpaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 车牌号
     */

    @TableField(value = "xuanpai_name")
    private String xuanpaiName;


    /**
     * 车牌类型
     */

    @TableField(value = "xuanpai_types")
    private Integer xuanpaiTypes;


    /**
     * 车牌状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车牌号
	 */
    public String getXuanpaiName() {
        return xuanpaiName;
    }


    /**
	 * 获取：车牌号
	 */

    public void setXuanpaiName(String xuanpaiName) {
        this.xuanpaiName = xuanpaiName;
    }
    /**
	 * 设置：车牌类型
	 */
    public Integer getXuanpaiTypes() {
        return xuanpaiTypes;
    }


    /**
	 * 获取：车牌类型
	 */

    public void setXuanpaiTypes(Integer xuanpaiTypes) {
        this.xuanpaiTypes = xuanpaiTypes;
    }
    /**
	 * 设置：车牌状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：车牌状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

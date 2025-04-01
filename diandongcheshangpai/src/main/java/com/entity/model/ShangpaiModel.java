package com.entity.model;

import com.entity.ShangpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 上牌信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-27
 */
public class ShangpaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 上牌用户
     */
    private Integer yonghuId;


    /**
     * 所选牌号
     */
    private Integer xuanpaiId;


    /**
     * 审核状态
     */
    private Integer shangpaiTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：上牌用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：上牌用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：所选牌号
	 */
    public Integer getXuanpaiId() {
        return xuanpaiId;
    }


    /**
	 * 设置：所选牌号
	 */
    public void setXuanpaiId(Integer xuanpaiId) {
        this.xuanpaiId = xuanpaiId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getShangpaiTypes() {
        return shangpaiTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setShangpaiTypes(Integer shangpaiTypes) {
        this.shangpaiTypes = shangpaiTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

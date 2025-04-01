package com.entity.model;

import com.entity.BaoxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 保险信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-27
 */
public class BaoxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 保险标题
     */
    private String baoxianName;


    /**
     * 保险类型
     */
    private Integer baoxianTypes;


    /**
     * 保险价格
     */
    private Double baoxianMoney;


    /**
     * 保险内容
     */
    private String baoxianContent;


    /**
     * 发布时间
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
	 * 获取：保险标题
	 */
    public String getBaoxianName() {
        return baoxianName;
    }


    /**
	 * 设置：保险标题
	 */
    public void setBaoxianName(String baoxianName) {
        this.baoxianName = baoxianName;
    }
    /**
	 * 获取：保险类型
	 */
    public Integer getBaoxianTypes() {
        return baoxianTypes;
    }


    /**
	 * 设置：保险类型
	 */
    public void setBaoxianTypes(Integer baoxianTypes) {
        this.baoxianTypes = baoxianTypes;
    }
    /**
	 * 获取：保险价格
	 */
    public Double getBaoxianMoney() {
        return baoxianMoney;
    }


    /**
	 * 设置：保险价格
	 */
    public void setBaoxianMoney(Double baoxianMoney) {
        this.baoxianMoney = baoxianMoney;
    }
    /**
	 * 获取：保险内容
	 */
    public String getBaoxianContent() {
        return baoxianContent;
    }


    /**
	 * 设置：保险内容
	 */
    public void setBaoxianContent(String baoxianContent) {
        this.baoxianContent = baoxianContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
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

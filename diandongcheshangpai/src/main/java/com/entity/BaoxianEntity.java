package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 保险信息
 *
 * @author 
 * @email
 * @date 2021-04-27
 */
@TableName("baoxian")
public class BaoxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BaoxianEntity() {

	}

	public BaoxianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 保险标题
     */
    @TableField(value = "baoxian_name")

    private String baoxianName;


    /**
     * 保险类型
     */
    @TableField(value = "baoxian_types")

    private Integer baoxianTypes;


    /**
     * 保险价格
     */
    @TableField(value = "baoxian_money")

    private Double baoxianMoney;


    /**
     * 保险内容
     */
    @TableField(value = "baoxian_content")

    private String baoxianContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：保险标题
	 */
    public String getBaoxianName() {
        return baoxianName;
    }


    /**
	 * 获取：保险标题
	 */

    public void setBaoxianName(String baoxianName) {
        this.baoxianName = baoxianName;
    }
    /**
	 * 设置：保险类型
	 */
    public Integer getBaoxianTypes() {
        return baoxianTypes;
    }


    /**
	 * 获取：保险类型
	 */

    public void setBaoxianTypes(Integer baoxianTypes) {
        this.baoxianTypes = baoxianTypes;
    }
    /**
	 * 设置：保险价格
	 */
    public Double getBaoxianMoney() {
        return baoxianMoney;
    }


    /**
	 * 获取：保险价格
	 */

    public void setBaoxianMoney(Double baoxianMoney) {
        this.baoxianMoney = baoxianMoney;
    }
    /**
	 * 设置：保险内容
	 */
    public String getBaoxianContent() {
        return baoxianContent;
    }


    /**
	 * 获取：保险内容
	 */

    public void setBaoxianContent(String baoxianContent) {
        this.baoxianContent = baoxianContent;
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

    @Override
    public String toString() {
        return "Baoxian{" +
            "id=" + id +
            ", baoxianName=" + baoxianName +
            ", baoxianTypes=" + baoxianTypes +
            ", baoxianMoney=" + baoxianMoney +
            ", baoxianContent=" + baoxianContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}

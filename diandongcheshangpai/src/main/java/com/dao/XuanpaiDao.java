package com.dao;

import com.entity.XuanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuanpaiView;

/**
 * 选牌信息 Dao 接口
 *
 * @author 
 * @since 2021-04-27
 */
public interface XuanpaiDao extends BaseMapper<XuanpaiEntity> {

   List<XuanpaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

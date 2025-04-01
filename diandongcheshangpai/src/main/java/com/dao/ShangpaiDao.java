package com.dao;

import com.entity.ShangpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpaiView;

/**
 * 上牌信息 Dao 接口
 *
 * @author 
 * @since 2021-04-27
 */
public interface ShangpaiDao extends BaseMapper<ShangpaiEntity> {

   List<ShangpaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.ShangpaiDao;
import com.entity.ShangpaiEntity;
import com.service.ShangpaiService;
import com.entity.view.ShangpaiView;

/**
 * 上牌信息 服务实现类
 * @author 
 * @since 2021-04-27
 */
@Service("shangpaiService")
@Transactional
public class ShangpaiServiceImpl extends ServiceImpl<ShangpaiDao, ShangpaiEntity> implements ShangpaiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShangpaiView> page =new Query<ShangpaiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}

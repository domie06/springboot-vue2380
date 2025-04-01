package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShangpaiEntity;

import com.service.ShangpaiService;
import com.entity.view.ShangpaiView;
import com.service.XuanpaiService;
import com.entity.XuanpaiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 上牌信息
 * 后端接口
 * @author
 * @email
 * @date 2021-04-27
*/
@RestController
@Controller
@RequestMapping("/shangpai")
public class ShangpaiController {
    private static final Logger logger = LoggerFactory.getLogger(ShangpaiController.class);

    @Autowired
    private ShangpaiService shangpaiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private XuanpaiService xuanpaiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = shangpaiService.queryPage(params);

        //字典表数据转换
        List<ShangpaiView> list =(List<ShangpaiView>)page.getList();
        for(ShangpaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShangpaiEntity shangpai = shangpaiService.selectById(id);
        if(shangpai !=null){
            //entity转view
            ShangpaiView view = new ShangpaiView();
            BeanUtils.copyProperties( shangpai , view );//把实体数据重构到view中

            //级联表
            XuanpaiEntity xuanpai = xuanpaiService.selectById(shangpai.getXuanpaiId());
            if(xuanpai != null){
                BeanUtils.copyProperties( xuanpai , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setXuanpaiId(xuanpai.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(shangpai.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpaiEntity shangpai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shangpai:{}",this.getClass().getName(),shangpai.toString());
        Wrapper<ShangpaiEntity> queryWrapper = new EntityWrapper<ShangpaiEntity>()
            .eq("yonghu_id", shangpai.getYonghuId())
            .eq("xuanpai_id", shangpai.getXuanpaiId())
            .eq("shangpai_types", shangpai.getShangpaiTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangpaiEntity shangpaiEntity = shangpaiService.selectOne(queryWrapper);
        if(shangpaiEntity==null){
            shangpai.setInsertTime(new Date());
            shangpai.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shangpai.set
        //  }
            shangpaiService.insert(shangpai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpaiEntity shangpai, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shangpai:{}",this.getClass().getName(),shangpai.toString());
        //根据字段查询是否有相同数据
        Wrapper<ShangpaiEntity> queryWrapper = new EntityWrapper<ShangpaiEntity>()
            .notIn("id",shangpai.getId())
            .andNew()
            .eq("yonghu_id", shangpai.getYonghuId())
            .eq("xuanpai_id", shangpai.getXuanpaiId())
            .eq("shangpai_types", shangpai.getShangpaiTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangpaiEntity shangpaiEntity = shangpaiService.selectOne(queryWrapper);
        if(shangpaiEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shangpai.set
            //  }
            shangpaiService.updateById(shangpai);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 选牌
    */
    @RequestMapping("/xuanzhe")
    public R xuanzhe(Integer ids, HttpServletRequest request){
        XuanpaiEntity xuanpai = xuanpaiService.selectById(ids);
        if(xuanpai == null){
            return R.error();
        }
        xuanpai.setZhuangtaiTypes(2);
        boolean b = xuanpaiService.updateById(xuanpai);
        if(b){
            ShangpaiEntity shangpai = new ShangpaiEntity();
            shangpai.setShangpaiTypes(ids);
            shangpai.setCreateTime(new Date());
            shangpai.setInsertTime(new Date());
            shangpai.setXuanpaiId(ids);
            shangpai.setShangpaiTypes(1);
            shangpai.setYonghuId((Integer) request.getSession().getAttribute("userId"));
            Wrapper<ShangpaiEntity> queryWrapper = new EntityWrapper<ShangpaiEntity>()
                    .eq("yonghu_id", shangpai.getYonghuId())
                    .eq("xuanpai_id", shangpai.getXuanpaiId())
                    ;
            logger.info("sql语句:"+queryWrapper.getSqlSegment());
            ShangpaiEntity shangpaiEntity = shangpaiService.selectOne(queryWrapper);
            if(shangpaiEntity!=null){
                return R.error("你已经学过这个车牌了");
            }
            boolean insert = shangpaiService.insert(shangpai);
            if(insert){
                return R.ok();
            }
        }
        return R.error();
    }



    /**
     * 审核
     */
    @RequestMapping("/shenhe")
    public R shenhe(Integer ids,Integer jieguo){
        ShangpaiEntity shangpai = shangpaiService.selectById(ids);
        if(shangpai == null){
            return R.error();
        }
        XuanpaiEntity xuanpai = xuanpaiService.selectById(shangpai.getXuanpaiId());
        if(jieguo == 2){
            xuanpai.setZhuangtaiTypes(3);
        }else{
            xuanpai.setZhuangtaiTypes(1);
        }
        shangpai.setShangpaiTypes(jieguo);
        xuanpaiService.updateById(xuanpai);
        shangpaiService.updateById(shangpai);
        return R.ok();
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(Integer ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ShangpaiEntity shangpai = shangpaiService.selectById(ids);
        if(shangpai == null){
            return R.error();
        }
        if(shangpai.getShangpaiTypes() == 2){
            shangpaiService.deleteBatchIds(Arrays.asList(ids));
            return R.ok();
        }
        XuanpaiEntity xuanpai = xuanpaiService.selectById(shangpai.getXuanpaiId());
        xuanpai.setZhuangtaiTypes(1);
        boolean b = xuanpaiService.updateById(xuanpai);
        if(b){
            shangpaiService.deleteBatchIds(Arrays.asList(ids));
            return R.ok();
        }
        return R.error();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shangpaiService.queryPage(params);

        //字典表数据转换
        List<ShangpaiView> list =(List<ShangpaiView>)page.getList();
        for(ShangpaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShangpaiEntity shangpai = shangpaiService.selectById(id);
            if(shangpai !=null){
                //entity转view
        ShangpaiView view = new ShangpaiView();
                BeanUtils.copyProperties( shangpai , view );//把实体数据重构到view中

                //级联表
                    XuanpaiEntity xuanpai = xuanpaiService.selectById(shangpai.getXuanpaiId());
                if(xuanpai != null){
                    BeanUtils.copyProperties( xuanpai , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXuanpaiId(xuanpai.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shangpai.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpaiEntity shangpai, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shangpai:{}",this.getClass().getName(),shangpai.toString());
        Wrapper<ShangpaiEntity> queryWrapper = new EntityWrapper<ShangpaiEntity>()
            .eq("yonghu_id", shangpai.getYonghuId())
            .eq("xuanpai_id", shangpai.getXuanpaiId())
            .eq("shangpai_types", shangpai.getShangpaiTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    ShangpaiEntity shangpaiEntity = shangpaiService.selectOne(queryWrapper);
        if(shangpaiEntity==null){
            shangpai.setInsertTime(new Date());
            shangpai.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shangpai.set
        //  }
        shangpaiService.insert(shangpai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}


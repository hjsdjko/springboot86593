package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuangoushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuangoushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuangoushangpinView;


/**
 * 团购商品
 *
 * @author 
 * @email 
 * @date 2022-03-27 21:55:39
 */
public interface TuangoushangpinService extends IService<TuangoushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuangoushangpinVO> selectListVO(Wrapper<TuangoushangpinEntity> wrapper);
   	
   	TuangoushangpinVO selectVO(@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);
   	
   	List<TuangoushangpinView> selectListView(Wrapper<TuangoushangpinEntity> wrapper);
   	
   	TuangoushangpinView selectView(@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuangoushangpinEntity> wrapper);
   	

}


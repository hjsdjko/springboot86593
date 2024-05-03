package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstuangoushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstuangoushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstuangoushangpinView;


/**
 * 团购商品评论表
 *
 * @author 
 * @email 
 * @date 2022-03-27 21:55:40
 */
public interface DiscusstuangoushangpinService extends IService<DiscusstuangoushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstuangoushangpinVO> selectListVO(Wrapper<DiscusstuangoushangpinEntity> wrapper);
   	
   	DiscusstuangoushangpinVO selectVO(@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);
   	
   	List<DiscusstuangoushangpinView> selectListView(Wrapper<DiscusstuangoushangpinEntity> wrapper);
   	
   	DiscusstuangoushangpinView selectView(@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstuangoushangpinEntity> wrapper);
   	

}


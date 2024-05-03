package com.dao;

import com.entity.DiscusstuangoushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstuangoushangpinVO;
import com.entity.view.DiscusstuangoushangpinView;


/**
 * 团购商品评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-27 21:55:40
 */
public interface DiscusstuangoushangpinDao extends BaseMapper<DiscusstuangoushangpinEntity> {
	
	List<DiscusstuangoushangpinVO> selectListVO(@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);
	
	DiscusstuangoushangpinVO selectVO(@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);
	
	List<DiscusstuangoushangpinView> selectListView(@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);

	List<DiscusstuangoushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);
	
	DiscusstuangoushangpinView selectView(@Param("ew") Wrapper<DiscusstuangoushangpinEntity> wrapper);
	

}

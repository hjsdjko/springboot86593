package com.dao;

import com.entity.TuangoushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuangoushangpinVO;
import com.entity.view.TuangoushangpinView;


/**
 * 团购商品
 * 
 * @author 
 * @email 
 * @date 2022-03-27 21:55:39
 */
public interface TuangoushangpinDao extends BaseMapper<TuangoushangpinEntity> {
	
	List<TuangoushangpinVO> selectListVO(@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);
	
	TuangoushangpinVO selectVO(@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);
	
	List<TuangoushangpinView> selectListView(@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);

	List<TuangoushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);
	
	TuangoushangpinView selectView(@Param("ew") Wrapper<TuangoushangpinEntity> wrapper);
	

}

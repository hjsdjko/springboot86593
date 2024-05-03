package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuangoushangpinDao;
import com.entity.TuangoushangpinEntity;
import com.service.TuangoushangpinService;
import com.entity.vo.TuangoushangpinVO;
import com.entity.view.TuangoushangpinView;

@Service("tuangoushangpinService")
public class TuangoushangpinServiceImpl extends ServiceImpl<TuangoushangpinDao, TuangoushangpinEntity> implements TuangoushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuangoushangpinEntity> page = this.selectPage(
                new Query<TuangoushangpinEntity>(params).getPage(),
                new EntityWrapper<TuangoushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuangoushangpinEntity> wrapper) {
		  Page<TuangoushangpinView> page =new Query<TuangoushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuangoushangpinVO> selectListVO(Wrapper<TuangoushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuangoushangpinVO selectVO(Wrapper<TuangoushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuangoushangpinView> selectListView(Wrapper<TuangoushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuangoushangpinView selectView(Wrapper<TuangoushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

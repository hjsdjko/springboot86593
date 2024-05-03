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


import com.dao.DiscusstuangoushangpinDao;
import com.entity.DiscusstuangoushangpinEntity;
import com.service.DiscusstuangoushangpinService;
import com.entity.vo.DiscusstuangoushangpinVO;
import com.entity.view.DiscusstuangoushangpinView;

@Service("discusstuangoushangpinService")
public class DiscusstuangoushangpinServiceImpl extends ServiceImpl<DiscusstuangoushangpinDao, DiscusstuangoushangpinEntity> implements DiscusstuangoushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstuangoushangpinEntity> page = this.selectPage(
                new Query<DiscusstuangoushangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusstuangoushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstuangoushangpinEntity> wrapper) {
		  Page<DiscusstuangoushangpinView> page =new Query<DiscusstuangoushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstuangoushangpinVO> selectListVO(Wrapper<DiscusstuangoushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstuangoushangpinVO selectVO(Wrapper<DiscusstuangoushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstuangoushangpinView> selectListView(Wrapper<DiscusstuangoushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstuangoushangpinView selectView(Wrapper<DiscusstuangoushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

package demo.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.house.api.AreaService;
import demo.house.bean.Area;
import demo.house.dao.AreaRepository;

@Service("areaserviceimpl")
public class AreaServiceImpl implements AreaService{
	   @Autowired
       private AreaRepository arearepo;
    //查询所有区域
	public List<Area> findAreaAll() {
		return arearepo.findAll();
	}
	   
}

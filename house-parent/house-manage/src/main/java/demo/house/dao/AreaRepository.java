package demo.house.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import demo.house.bean.Area;

public interface AreaRepository {
	//查询所有区域
	@Select("select * from area")
    public List<Area> findAll();
}

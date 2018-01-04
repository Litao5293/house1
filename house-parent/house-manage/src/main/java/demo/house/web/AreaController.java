package demo.house.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.house.bean.Area;
import demo.house.service.AreaServiceImpl;

@Controller
@RequestMapping("/area")
public class AreaController {
	@Autowired
    private AreaServiceImpl areaservice;
    
	//为所有业务请求提供 模型数据
	public List<Area> getArea(){
		return areaservice.findAreaAll();
	}
	
}

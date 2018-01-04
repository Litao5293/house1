package demo.house.bean;

import org.apache.ibatis.type.Alias;

//楼盘类型信息
@Alias("building_type")
public class Building_Type implements java.io.Serializable{
     private Integer btid;//楼盘类型id
     private String btname;//楼盘类型名称(新房、二手、租房、现房、学区房)
     private String btdescribe;//描述
     private Building building;//楼盘
     private House_Type house_type;//房屋
     
	public Integer getBtid() {
		return btid;
	}
	public void setBtid(Integer btid) {
		this.btid = btid;
	}
	public String getBtname() {
		return btname;
	}
	public void setBtname(String btname) {
		this.btname = btname;
	}
	public String getBtdescribe() {
		return btdescribe;
	}
	public void setBtdescribe(String btdescribe) {
		this.btdescribe = btdescribe;
	}
	
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public House_Type getHouse_type() {
		return house_type;
	}
	public void setHouse_type(House_Type house_type) {
		this.house_type = house_type;
	}
	@Override
	public String toString() {
		return "Building_Type [btid=" + btid + ", btname=" + btname + ", btdescribe=" + btdescribe + ", building="
				+ building + ", house_type=" + house_type + "]";
	}
     
}

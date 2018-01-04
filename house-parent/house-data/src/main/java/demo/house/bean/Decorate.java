package demo.house.bean;

import org.apache.ibatis.type.Alias;

//装修信息
@Alias("decorate")
public class Decorate implements java.io.Serializable{
    private Integer did;//装修id
    private String dname;//装修度名称
    private Building building;//楼盘
    private House_Type house_Type;//房屋户型
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public House_Type getHouse_Type() {
		return house_Type;
	}
	public void setHouse_Type(House_Type house_Type) {
		this.house_Type = house_Type;
	}
	@Override
	public String toString() {
		return "Decorate [did=" + did + ", dname=" + dname + ", building=" + building + ", house_Type=" + house_Type
				+ "]";
	}
    
}

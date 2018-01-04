package demo.house.bean;

import org.apache.ibatis.type.Alias;
//¥����Ϣ
@Alias("floor_type")
public class Floor_Type implements java.io.Serializable{
       private Integer ftid;//¥��id
       private String ftname;//¥������
       private Building building;//¥��
       private House_Type house_type;//����
	public Integer getFtid() {
		return ftid;
	}
	public void setFtid(Integer ftid) {
		this.ftid = ftid;
	}
	public String getFtname() {
		return ftname;
	}
	public void setFtname(String ftname) {
		this.ftname = ftname;
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
		return "Floor_Type [ftid=" + ftid + ", ftname=" + ftname + ", building=" + building + ", house_type="
				+ house_type + "]";
	}
       
}

package demo.house.bean;

import org.apache.ibatis.type.Alias;

//װ����Ϣ
@Alias("decorate")
public class Decorate implements java.io.Serializable{
    private Integer did;//װ��id
    private String dname;//װ�޶�����
    private Building building;//¥��
    private House_Type house_Type;//���ݻ���
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

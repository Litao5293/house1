package demo.house.bean;

import java.util.Date;

import org.apache.ibatis.type.Alias;
//楼房户型详细信息
@Alias("house_type")
public class House_Type implements java.io.Serializable{
    private Integer hid;//房屋id
    private Integer bid;//所属楼盘id
    private String htype;//房屋户型
    private Integer did;//装修度id
    private Float hprice;//价格
    private double hsize;//大小
    private Date htime;//时间
    private Integer btid;//楼盘类型id
    private Integer ftid;//楼型id
    private Integer proid;//物业id
    private Building_Type building_type;
    private Building building;
    private Floor_Type floor_type;
    private Property property;//物业
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Float getHprice() {
		return hprice;
	}
	public void setHprice(Float hprice) {
		this.hprice = hprice;
	}
	public double getHsize() {
		return hsize;
	}
	public void setHsize(double hsize) {
		this.hsize = hsize;
	}
	public Date getHtime() {
		return htime;
	}
	public void setHtime(Date htime) {
		this.htime = htime;
	}
	public Integer getBtid() {
		return btid;
	}
	public void setBtid(Integer btid) {
		this.btid = btid;
	}
	public Integer getFtid() {
		return ftid;
	}
	public void setFtid(Integer ftid) {
		this.ftid = ftid;
	}
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public Building_Type getBuilding_type() {
		return building_type;
	}
	public void setBuilding_type(Building_Type building_type) {
		this.building_type = building_type;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public Floor_Type getFloor_type() {
		return floor_type;
	}
	public void setFloor_type(Floor_Type floor_type) {
		this.floor_type = floor_type;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	@Override
	public String toString() {
		return "House_Type [hid=" + hid + ", bid=" + bid + ", htype=" + htype + ", did=" + did + ", hprice=" + hprice
				+ ", hsize=" + hsize + ", htime=" + htime + ", btid=" + btid + ", ftid=" + ftid + ", proid=" + proid
				+ ", building_type=" + building_type + ", building=" + building + ", floor_type=" + floor_type
				+ ", property=" + property + "]";
	}
    
    
    
}

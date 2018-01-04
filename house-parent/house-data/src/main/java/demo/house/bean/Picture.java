package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("picture")
public class Picture implements java.io.Serializable{
    private Integer pid;//Í¼Æ¬id
    private String pclasspath;//Í¼Æ¬Â·¾¶
    private Integer ptid;//Í¼Æ¬ÀàÐÍ
    private Integer bid;//
    private String pstate;//×´Ì¬
    private Picture_Type picture_type;
    private Building building;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPclasspath() {
		return pclasspath;
	}
	public void setPclasspath(String pclasspath) {
		this.pclasspath = pclasspath;
	}
	public Integer getPtid() {
		return ptid;
	}
	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getPstate() {
		return pstate;
	}
	public void setPstate(String pstate) {
		this.pstate = pstate;
	}
	public Picture_Type getPicture_type() {
		return picture_type;
	}
	public void setPicture_type(Picture_Type picture_type) {
		this.picture_type = picture_type;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	@Override
	public String toString() {
		return "Picture [pid=" + pid + ", pclasspath=" + pclasspath + ", ptid=" + ptid + ", bid=" + bid + ", pstate="
				+ pstate + ", picture_type=" + picture_type + ", building=" + building + "]";
	}
    
}

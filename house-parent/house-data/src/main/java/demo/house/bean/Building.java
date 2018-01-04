package demo.house.bean;

import java.util.Date;

import org.apache.ibatis.type.Alias;
//楼盘信息
@Alias("building")
public class Building implements java.io.Serializable{
     private Integer bid;//楼盘id
     private String bname;//楼盘名称
     private String baddress;//楼盘详细地址
     private Integer qid;//楼盘所在商圈id
     private Integer aid;//楼盘所在区域id
     private Integer btid;//楼盘类型id
     private  Integer ftid;//楼型id
     private Date opentime;//开盘时间
     private Date jiaotime;//交盘时间
     private Integer did;//装修度
     private Integer dev_id;//开发商id
     private String dev_num;//开发商电话
     private House_Type house_type;//房屋户型
     private Picture picture;//图片信息
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
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
	public Date getOpentime() {
		return opentime;
	}
	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}
	public Date getJiaotime() {
		return jiaotime;
	}
	public void setJiaotime(Date jiaotime) {
		this.jiaotime = jiaotime;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getDev_id() {
		return dev_id;
	}
	public void setDev_id(Integer dev_id) {
		this.dev_id = dev_id;
	}
	public String getDev_num() {
		return dev_num;
	}
	public void setDev_num(String dev_num) {
		this.dev_num = dev_num;
	}
	public House_Type getHouse_type() {
		return house_type;
	}
	public void setHouse_type(House_Type house_type) {
		this.house_type = house_type;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Building [bid=" + bid + ", bname=" + bname + ", baddress=" + baddress + ", qid=" + qid + ", aid=" + aid
				+ ", btid=" + btid + ", ftid=" + ftid + ", opentime=" + opentime + ", jiaotime=" + jiaotime + ", did="
				+ did + ", dev_id=" + dev_id + ", dev_num=" + dev_num + ", house_type=" + house_type + ", picture="
				+ picture + "]";
	}
     
}

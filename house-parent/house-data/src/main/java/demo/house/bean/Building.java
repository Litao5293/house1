package demo.house.bean;

import java.util.Date;

import org.apache.ibatis.type.Alias;
//¥����Ϣ
@Alias("building")
public class Building implements java.io.Serializable{
     private Integer bid;//¥��id
     private String bname;//¥������
     private String baddress;//¥����ϸ��ַ
     private Integer qid;//¥��������Ȧid
     private Integer aid;//¥����������id
     private Integer btid;//¥������id
     private  Integer ftid;//¥��id
     private Date opentime;//����ʱ��
     private Date jiaotime;//����ʱ��
     private Integer did;//װ�޶�
     private Integer dev_id;//������id
     private String dev_num;//�����̵绰
     private House_Type house_type;//���ݻ���
     private Picture picture;//ͼƬ��Ϣ
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

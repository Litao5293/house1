package demo.house.bean;

import java.util.Date;

import org.apache.ibatis.type.Alias;
//����
@Alias("evaluate")
public class Evaluate implements java.io.Serializable{
   private Integer eid;
   private String econtent;//��������
   private Integer uid;//�û�id
   private Date etime;//����ʱ��
   private String epicture;//����ͼƬ
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEcontent() {
	return econtent;
}
public void setEcontent(String econtent) {
	this.econtent = econtent;
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public Date getEtime() {
	return etime;
}
public void setEtime(Date etime) {
	this.etime = etime;
}
public String getEpicture() {
	return epicture;
}
public void setEpicture(String epicture) {
	this.epicture = epicture;
}
@Override
public String toString() {
	return "Evaluate [eid=" + eid + ", econtent=" + econtent + ", uid=" + uid + ", etime=" + etime + ", epicture="
			+ epicture + "]";
}
   
}

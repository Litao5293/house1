package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("picture_type")
public class Picture_Type implements java.io.Serializable {
      private Integer ptid;//图片类型id
      private String ptdescribe;//图片类型
      private Picture picture;//
	public Integer getPtid() {
		return ptid;
	}
	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}
	public String getPtdescribe() {
		return ptdescribe;
	}
	public void setPtdescribe(String ptdescribe) {
		this.ptdescribe = ptdescribe;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Picture_Type [ptid=" + ptid + ", ptdescribe=" + ptdescribe + ", picture=" + picture + "]";
	}
      
}

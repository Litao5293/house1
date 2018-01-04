package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("area")
public class Area implements java.io.Serializable{
      private Integer aid;//ÇøÓòid
      private String address;//µØÖ·
      private String astate;//×´Ì¬
      private Quan quan;//ÉÌÈ¦
      private Building building;//Â¥ÅÌ
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAstate() {
		return astate;
	}
	public void setAstate(String astate) {
		this.astate = astate;
	}
	public Quan getQuan() {
		return quan;
	}
	public void setQuan(Quan quan) {
		this.quan = quan;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	@Override
	public String toString() {
		return "Area [aid=" + aid + ", address=" + address + ", astate=" + astate + ", quan=" + quan + ", building="
				+ building + "]";
	}
      
}

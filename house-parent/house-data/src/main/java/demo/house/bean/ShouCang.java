package demo.house.bean;




import org.apache.ibatis.type.Alias;

@Alias("shoucang")
public class ShouCang implements java.io.Serializable{
     private Integer cid;
     private Integer hid;
     private Integer uid;
     private House_Type house_type;
     private Users users;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public House_Type getHouse_type() {
		return house_type;
	}
	public void setHouse_type(House_Type house_type) {
		this.house_type = house_type;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Collection [cid=" + cid + ", hid=" + hid + ", uid=" + uid + ", house_type=" + house_type + ", users="
				+ users + "]";
	}
     
}

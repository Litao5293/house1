package demo.house.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.ibatis.type.Alias;

@Alias("users_type")
public class Users_type implements java.io.Serializable{
    private Integer utid;//用户类型ID
    private String utname;//用户类型名称
    private Collection<Users> users=new ArrayList<Users>();
	public Integer getUtid() {
		return utid;
	}
	public void setUtid(Integer utid) {
		this.utid = utid;
	}
	public String getUtname() {
		return utname;
	}
	public void setUtname(String utname) {
		this.utname = utname;
	}
	public Collection<Users> getUsers() {
		return users;
	}
	public void setUsers(Collection<Users> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Users_type [utid=" + utid + ", utname=" + utname + ", users=" + users + "]";
	}
    
}

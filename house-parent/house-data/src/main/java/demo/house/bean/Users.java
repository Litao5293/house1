package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("users")
public class Users implements java.io.Serializable{
   private Integer uid;//�û�id
   private String uname;//�û�����
   private String password;//����
   private String user_num;//��ϵ��ʽ
   private Integer utid;//��� �û�����id
   private Users_type type;
   private ShouCang shouCang;
   

public ShouCang getShouCang() {
	return shouCang;
}
public void setShouCang(ShouCang shouCang) {
	this.shouCang = shouCang;
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUser_num() {
	return user_num;
}
public void setUser_num(String user_num) {
	this.user_num = user_num;
}
public Integer getUtid() {
	return utid;
}
public void setUtid(Integer utid) {
	this.utid = utid;
}
public Users_type getType() {
	return type;
}
public void setType(Users_type type) {
	this.type = type;
}
@Override
public String toString() {
	return "Users [uid=" + uid + ", uname=" + uname + ", password=" + password + ", user_num=" + user_num + ", utid="
			+ utid + ", type=" + type + ", shouCang=" + shouCang + "]";
}
   
}

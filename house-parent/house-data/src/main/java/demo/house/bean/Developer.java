package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("developer")
public class Developer implements java.io.Serializable{
     private Integer dev_id;//������id
     private String dev_name;//����������
     private String dev_book;//�������ʸ�֤��
     private String dev_num;//�����̵绰
	public Integer getDev_id() {
		return dev_id;
	}
	public void setDev_id(Integer dev_id) {
		this.dev_id = dev_id;
	}
	public String getDev_name() {
		return dev_name;
	}
	public void setDev_name(String dev_name) {
		this.dev_name = dev_name;
	}
	public String getDev_book() {
		return dev_book;
	}
	public void setDev_book(String dev_book) {
		this.dev_book = dev_book;
	}
	public String getDev_num() {
		return dev_num;
	}
	public void setDev_num(String dev_num) {
		this.dev_num = dev_num;
	}
	@Override
	public String toString() {
		return "Developer [dev_id=" + dev_id + ", dev_name=" + dev_name + ", dev_book=" + dev_book + ", dev_num="
				+ dev_num + "]";
	}
     
     
     
     
}

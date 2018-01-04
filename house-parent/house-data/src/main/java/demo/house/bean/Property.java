package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("property")
public class Property implements java.io.Serializable{
    private Integer proid;//��ҵid
    private String proname;//��ҵ����
    private String parking;//ͣ��λ
    private double pro_green;//�̻����
    private House_Type house_type;
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public double getPro_green() {
		return pro_green;
	}
	public void setPro_green(double pro_green) {
		this.pro_green = pro_green;
	}
	public House_Type getHouse_type() {
		return house_type;
	}
	public void setHouse_type(House_Type house_type) {
		this.house_type = house_type;
	}
	@Override
	public String toString() {
		return "Property [proid=" + proid + ", proname=" + proname + ", parking=" + parking + ", pro_green=" + pro_green
				+ ", house_type=" + house_type + "]";
	}
    
}

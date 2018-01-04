package demo.house.bean;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("interest_rate")
public class Interest_rate implements java.io.Serializable{
    private Integer irid;//����id
    private String irname;//��������
    private double rate;//����
    private Date rate_time;//����ʱ��(�ֶ�����)
    private double first_price;//�׸��ٷֱ���
	public Integer getIrid() {
		return irid;
	}
	public void setIrid(Integer irid) {
		this.irid = irid;
	}
	public String getIrname() {
		return irname;
	}
	public void setIrname(String irname) {
		this.irname = irname;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Date getRate_time() {
		return rate_time;
	}
	public void setRate_time(Date rate_time) {
		this.rate_time = rate_time;
	}
	public double getFirst_price() {
		return first_price;
	}
	public void setFirst_price(double first_price) {
		this.first_price = first_price;
	}
	@Override
	public String toString() {
		return "Interest_rate [irid=" + irid + ", irname=" + irname + ", rate=" + rate + ", rate_time=" + rate_time
				+ ", first_price=" + first_price + "]";
	}
    
}

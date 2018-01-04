package demo.house.bean;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("interest_rate")
public class Interest_rate implements java.io.Serializable{
    private Integer irid;//利率id
    private String irname;//利率名称
    private double rate;//利率
    private Date rate_time;//利率时间(分多少年)
    private double first_price;//首付百分比例
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

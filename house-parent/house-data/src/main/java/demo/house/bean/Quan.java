package demo.house.bean;

import org.apache.ibatis.type.Alias;

@Alias("quan")
public class Quan implements java.io.Serializable{
    private Integer qid;//商圈id
    private String qname;//商圈名称
    private Integer aid;//商圈所在区域id 
    private String qstate;//状态
    private Building building;//楼盘
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getQstate() {
		return qstate;
	}
	public void setQstate(String qstate) {
		this.qstate = qstate;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	@Override
	public String toString() {
		return "Quan [qid=" + qid + ", qname=" + qname + ", aid=" + aid + ", qstate=" + qstate + ", building="
				+ building + "]";
	}
    
}

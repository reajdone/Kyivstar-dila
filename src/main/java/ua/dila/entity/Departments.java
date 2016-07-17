package ua.dila.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Departments {
	
	private int deptId;
	private String deptName;
	private boolean act;
	private Date dateStart;
	private Date dateStop;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="deptId",unique = true, nullable = false)
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Column(name="deptName")
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Column(name="act")
	public boolean isAct() {
		return act;
	}
	public void setAct(boolean act) {
		this.act = act;
	}
	@Column(name="dateStart")
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	@Column(name="dateStop")
	public Date getDateStop() {
		return dateStop;
	}
	public void setDateStop(Date dateStop) {
		this.dateStop = dateStop;
	
	}
	/**
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Departments", cascade = CascadeType.ALL)
	public List<Subdivisions> getSubdivisions() {
		return subdivisions;
	}
	public void setSubdivisions(List<Subdivisions> subdivisions) {
		this.subdivisions = subdivisions;
	}
	**/
	

}

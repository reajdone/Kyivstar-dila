package ua.dila.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="subdivisions")
public class Subdivisions {
	
	private int subdId;
	private String subdName;
	private boolean act;
	private Date dateStart;
	private Date dateStop;
	private Departments departments;
	private List<Positions> positions;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subdId", unique = true, nullable = false)
	public int getSubdId() {
		return subdId;
	}
	public void setSubdId(int subdId) {
		this.subdId = subdId;
	}
	@Column (name= "subdName")
	public String getSubdName() {
		return subdName;
	}
	public void setSubdName(String subdName) {
		this.subdName = subdName;
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
	 @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinColumn(name = "deptId")
	public Departments getDepartments() {
		return departments;
	}
	public void setDepartments(Departments departments) {
		this.departments = departments;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Subdivisions", cascade = CascadeType.ALL)
	public List<Positions> getPositions() {
		return positions;
	}
	public void setPositions(List<Positions> positions) {
		this.positions = positions;
	}
	
	

}

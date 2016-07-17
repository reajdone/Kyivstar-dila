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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class Positions {
	

	private int postId;
	private String postName;
	private boolean act;
	private Date dateStart;
	private Date dateStop;
	private List<Employees> employees;
	private Subdivisions subdivisions;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="postId", unique = true, nullable = false)
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	@Column (name="postName")
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	@Column (name="act")
	public boolean isAct() {
		return act;
	}
	public void setAct(boolean act) {
		this.act = act;
	}
	@Column (name="dateStart")
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	@Column (name="dateStop")
	public Date getDateStop() {
		return dateStop;
	}
	public void setDateStop(Date dateStop) {
		this.dateStop = dateStop;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Positions", cascade = CascadeType.ALL)
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinColumn(name = "subdId")
	public Subdivisions getSubdivisions() {
		return subdivisions;
	}
	public void setSubdivisions(Subdivisions subdivisions) {
		this.subdivisions = subdivisions;
	}
	
	

}

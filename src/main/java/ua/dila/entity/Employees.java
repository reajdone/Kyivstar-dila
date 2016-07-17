package ua.dila.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	private int empId;
	private String name;
	private String surname;
	private String fathname;
	private boolean act;
	private Date dateStart;
	private Date dateStop;
	private Positions positions;
	private Phonenumbers phonenumbers;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empId")
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="surname")
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Column(name="fathname")
	public String getFathname() {
		return fathname;
	}
	public void setFathname(String fathname) {
		this.fathname = fathname;
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
	 @JoinColumn(name = "postId")
	public Positions getPositions() {
		return positions;
	}
	public void setPositions(Positions positions) {
		this.positions = positions;
	}
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "numbId")
	public Phonenumbers getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(Phonenumbers phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	
	
	


}

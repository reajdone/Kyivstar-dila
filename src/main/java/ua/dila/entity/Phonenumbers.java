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
@Table(name="phonenumbers")
public class Phonenumbers {
	private int numbId;
	private String number;
	private boolean act;
	private Date dateStart;
	private Date dateStop;
	private List<Employees> employees;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numbId", unique = true, nullable = false)
	public int getNumbId() {
		return numbId;
	}
	public void setNumbId(int numbId) {
		this.numbId = numbId;
	}
	@Column(name="number")
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Phonenumbers", cascade = CascadeType.ALL)
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	
	

}

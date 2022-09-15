package com.HbOnetoManyUni.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	@Column(length=20,nullable=false)
	private String tname;
	@Column(length=20,nullable=false)
	private String cname;
	@Column(length=20,nullable=false)
	private String designation;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="tid")
	private List<Students> students;

	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}

	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}

	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the students
	 */
	public List<Students> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	

}
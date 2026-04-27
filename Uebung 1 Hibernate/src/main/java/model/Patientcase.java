package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the patientcase database table.
 * 
 */
@Entity
@NamedQuery(name="Patientcase.findAll", query="SELECT p FROM Patientcase p")
public class Patientcase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer casenb;

	private String diagnosis;

	@Temporal(TemporalType.DATE)
	private Date fromdate;

	private Integer patientnb;

	private String status;

	@Temporal(TemporalType.DATE)
	private Date todate;

	public Patientcase() {
	}

	public Integer getCasenb() {
		return this.casenb;
	}

	public void setCasenb(Integer casenb) {
		this.casenb = casenb;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Date getFromdate() {
		return this.fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Integer getPatientnb() {
		return this.patientnb;
	}

	public void setPatientnb(Integer patientnb) {
		this.patientnb = patientnb;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

}
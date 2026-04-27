package ch.bfh.btx8053.jpa.family;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;
  
  private String firstName;
  
  private String lastName;

  @ManyToOne
  private Family family;

  @Transient
  private String nonsenseField = "";

  @OneToMany
  private List<Job> jobList = new ArrayList<Job>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Family getFamily() {
    return family;
  }

  public void setFamily(Family family) {
    this.family = family;
  }

  public String getNonsenseField() {
    return nonsenseField;
  }

  public void setNonsenseField(String nonsenseField) {
    this.nonsenseField = nonsenseField;
  }

  public List<Job> getJobList() {
    return this.jobList;
  }

  public void setJobList(List<Job> nickName) {
    this.jobList = nickName;
  }
} 

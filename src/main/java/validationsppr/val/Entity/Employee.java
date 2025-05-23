package validationsppr.val.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
  public String getEmail() {
    return email;
  }
  //Employee  Entity
  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;


  @Column(name = "name",nullable = false)
  private String empName;

  @Column(name ="email",nullable = false)
  private String email;

  @Column(name = "phone",nullable = false)
  private String phoneNo;

  public String getEmpRole() {
    return empRole;
  }

  public void setEmpRole(String empRole) {
    this.empRole = empRole;
  }

  @Column(name = "emprole",nullable = false)
  private String empRole;
  }
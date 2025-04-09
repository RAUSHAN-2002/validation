package validationsppr.val.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmployeeDto {

    private Long id;

    @NotBlank(message = "Name is required")
    private String empName;

    @NotBlank(message = "Email is required")
    @Size(min = 10 ,max = 15)
    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 9, max=10)
    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 10, message = "Phone number must be 10 digits")
    private String phoneNo;

    // Constructors
    public EmployeeDto() {}

    public EmployeeDto(Long id, String empName, String email, String phoneNo) {
        this.id = id;
        this.empName = empName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

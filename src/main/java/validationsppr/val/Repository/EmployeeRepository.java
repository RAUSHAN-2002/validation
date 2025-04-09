package validationsppr.val.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import validationsppr.val.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  }
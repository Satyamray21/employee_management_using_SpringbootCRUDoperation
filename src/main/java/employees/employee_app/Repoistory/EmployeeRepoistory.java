package employees.employee_app.Repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employees.employee_app.Entity.Employee;

@Repository
public interface EmployeeRepoistory extends JpaRepository<Employee,Long>{
    
}

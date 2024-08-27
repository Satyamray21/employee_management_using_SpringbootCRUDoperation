package employees.employee_app.Service;

import java.util.List;

import employees.employee_app.Dto.EmployeeDto;

public interface EmployeeService {
     EmployeeDto createEmployye(EmployeeDto employeeDto);
     EmployeeDto findById(Long id);
     List<EmployeeDto> findAllEmployee();
     EmployeeDto updateEmployeeDetails(Long id,EmployeeDto employeeDto);
     void deleteById(Long id);
}

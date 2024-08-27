package employees.employee_app.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import employees.employee_app.Dto.EmployeeDto;
import employees.employee_app.Entity.Employee;
import employees.employee_app.Mapper.EmployeeMapper;
import employees.employee_app.Repoistory.EmployeeRepoistory;
import employees.employee_app.Service.EmployeeService;
@Service
public class EmployeeServiceImp implements EmployeeService {
        private EmployeeRepoistory employeeRepoistory;
    public EmployeeServiceImp(EmployeeRepoistory employeeRepoistory) {
            this.employeeRepoistory = employeeRepoistory;
        }
    @Override
    public EmployeeDto createEmployye(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepoistory.save(employee); 
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
    @Override
    public EmployeeDto findById(Long id) {
        Employee employee = employeeRepoistory
                            .findById(id)
                            .orElseThrow(()->new RuntimeException("Not found employee"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
    @Override
    public List<EmployeeDto> findAllEmployee() {
        List<Employee> employees = employeeRepoistory.findAll();
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for(Employee employee:employees)
        {
            EmployeeDto dto = new EmployeeDto(employee.getId(),employee.getEmployee_name(),employee.getEmployee_email(),employee.getPhone(),employee.getAddress());
            employeeDtos.add(dto);
        }
        return employeeDtos;

    }
    @Override
    public EmployeeDto updateEmployeeDetails(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeRepoistory
                            .findById(id)
                            .orElseThrow(()->new RuntimeException("Not found employee"));
                            
                            if (employeeDto.getEmployee_name() != null && !employeeDto.getEmployee_name().isEmpty()) {
                                employee.setEmployee_name(employeeDto.getEmployee_name());
                            }
                            
                            if (employeeDto.getEmployee_email() != null && !employeeDto.getEmployee_email().isEmpty()) {
                                employee.setEmployee_email(employeeDto.getEmployee_email());
                            }
                            
                            if (employeeDto.getAddress() != null && !employeeDto.getAddress().isEmpty()) {
                                employee.setAddress(employeeDto.getAddress());
                            }
                            
                            if (employeeDto.getPhone() != null && !employeeDto.getPhone().isEmpty()) {
                                employee.setPhone(employeeDto.getPhone());
                            }
                            
        Employee updaEmployee = employeeRepoistory.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updaEmployee);
    }
    @Override
    public void deleteById(Long id) {
        Employee employee = employeeRepoistory
        .findById(id)
        .orElseThrow(()->new RuntimeException("Not found employee"));
        employeeRepoistory.delete(employee);
        
    }
    
    
    
}

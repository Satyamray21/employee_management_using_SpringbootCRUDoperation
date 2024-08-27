package employees.employee_app.Mapper;

import employees.employee_app.Dto.EmployeeDto;
import employees.employee_app.Entity.Employee;

public class EmployeeMapper {
    public static Employee mapToEmployee(EmployeeDto employeeDto)
    {
        Employee employee = new Employee(
            employeeDto.getId(),
            employeeDto.getEmployee_name(),
            employeeDto.getEmployee_email(),
            employeeDto.getPhone(),
            employeeDto.getAddress()

        );
        return employee;
    }
    public static EmployeeDto mapToEmployeeDto(Employee employee)
    {
        EmployeeDto employeeDto = new EmployeeDto(
            employee.getId(),
            employee.getEmployee_name(),
            employee.getEmployee_email(),
            employee.getPhone(),
            employee.getAddress()

        );
        return employeeDto;
    }
}

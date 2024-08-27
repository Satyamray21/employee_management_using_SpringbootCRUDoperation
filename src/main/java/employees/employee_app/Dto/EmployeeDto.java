package employees.employee_app.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String employee_name;
    private String employee_email;
    private String phone;
    private String address;
}

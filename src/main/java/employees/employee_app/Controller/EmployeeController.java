package employees.employee_app.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employees.employee_app.Dto.EmployeeDto;
import employees.employee_app.Service.EmployeeService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping()
    
    
    public ResponseEntity<EmployeeDto> createEmployye(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(employeeService.createEmployye(employeeDto),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable Long id) {
        EmployeeDto employeeDto = employeeService.findById(id);
        return  ResponseEntity.ok(employeeDto);
    }
    @GetMapping("/allEmployees")
    public ResponseEntity<List<EmployeeDto>> findAllEmployee() {
      List<EmployeeDto> employeeDto = employeeService.findAllEmployee();
      return ResponseEntity.ok(employeeDto);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeDetails( @PathVariable Long id, @RequestBody EmployeeDto employeeDto) {
       EmployeeDto employeeDtos = employeeService.updateEmployeeDetails(id, employeeDto);
       return ResponseEntity.ok(employeeDtos);

    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        employeeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
    
    
}

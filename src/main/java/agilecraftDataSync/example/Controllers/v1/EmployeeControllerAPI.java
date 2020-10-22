package agilecraftDataSync.example.Controllers.v1;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import agilecraftDataSync.example.Services.EmployeeService;
import agilecraftDataSync.example.model.Employee;

@RestController
@RequestMapping(EmployeeControllerAPI.BASE_URL)
public class EmployeeControllerAPI {
    public static final String BASE_URL = "/api/v1/employees";
    private final EmployeeService employeeService;

    public EmployeeControllerAPI(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    // public EmployeeControllerAPI(EmployeeService employeeService) {
     //   super();
       // this.employeeService = employeeService;
    //}


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployee(){

        return (employeeService.findAll());
    }
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Optional<Employee> getEmployeeById(@PathVariable String id){

        return employeeService.getById((id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createNewEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }


    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteById(id);
    }
    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee){

        employee.setID(Integer.parseInt(id));
        return employeeService.put(id,employee);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Employee patchCustomer(@PathVariable String id, @RequestBody Employee employee){
        return employeeService.patchEmployee(id, employee);
    }

}

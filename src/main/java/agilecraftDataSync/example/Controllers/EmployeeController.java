package agilecraftDataSync.example.Controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import agilecraftDataSync.example.Repositories.EmployeeRepository;
import agilecraftDataSync.example.Services.EmployeeService;
import agilecraftDataSync.example.model.Employee;
import agilecraftDataSync.example.model.Region;

import java.util.Optional;

@Controller
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeRepository employeeRepository,EmployeeService employeeService){
        this.employeeRepository = employeeRepository;
        this.employeeService=employeeService;
    }
    @GetMapping("/employee/new")
    public String add(Model model) {
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "Employee/employeeNew";
    }
    @PostMapping("/employee/new")
    public String add(@ModelAttribute("employee") Employee employee) {
        employee.setEmail(employee.getLastName()+"."+employee.getFirstName()+"@ncr.com");
        employeeService.save(employee);
        return "redirect:/employees/show";
    }
    @GetMapping("/employee/delete/{id}")
    public String delete(@PathVariable String id) {
        employeeService.deleteById(id);
        return "redirect:/employees/show";
    }
    @GetMapping("/employee/update/{id}")
    public String update(@PathVariable String id,Model model) {
        model.addAttribute("employee",employeeService.getById(id));
        return "Employee/employeeNew";
    }
    @GetMapping("/employee/show/{id}")
    public String show(@PathVariable String id,Model model) {
        Optional<Employee> employee=employeeService.getById(id);
        model.addAttribute("employees",employee.get());
        return "Employee/employeeShow";
    }
    @GetMapping("/employees/show")
    public String showall(Model model) {
        model.addAttribute("employees",employeeService.findAll());
        return "Employee/employeesShow";
    }
}


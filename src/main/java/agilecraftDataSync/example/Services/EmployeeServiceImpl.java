package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.Repositories.EmployeeRepository;
import agilecraftDataSync.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return employeeRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        employeeRepository.deleteById(Integer.valueOf(id));
    }

    @Override
    public Optional<Employee> getById(String id) {
        // TODO Auto-generated method stub
        return employeeRepository.findById(Integer.valueOf(id));
    }

    @Override
    public Employee save(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepository.save(employee);
    }



    @Override
    public Employee put(String id, Employee employee) {
        // TODO Auto-generated method stub
        employee.setID(Integer.parseInt(id));

        return employeeRepository.save(employee);
    }

    @Override
    public Employee patchEmployee(String id, Employee employee) {
        // TODO Auto-generated method stub
        Employee patchEmployee=employeeRepository.findById(Integer.parseInt(id)).get();
        if(employee.getFirstName()!=null)
            patchEmployee.setFirstName(employee.getFirstName());
        if(employee.getLastName()!=null)
            patchEmployee.setLastName(employee.getLastName());
        if(employee.getEmail()!=null)
            patchEmployee.setEmail(employee.getEmail());
        return employeeRepository.save(patchEmployee);
    }
}

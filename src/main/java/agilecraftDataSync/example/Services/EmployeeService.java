package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    void deleteById(String id);
    Optional<Employee> getById(String id);
    Employee save(Employee employee);
    Employee put(String id,Employee employee);
    Employee patchEmployee(String id, Employee employee);
}

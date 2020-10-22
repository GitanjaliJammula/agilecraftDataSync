package agilecraftDataSync.example.Repositories;

import agilecraftDataSync.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

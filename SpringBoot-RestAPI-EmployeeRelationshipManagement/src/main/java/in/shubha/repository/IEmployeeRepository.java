package in.shubha.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.shubha.entity.Employee;


public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	
}

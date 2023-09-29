package in.shubha.service;

import java.util.List;

import in.shubha.entity.Employee;

public interface IEmployeeService {

	public List<Employee> listAllEmps();
	
	public Employee getEmployeebyId(Integer id);
	
	public void saveEmployee(Employee emp);
	
	public void deleteEmployee(Integer id);
}

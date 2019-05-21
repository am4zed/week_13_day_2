package com.codeclan.walmart.Walmart;

import com.codeclan.walmart.Walmart.models.Department;
import com.codeclan.walmart.Walmart.models.Employee;
import com.codeclan.walmart.Walmart.models.Project;
import com.codeclan.walmart.Walmart.repositories.DepartmentRepository;
import com.codeclan.walmart.Walmart.repositories.EmployeeRepository;
import com.codeclan.walmart.Walmart.repositories.ProjectRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WalmartApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test @Ignore
	public void canCreateDepartment() {
		Department department = new Department("Sales");
		departmentRepository.save(department);

	}

	@Test @Ignore
	public void canAddEmployeeToDepartment() {
		Department department = departmentRepository.getOne(1l);

		Employee employee = new Employee("Sally", "Salesperson", 2343, department);
		employeeRepository.save(employee);

		department.addEmployee(employee);
		departmentRepository.save(department);
	}

	@Test
	public void canAddProjectToEmployee() {
		Project project = new Project("Preparation H", 10);
		projectRepository.save(project);

		Employee employee = employeeRepository.getOne(1l);

		employee.addProject(project);
		employeeRepository.save(employee);
	}
}

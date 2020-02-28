package com.gieandessilva.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gieandessilva.api.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

//	Employee findByCnpj(String cnpj);
}

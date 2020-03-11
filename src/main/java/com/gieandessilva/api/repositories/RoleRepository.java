package com.gieandessilva.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gieandessilva.api.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}

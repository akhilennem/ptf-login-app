package com.attendance.login.repository;

import java.util.Optional;

import com.attendance.login.models.ERole;
import com.attendance.login.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}

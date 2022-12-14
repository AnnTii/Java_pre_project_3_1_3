package spring_boot_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_boot_security.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {

}

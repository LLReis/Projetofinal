package br.com.arq.tardis.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arq.tardis.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}

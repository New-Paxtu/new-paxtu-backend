package com.newPaxtu.newpaxtubackend.Auth.Privileges;

import org.springframework.data.repository.CrudRepository;

public interface PrivilegeRepository extends CrudRepository<Privilege, Integer> {
    Privilege findByName(String name);
}

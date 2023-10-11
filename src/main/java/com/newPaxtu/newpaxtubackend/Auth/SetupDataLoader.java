package com.newPaxtu.newpaxtubackend.Auth;

import com.newPaxtu.newpaxtubackend.Auth.Privileges.Privilege;
import com.newPaxtu.newpaxtubackend.Auth.Privileges.PrivilegeRepository;
import com.newPaxtu.newpaxtubackend.Auth.Roles.RoleRepository;
import com.newPaxtu.newpaxtubackend.User.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {
    boolean alreadySetup = false;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository role;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Transactional
    Privilege createPrivilegeIfNotFound(String name) {
        Privilege privilege = privilegeRepository.findByName(name)
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (alreadySetup) {
            return;
        }
        Privilege readPrivilege = createPrivilegeIfNotFound("Read_Privilege")

    }
}

package com.newPaxtu.newpaxtubackend.Auth.Privileges;

import com.newPaxtu.newpaxtubackend.Auth.Roles.Role;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;
}

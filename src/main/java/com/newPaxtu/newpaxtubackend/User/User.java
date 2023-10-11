package com.newPaxtu.newpaxtubackend.User;

import com.newPaxtu.newpaxtubackend.Auth.Roles.Role;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.UUID;

enum Roles {
    diretoria, chefeSecao, chefeAssist, jovem;
}

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String password;

    @Nullable
    private String registry;

    @Nullable
    private String role;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
}
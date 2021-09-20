package com.velmar.pvmStore.payload.request;

import com.velmar.pvmStore.models.Role;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.util.HashSet;
import java.util.Set;

public class SignupRequest {

    private String username;

    private String password;

    private String email;

    @DBRef
    private Set<Role> roles = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

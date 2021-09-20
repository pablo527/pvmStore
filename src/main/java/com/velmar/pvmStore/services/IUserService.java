package com.velmar.pvmStore.services;

import com.velmar.pvmStore.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface IUserService extends UserDetails {
    void registerUser (User user);
    Iterable<User> getUsers();
}
